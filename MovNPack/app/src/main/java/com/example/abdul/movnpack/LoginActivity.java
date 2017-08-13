package com.example.abdul.movnpack;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Helpers.Session;
import Helpers.Utility;


public class LoginActivity extends AppCompatActivity {

   // public static final String ARG_FROM_MAIN = "email";
    EditText emailTextView,passwordText;
    String name, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailTextView = (EditText) findViewById(R.id.email_text_input);
        passwordText = (EditText) findViewById(R.id.password_text_input);

        emailTextView.setHint("Enter Email");
        passwordText.setHint("Enter Password");


    }



    public void sendMessage(View view) {
        Button button = (Button) findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (authentication()){
                    Intent myIntent = new Intent(LoginActivity.this, Home.class);
                    //myIntent.putExtra("email", emailTextView.getText().toString());
                    //myIntent.putExtra("email", name.getText())
                    startActivity(myIntent);
                    //// Session Working initialized
                    Session s = Session.getInstance();
                    s.name = emailTextView.getText().toString();
                    s.password = passwordText.getText().toString();
                    // I assume Page.class is your second ativity
                    //Intent intent = new Intent(this, Page.class);
                  //intent.putExtra("arg", getText()); // getText() SHOULD NOT be static!!!
                    //startActivity(intent);

                }
                else
                {
                    Utility.makeToast("Invalid username or password",getApplicationContext());
                }
            }
        });

    }

    public boolean authentication(){
        name = emailTextView.getText().toString();
        password = passwordText.getText().toString();
        return (name.equalsIgnoreCase("zafar") && password.matches("1234") );

        }




    }

