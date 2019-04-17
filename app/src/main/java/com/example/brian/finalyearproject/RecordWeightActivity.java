package com.example.brian.finalyearproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Log;


import com.example.brian.finalyearproject.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
//import com.google.firebase.quickstart.database.R;
//import com.google.firebase.quickstart.database.Post;
//import com.google.firebase.quickstart.database.User;
import java.util.HashMap;
import java.util.Map;


public class RecordWeightActivity extends AppCompatActivity {

    private static final String TAG = "RecordWeightActivity";
    private static final String REQUIRED = "Required";

    private DatabaseReference mDatabase;

    private EditText editRecordWeight;
    private Button btnSubmitWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        mDatabase = FirebaseDatabase.getInstance("https://finalyearproject-c4ec8.firebaseio.com/Users").getReference();


        editRecordWeight = (EditText) findViewById(R.id.editText_Record_Weight);
        btnSubmitWeight = (Button) findViewById(R.id.btn_Save_Weight);

        btnSubmitWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value =  editRecordWeight.getText().toString();

                DatabaseReference childRef = mDatabase.child("Weight");

                childRef.setValue(value);
            }
        });

    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_weight_entry);
//
//        // [START initialize_database_ref]
//        mDatabase = FirebaseDatabase.getInstance("https://finalyearproject-c4ec8.firebaseio.com/").getReference();
//        // [END initialize_database_ref]
//
//        editRecordWeight = (EditText) findViewById(R.id.editRecordWeight);
//        btnSubmitWeight = (Button) findViewById(R.id.btnSubmitWeight);
//
//        btnSubmitWeight.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                submitWeight();
//            }
//        });
//    }
//
//    private void submitWeight(){
//        final String weight = editRecordWeight.getText().toString();
//
//        //Weight is Required
//        if (TextUtils.isEmpty(weight)){
//            editRecordWeight.setError(REQUIRED);
//            return;
//        }
//
//        //Disable the submit button so weight can only be recorded once
//        setEditingEnabled(false);
//        Toast.makeText(this, "Weight Recording...", Toast.LENGTH_SHORT).show();
//
//        //
//        // [START single_value_read]
//        //final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//        final String userId = getUid();
//        mDatabase.child("users").child(userId).addListenerForSingleValueEvent(
//                new ValueEventListener() {
//                    @Override
//                    public void onDataChange(DataSnapshot dataSnapshot) {
//                        // Get user value
//                        User user = dataSnapshot.getValue(User.class);
//
//                        // [START_EXCLUDE]
//                        if (user == null) {
//                            // User is null, error out
//                            Log.e(TAG, "User " + userId + " is unexpectedly null");
//                            Toast.makeText(RecordWeightActivity.this,
//                                    "Error: could not fetch user.",
//                                    Toast.LENGTH_SHORT).show();
//                        } else {
//                            // Write new post
//                            recordWeight(userId, weight);
//                        }
//
//                        // Finish this Activity, back to the stream
//                        setEditingEnabled(true);
//                        finish();
//                        // [END_EXCLUDE]
//                    }
//
//                    @Override
//                    public void onCancelled(DatabaseError databaseError) {
//                        Log.w(TAG, "getUser:onCancelled", databaseError.toException());
//                        // [START_EXCLUDE]
//                        setEditingEnabled(true);
//                        // [END_EXCLUDE]
//                    }
//                });
//        // [END single_value_read]
//    }
//
////    private void setEditingEnabled(boolean enabled) {
////        editRecordWeight.setEnabled(enabled);
////        if (enabled) {
////            btnSubmitWeight.show();
////        } else {
////            btnSubmitWeight.hide();
////        }
////    }
//
////    // [START write_fan_out]
////    private void recordWeight(String userId, String weight) {
////        // Create new post at /user-posts/$userid/$postid and at
////        // /posts/$postid simultaneously
////        String key = mDatabase.child("weights").push().getKey();
////        Post post = new Post(userId, weight);
////        Map<String, Object> postValues;
////        postValues = post.toMap();
////
////        Map<String, Object> childUpdates = new HashMap<>();
////        childUpdates.put("/weights/" + key, postValues);
////        childUpdates.put("/user-weights/" + userId + "/" + key, postValues);
////
////        mDatabase.updateChildren(childUpdates);
////    }
////    // [END write_fan_out]

    }








