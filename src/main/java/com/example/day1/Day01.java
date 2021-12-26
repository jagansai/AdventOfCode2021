package com.example.day1;

import java.util.Arrays;
import java.util.List;

public final class Day01 {

	private Day01() {
	}

	public static int solve(final List<Integer> reports) {

		int prev = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < reports.size(); i++) {
			if (i != 0 && prev < reports.get(i)) {
				++count;
			}
			prev = reports.get(i);
		}
		return count;
	}

	public static void main(String[] args) {
		final int count = Day01.solve(Arrays.asList(199,
				200,
				208,
				210,
				200,
				207,
				240,
				269,
				260,
				263));

		System.out.println(
				String.format("there are %d measurements that are larger than the previous measurement", count));
	}
}
