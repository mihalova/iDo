package com.example.ido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    EditText username, emailAddress, password, verifyPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void register(View view) {
        username = findViewById(R.id.registrationUsername);
        emailAddress =
        validation();
        Intent mainActivity = new Intent(RegistrationActivity.this, LoginActivity.class);
        startActivity(mainActivity);
    }

    private void validation() {
    }

    public void goToLogin(View view) {
        Intent registration = new Intent(RegistrationActivity.this, LoginActivity.class);
        startActivity(registration);

    }
}
