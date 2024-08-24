package org.example;

public class ProPlan implements Plan{
    private final Integer factor = 2;

    public Float getValue(float value, int clientCount, int interval) {
        float clientPrice = clientCount * 8.0f;
        float calculatedValue = value * clientPrice * factor;

        if (interval == 12) {
            interval = interval * 10;
        }

        return calculatedValue * interval;
    }
}
