package com.example.dyplome.model;

public class Score {
    int id;
    int id_test;
    int score;

    public Score(int id_test, int score) {
        this.id_test = id_test;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public int getId_test() {
        return id_test;
    }

    public int getScore() {
        return score;
    }
}
