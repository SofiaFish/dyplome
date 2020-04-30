package com.example.dyplome.model;

public class TestRecyclerItem{

    private String name;
    private int isPassed;

    public TestRecyclerItem(String name, int isPassed) {
        this.name = name;
        this.isPassed = isPassed;
    }

    public String getName() {
        return name;
    }

    public int isPassed() {
        return isPassed;
    }
}
