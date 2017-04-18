package com.example.a15017470.p01_dailygoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class GoalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal);

// Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        String selectedRadioValue1 = i.getStringExtra("selectedRadioValue1");
        String selectedRadioValue2 = i.getStringExtra("selectedRadioValue2");
        String selectedRadioValue3 = i.getStringExtra("selectedRadioValue3");
        // Get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        // Get the TextView object
        TextView tv8 = (TextView) findViewById(R.id.textView8);
        TextView tv9 = (TextView) findViewById(R.id.textView9);
        TextView tv10 = (TextView) findViewById(R.id.textView10);
        TextView tv11 = (TextView) findViewById(R.id.textView11);
        // Display the name and age on the TextView
        tv8.setText("Read up on materials before class : " + selectedRadioValue1);
        tv9.setText("Arrive on time so as not to miss important part of the lesson : " + selectedRadioValue2);
        tv10.setText("Attempt the problem myself : " + selectedRadioValue3);
        tv11.setText("Reflection : " + info[0]);
    }

}
