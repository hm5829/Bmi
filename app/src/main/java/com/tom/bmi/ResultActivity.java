package com.tom.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        float bmi = getIntent().getFloatExtra(getString(R.string.extra_bmi) , 0);
        TextView result = (TextView) findViewById(R.id.bmi_result);
        result.setText("BMI: " + bmi);

    }
}
