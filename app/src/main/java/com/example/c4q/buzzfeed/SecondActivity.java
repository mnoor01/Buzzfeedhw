package com.example.c4q.buzzfeed;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by c4q on 11/14/17.
 */

public class SecondActivity extends AppCompatActivity {//Always do a build, so you know how your code works.
    TextView toast;
    int soccerCount = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//After this I will create an XML file
        setContentView(R.layout.activity_second);
        toast = (TextView) findViewById(R.id.toasts);


//        toasts=(TextView) findViewById(R.id.toasts);

    }

    public void takeQuiz(View view) {
        setContentView(R.layout.soccer_xml);

    }

    public void noQuiz(View view) {
        toast.setText("Thank you for playing the first game.");
    }

    public void correct1(View view) {
        soccerCount++;
    }

    public void minus1(View view) {
        soccerCount--;
    }

    public void correct2(View view) {
        soccerCount++;
    }

    public void minus2(View view) {
        soccerCount--;
    }

    public void soccerSubmit(View view) {
        if (soccerCount >= 1) {
            Toast.makeText(getApplicationContext(), "you are a soccer fan.", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "you don't care about soccer", Toast.LENGTH_LONG).show();
        }
        onBackPressed();
    }
//    public void answerClicked(View view){
//        if(view.getId()==R.id.yesButton1){
//            Intent intent=getIntent();
//        }
//        if(view.getId()==R.id.noButton1){
//            Intent intent=getIntent();
//        }
//        if(view.getId()==R.id.yesButton2){
//            Intent intent=getIntent();
//        }
//        if(view.getId()==R.id.noButton2){
//            Intent intent=getIntent();
//        }
//
//
//    }
}
