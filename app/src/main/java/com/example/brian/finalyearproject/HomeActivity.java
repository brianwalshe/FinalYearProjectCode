package com.example.brian.finalyearproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.brian.finalyearproject.R;
import com.example.brian.finalyearproject.LoginSignupActivity.LoginActivity;
import com.example.brian.finalyearproject.WorkoutDiaryActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by brian on 28/03/2019.
 */

public class HomeActivity extends AppCompatActivity {
    private TextView UserEmail;
    private Button SignOut;
    private FirebaseAuth auth;
    private Button RecordWeight;
    private Button RecordWorkout;
    private Button WorkoutArchive;
    private Button WeightArchive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //get firebase auth instance
        auth = FirebaseAuth.getInstance();
        UserEmail = (TextView) findViewById(R.id.txt_useremail);
        SignOut = (Button) findViewById(R.id.btn_signout);
        RecordWeight = (Button) findViewById(R.id.btn_record_weight);
        WorkoutArchive = (Button) findViewById(R.id.btn_workout_diary);
        RecordWorkout = (Button) findViewById(R.id.btn_Home_Record_Workout);
        WeightArchive = (Button) findViewById(R.id.btn_Weight_Diary);


        //get current user
        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        setDataToView(user);

        authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null) {
                    // user auth state is changed - user is null
                    // launch login activity
                    startActivity(new Intent(HomeActivity.this, LoginActivity.class));
                    finish();
                }
            }
        };

        SignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signOut();
            }
        });

        RecordWorkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, WorkoutDiaryActivity.class));
            }
        });

        RecordWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, RecordWeightActivity.class));
            }
        });

        WeightArchive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, ArchiveWeightActivity.class));
            }
        });

//        WorkoutArchive.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(HomeActivity.this, RecordWeightActivity.class));
//            }
//        });


//        RecordWorkout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openWorkoutDiaryActivity();
//            }
//        });

//        RecordWeight.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openWeightActivity();
//            }
//        });




    }

//    public void openWeightActivity() {
//        Intent intent = new Intent(HomeActivity.this, WeightActivity.class);
//        startActivity(intent);
//    }

//    public void openWorkoutDiaryActivity()[
//            Intent intent = new Intent(HomeActivity.this, WorkoutDiaryActivity.class);
//            startActivity(intent);
//    ]



    @SuppressLint("SetTextI18n")
    private void setDataToView(FirebaseUser user) {

        UserEmail.setText("User Email: " + user.getEmail());


    }

    // this listener will be called when there is change in firebase user session
    FirebaseAuth.AuthStateListener authListener = new FirebaseAuth.AuthStateListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
            FirebaseUser user = firebaseAuth.getCurrentUser();
            if (user == null) {
                // user auth state is changed - user is null
                // launch login activity
                startActivity(new Intent(HomeActivity.this, LoginActivity.class));
                finish();
            } else {
                setDataToView(user);

            }
        }


    };

    //sign out method
    public void signOut() {
        auth.signOut();


// this listener will be called when there is change in firebase user session
        FirebaseAuth.AuthStateListener authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null) {
                    // user auth state is changed - user is null
                    // launch login activity
                    startActivity(new Intent(HomeActivity.this, LoginActivity.class));
                    finish();
                }
            }
        };
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        progressBar.setVisibility(View.GONE);
//    }

    @Override
    public void onStart() {
        super.onStart();
        auth.addAuthStateListener(authListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (authListener != null) {
            auth.removeAuthStateListener(authListener);
        }
    }

//    public void setDataToView(FirebaseUser dataToView) {
//        this.dataToView = dataToView;
//    }

}
