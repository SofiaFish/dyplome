package com.example.dyplome.model;

public class TestRecyclerItem {

    private String testName;
    private boolean isPassed;

    public TestRecyclerItem(String testName, boolean isPassed) {
        this.testName = testName;
        this.isPassed = isPassed;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }
}
