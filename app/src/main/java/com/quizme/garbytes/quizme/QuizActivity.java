package com.quizme.garbytes.quizme;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button mSubmitButton;
    private RadioButton mAnswereAButton;
    private RadioButton mAnswereBButton;
    private RadioButton mAnswereCButton;
    private RadioButton mAnswereDButton;
    private TextView mQuestionText;

    //Here we are calling the TrueFalse constructor several times and create an array of TrueFlase objects
    //This is actually bad practise but we will leave it like so to not make this project too complex
    private TrueFalse[] mQuestionBank = new TrueFalse[]{
            new TrueFalse(R.string.question1,true),
            new TrueFalse(R.string.question2,true),
            new TrueFalse(R.string.question3,true),
            new TrueFalse(R.string.question4,true),
    };

    private int mCurrentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mSubmitButton = (Button)findViewById(R.id.submit_button);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This is an anonymous inner class
                // It will take actions when button is pressed
                Toast.makeText(QuizActivity.this, "Correct! err maybe.. idk.", Toast.LENGTH_LONG);
        }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
