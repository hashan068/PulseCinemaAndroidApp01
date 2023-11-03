package com.example.pulsecinemaandroidapp.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
// allowing to use Toast to display messages in your Android application
import android.widget.Toast;

import com.example.pulsecinemaandroidapp.R;
import com.example.pulsecinemaandroidapp.ui.movies.MovieFragment;

public class LoginActivity extends AppCompatActivity {

    private com.google.android.material.textfield.TextInputEditText editTextUsername, editTextPassword;
    private Button buttonLogin;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize UI elements
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        // Set click listener for the login button
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve username and password from EditText fields
                String username = editTextUsername.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Perform authentication logic here

                if (isValidCredentials(username, password)) {
                    // Authentication successful, move to the next activity
                    moveToNextActivity();
                } else {

                    // Authentication failed, show a toast or error message
                    // create and display a short-duration toast message in the LoginActivity
                    // with the content "Invalid credentials" when the authentication fails

                    String errorMessage = "Invalid credentials";
                    Toast.makeText(LoginActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // method for authentication logic
    private boolean isValidCredentials(String username, String password) {
        // Replace this with your actual authentication logic
        return username.equals("username") && password.equals("password");
    }

    private void moveToNextActivity() {
        // Create an Intent to start the next activity
        // Replace NextActivity.class with the actual class of your next activity
           Intent intent = new Intent(LoginActivity.this, MovieFragment.class);
            startActivity(intent);

        // For testing purposes, you can finish the current activity
        // finish();
    }
}
