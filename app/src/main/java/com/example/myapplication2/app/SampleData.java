package com.example.myapplication2.app;

import java.util.ArrayList;

public class SampleData {

    public static final int SAMPLE_DATA_ITEM_COUNT = 30;

    public static ArrayList<String> generateSampleData() {
        final ArrayList<String> data = new ArrayList<String>(SAMPLE_DATA_ITEM_COUNT);

        for (int i = 0; i < SAMPLE_DATA_ITEM_COUNT; i++) {
            data.add("SAMPLE #");
        }

        return data;
    }

}
