package com.example.brian.finalyearproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.brian.finalyearproject.R;
import com.example.brian.finalyearproject.LoginSignupActivity.LoginActivity;
import com.example.brian.finalyearproject.LoginSignupActivity.SignupActivity;

public class MainActivity extends AppCompatActivity {

   private Button Main_Login;
   private Button Create_Account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Main_Login=(Button) findViewById(R.id.btn_login_main);
        Button Create_Account=(Button) findViewById(R.id.btn_create_account);

        Main_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openLoginActivity();
            }
        });

        Create_Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openSignupActivity();
            }
        });
    }

    public void openLoginActivity() {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void openSignupActivity() {
        Intent intent = new Intent(MainActivity.this, SignupActivity.class);
        startActivity(intent);
    }

}
