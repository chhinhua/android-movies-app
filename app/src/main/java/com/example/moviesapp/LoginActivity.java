package com.example.moviesapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText usernameEdt, passwordEdt;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView() {
        usernameEdt = findViewById(R.id.editTextUsername);
        passwordEdt = findViewById(R.id.editTextPassword);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(v -> {
            if (usernameEdt.getText().toString().isEmpty() || passwordEdt.getText().toString().isEmpty()) {
                Toast.makeText(LoginActivity.this, "Please fill your username and password", Toast.LENGTH_SHORT).show();
            } else if (usernameEdt.getText().toString().equals("test") && passwordEdt.getText().toString().equals("test")) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            } else {
                Toast.makeText(LoginActivity.this, "Your username or password is not correct", Toast.LENGTH_SHORT).show();
            }
        });
    }
}