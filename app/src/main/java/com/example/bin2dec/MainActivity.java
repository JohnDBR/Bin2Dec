package com.example.bin2dec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Convert a binary to decimal.
     * @param bin binary number
     * @return decimal number
     */
    int bin2Dec(String bin) {
        return Integer.parseInt(bin, 2);
    }
}
