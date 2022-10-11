package com.example.homework13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText To, Subject, Message;
    Button Send;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        To = findViewById(R.id.et_too);
        Message = findViewById(R.id.message);
        Subject = findViewById(R.id.subject);
        Send = findViewById(R.id.send);

        Send.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {


                String to = To.getText().toString();
                String subject = Subject.getText().toString();
                String message = Message.getText().toString();

                Intent To = new Intent(Intent.ACTION_SEND);
                To.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                To.putExtra(Intent.EXTRA_SUBJECT, subject);
                To.putExtra(Intent.EXTRA_TEXT, message);

                To.setType("Email/XAH");
                startActivity(Intent.createChooser(To,"Your Email"));



            }
        });
    }
}