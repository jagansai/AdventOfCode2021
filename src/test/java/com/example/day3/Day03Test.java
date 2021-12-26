package com.example.day3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Day03Test {

    @Test
    public void testDay03() {

        int value = Day03.calculatePowerConsumption(Arrays.asList(
                "00100",
                "11110",
                "10110",
                "10111",
                "10101",
                "01111",
                "00111",
                "11100",
                "10000",
                "11001",
                "00010",
                "01010"));

        assertEquals(198, value);
    }

}
