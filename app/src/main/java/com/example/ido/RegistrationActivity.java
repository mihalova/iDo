package com.example.ido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    EditText username, emailAddress, password, verifyPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void register(View view) {
        if (validation()) {
            Intent mainActivity = new Intent(RegistrationActivity.this, LoginActivity.class);
            startActivity(mainActivity);
        } else {
            Toast.makeText(this, "Incorrect registration.", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validation() {
        username = findViewById(R.id.registrationUsername);
        emailAddress = findViewById(R.id.registrationEmailAddress);
        password = findViewById(R.id.registrationPassword);
        verifyPassword = findViewById(R.id.registrationVerifyPassword);

        String email = emailAddress.getText().toString().trim();
        boolean emailCorrect = android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
        boolean passwordCorrect = password.getText().toString().equals(verifyPassword.getText().toString());
        return emailCorrect && passwordCorrect;
    }

    public void goToLogin(View view) {
        Intent registration = new Intent(RegistrationActivity.this, LoginActivity.class);
        startActivity(registration);

    }
}
