package org.example;

public class Payment {
    private Float value;
    private Integer clientCount;
    private Integer interval;

    public Payment(Float value, Integer clientCount, Integer interval) {
        this.value = value;
        this.clientCount = clientCount;
        this.interval = interval;
    }

    public Float getValue(Plan plan) {
        return plan.getValue(value, clientCount, interval);
    }
}
