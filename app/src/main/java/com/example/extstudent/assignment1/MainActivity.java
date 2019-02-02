package com.example.extstudent.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView firstNameTextField = null;
private TextView lastNameTextField = null;
private String firstName = "" ;
private String lastName = "";
private Button SubmitButton = null;
private TextView resultTextView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize variables
        this.firstNameTextField = findViewById(R.id.editTextFirstName);
        this.lastNameTextField = findViewById(R.id.editTextLastName);
        this.resultTextView = findViewById(R.id.textViewResult);
        this.SubmitButton = findViewById(R.id.button);

        this.SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Log.d( "My Submit button",  "OnClick pressed");
             setUserInfo();
             showResult();
             Log.d("First Name: ", firstName);
             Log.d("Last Name: ", lastName);

            }
        });



    }
    private void setUserInfo() {
        this.firstName = this.firstNameTextField.getText().toString();
        this.lastName = this.lastNameTextField.getText().toString();
    }
    private void showResult() {
        String resultStr = "Hi, nice to meet you " + firstName + " " + lastName;
        this.resultTextView.setText(resultStr);
    }


}
