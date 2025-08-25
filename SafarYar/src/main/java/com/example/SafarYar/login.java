package com.example.SafarYar;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class login extends AppCompatActivity {

    private TextView firstnameLabel, lastnameLabel, accountnameLabel, passwordLabel, emailLabel;

    // Submit button
    private MaterialButton okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Labels
        firstnameLabel = findViewById(R.id.firstname);
        lastnameLabel = findViewById(R.id.lastname);
        accountnameLabel = findViewById(R.id.accountname);
        passwordLabel = findViewById(R.id.password);
        emailLabel = findViewById(R.id.email);

        // Submit
        okBtn = findViewById(R.id.ok);

        // --- Button action ---
        okBtn.setOnClickListener(v -> {
            Toast.makeText(this, "ثبت نام انجام شد ✅", Toast.LENGTH_SHORT).show();
        });
    }
}
