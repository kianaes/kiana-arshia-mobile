package com.example.SafarYar; // change this to your actual package name

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class Register extends AppCompatActivity {

    // Views
    private TextView accountNameTxt, passwordTxt, noAccountTxt;
    private MaterialButton okBtn;
    private LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // --- Find views ---
        mainLayout = findViewById(R.id.main);
        accountNameTxt = findViewById(R.id.accountname);
        passwordTxt = findViewById(R.id.password);
        noAccountTxt = findViewById(R.id.no_account);
        okBtn = findViewById(R.id.ok);

        // --- Click listeners ---
        accountNameTxt.setOnClickListener(v ->
                Toast.makeText(this, "نام کاربری کلیک شد", Toast.LENGTH_SHORT).show()
        );

        passwordTxt.setOnClickListener(v ->
                Toast.makeText(this, "رمز عبور کلیک شد", Toast.LENGTH_SHORT).show()
        );

        noAccountTxt.setOnClickListener(v ->
                Toast.makeText(this, "اکانت ندارید؟ کلیک شد", Toast.LENGTH_SHORT).show()
        );

        okBtn.setOnClickListener(v ->
                Toast.makeText(this, "ثبت نام انجام شد", Toast.LENGTH_SHORT).show()
        );
    }
}
