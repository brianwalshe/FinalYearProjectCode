package com.example.brian.finalyearproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.brian.finalyearproject.WorkoutDiary.AbsActivity;
import com.example.brian.finalyearproject.WorkoutDiary.ArmsActivity;
import com.example.brian.finalyearproject.WorkoutDiary.BackActivity;
import com.example.brian.finalyearproject.WorkoutDiary.CardioActivity;
import com.example.brian.finalyearproject.WorkoutDiary.ChestActivity;
import com.example.brian.finalyearproject.WorkoutDiary.CoreActivity;
import com.example.brian.finalyearproject.WorkoutDiary.LegsActivity;
import com.example.brian.finalyearproject.WorkoutDiary.ShoulderActivity;


public class WorkoutDiaryActivity extends AppCompatActivity {

    private Button Chest, Back, Shoulders, Arms, Legs, Abs, Core, Cardio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_diary);

        Chest=(Button) findViewById(R.id.btn_chest);
        Back=(Button) findViewById(R.id.btn_back);
        Shoulders=(Button) findViewById(R.id.btn_shoulders);
        Arms=(Button) findViewById(R.id.btn_arms);
        Legs=(Button) findViewById(R.id.btn_legs);
        Abs=(Button) findViewById(R.id.btn_abs);
        Core=(Button) findViewById(R.id.btn_core);
        Cardio=(Button) findViewById(R.id.btn_cardio);


        Chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorkoutDiaryActivity.this, ChestActivity.class);
                startActivity(intent);
            }//end of onClick
        });//end of onClickListener

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorkoutDiaryActivity.this, BackActivity.class);
                startActivity(intent);
            }//end of onClick
        });//end of onClickListener

        Shoulders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorkoutDiaryActivity.this, ShoulderActivity.class);
                startActivity(intent);
            }//end of onClick
        });//end of onClickListener

        Arms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorkoutDiaryActivity.this, ArmsActivity.class);
                startActivity(intent);
            }//end of onClick
        });//end of onClickListener

        Legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorkoutDiaryActivity.this, LegsActivity.class);
                startActivity(intent);
            }//end of onClick
        });//end of onClickListener

        Abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorkoutDiaryActivity.this, AbsActivity.class);
                startActivity(intent);
            }//end of onClick
        });//end of onClickListener

        Core.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorkoutDiaryActivity.this, CoreActivity.class);
                startActivity(intent);
            }//end of onClick
        });//end of onClickListener

        Cardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorkoutDiaryActivity.this, CardioActivity.class);
                startActivity(intent);
            }//end of onClick
        });//end of onClickListener
    }
}
