package ru.netology.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    private CashbackHackService service;

    @Before
    public void setUp() {
        service = new CashbackHackService();
    }

    @After
    public void tearDown() {
        service = null;
    }

    @Test
    public void shouldRemain50() {
        int amount = 950;
        int actual = service.remain(amount);
        int expected = 50;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain0() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain300() {
        int amount = 1700;
        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain112JUnit5() {
        int amount = 888;
        int actual = service.remain(amount);
        int expected = 112;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain0JUnit5() {
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain150JUnit5() {
        int amount = 2850;
        int actual = service.remain(amount);
        int expected = 150;

        Assertions.assertEquals(expected, actual);
    }

}
