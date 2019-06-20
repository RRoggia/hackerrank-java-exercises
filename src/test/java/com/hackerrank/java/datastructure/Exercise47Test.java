package com.hackerrank.java.datastructure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;

public class Exercise47Test {

	@Test
	public void testAll() {
		InputStream is = getClass().getClassLoader().getResourceAsStream("exercise47_answer.txt");
		InputStream is2 = getClass().getClassLoader().getResourceAsStream("exercise47.txt");
		Scanner scanQuestion = new Scanner(is2);
		Scanner scanAnswer = new Scanner(is);

		int numberOfQuestion = scanQuestion.nextInt();

		while (numberOfQuestion-- > 0) {
			int n = scanQuestion.nextInt();
			int leap = scanQuestion.nextInt();
			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scanQuestion.nextInt();
			}

			String answer = scanAnswer.nextLine();

			String s = Exercise47.canWin(leap, game) ? "YES" : "NO";
			if (!answer.equals(s))
				System.out.println(n + " " + leap);

			assertEquals(answer, s);
		}
		scanQuestion.close();
		scanAnswer.close();
	}

	@Test
	public void invalidGames() {
		int[] game = { 1, 0 };
		assertFalse(Exercise47.canWin(0, game));
	}

	@Test
	public void winWalking() {
		int[] game = { 0, 0, 0 };
		assertTrue(Exercise47.canWin(0, game));
	}

	@Test
	public void cannotWinWalking() {
		int[] game = { 0, 1, 0 };
		assertFalse(Exercise47.canWin(0, game));
	}

	@Test
	public void winLeaping() {
		int[] games = { 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0 };
		assertTrue(Exercise47.canWin(4, games));
	}

	@Test
	public void cannotLeapFirstWalkIOneThenWinLeaping() {
		int[] games = { 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 };
		assertTrue(Exercise47.canWin(4, games));
	}

	@Test
	public void leapFirstWalkIOneThenWinLeaping() {
		int[] games = { 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1 };
		assertTrue(Exercise47.canWin(4, games));
	}

	@Test
	public void test() {
		int[] games = { 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1 };
		assertFalse(Exercise47.canWin(8, games));
	}

}
