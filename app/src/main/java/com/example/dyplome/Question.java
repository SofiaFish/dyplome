package com.example.dyplome;

public class Question {
    int id;
    int id_test;
    String question;

    public Question(int id, int id_test, String question) {
        this.id = id;
        this.id_test = id_test;
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public int getId_test() {
        return id_test;
    }

    public String getQuestion() {
        return question;
    }
}
