package com.example.bin2dec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity   {

    private Button b0Btn;
    private Button b1Btn ;
    private Button clearBtn ;
    private TextView binTextV ;
    private TextView decTextV ;

    String binaryText = "0";
    String decText = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

         b0Btn = (Button) findViewById(R.id.b0);
         b1Btn = (Button) findViewById(R.id.b1);
         clearBtn = (Button) findViewById(R.id.bClear);
        binTextV = findViewById(R.id.tEntry);
        decTextV = findViewById(R.id.tResult);
    }

    void addDigit(String digit) {
        this.binaryText += digit;
        this.binTextV.setText(this.binaryText);
        this.bin2Dec();
    }

    void resetText() {
        this.binaryText = "0";
        this.decText = "0";

        this.binTextV.setText(this.binaryText);
        this.decTextV.setText(this.decText);
    }

    void bin2Dec() {
        int dec = Integer.parseInt(this.binaryText, 2);
        this.decText = dec + "";

        this.decTextV.setText(this.decText);
    }

   public void addZero(View view) {
        this.addDigit("0");
    }

    public void addOne(View view) {
        this.addDigit("1");
    }

    public void clear(View view) {
        this.resetText();
    }
}
