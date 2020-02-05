package com.example.bin2dec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    final Button b0Btn = (Button) findViewById(R.id.b0);
    final Button b1Btn = (Button) findViewById(R.id.b1);
    final Button clearBtn = (Button) findViewById(R.id.bClear);

    String binaryText = "";
    String decText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    void addDigit(String digit) {
        this.binaryText += digit;
        this.bin2Dec();
    }

    void resetText() {
        this.binaryText = "";
    }

    void bin2Dec() {
        int dec = Integer.parseInt(this.binaryText, 2);
        this.decText = dec + "";
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.b0: {
                this.addDigit("0");
                break;
            }
            case R.id.b1: {
                this.addDigit("1");
                break;
            }
            case R.id.bClear: {
                this.resetText();
                break;
            }
        }
    }
}
