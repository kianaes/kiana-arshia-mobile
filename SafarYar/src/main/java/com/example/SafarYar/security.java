package com.example.SafarYar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class security extends AppCompatActivity {

    // Toolbar
    private Toolbar toolbar;
    private ImageView back, logoname, account;

    // Content
    private LinearLayout backgroound;
    private TextView privacyText;

    // OK button
    private LinearLayout okButton;

    // Bottom menu
    private LinearLayout homeLayout, addLayout, calenderLayout, alarmLayout, moreLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);

        initViews();
        setupToolbar();
        setupClickListeners();
    }

    private void initViews() {
        // Toolbar
        toolbar = findViewById(R.id.toolbar);
        back = findViewById(R.id.back);
        logoname = findViewById(R.id.logoname);
        account = findViewById(R.id.account);

        // Main content
        backgroound = findViewById(R.id.backgroound);


        if (backgroound.getChildCount() > 1) {
            privacyText = (TextView) backgroound.getChildAt(1);
        }

        // OK button
        okButton = findViewById(R.id.ok);

        // Bottom menu
        homeLayout = findViewById(R.id.home);
        addLayout = findViewById(R.id.add);
        calenderLayout = findViewById(R.id.calender);
        alarmLayout = findViewById(R.id.alarm);
        moreLayout = findViewById(R.id.more);
    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("");
        }
    }

    private void setupClickListeners() {
        // Toolbar buttons
        back.setOnClickListener(v -> finish());

        account.setOnClickListener(v -> {
            // Handle account click
        });

        // OK button
        okButton.setOnClickListener(v -> finish());

        // Bottom menu
        homeLayout.setOnClickListener(v -> {
            // Handle Home click
        });
        addLayout.setOnClickListener(v -> {
            // Handle Add click
        });
        calenderLayout.setOnClickListener(v -> {
            // Handle Calendar click
        });
        alarmLayout.setOnClickListener(v -> {
            // Handle Alarm click
        });
        moreLayout.setOnClickListener(v -> {
            // Handle More click
        });
    }
}
