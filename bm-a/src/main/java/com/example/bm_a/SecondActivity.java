package com.example.bm_a;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.router.annotations.Destination;

@Destination(url = "router://example.com/app/second", description = "second page")
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}