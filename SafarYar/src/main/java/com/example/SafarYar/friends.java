package com.example.SafarYar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class friends extends AppCompatActivity {

    // Toolbar
    private ImageView backBtn, logoBtn, accountBtn;

    // Friend list buttons
    private Button friend1Btn, friend2Btn, friend3Btn, friend4Btn, friend5Btn;

    // Bottom navigation
    private LinearLayout homeBtn, addBtn, calendarBtn, alarmBtn, moreBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends); // make sure file name is activity_friends.xml

        // Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        backBtn = findViewById(R.id.back);
        logoBtn = findViewById(R.id.logoname);
        accountBtn = findViewById(R.id.account);

        friend1Btn = null;
        friend2Btn = null;
        friend3Btn = null;
        friend4Btn = null;
        friend5Btn = null;

        // Bottom navigation
        homeBtn = findViewById(R.id.home);
        addBtn = findViewById(R.id.add);
        calendarBtn = findViewById(R.id.calender);
        alarmBtn = findViewById(R.id.alarm);
        moreBtn = findViewById(R.id.more);

        // Toolbar clicks
        backBtn.setOnClickListener(v -> finish());
        logoBtn.setOnClickListener(v -> Toast.makeText(this, "Logo clicked", Toast.LENGTH_SHORT).show());
        accountBtn.setOnClickListener(v -> Toast.makeText(this, "Account clicked", Toast.LENGTH_SHORT).show());

        // Bottom nav clicks
        homeBtn.setOnClickListener(v -> Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show());
        addBtn.setOnClickListener(v -> Toast.makeText(this, "Add clicked", Toast.LENGTH_SHORT).show());
        calendarBtn.setOnClickListener(v -> Toast.makeText(this, "Calendar clicked", Toast.LENGTH_SHORT).show());
        alarmBtn.setOnClickListener(v -> Toast.makeText(this, "Alarm clicked", Toast.LENGTH_SHORT).show());
        moreBtn.setOnClickListener(v -> Toast.makeText(this, "More clicked", Toast.LENGTH_SHORT).show());
    }
}
