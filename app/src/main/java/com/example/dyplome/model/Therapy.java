package com.example.dyplome.model;

import java.util.Date;

public class Therapy {
    int id;
    String task;
    Date date;

    public Therapy(int id, String task, Date date) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
