package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


/**
 * This app gets user input as an answer's to a 10 questions in general knowledge
 * and gives feedback to the user in a toast message whether if the answers are correct or not!
 */
public class QuizActivity extends AppCompatActivity {
    //Declaring variables which will be used to store the answers.
    String qa1;
    String qa2;
    String qa3;
    String qa4;
    String qa5;
    String qa6;
    String qa7;
    String qa8;
    String qa9;
    String qa10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    /**
     * This method is called when the user answers all of the questions and
     * press the Submit button.
     */
    public void submit(View view) {
        RadioButton a1 = (RadioButton) findViewById(R.id.a1a);
        if (a1.isChecked()) {
            qa1 = "1. Your answer is correct!";
        } else {
            qa1 = "1. Incorrect answer; Please try again";
        }

        EditText a2 = (EditText) findViewById(R.id.a2a);
        qa2 = a2.getText().toString();
        if (qa2.equals("")) {
            qa2 = "0";
        }
        int qA2 = Integer.parseInt(qa2);
        if (qA2 == 99999) {
            qa2 = "2. Your answer is correct!";
        } else {
            qa2 = "2. Incorrect answer; Please try again";
        }

        RadioButton a3 = (RadioButton) findViewById(R.id.a3c);
        if (a3.isChecked()) {
            qa3 = "3. Your answer is correct!";
        } else {
            qa3 = "3. Incorrect answer; Please try again";
        }

        RadioButton a4 = (RadioButton) findViewById(R.id.a4b);
        if (a4.isChecked()) {
            qa4 = "4. Your answer is correct!";
        } else {
            qa4 = "4. Incorrect answer; Please try again";
        }

        CheckBox a5 = (CheckBox) findViewById(R.id.a5a);
        CheckBox ab5 = (CheckBox) findViewById(R.id.a5b);
        CheckBox ac5 = (CheckBox) findViewById(R.id.a5c);
        CheckBox ad5 = (CheckBox) findViewById(R.id.a5d);
        CheckBox ae5 = (CheckBox) findViewById(R.id.a5e);
        CheckBox af5 = (CheckBox) findViewById(R.id.a5f);

        if (a5.isChecked() && ab5.isChecked() && !ac5.isChecked() && !ad5.isChecked() && !ae5.isChecked() && !af5.isChecked()) {
            qa5 = "5. Your answer is correct!";
        } else {
            qa5 = "5. Incorrect answer; Please try again";
        }

        RadioButton a6 = (RadioButton) findViewById(R.id.a6d);
        if (a6.isChecked()) {
            qa6 = "6. Your answer is correct!";
        } else {
            qa6 = "6. Incorrect answer; Please try again";
        }

        EditText a7 = (EditText) findViewById(R.id.a7a);
        qa7 = a7.getText().toString();
        if (qa7.equals("Venezuela")) {
            qa7 = "7. Your answer is correct!";
        } else {
            qa7 = "7. Incorrect answer; Please try again";
        }

        RadioButton a8 = (RadioButton) findViewById(R.id.a8c);
        if (a8.isChecked()) {
            qa8 = "8. Your answer is correct!";
        } else {
            qa8 = "8. Incorrect answer; Please try again";
        }

        EditText a9 = (EditText) findViewById(R.id.a9a);
        qa9 = a9.getText().toString();
        if (qa9.equals("Amsterdam")) {
            qa9 = "9. Your answer is correct!";
        } else {
            qa9 = "9. Incorrect answer; Please try again";
        }

        CheckBox a10c = (CheckBox) findViewById(R.id.a10c);
        CheckBox a10d = (CheckBox) findViewById(R.id.a10d);
        CheckBox a10f = (CheckBox) findViewById(R.id.a10f);
        CheckBox a10i = (CheckBox) findViewById(R.id.a10i);
        CheckBox a10j = (CheckBox) findViewById(R.id.a10j);

        CheckBox a10a = (CheckBox) findViewById(R.id.a10a);
        CheckBox a10b = (CheckBox) findViewById(R.id.a10b);
        CheckBox a10e = (CheckBox) findViewById(R.id.a10e);
        CheckBox a10g = (CheckBox) findViewById(R.id.a10g);
        CheckBox a10h = (CheckBox) findViewById(R.id.a10h);
        CheckBox a10k = (CheckBox) findViewById(R.id.a10k);
        CheckBox a10l = (CheckBox) findViewById(R.id.a10l);

        if (a10c.isChecked() && a10d.isChecked() && a10f.isChecked() && a10i.isChecked()
                && a10j.isChecked() && !a10a.isChecked() && !a10b.isChecked() && !a10e.isChecked() && !a10g.isChecked()
                && !a10h.isChecked() && !a10k.isChecked() && !a10l.isChecked()) {
            qa10 = "10. Your answer is correct!";
        } else {
            qa10 = "10. Incorrect answer; Please try again";
        }

        String results = "RESULTS: " + "\n" + qa1 + "\n" + qa2 + "\n" + qa3 + "\n" + qa4
                + "\n" + qa5 + "\n" + qa6 + "\n" + qa7 + "\n" + qa8 + "\n" + qa9 + "\n" + qa10;
        Toast.makeText(getApplicationContext(), results, Toast.LENGTH_LONG).show();

    }
}

