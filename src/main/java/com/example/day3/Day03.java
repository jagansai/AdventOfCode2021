package com.example.day3;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Day03 {

    private static char getMostOrLeastCommonBit(final List<String> report, final int position,
            final BiPredicate<Integer, Integer> commonalityTest) {

        int zeros = 0;
        int ones = 0;

        for (String r : report) {
            final char c = r.charAt(position);
            if (c == '0') {
                ++zeros;
            } else if (c == '1') {
                ++ones;
            }
        }
        return commonalityTest.test(zeros, ones) ? '0' : '1';
    }

    public static int calculatePowerConsumption(final List<String> report) {
        String gammaRateStr = "";
        String epsilonRateStr = "";

        if (report.isEmpty())
            throw new IllegalArgumentException("Empty report");

        final int columnSize = report.get(0).length();

        for (int i = 0; i < columnSize; ++i) {
            gammaRateStr += getMostOrLeastCommonBit(report, i, (x, y) -> x.compareTo(y) > 0);
            epsilonRateStr += getMostOrLeastCommonBit(report, i, (x, y) -> x.compareTo(y) < 0);
        }
        return Integer.parseInt(gammaRateStr, 2) * Integer.parseInt(epsilonRateStr, 2);
    }

    public static void main(String[] args) {
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

        System.out.println(String.format("Power consumed %d WATTS", value));
    }
}
