package com.example.dyplome.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Therapy {
    int id;
    String task;
    String date;

    public Therapy(int id, String task, String date) {
        this.id = id;
        this.task = task;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
