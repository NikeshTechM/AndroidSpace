package com.example.helloworld;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set a simple TextView as the UI
        TextView textView = new TextView(this);
        textView.setText("Hello, World!");
        textView.setTextSize(24);

        setContentView(textView);
    }
}
