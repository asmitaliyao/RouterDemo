package com.example.routerdemo;

import android.app.Application;

import com.example.router_api.Router;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Router.init();
    }
}
