package com.tom.bmi;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edWeight;
    private EditText edHeight;
    private Button bInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate");
        // getResources().getString(R.string.app_name);
        // 上面 = "Bmi"
        Findviews();
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

    private void Findviews() {
        bInfo = (Button) findViewById(R.id.b_info);
        edWeight = (EditText) findViewById(R.id.ed_weight);
        edHeight = (EditText) findViewById(R.id.ed_height);
    }

    public void bmi(View view){
     //   System.out.println();
        //Log.d("MainActivity", "testing bmi method");

        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight / (height * height);

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("EXTRA_BMI" , bmi);
        startActivity(intent);

//        if(bmi >= 20 && height <= 3){
//            new AlertDialog.Builder(this)
//                    .setMessage(getString(R.string.your_bmi_is) + bmi)
//                    // = .setMessage("Your BMI is " + bmi)
//                    .setTitle(R.string.bmi_title)
//                    .setPositiveButton(R.string.ok, null)
//                    .show();
//        }
//        if (bmi < 20 && height <= 3){
//            new AlertDialog.Builder(this)
//                    .setMessage("Your BMI is" + bmi)
//                    .setTitle("請多吃點")
//                    .setPositiveButton("OK", null)
//                    .show();
//
//        }
//        if(height > 3){
//            new AlertDialog.Builder(this)
//                    .setTitle("注意")
//                    .setMessage("身高單位應為公尺")
//                    .setPositiveButton("OK", null)
//                    .show();
//        }

//        Log.d("MainActivity", "You Bmi is : " +bmi);
//        Toast.makeText(this, "Your BMI is " + bmi, Toast.LENGTH_LONG).show();
    }




    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity", "onRestart");
    }
}
