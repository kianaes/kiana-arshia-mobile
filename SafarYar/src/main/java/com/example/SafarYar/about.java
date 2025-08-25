package com.example.SafarYar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class about extends AppCompatActivity {

    // Toolbar views
    private ImageView backBtn, logoBtn, accountBtn;

    // Bottom navigation views
    private LinearLayout homeBtn, addBtn, calendarBtn, alarmBtn, moreBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about); // your uploaded XML file

        // --- Toolbar setup ---
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        backBtn = findViewById(R.id.back);
        logoBtn = findViewById(R.id.logoname);
        accountBtn = findViewById(R.id.account);

        // --- Bottom navigation setup ---
        homeBtn = findViewById(R.id.home);
        addBtn = findViewById(R.id.add);
        calendarBtn = findViewById(R.id.calender);
        alarmBtn = findViewById(R.id.alarm);
        moreBtn = findViewById(R.id.more);

        // --- Toolbar Clicks ---
        backBtn.setOnClickListener(v -> finish()); // just go back

        logoBtn.setOnClickListener(v ->
                Toast.makeText(this, "Logo clicked", Toast.LENGTH_SHORT).show());

        accountBtn.setOnClickListener(v ->
                Toast.makeText(this, "Account clicked", Toast.LENGTH_SHORT).show());

        // --- Bottom Nav Clicks ---
        homeBtn.setOnClickListener(v ->
                Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show());

        addBtn.setOnClickListener(v ->
                Toast.makeText(this, "Add clicked", Toast.LENGTH_SHORT).show());

        calendarBtn.setOnClickListener(v ->
                Toast.makeText(this, "Calendar clicked", Toast.LENGTH_SHORT).show());

        alarmBtn.setOnClickListener(v ->
                Toast.makeText(this, "Alarm clicked", Toast.LENGTH_SHORT).show());

        moreBtn.setOnClickListener(v ->
                Toast.makeText(this, "More clicked", Toast.LENGTH_SHORT).show());
    }
}
