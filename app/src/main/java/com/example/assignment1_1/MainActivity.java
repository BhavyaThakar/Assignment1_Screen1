package com.example.assignment1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2, e3, e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.name2);
        e2 = findViewById(R.id.email2);
        e3 = findViewById(R.id.password2);
        e4 = findViewById(R.id.number2);

    }

    public void validateinfo(View view) {
        Intent i1 = new Intent(this,Validation.class);
        i1.putExtra("name",e1.getText().toString());
        i1.putExtra("email",e2.getText().toString());
        i1.putExtra("password",e3.getText().toString());
        i1.putExtra("number", e4.getText().toString());




        startActivity(i1);
       



    }
}