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
    }



    public void Convert (View v){
        radio_group = (RadioGroup) findViewById(R.id.radioGroup);
        int selected_Id = radio_group.getCheckedRadioButtonId();
        radio_button = (RadioButton) findViewById(selected_Id);

        input = (TextView) findViewById(R.id.input_number);

        if (radio_button.getText() == "USD"){

        }else if (radio_button.getText() == "LBP"){

        } else{
            String message = "Please choose a currency!";
            Toast toast = Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG);
            toast.show();
        }



    }
}