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
    private TextView input;
    private TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_view = (TextView) findViewById(R.id.tv_output);
    }



    public void Convert (View v){
        radio_group = (RadioGroup) findViewById(R.id.radioGroup);
        int selected_Id = radio_group.getCheckedRadioButtonId();
        radio_button = (RadioButton) findViewById(selected_Id);

        input = (TextView) findViewById(R.id.input_number);

        int output;
        if (radio_button.getText().equals("USD")){
            output = input.getText() / 22000;
            text_view.setText(output);
        }else if (radio_button.getText().equals("LBP")){
            output = Integer.parseInt(String.valueOf(input)) * 22000;
            text_view.setText(output);
        } else{
            String message = "Please choose a currency!";
            Toast toast = Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG);
            toast.show();
        }






    }
}