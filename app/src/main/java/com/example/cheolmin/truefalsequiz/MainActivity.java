package com.example.cheolmin.truefalsequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button trueButton, falseButton, nextButton;
    private TextView questionText;
    private List<Question> questionBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        initQuestionBank();
        //load q
        questionText.setText(questionBank.get(0)getQuestionText());
    }

    private void initQuestionBank() {
        questionBank = new ArrayList<>();
        questionBank.add(new Question(getString(R.string.girl_bread), true));
        questionBank.add(new Question(getString(R.string.boy_girl_menu), false));
        questionBank.add(new Question(getString(R.string.boy_girl_menu), false));
        questionBank.add(new Question(getString(R.string.bigbang), false)); //add more questions here
        questionBank.add(new Question(getString(R.string.boy_girl_menu), false));
        questionBank.add(new Question(getString(R.string.boy_girl_menu), false));
        questionBank.add(new Question(getString(R.string.boy_girl_menu), false));
        questionBank.add(new Question(getString(R.string.boy_girl_menu), false));


    }
}

    private void wireWidgets() {
        trueButton = (Button) findViewById(R.id.button_true);
        falseButton = (Button) findViewById(R.id.button_false);
        nextButton = (Button) findViewById(R.id.button_next);
        questionText = (TextView) findViewById(R.id.text_question);
    }

    private void setListeners() {
        trueButton.setOnClickListener(this);
        falseButton.setOnClickListener(this);
        nextButton.setOnClickListener( this);
    }

    public TextView getQuestionText() {
        return questionText;
    }


