package com.example.assignment1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Validation extends AppCompatActivity {
    TextView txt_name, txt_email, txt_password, txt_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);
        txt_name = findViewById(R.id.validname1);
        txt_email = findViewById(R.id.validemail1);
        txt_password = findViewById(R.id.validpassword1);
        txt_number = findViewById(R.id.validnumber1);

        Bundle b1 = getIntent().getExtras();
            String s1 = b1.getString("name");
            String s2 = b1.getString("email");
            String s3 = b1.getString("password");
            String s4 = b1.getString("number");

        txt_name.setText(s1);
        txt_email.setText(s2);
        txt_password.setText(s3);
        txt_number.setText(s4);


    }
}