package com.kkndesasendang.sendangsmartlearning.model;

import java.util.ArrayList;

public class MatchQuestionModel {
    private String questionText;
    private ArrayList<String> options;
    private String answer;

    public MatchQuestionModel(String questionText, ArrayList<String> options, String answer) {
        this.questionText = questionText;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public String getAnswer() {
        return answer;
    }

    public String getAnswerFullText() {
        if (answer.equalsIgnoreCase("A")) {
            return options.get(0);
        } else if (answer.equalsIgnoreCase("B")) {
            return options.get(1);
        } else if (answer.equalsIgnoreCase("C")) {
            return options.get(2);
        } else {
            return options.get(3);
        }
    }
}
