package com.example.brian.finalyearproject.WorkoutDiary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.brian.finalyearproject.R;
import com.example.brian.finalyearproject.WorkoutDiaryActivity;

public class ChestActivity extends AppCompatActivity {

    private Button ChestReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);

        ChestReturn=(Button) findViewById(R.id.btn_chest_back);
       // Spinner ChestSpinner = (Spinner) findViewById(R.id.chest_spinner);

//        ChestReturn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(ChestActivity.this, WorkoutDiaryActivity.class);
//                startActivity(intent);
//            }//end of onClick
//        });//end of onClickListener

        ChestReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChestActivity.this, WorkoutDiaryActivity.class));
            }
        });

        // Create an ArrayAdapter using the string array and a default spinner layout
        // ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.chest_spinner_array, android.R.layout.activity_chest);
        // Specify the layout to use when the list of choices appears
        // adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        // Apply the adapter to the spinner
        // chest_spinner.setAdapter(adapter);
    }
};
