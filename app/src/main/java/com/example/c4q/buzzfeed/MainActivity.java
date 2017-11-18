package com.example.c4q.buzzfeed;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {//Approach it like you don;t know anything and just learn
    private SharedPreferences sharedPreferences;
    public static final String SHARED_PREFS_KEY = "sharedPrefsTesting";
    int duration = Toast.LENGTH_SHORT;
    //    public void myAge(View view) {
    private List<Quiz> quizList = new ArrayList<>();
    private int count = 0;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {// Get your recyclerviews setup.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//first I am going to make a linear layout in my xml.
        SharedPreferences sharedPreferences;
        sharedPreferences = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);
        editor = sharedPreferences.edit();
        RecyclerView buzzRecyclerView = (RecyclerView) findViewById(R.id.buzz_recylclerview);
        quizList.add(new Quiz("Do you own a pair of timbs?", getResources().getDrawable(R.drawable.timbs)));
        quizList.add(new Quiz("Do you support a New York Sports team?", getResources().getDrawable(R.drawable.sportsteams)));
        quizList.add(new Quiz("Was the mta fare $1.50 in 1999?", getResources().getDrawable(R.drawable.mta)));
        quizList.add(new Quiz("Have you ever experienced a block party?", getResources().getDrawable(R.drawable.blockparty)));
        quizList.add(new Quiz("Do you remember the old Yankee stadium?", getResources().getDrawable(R.drawable.stadium)));
        quizList.add(new Quiz("Do you talk fast?", getResources().getDrawable(R.drawable.talking)));
        quizList.add(new Quiz("have you ever got wet from a running fire hydrant during the summer?", getResources().getDrawable(R.drawable.firehydrant)));
        CustomAdapter customAdapter = new CustomAdapter(quizList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        buzzRecyclerView.setAdapter(customAdapter);
        buzzRecyclerView.setLayoutManager(linearLayoutManager);


//        yourQuestions();
    }

    public void yesButton(View view) {
        count++;
    }

    public void noButton(View view) {
        count--;
    }

    public void submitButton(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
        if (count >= 3) {
            Toast toast = Toast.makeText(getApplicationContext(), "Wwaaaaaoooooow you are a New Yorker", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Sorry, you are not a New Yorker", Toast.LENGTH_LONG);
            toast.show();
        }
    }


//
//
//  }

}
