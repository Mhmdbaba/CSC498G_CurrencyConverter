package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radio_group;
    private RadioButton radio_button;
    private EditText input;
    private TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_view = (TextView) findViewById(R.id.tv_output);
    }



    public void Convert (View v){
        radio_group = (RadioGroup) findViewById(R.id.radioGroup);
        radio_button = (RadioButton) findViewById(radio_group.getCheckedRadioButtonId());

        input = findViewById(R.id.input_number);

        Double output;
        if (radio_button.getText().equals("USD")){
            output = Double.parseDouble(input.getText().toString()) / 22000;
            text_view.setText("USD " + output);
        }else if (radio_button.getText().equals("LBP")){
            output = Double.parseDouble(input.getText().toString()) * 22000;
            text_view.setText("LBP " + output);
        } else{
            String message = "Please choose a currency!";
            Toast toast = Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG);
            toast.show();
        }






    }
}