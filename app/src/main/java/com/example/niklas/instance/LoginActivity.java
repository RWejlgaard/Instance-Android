package com.example.niklas.instance;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView nameText = (TextView)findViewById(R.id.NameText);
        EditText usernameText = (EditText)findViewById(R.id.UsernameText);
        EditText passwordText = (EditText)findViewById(R.id.PasswordText);
        Button loginBtn = (Button)findViewById(R.id.LoginBtn);

        Typeface type = Typeface.createFromAsset(getAssets(),"Futura Book font.ttf");
        nameText.setTypeface(type);
        usernameText.setTypeface(type);
        passwordText.setTypeface(type);
        loginBtn.setTypeface(type);
    }
}
