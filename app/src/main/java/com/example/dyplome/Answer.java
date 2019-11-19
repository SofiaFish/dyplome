package com.example.dyplome;

public class Answer {
    int id;
    int id_question;
    String text;
    int score;

    public Answer(int id, int id_question, String text, int score) {
        this.id = id;
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
}
