package com.example.cheolmin.truefalsequiz;

/**
 * Created by cheolminhwang11 on 9/15/17.
 */

public class Question {
    private String questionText;
    private boolean answer;

    public Question(String questionText, boolean answer) {
        this.questionText = questionText;
        this.answer = answer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean isAnswer() {
        return answer;
    }

    //write the check answer method that returns whether or not te supplied boolean answer matches the real answer
    /**
     * @param userAnswer what the user selected
     * @return true if answers match, false otherwise
     */
    public boolean checkAnswer(boolean userAnswer)
    {
        if (answer == userAnswer)
            return true;
        else
            return false;
    }
}
