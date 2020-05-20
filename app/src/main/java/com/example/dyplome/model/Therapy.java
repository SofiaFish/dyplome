package com.example.dyplome.model;

public class Therapy {
    int id;
    String therapy_name;

    public Therapy(String therapy_name) {
        this.therapy_name = therapy_name;
    }

    public int getId() {
        return id;
    }

    public String getTherapy_name() {
        return therapy_name;
    }
}
