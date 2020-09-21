package com.example.temperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button ctof, ftoc;
    private TextView result;
    private EditText temp;
    double result0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ctof = (Button) findViewById(R.id.ctof);
        ftoc = (Button) findViewById(R.id.ftoc);
        result = (TextView) findViewById(R.id.result);
        temp = (EditText) findViewById(R.id.temp);

        ctof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value = Double.parseDouble(temp.getText().toString());
                result0 = (value * 1.8) + 32;
                result.setText(String.valueOf(result0));
            }
        });

        ftoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double value = Double.parseDouble(temp.getText().toString());
                result0 = (value - 32) / 1.8;
                result.setText(String.valueOf(result0));
            }
        });
    }

}