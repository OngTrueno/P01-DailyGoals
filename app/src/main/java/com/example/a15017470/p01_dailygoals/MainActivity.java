package com.example.a15017470.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOk = (Button) findViewById(R.id.button);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg1 = (RadioGroup)findViewById(R.id.radioGroup1);
                String selectedRadioValue1 = ((RadioButton)findViewById(rg1.getCheckedRadioButtonId())).getText().toString();
                RadioGroup rg2 = (RadioGroup)findViewById(R.id.radioGroup2);
                String selectedRadioValue2 = ((RadioButton)findViewById(rg2.getCheckedRadioButtonId())).getText().toString();
                RadioGroup rg3 = (RadioGroup)findViewById(R.id.radioGroup3);
                String selectedRadioValue3 = ((RadioButton)findViewById(rg3.getCheckedRadioButtonId())).getText().toString();
                EditText et1 = (EditText)findViewById(R.id.editText);
                // Put the name and age into an array

                String[] info = {et1.getText().toString()};
                // Create an intent to start another activity called
                //  DemoActivities (which we would create later)
                Intent i = new Intent(MainActivity.this,
                        GoalActivity.class);
                // Pass the String array holding the name & age to new activity
                i.putExtra("selectedRadioValue1",selectedRadioValue1);
                i.putExtra("selectedRadioValue2",selectedRadioValue2);
                i.putExtra("selectedRadioValue3",selectedRadioValue3);
                i.putExtra("info", info);

                // Start the new activity
                startActivity(i);
            }
        });
    }
}
