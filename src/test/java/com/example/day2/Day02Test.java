package com.example.day2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Day02Test {

    @Test
    public void day2Test() {
        {
            final String move_result = Day02.move(Arrays.asList(
                    "forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2"));

            assertEquals(String.format(Day02.MOVE_RESULT_STR, 15, 10), move_result);
        }
        {
            final String move_result = Day02.move(Arrays.asList(
                    "forward 5", "down 5", "forward 8", "up 5", "down 8", "forward 5"));

            assertEquals(String.format(Day02.MOVE_RESULT_STR, 18, 8), move_result);
        }
    }
}
