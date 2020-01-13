package com.example.sportquiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;

    TextView score, question;

    private Questions mQuestions = new Questions();

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Wynik " + mScore);

        updateQuestion(r.nextInt(mQuestionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.getText() == mAnswer) {
                    mScore++;
                    score.setText("Wynik " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }

            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText() == mAnswer) {
                    mScore++;
                    score.setText("Wynik " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer3.getText() == mAnswer) {
                    mScore++;
                    score.setText("Wynik " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer4.getText() == mAnswer) {
                    mScore++;
                    score.setText("Wynik " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });
    }


    private void updateQuestion(int num) {
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }

    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Koniec gry! Twój wynik to " + mScore + " punktów.")
                .setCancelable(false)
                .setPositiveButton("NOWA GRA",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                finish();
                            }
                        })
                .setNegativeButton("Wyjście",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }
}
