package com.example.brian.finalyearproject.WorkoutDiary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.brian.finalyearproject.R;

/**
 * Created by brian on 10/04/2019.
 */

public class ShoulderActivity extends AppCompatActivity {
    private Spinner ShoulderSpinner;
    private EditText ShoulderReps;
    private EditText ShoulderSets;
    private EditText ShoulderNotes;
    private Button ShoulderSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulders);

        ShoulderSpinner = (Spinner) findViewById(R.id.shoulders_spinner);
        ShoulderReps = (EditText) findViewById(R.id.editText_shoulders_reps);
        ShoulderSets = (EditText) findViewById(R.id.editText_shoulders_sets);
        ShoulderNotes = (EditText) findViewById(R.id.editText_shoulders_notes);
        ShoulderSave = (Button) findViewById(R.id.btn_shoulders_save);


    }
}