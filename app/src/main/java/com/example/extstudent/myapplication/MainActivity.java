package com.example.extstudent.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;
import java.util.Random;



public class MainActivity extends AppCompatActivity {
    private String firstName;
    private String lastName;

    private TextView firstNameTextView = null;
    private TextView lastNameTextView = null;
    private Button submitButton = null;
    private TextView resultText = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set set variables
        this.firstNameTextView = (TextView) findViewById(R.id.editTextFirstName);
        this.lastNameTextView  = (TextView) findViewById(R.id.editTextLastName);
        this.resultText = (TextView) findViewById(R.id.textViewResult);
        this.submitButton = (Button) findViewById(R.id.submitButton);
        this.submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v) {
                Log.d (tag: "First Name:", firstName);
                Log.d (tag: "Last Name:", lastName);
                showResult();

            }
        });                                    }

        private void setUserInfo() {
         String resultSt= "Hi, nice to meet you " + firstName + " "+ lastName;
         this.resultTextView.setText(resultText);
        }
        TextView text = (TextView)findViewById(R.id.textViewTitle);
                text.setTextColor(getResources().getColor(R.color.color1));
    }
}
