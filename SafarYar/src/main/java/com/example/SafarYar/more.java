package com.example.SafarYar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class more extends AppCompatActivity {

    // Toolbar buttons
    private ImageView backBtn, logoName, accountBtn;

    // Bottom navigation
    private LinearLayout homeBtn, addBtn, calenderBtn, alarmBtn, moreBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        // Toolbar
        backBtn = findViewById(R.id.back);
        logoName = findViewById(R.id.logoname);
        accountBtn = findViewById(R.id.account);

        // Bottom navigation
        homeBtn = findViewById(R.id.home);
        addBtn = findViewById(R.id.add);
        calenderBtn = findViewById(R.id.calender);
        alarmBtn = findViewById(R.id.alarm);
        moreBtn = findViewById(R.id.more);

        // --- Click Actions ---
        backBtn.setOnClickListener(v ->
                Toast.makeText(this, "بازگشت کلیک شد", Toast.LENGTH_SHORT).show()
        );

        accountBtn.setOnClickListener(v ->
                Toast.makeText(this, "حساب کاربری کلیک شد", Toast.LENGTH_SHORT).show()
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
