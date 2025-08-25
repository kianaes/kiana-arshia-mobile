package com.example.SafarYar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    // Top bar
    private ImageView backBtn;

    // Menu items
    private LinearLayout accountLayout, travelsLayout, alarmLayout, nameTravelLayout,
            friendsLayout, settingLayout, shareLayout, aboutLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initViews();
        setupClickListeners();
    }

    private void initViews() {
        // Back button
        backBtn = findViewById(R.id.back);

        // Menu layouts
        accountLayout = findViewById(R.id.account);
        travelsLayout = findViewById(R.id.travels);
        alarmLayout = findViewById(R.id.alarm);
        nameTravelLayout = findViewById(R.id.nametravel);
        friendsLayout = findViewById(R.id.friends);
        settingLayout = findViewById(R.id.setting);
        shareLayout = findViewById(R.id.share);
        aboutLayout = findViewById(R.id.about);
    }

    private void setupClickListeners() {
        // Back button closes the menu
        backBtn.setOnClickListener(v -> finish());

        // Each menu item click handler
        accountLayout.setOnClickListener(v -> {
            // TODO: open Account activity
        });

        travelsLayout.setOnClickListener(v -> {
            // TODO: open Travels activity
        });

        alarmLayout.setOnClickListener(v -> {
            // TODO: open Alarm activity
        });

        nameTravelLayout.setOnClickListener(v -> {
            // TODO: open New Travel activity
        });

        friendsLayout.setOnClickListener(v -> {
            // TODO: open Friends/Groups activity
        });

        settingLayout.setOnClickListener(v -> {
            // TODO: open Settings activity
        });

        shareLayout.setOnClickListener(v -> {
            // TODO: open Share activity
        });

        aboutLayout.setOnClickListener(v -> {
            // TODO: open About Us activity
        });
    }
}
