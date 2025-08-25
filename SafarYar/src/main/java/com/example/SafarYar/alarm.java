package com.example.SafarYar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class
alarm extends AppCompatActivity {

    // Toolbar
    private ImageView menuBtn, logoBtn, accountBtn;

    // Alarm controls
    private Button travelNameBtn;

    // Bottom navigation
    private LinearLayout homeBtn, addBtn, calendarBtn, alarmBtn, moreBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        // Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        menuBtn = findViewById(R.id.menu);
        logoBtn = findViewById(R.id.logoname);
        accountBtn = findViewById(R.id.account);

        // Alarm controls
        travelNameBtn = findViewById(R.id.nametravel);

        // Bottom Nav
        homeBtn = findViewById(R.id.home);
        addBtn = findViewById(R.id.add);
        calendarBtn = findViewById(R.id.calender);
        alarmBtn = findViewById(R.id.alarm);
        moreBtn = findViewById(R.id.more);

        // Toolbar clicks
        menuBtn.setOnClickListener(v -> Toast.makeText(this, "Menu clicked", Toast.LENGTH_SHORT).show());
        logoBtn.setOnClickListener(v -> Toast.makeText(this, "Logo clicked", Toast.LENGTH_SHORT).show());
        accountBtn.setOnClickListener(v -> Toast.makeText(this, "Account clicked", Toast.LENGTH_SHORT).show());

        // Alarm controls
        travelNameBtn.setOnClickListener(v ->
                Toast.makeText(this, "Travel reminder button clicked", Toast.LENGTH_SHORT).show());

        // Bottom Nav clicks
        homeBtn.setOnClickListener(v -> Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show());
        addBtn.setOnClickListener(v -> Toast.makeText(this, "Add clicked", Toast.LENGTH_SHORT).show());
        calendarBtn.setOnClickListener(v -> Toast.makeText(this, "Calendar clicked", Toast.LENGTH_SHORT).show());
        alarmBtn.setOnClickListener(v -> Toast.makeText(this, "Alarm clicked", Toast.LENGTH_SHORT).show());
        moreBtn.setOnClickListener(v -> Toast.makeText(this, "More clicked", Toast.LENGTH_SHORT).show());
    }
}
