package com.example.dyplome.model;

public abstract class RecycleItem {

    private String name;

    public RecycleItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
