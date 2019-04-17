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

public class CoreActivity extends AppCompatActivity {
    private Spinner CoreSpinner;
    private EditText CoreReps;
    private EditText CoreSets;
    private EditText CoreNotes;
    private Button CoreSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core);

        CoreSpinner = (Spinner) findViewById(R.id.core_spinner);
        CoreReps = (EditText) findViewById(R.id.editText_core_reps);
        CoreSets = (EditText) findViewById(R.id.editText_core_sets);
        CoreNotes = (EditText) findViewById(R.id.editText_core_notes);
        CoreSave = (Button) findViewById(R.id.btn_core_save);


    }
}

