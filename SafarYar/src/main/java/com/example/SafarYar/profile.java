package com.example.SafarYar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class profile extends AppCompatActivity {

    // Toolbar
    private ImageView backBtn, logoName, editBtn;

    // Profile fields
    private Button firstNameBtn, lastNameBtn, passwordBtn, passwordCheckBtn, phoneBtn, emailBtn;

    // Confirm button
    private LinearLayout okBtn;

    // Bottom navigation
    private LinearLayout homeBtn, addBtn, calenderBtn, alarmBtn, moreBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // --- Toolbar ---
        backBtn = findViewById(R.id.back);
        logoName = findViewById(R.id.logoname);
        editBtn = findViewById(R.id.edit);

        // --- Profile fields ---
        firstNameBtn = findViewById(R.id.firstname);
        lastNameBtn = findViewById(R.id.lastname);
        passwordBtn = findViewById(R.id.password);
        passwordCheckBtn = findViewById(R.id.passwordcheck);
        phoneBtn = findViewById(R.id.phone);
        emailBtn = findViewById(R.id.email);

        // --- OK button ---
        okBtn = findViewById(R.id.ok);

        // --- Bottom nav ---
        homeBtn = findViewById(R.id.home);
        addBtn = findViewById(R.id.add);
        calenderBtn = findViewById(R.id.calender);
        alarmBtn = findViewById(R.id.alarm);
        moreBtn = findViewById(R.id.more);

        // --- Click Listeners ---
        backBtn.setOnClickListener(v ->
                Toast.makeText(this, "بازگشت کلیک شد", Toast.LENGTH_SHORT).show()
        );

        editBtn.setOnClickListener(v ->
                Toast.makeText(this, "ویرایش کلیک شد", Toast.LENGTH_SHORT).show()
        );

        firstNameBtn.setOnClickListener(v ->
                Toast.makeText(this, "نام کلیک شد", Toast.LENGTH_SHORT).show()
        );

        lastNameBtn.setOnClickListener(v ->
                Toast.makeText(this, "نام خانوادگی کلیک شد", Toast.LENGTH_SHORT).show()
        );

        passwordBtn.setOnClickListener(v ->
                Toast.makeText(this, "رمز عبور کلیک شد", Toast.LENGTH_SHORT).show()
        );

        passwordCheckBtn.setOnClickListener(v ->
                Toast.makeText(this, "تأیید رمز عبور کلیک شد", Toast.LENGTH_SHORT).show()
        );

        phoneBtn.setOnClickListener(v ->
                Toast.makeText(this, "شماره تماس کلیک شد", Toast.LENGTH_SHORT).show()
        );

        emailBtn.setOnClickListener(v ->
                Toast.makeText(this, "ایمیل کلیک شد", Toast.LENGTH_SHORT).show()
        );

        okBtn.setOnClickListener(v ->
                Toast.makeText(this, "تایید کلیک شد", Toast.LENGTH_SHORT).show()
        );

        homeBtn.setOnClickListener(v ->
                Toast.makeText(this, "خانه کلیک شد", Toast.LENGTH_SHORT).show()
        );

        addBtn.setOnClickListener(v ->
                Toast.makeText(this, "جدید کلیک شد", Toast.LENGTH_SHORT).show()
        );

        calenderBtn.setOnClickListener(v ->
                Toast.makeText(this, "تقویم کلیک شد", Toast.LENGTH_SHORT).show()
        );

        alarmBtn.setOnClickListener(v ->
                Toast.makeText(this, "هشدار کلیک شد", Toast.LENGTH_SHORT).show()
        );

        moreBtn.setOnClickListener(v ->
                Toast.makeText(this, "بیشتر کلیک شد", Toast.LENGTH_SHORT).show()
        );
    }
}
