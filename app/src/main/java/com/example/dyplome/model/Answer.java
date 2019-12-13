package com.example.dyplome.model;

public class Answer {
    int id;
    int id_test;
    int id_question;
    String text;
    int score;

    public Answer(int id_test, int id_question, String text, int score) {
        this.id_test = id_test;
        this.id_question = id_question;
        this.text = text;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public int getId_question() {
        return id_question;
    }

    public String getText() {
        return text;
    }

    public int getScore() {
        return score;
    }

    public int getId_test() {
        return id_test;
    }

    public void setId_test(int id_test) {
        this.id_test = id_test;
    }
}
