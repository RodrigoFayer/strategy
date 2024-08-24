package org.example;

public class Client {
    public Float getStarterValue(float value, int clientCount, int interval) {
        Payment payment = new Payment(value, clientCount, interval);
        return payment.getValue(new StarterPlan());
    }

    public Float getProValue(float value, int clientCount, int interval) {
        Payment payment = new Payment(value, clientCount, interval);
        return payment.getValue(new ProPlan());
    }

    public Float getPremiumValue(float value, int clientCount, int interval) {
        Payment payment = new Payment(value, clientCount, interval);
        return payment.getValue(new PremiumPlan());
    }
}
