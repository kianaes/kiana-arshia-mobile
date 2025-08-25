package com.example.SafarYar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class share extends AppCompatActivity {

    private ImageView backBtn;
    private MaterialButton okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        // Initialize views
        backBtn = findViewById(R.id.back);
        okBtn = findViewById(R.id.ok);

        // Back button → close activity
        backBtn.setOnClickListener(v -> finish());

        // OK button → open system share sheet
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText = "Hey! I'm sharing this content with you 😊";
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

                // Open chooser
                startActivity(Intent.createChooser(shareIntent, "اشتراک گذاری با"));
            }
        });
    }
}
