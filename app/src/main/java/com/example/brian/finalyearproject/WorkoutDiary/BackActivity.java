package com.example.brian.finalyearproject.WorkoutDiary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.brian.finalyearproject.R;
import com.example.brian.finalyearproject.WorkoutDiaryActivity;


public class BackActivity extends AppCompatActivity {
    private Spinner BackSpinner;
    private EditText BackReps;
    private EditText BackSets;
    private EditText BackNotes;
    private Button BackSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        BackSpinner = (Spinner) findViewById(R.id.back_spinner);
        BackReps = (EditText) findViewById(R.id.editText_back_reps);
        BackSets = (EditText) findViewById(R.id.editText_back_sets);
        BackNotes = (EditText) findViewById(R.id.editText_back_notes);
        BackSave = (Button) findViewById(R.id.btn_back_save);


    }
}


//public class BackActivity extends AppCompatActivity {
//
//    private Button BackReturn;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        //setContentView(R.layout.activity_back);
//
//        //BackReturn=(Button) findViewById(R.id.btn_back_back);
//        Spinner ChestSpinner = (Spinner) findViewById(R.id.chest_spinner);
//
//        BackReturn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(BackActivity.this, WorkoutDiaryActivity.class);
//                startActivity(intent);
//            }//end of onClick
//        });//end of onClickListener
//
//        // Create an ArrayAdapter using the string array and a default spinner layout
//        // ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.chest_spinner_array, android.R.layout.activity_chest);
//        // Specify the layout to use when the list of choices appears
//        // adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
//        // Apply the adapter to the spinner
//        // chest_spinner.setAdapter(adapter);
//    }
//}
