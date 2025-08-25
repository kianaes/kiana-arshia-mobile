package com.example.SafarYar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Newpage extends AppCompatActivity {

    // Toolbar
    private ImageView backBtn, logoName, accountBtn;

    // Travel form buttons
    private Button nameTravelBtn, dateGoBtn, dateBackBtn, typeTravelBtn;

    // Bottom navigation
    private LinearLayout homeBtn, addBtn, calenderBtn, alarmBtn, moreBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        // Toolbar
        backBtn = findViewById(R.id.back);
        logoName = findViewById(R.id.logoname);
        accountBtn = findViewById(R.id.account);

        // Travel form
        nameTravelBtn = findViewById(R.id.nametravel);
        dateGoBtn = findViewById(R.id.datego);
        dateBackBtn = findViewById(R.id.dateback);
        typeTravelBtn = findViewById(R.id.typetravel);

        // Bottom navigation
        homeBtn = findViewById(R.id.home);
        addBtn = findViewById(R.id.add);
        calenderBtn = findViewById(R.id.calender);
        alarmBtn = findViewById(R.id.alarm);
        moreBtn = findViewById(R.id.more);

        // --- Click actions ---
        backBtn.setOnClickListener(v ->
                Toast.makeText(this, "بازگشت کلیک شد", Toast.LENGTH_SHORT).show()
        );

        accountBtn.setOnClickListener(v ->
                Toast.makeText(this, "حساب کاربری کلیک شد", Toast.LENGTH_SHORT).show()
        );

        nameTravelBtn.setOnClickListener(v ->
                Toast.makeText(this, "نام سفر کلیک شد", Toast.LENGTH_SHORT).show()
        );

        dateGoBtn.setOnClickListener(v ->
                Toast.makeText(this, "تاریخ رفت کلیک شد", Toast.LENGTH_SHORT).show()
        );

        dateBackBtn.setOnClickListener(v ->
                Toast.makeText(this, "تاریخ برگشت کلیک شد", Toast.LENGTH_SHORT).show()
        );

        typeTravelBtn.setOnClickListener(v ->
                Toast.makeText(this, "نوع سفر کلیک شد", Toast.LENGTH_SHORT).show()
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
