package com.example.brian.finalyearproject.LoginSignupActivity;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.brian.finalyearproject.LoginSignupActivity.LoginActivity;
import com.example.brian.finalyearproject.HomeActivity;
import com.example.brian.finalyearproject.R;
//import com.firebaseloginapp.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity {

    private EditText editText_Username_Signup, editText_Password_Signup; //editText_Confirm_Password_Signup;
    private Button btn_Login_Signup, btn_Signup_Signup; //btnResetPassword;
    //private ProgressBar progressBar;
    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        //Get Firebase auth instance
        auth = FirebaseAuth.getInstance();

        btn_Login_Signup = (Button) findViewById(R.id.btn_Login_Signup);
        btn_Signup_Signup = (Button) findViewById(R.id.btn_Signup_Signup);
        editText_Username_Signup = (EditText) findViewById(R.id.editText_Username_Signup);
        editText_Password_Signup = (EditText) findViewById(R.id.editText_Password_Signup);
        //editText_Confirm_Password_Signup = (EditText) findViewById(R.id.editText_Confirm_Password_Signup);
        //progressBar = (ProgressBar) findViewById(R.id.progressBar);
        //btnResetPassword = (Button) findViewById(R.id.btn_reset_password);

//        btnResetPassword.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(SignupActivity.this, ResetPasswordActivity.class));
//            }
//        });

//        btn_Login_Signup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(SignupActivity.this, LoginActivity.class));
//                finish();
//            }
//        });

        btn_Login_Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openLoginActivity();
            }
        });

        btn_Signup_Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = editText_Username_Signup.getText().toString().trim();
                String password = editText_Password_Signup.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.length() < 6) {
                    Toast.makeText(getApplicationContext(), "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
                    return;
                }

//                progressBar.setVisibility(View.VISIBLE);
//                //create user
                auth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(SignupActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                //Toast.makeText(SignupActivity.this, "createUserWithEmail:onComplete:" + task.isSuccessful(), Toast.LENGTH_SHORT).show();
                                //progressBar.setVisibility(View.GONE);
                                // If sign in fails, display a message to the user. If sign in succeeds
                                // the auth state listener will be notified and logic to handle the
                                // signed in user can be handled in the listener.
                                if (!task.isSuccessful()) {
                                    Toast.makeText(SignupActivity.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                } else {
                                    startActivity(new Intent(SignupActivity.this, HomeActivity.class));
                                    finish();
                                }
                            }
                        });

            }
        });
    }

    private void openLoginActivity() {
        Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
        startActivity(intent);
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        progressBar.setVisibility(View.GONE);
//    }
}
