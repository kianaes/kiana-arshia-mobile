package com.example.SafarYar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class settings extends AppCompatActivity {

    // Toolbar
    private Toolbar toolbar;
    private ImageView menu, logoname, edit;

    // Content
    private LinearLayout backgroound;
    private TextView titleText; // "تنظیمات" title

    // Options
    private LinearLayout accountLayout, generalLayout, notificationLayout, securityLayout;

    // Bottom menu
    private LinearLayout homeLayout, addLayout, calenderLayout, alarmLayout, moreLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        initViews();
        setupToolbar();
        setupClickListeners();
    }

    private void initViews() {
        // Toolbar
        toolbar = findViewById(R.id.toolbar);
        menu = findViewById(R.id.menu);
        logoname = findViewById(R.id.logoname);
        edit = findViewById(R.id.edit);

        // Main content
        backgroound = findViewById(R.id.backgroound);

        if (backgroound.getChildCount() > 0 && backgroound.getChildAt(0) instanceof TextView) {
            titleText = (TextView) backgroound.getChildAt(0);
        }

        // Other settings options
        accountLayout = findViewById(R.id.account);
        generalLayout = findViewById(R.id.general);
        notificationLayout = findViewById(R.id.notification);
        securityLayout = findViewById(R.id.security);

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
        menu.setOnClickListener(v -> {
            // Handle menu click
        });

        edit.setOnClickListener(v -> {
            // Handle edit click
        });

        // Settings options
        accountLayout.setOnClickListener(v -> {
            // Open account settings
        });

        generalLayout.setOnClickListener(v -> {
            // Open general settings
        });

        notificationLayout.setOnClickListener(v -> {
            // Open notification settings
        });

        securityLayout.setOnClickListener(v -> {
            // Open security/privacy settings
        });

        // Bottom menu
        homeLayout.setOnClickListener(v -> {
            // Go Home
        });
        addLayout.setOnClickListener(v -> {
            // Add new
        });
        calenderLayout.setOnClickListener(v -> {
            // Open calendar
        });
        alarmLayout.setOnClickListener(v -> {
            // Open alarms
        });
        moreLayout.setOnClickListener(v -> {
            // Open more
        });
    }
}
