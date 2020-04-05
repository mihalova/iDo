package com.example.ido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText emailAddress, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        if (validation()) {
            Intent mainActivity = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(mainActivity);
        } else {
            Toast.makeText(this, "Incorrect login.", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validation() {
        emailAddress = findViewById(R.id.loginEmailAddress);
        password = findViewById(R.id.loginPassword);

        String email = emailAddress.getText().toString().trim();
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public void goToRegistration(View view) {
        Intent registration = new Intent(LoginActivity.this, RegistrationActivity.class);
        startActivity(registration);
    }

}
