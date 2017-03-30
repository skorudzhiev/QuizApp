package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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

    boolean a5a;
    boolean a5b;
    boolean a10c;
    boolean a10d;
    boolean a10f;
    boolean a10i;
    boolean a10j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        RadioButton a1 = (RadioButton) findViewById(R.id.a1a);
        if (a1.isChecked()) {
            qa1 = "1. Your answer is correct!";
        } else {
            qa1 = "1. Incorrect answer; Please try again";
        }

        EditText a2 = (EditText) findViewById(R.id.a2a);
        qa2 = a2.getText().toString();
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
        a5a = a5.isChecked();

        CheckBox ab5 = (CheckBox) findViewById(R.id.a5b);
        a5b = ab5.isChecked();
        if (a5.isChecked() && (ab5.isChecked())) {
            qa5 = "5. Your answer is correct!";
        } else if (a5.isChecked()) {
            qa5 = "5. Correct but not completely! Look around for another clues to get this question answered.";
        } else if (ab5.isChecked()) {
            qa5 = "5. Correct but not completely! Look around for another clues to get this question answered.";
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

        CheckBox a10 = (CheckBox) findViewById(R.id.a10c);
        a10c = a10.isChecked();

        CheckBox a10b = (CheckBox) findViewById(R.id.a10d);
        a10d = a10b.isChecked();

        CheckBox a10c = (CheckBox) findViewById(R.id.a10f);
        a10f = a10c.isChecked();

        CheckBox a10d = (CheckBox) findViewById(R.id.a10i);
        a10i = a10d.isChecked();

        CheckBox a10e = (CheckBox) findViewById(R.id.a10j);
        a10j = a10e.isChecked();

        if (a10.isChecked() && (a10b.isChecked() && (a10c.isChecked() && (a10d.isChecked()
                && (a10e.isChecked()))))) {
            qa10 = "10. Your answer is correct!";
        } else if (a10.isChecked()) {
            qa10 = "10. Correct but not completely! Look around for another clues to get this question answered.";
        } else if (a10b.isChecked()) {
            qa10 = "10. Correct but not completely! Look around for another clues to get this question answered.";
        } else if (a10c.isChecked()) {
            qa10 = "10. Correct but not completely! Look around for another clues to get this question answered.";
        } else if (a10d.isChecked()) {
            qa10 = "10. Correct but not completely! Look around for another clues to get this question answered.";
        } else if (a10e.isChecked()) {
            qa10 = "10. Correct but not completely! Look around for another clues to get this question answered.";
        } else {
            qa10 = "10. Incorrect answer; Please try again";
        }

        String results = "RESULTS: " + "\n" + qa1 + "\n" + qa2 + "\n" + qa3 + "\n" + qa4
                + "\n" + qa5 + "\n" + qa6 + "\n" + qa7 + "\n" + qa8 + "\n" + qa9 + "\n" + qa10;
        Toast.makeText(getApplicationContext(), results, Toast.LENGTH_LONG).show();

    }
}
