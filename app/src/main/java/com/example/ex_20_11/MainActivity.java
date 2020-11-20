package com.example.ex_20_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double aParameter;
    private double bParameter;
    private double cParameter;

    private EditText a;
    private EditText b;
    private EditText c;

    private TextView x1;
    private TextView x2;

    private double x1Calc;
    private double x2Calc;

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.editTextNumber1);
        b = findViewById(R.id.editTextNumber2);
        c = findViewById(R.id.editTextNumber3);
        x1 = findViewById(R.id.textView5);
        x2 = findViewById(R.id.textView7);

    }
    public void calc(View v){
        try {
            aParameter = Double.parseDouble(a.getText().toString());
            bParameter = Double.parseDouble(b.getText().toString());
            cParameter = Double.parseDouble(c.getText().toString());
        } catch (NumberFormatException e){

        }
        x1Calc = ((-bParameter + (Math.sqrt(((Math.pow(bParameter,2))- 4 * aParameter * cParameter)))) / 2*aParameter);
        x1.setText("" + x1Calc);
        x2Calc = ((-bParameter - (Math.sqrt(((Math.pow(bParameter,2))- 4 * aParameter * cParameter)))) / 2*aParameter);
        x2.setText(""+ x2Calc);
    }


}