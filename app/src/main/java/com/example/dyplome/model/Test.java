package com.example.dyplome.model;

public class Test {

    //Триада, Шкала Бека, Идеоторная заторможенность Гамильтон, Враждебность, Скорость реакции, настроение

    private Integer id;
    private String name;
    private Integer isPassed;

    public Test(Integer id, String name, Integer isPassed) {
        this.id = id;
        this.name = name;
        this.isPassed = isPassed;
    }

    public Integer isPassed() {
        return isPassed;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
