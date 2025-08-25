package com.example.SafarYar;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class logo extends AppCompatActivity {

    private MaterialButton loginBtn, registerBtn, loginGoogleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        // Find buttons by ID
        loginBtn = findViewById(R.id.ligin_button);
        registerBtn = findViewById(R.id.regester_button);
        loginGoogleBtn = findViewById(R.id.logingoogle_button);

        // --- Click actions ---
        loginBtn.setOnClickListener(v ->
                Toast.makeText(this, "ثبت نام کلیک شد ✅", Toast.LENGTH_SHORT).show()
        );

        registerBtn.setOnClickListener(v ->
                Toast.makeText(this, "ورود کلیک شد ✅", Toast.LENGTH_SHORT).show()
        );

        loginGoogleBtn.setOnClickListener(v ->
                Toast.makeText(this, "ورود با گوگل کلیک شد ✅", Toast.LENGTH_SHORT).show()
        );
    }
}
