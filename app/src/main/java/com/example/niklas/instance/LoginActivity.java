package com.example.niklas.instance;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    String[][] DummyLogins = new String[][]{
            {"user1","pass"},
            {"user2","pass"}
    };
    TextView nameText;
    EditText usernameView;
    EditText passwordView;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nameText = (TextView)findViewById(R.id.NameText);
        usernameView = (EditText)findViewById(R.id.messageText);
        passwordView = (EditText)findViewById(R.id.PasswordText);
        loginBtn = (Button)findViewById(R.id.LoginBtn);

        Typeface type = Typeface.createFromAsset(getAssets(),"Futura Book font.ttf");
        nameText.setTypeface(type);
        usernameView.setTypeface(type);
        passwordView.setTypeface(type);
        loginBtn.setTypeface(type);
    }

    public void loginBtn_Clicked(View v){
        String username = usernameView.getText().toString();
        String password = passwordView.getText().toString();

        if (!username.isEmpty() && !password.isEmpty()){
            login(username,password);
            
        }
        else if(username.isEmpty()){
            usernameView.setError("Username required");
        }
        else if(password.isEmpty()){
            passwordView.setError("Password required");
        }
    }

    private void login (String username, String password){
        if(username == "user" && password == "pass"){
            loginSuccessful(username);
        }
    }

    private void loginSuccessful(String username){
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("username", username);
        startActivity(i);
    }
}
