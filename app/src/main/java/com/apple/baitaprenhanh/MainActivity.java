package com.apple.baitaprenhanh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText NumA, NumB;
    TextView Result;
    Button Compare , Reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumA= (EditText)findViewById(R.id.etnumbera);
        NumB = (EditText)findViewById(R.id.etnumberb);
        Result = (TextView)findViewById(R.id.tvketqua);
        Compare = (Button)findViewById(R.id.btnclick);
        Reset = (Button)findViewById(R.id.btnreset);

        Compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 , num2;
                 num1 = Double.parseDouble(NumA.getText().toString());
                 num2 = Double.parseDouble(NumB.getText().toString());

                if (num1 > num2) {
                    Result.setText(num1 + " > " + num2);
                }
                else if (num1 < num2) {
                    Result.setText(num1 + " < " + num2);
                }
                else {
                    Result.setText(num1 + " = " + num2);
                }

            }
        });

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());
            }
        });
    }
}
