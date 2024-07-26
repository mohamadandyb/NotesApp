// LoginActivity.java
package com.mohamadandyb.notesapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ImageView;
import android.widget.TextView;

import android.support.v7.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private ImageView loginImageView;
    private TextView loginTextView;

    private Admin admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.login);
        loginImageView = findViewById(R.id.login_image);
        loginTextView = findViewById(R.id.login_text);

        // Set gambar dan teks secara dinamis jika diperlukan
        loginImageView.setImageResource(R.drawable.logo_unsia);
        loginTextView.setText("Log in");

        // Inisialisasi admin dengan username dan password yang sudah ditentukan
        admin = new Admin("admin", "admin123");

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (admin.validate(username, password)) {
                    // Login berhasil
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    // Login gagal
                    Toast.makeText(LoginActivity.this, "Username atau password tidak valid!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
