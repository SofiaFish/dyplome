package com.example.dyplome.model;

public class Task {
    String table_name;
    int id;
    String task_name;
    String task;

    public Task(String table_name, int id, String task_name, String task) {
        this.table_name = table_name;
        this.id = id;
        this.task_name = task_name;
        this.task = task;
    }

    public String getTable_name() {
        return table_name;
    }

    public int getId() {
        return id;
    }

    public String getTask_name() {
        return task_name;
    }

    public String getTask() {
        return task;
    }
}
