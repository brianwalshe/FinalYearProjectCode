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

public class CardioActivity extends AppCompatActivity {
    private Spinner CardioSpinner;
    private EditText CardioDistance;
    private EditText CardioTime;
    private EditText CardioNotes;
    private Button CardioSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);

        CardioSpinner = (Spinner) findViewById(R.id.cardio_spinner);
        CardioDistance = (EditText) findViewById(R.id.editText_cardio_distance);
        CardioTime = (EditText) findViewById(R.id.editText_cardio_time);
        CardioNotes = (EditText) findViewById(R.id.editText_cardio_notes);
        CardioSave = (Button) findViewById(R.id.btn_cardio_save);


    }
}