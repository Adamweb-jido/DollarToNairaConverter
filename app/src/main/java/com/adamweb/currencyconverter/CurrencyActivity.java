package com.adamweb.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CurrencyActivity extends AppCompatActivity {

    public void anotherButton(View v){
        EditText mtText = (EditText) findViewById(R.id.textField);
        Double dollarAmount = Double.parseDouble(mtText.getText().toString());
        Double nairaAmount = dollarAmount * 769.50;
        ((TextView) findViewById(R.id.textView2)).setText("Result = "+nairaAmount.toString() +" Naira");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
    }

}