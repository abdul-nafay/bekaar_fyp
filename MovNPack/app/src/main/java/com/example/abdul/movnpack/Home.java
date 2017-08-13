package com.example.abdul.movnpack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import Helpers.Session;

public class Home extends AppCompatActivity {

    TextView passedTextView;
    String passedArg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        passedTextView = (TextView) findViewById(R.id.dynamic_text_view);

        //passedArg = getIntent().getExtras().getString("email");
        //passedTextView.setText(passedArg +" , Mar andar sale");

        passedTextView.setText(Session.sharedInstance.name);
    }
}
