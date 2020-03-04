package com.example.mlfeatureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    EditText email, password;
    Button button;

    String myEmail, myPassword;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();

    }

    private void bindView() {
        email = findViewById(R.id.et_email);
        password = findViewById(R.id.et_password);
        button = findViewById(R.id.btn_register);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getdata();
            }
        });
    }

    private void getdata() {

        myEmail=email.getText().toString();
        myPassword=password.getText().toString();
        

    }
}
