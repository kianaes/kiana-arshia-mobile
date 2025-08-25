package com.example.SafarYar; 

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Map extends AppCompatActivity {

    // Toolbar
    private ImageView menuBtn, logoBtn, accountBtn;

    // Map button
    private Button mapBtn;

    // Bottom navigation
    private LinearLayout homeBtn, addBtn, calenderBtn, alarmBtn, moreBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        // Toolbar items
        menuBtn = findViewById(R.id.menu);
        logoBtn = findViewById(R.id.logoname);
        accountBtn = findViewById(R.id.account);

        // Map button
        mapBtn = findViewById(R.id.map);

        // Bottom navigation
        homeBtn = findViewById(R.id.home);
        addBtn = findViewById(R.id.add);
        calenderBtn = findViewById(R.id.calender);
        alarmBtn = findViewById(R.id.alarm);
        moreBtn = findViewById(R.id.more);

        // --- Click actions ---
        menuBtn.setOnClickListener(v ->
                Toast.makeText(this, "منو کلیک شد", Toast.LENGTH_SHORT).show()
        );

        logoBtn.setOnClickListener(v ->
                Toast.makeText(this, "لوگو کلیک شد", Toast.LENGTH_SHORT).show()
        );

        accountBtn.setOnClickListener(v ->
                Toast.makeText(this, "اکانت کلیک شد", Toast.LENGTH_SHORT).show()
        );

        mapBtn.setOnClickListener(v ->
                Toast.makeText(this, "نمایش نقشه", Toast.LENGTH_SHORT).show()
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
