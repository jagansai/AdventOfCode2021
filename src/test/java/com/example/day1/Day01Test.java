package com.example.day1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Day01Test {

    @Test
    public void testDay01() {
        {
            final int result = Day01.solve(Arrays.asList(199,
                    200,
                    208,
                    210,
                    200,
                    207,
                    240,
                    269,
                    260,
                    263));

            assertEquals(7, result);
        }
        {
            final int result = Day01.solve(Arrays.asList(
                    201,
                    200,
                    205,
                    207,
                    206,
                    240,
                    250));
            assertEquals(4, result);
        }
    }
}