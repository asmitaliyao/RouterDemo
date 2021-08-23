package com.example.bm_a;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.router.annotations.Destination;
import com.example.router_api.Router;

@Destination(url = "router://example.com/app/first", description = "first page")
public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        findViewById(R.id.button1).setOnClickListener(v ->
                Router.navigation(FirstActivity.this, "router://example.com/app/second"));

        findViewById(R.id.button2).setOnClickListener(v ->
                Router.navigation(FirstActivity.this, "router://example.com/app/third"));
    }
}