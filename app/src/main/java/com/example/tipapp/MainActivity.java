package com.example.tipapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText serviceInput;
    RadioGroup serviceGroup;
    Button calculateButton;
    TextView textView;
    double amount;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        serviceInput = findViewById(R.id.editTextCostOfService);
        serviceGroup = findViewById(R.id.serviceGroup);
        calculateButton = findViewById(R.id.calculateButton);
        textView = findViewById(R.id.textView2);
        aSwitch = findViewById(R.id.switch1);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(serviceGroup.getCheckedRadioButtonId()) {
                    case R.id.radioButtonAmazing:
                        amount = Double.parseDouble(serviceInput.getText().toString()) * 20 / 100;
                        break;
                    case R.id.radioButtonGood:
                        amount = Double.parseDouble(serviceInput.getText().toString()) * 18 / 100;
                        break;
                    case R.id.radioButtonOk:
                        amount = Double.parseDouble(serviceInput.getText().toString()) * 15 / 100;
                        break;
                }
                if (aSwitch.isChecked()){
                    textView.setText(Math.round(amount)+"");
                }
                else{
                    textView.setText(amount+"");
                }

            }
        });

    }
}