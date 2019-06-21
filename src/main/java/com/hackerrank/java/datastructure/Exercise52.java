package com.hackerrank.java.datastructure;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise52 {

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise52.txt");
		try (Scanner scan = new Scanner(System.in);) {
			int n = scan.nextInt();

			Player[] player = new Player[n];
			Checker checker = new Checker();

			for (int i = 0; i < n; i++) {
				player[i] = new Player(scan.next(), scan.nextInt());
			}

			Arrays.sort(player, checker);
			for (int i = 0; i < player.length; i++) {
				System.out.printf("%s %s\n", player[i].name, player[i].score);
			}
		}
	}

}

class Checker implements Comparator<Player> {
	private static final Comparator<Player> a = Comparator.<Player>comparingInt(player -> player.score).reversed()
			.thenComparing(player -> player.name);

	@Override
	public int compare(Player o1, Player o2) {
		return a.compare(o1, o2);
	}

}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}
