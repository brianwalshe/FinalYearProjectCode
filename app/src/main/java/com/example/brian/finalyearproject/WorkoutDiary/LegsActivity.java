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

public class LegsActivity extends AppCompatActivity {
    private Spinner LegsSpinner;
    private EditText LegsReps;
    private EditText LegsSets;
    private EditText LegsNotes;
    private Button LegsSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);

        LegsSpinner = (Spinner) findViewById(R.id.legs_spinner);
        LegsReps = (EditText) findViewById(R.id.editText_legs_reps);
        LegsSets = (EditText) findViewById(R.id.editText_legs_sets);
        LegsNotes = (EditText) findViewById(R.id.editText_legs_notes);
        LegsSave = (Button) findViewById(R.id.btn_legs_save);


    }
}
