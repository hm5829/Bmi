package com.tom.bmi;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // getResources().getString(R.string.app_name);
        // 上面 = "Bmi"
        Button bInfo = (Button) findViewById(R.id.b_info);
        bInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("hi")
                        .setMessage("BMI等於身高除以體重平方")
                        .setPositiveButton("OK", null)
                        .show();
            }
        });
    }
    public void bmi(View view){
     //   System.out.println();
        //Log.d("MainActivity", "testing bmi method");
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        EditText edHeight = (EditText) findViewById(R.id.ed_height);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight / (height * height);
        new AlertDialog.Builder(this)
                .setMessage(getString(R.string.your_bmi_is) + bmi)
                // = .setMessage("Your BMI is " + bmi)
                .setTitle(R.string.bmi_title)
                .setPositiveButton(R.string.ok, null)
                .show();
        /*Log.d("MainActivity", "You Bmi is : " +bmi);
        Toast.makeText(this, "Your BMI is " + bmi, Toast.LENGTH_LONG).show();*/
    }
}
