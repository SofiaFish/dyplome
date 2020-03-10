package com.example.dyplome.model;

public class TestRecyclerItem {

    private String testName;
    private int isPassed;

    public TestRecyclerItem(String testName, int isPassed) {
        this.testName = testName;
        this.isPassed = isPassed;
    }

    public String getTestName() {
        return testName;
    }

    public int isPassed() {
        return isPassed;
    }
}
