package org.example;

public class StarterPlan implements Plan {
    private final Integer factor = 1;
    public Float getValue(float value, int clientCount, int interval) {
        float clientPrice = clientCount * 5.0f;
        float calculatedValue = value * clientPrice * factor;

        if (interval == 12) {
            interval = interval * 10;
        }

        return calculatedValue * interval;
    }

}
