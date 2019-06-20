package com.hackerrank.java.datastructure;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.hackerrank.IOUtils;

public class Exercise47 {

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise47.txt");
		try (Scanner scan = new Scanner(System.in);) {
			int q = scan.nextInt();
			while (q-- > 0) {
				int n = scan.nextInt();
				int leap = scan.nextInt();
				int[] game = new int[n];
				for (int i = 0; i < n; i++) {
					game[i] = scan.nextInt();
				}
				System.out.println((canWin(leap, game)) ? "YES" : "NO");
			}
		}
	}

	public static boolean canWin(int leap, int[] game) {
		if (leap == 0 || leap == 1) {
			return canWalkThroughGame(game);
		}

		Set<Integer> alreadyProcessed = new HashSet<>();
		return tryAllThePossibilitiesOfLeapingNotProcessed(leap, 0, game, alreadyProcessed);

	}

	private static boolean canWalkThroughGame(int[] game) {
		for (int i = 0; i < game.length; i++) {
			if (game[i] == 1)
				return false;
		}
		return true;
	}

	private static boolean tryAllThePossibilitiesOfLeapingNotProcessed(int leap, int currentPosition, int[] game,
			Set<Integer> alreadyProcessed) {
		if (currentPosition + leap >= game.length)
			return true;

		alreadyProcessed.add(currentPosition);

		if (tryToLeapUntilTheEnd(leap, currentPosition, game, alreadyProcessed))
			return true;

		if (walkForwardAndTryingToLeapUntilTheEnd(leap, currentPosition, game, alreadyProcessed))
			return true;

		if (walkBackwardsAndTryingToLeapUntilTheEnd(leap, currentPosition, game, alreadyProcessed))
			return true;

		return false;

	}

	private static boolean tryToLeapUntilTheEnd(int leap, int currentPosition, int[] game,
			Set<Integer> alreadyProcessed) {
		if (game[currentPosition + leap] == 0) {
			if (alreadyProcessed.contains(currentPosition + leap))
				return false;

			boolean isAWin = tryAllThePossibilitiesOfLeapingNotProcessed(leap, currentPosition + leap, game,
					alreadyProcessed);
			if (isAWin)
				return isAWin;
		}
		return false;
	}

	private static boolean walkForwardAndTryingToLeapUntilTheEnd(int leap, int currentPosition, int[] game,
			Set<Integer> alreadyProcessed) {
		for (int i = currentPosition + 1; i < game.length && game[i] == 0; i++) {
			if (alreadyProcessed.contains(i))
				continue;

			alreadyProcessed.add(i);

			boolean isAWin = tryAllThePossibilitiesOfLeapingNotProcessed(leap, i, game, alreadyProcessed);
			if (isAWin)
				return isAWin;

		}

		return false;
	}

	private static boolean walkBackwardsAndTryingToLeapUntilTheEnd(int leap, int currentPosition, int[] game,
			Set<Integer> alreadyProcessed) {

		for (int i = currentPosition - 1; i > 0 && game[i] == 0; i--) {
			if (alreadyProcessed.contains(i))
				continue;

			alreadyProcessed.add(i);

			boolean isAWin = tryAllThePossibilitiesOfLeapingNotProcessed(leap, i, game, alreadyProcessed);
			if (isAWin)
				return isAWin;

		}
		return false;
	}

}
