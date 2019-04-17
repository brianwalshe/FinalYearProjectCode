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

public class ArmsActivity extends AppCompatActivity {
    private Spinner ArmsSpinner;
    private EditText ArmsReps;
    private EditText ArmsSets;
    private EditText ArmsNotes;
    private Button ArmsSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms);

        ArmsSpinner = (Spinner) findViewById(R.id.arms_spinner);
        ArmsReps = (EditText) findViewById(R.id.editText_arms_reps);
        ArmsSets = (EditText) findViewById(R.id.editText_arms_sets);
        ArmsNotes = (EditText) findViewById(R.id.editText_arms_notes);
        ArmsSave = (Button) findViewById(R.id.btn_arms_save);


    }
}
