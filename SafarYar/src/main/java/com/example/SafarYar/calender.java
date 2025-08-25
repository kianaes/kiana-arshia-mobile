package com.example.SafarYar;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class calender extends AppCompatActivity {

    private CalendarView calendarView;
    private LinearLayout home, add, calender, alarm, more;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        // Bottom navigation
        home = findViewById(R.id.home);
        add = findViewById(R.id.add);
        calender = findViewById(R.id.calender); // spelling from XML
        alarm = findViewById(R.id.alarm);
        more = findViewById(R.id.more);

        // Handle calendar date selection
        if (calendarView != null) {
            calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
                String date = dayOfMonth + "/" + (month + 1) + "/" + year;
                Toast.makeText(calender.this, "Selected Date: " + date, Toast.LENGTH_SHORT).show();
            });
        }

        // Handle bottom navigation clicks
        home.setOnClickListener(v ->
                Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show());

        add.setOnClickListener(v ->
                Toast.makeText(this, "Add clicked", Toast.LENGTH_SHORT).show());

        calender.setOnClickListener(v ->
                Toast.makeText(this, "Calendar clicked", Toast.LENGTH_SHORT).show());

        alarm.setOnClickListener(v ->
                Toast.makeText(this, "Alarm clicked", Toast.LENGTH_SHORT).show());

        more.setOnClickListener(v ->
                Toast.makeText(this, "More clicked", Toast.LENGTH_SHORT).show());
    }
}
