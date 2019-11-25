package com.example.dyplome.model;

public class Test {

    //Триада, Шкала Бека, Идеоторная заторможенность Гамильтон, Враждебность, Скорость реакции, настроение

    int id;
    String name;

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
