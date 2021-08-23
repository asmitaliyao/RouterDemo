package com.example.bm_b;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.router.annotations.Destination;

@Destination(url = "router://example.com/app/third")
public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
}