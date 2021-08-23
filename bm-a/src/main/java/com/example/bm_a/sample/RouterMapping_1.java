package com.example.bm_a.sample;

import java.util.HashMap;
import java.util.Map;

public class RouterMapping_1 {

    public static Map<String, String> get() {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("router://xxx", "com.example.bm_a.xxx");
        return mapping;
    }
}
