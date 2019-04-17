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

public class AbsActivity extends AppCompatActivity {
    private Spinner AbsSpinner;
    private EditText AbsReps;
    private EditText AbsSets;
    private EditText AbsNotes;
    private Button AbsSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs);

        AbsSpinner = (Spinner) findViewById(R.id.abs_spinner);
        AbsReps = (EditText) findViewById(R.id.editText_abs_reps);
        AbsSets = (EditText) findViewById(R.id.editText_abs_sets);
        AbsNotes = (EditText) findViewById(R.id.editText_abs_notes);
        AbsSave = (Button) findViewById(R.id.btn_abs_save);


    }
}

