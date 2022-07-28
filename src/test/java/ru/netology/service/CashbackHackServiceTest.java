package ru.netology.service;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    private CashbackHackService service;

    @BeforeSuite
    public void setUp() {
        service = new CashbackHackService();
    }

    @AfterSuite
    public void tearDown() {
        service = null;
    }


    @Test
    public void shouldRemain50() {
        int actual = service.remain(950);
        int expected = 50;

        assertEquals(actual, expected);
    }


    @Test
    public void shouldRemain0() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }


    @Test
    public void shouldRemain300() {
        int actual = service.remain(1700);
        int expected = 300;

        assertEquals(actual, expected);
    }

}