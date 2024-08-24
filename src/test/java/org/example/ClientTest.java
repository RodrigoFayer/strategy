package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    @Test
    void getStarterValue() {
        Client client = new Client();
        Float value = client.getStarterValue(100.0f, 10, 6);
        assertEquals(30000.0f, value);
    }

    @Test
    void getAnnualStarterValue() {
        Client client = new Client();
        Float value = client.getStarterValue(100.0f, 10, 12);
        assertEquals(600000.0f, value);
    }

    @Test
    void getProValue() {
        Client client = new Client();
        Float value = client.getProValue(100.0f, 10, 6);
        assertEquals(96000.0f, value);
    }

    @Test
    void getAnnualProValue() {
        Client client = new Client();
        Float value = client.getProValue(100.0f, 10, 12);
        assertEquals(1920000.0f, value);
    }

    @Test
    void getPremiumValue() {
        Client client = new Client();
        Float value = client.getPremiumValue(100.0f, 10, 6);
        assertEquals(180000.0f, value);
    }
}