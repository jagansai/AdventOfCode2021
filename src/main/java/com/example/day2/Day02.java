
package com.example.day2;

import java.util.Arrays;
import java.util.List;

enum Direction {
	Forward,
	Up,
	Down;

	public static Direction getDirection(final String direction) {
		return switch (direction.toLowerCase()) {
			case "forward" -> Direction.Forward;
			case "down" -> Direction.Down;
			case "up" -> Direction.Up;
			default -> throw new IllegalArgumentException(direction);
		};
	}

	public static int calculateValue(Direction direction, final int value, final int total) {
		return switch (direction) {
			case Forward -> value + total;
			case Up -> total - value;
			case Down -> total + value;
		};
	}
}

record DirectionValue(Direction direction, int value) {
}

public class Day02 {
	public static final String MOVE_RESULT_STR = "Horizontal Position: %d, Depth: %d";

	public static String move(final List<String> commands) {
		int horizontalPos = 0;
		int depth = 0;

		for (var command : commands) {
			var directionAndValue = command.split(" ");
			final Direction direction = Direction.getDirection(directionAndValue[0]);
			final int value = Integer.parseInt(directionAndValue[1]);

			switch (direction) {
				case Forward:
					horizontalPos = Direction.calculateValue(Direction.Forward, value, horizontalPos);
					break;
				case Up:
					depth = Direction.calculateValue(Direction.Up, value, depth);
					break;
				case Down:
					depth = Direction.calculateValue(Direction.Down, value, depth);
			}
		}
		return String.format(MOVE_RESULT_STR, horizontalPos, depth);
	}

	public static void main(String[] args) {
		final List<String> commands = Arrays.asList("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2");
		System.out.println(Day02.move(commands));
	}
}
