package com.example.SafarYar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Home extends AppCompatActivity {

    // Toolbar
    private ImageView menuBtn, logoBtn, accountBtn;

    // Search & map
    private Button searchBtn, mapBtn;

    // Bottom navigation
    private LinearLayout homeBtn, addBtn, calendarBtn, alarmBtn, moreBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        menuBtn = findViewById(R.id.menu);
        logoBtn = findViewById(R.id.logoname);
        accountBtn = findViewById(R.id.account);

        // Main buttons
        searchBtn = findViewById(R.id.search);
        mapBtn = findViewById(R.id.map);

        // Bottom nav
        homeBtn = findViewById(R.id.home);
        addBtn = findViewById(R.id.add);
        calendarBtn = findViewById(R.id.calender);
        alarmBtn = findViewById(R.id.alarm);
        moreBtn = findViewById(R.id.more);

        // --- Toolbar clicks ---
        menuBtn.setOnClickListener(v -> Toast.makeText(this, "Menu clicked", Toast.LENGTH_SHORT).show());
        logoBtn.setOnClickListener(v -> Toast.makeText(this, "Logo clicked", Toast.LENGTH_SHORT).show());
        accountBtn.setOnClickListener(v -> Toast.makeText(this, "Account clicked", Toast.LENGTH_SHORT).show());

        // --- Main content clicks ---
        searchBtn.setOnClickListener(v -> Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show());
        mapBtn.setOnClickListener(v -> Toast.makeText(this, "Map clicked", Toast.LENGTH_SHORT).show());

        // --- Bottom navigation clicks ---
        homeBtn.setOnClickListener(v -> Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show());
        addBtn.setOnClickListener(v -> Toast.makeText(this, "Add clicked", Toast.LENGTH_SHORT).show());
        calendarBtn.setOnClickListener(v -> Toast.makeText(this, "Calendar clicked", Toast.LENGTH_SHORT).show());
        alarmBtn.setOnClickListener(v -> Toast.makeText(this, "Alarm clicked", Toast.LENGTH_SHORT).show());
        moreBtn.setOnClickListener(v -> Toast.makeText(this, "More clicked", Toast.LENGTH_SHORT).show());
    }
}
