package com.hackerrank.java.datastructure;

import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise46 {

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise46.txt");

		try (Scanner scan = new Scanner(System.in)) {

			int[][] array2d = new int[6][6];

			for (int i = 0; i < 6; i++) {
				String nextLine = scan.nextLine();
				String[] split = nextLine.split(" ");
				for (int j = 0; j < split.length; j++) {
					array2d[i][j] = Integer.parseInt(split[j]);
				}
			}

			int highestHourglasSum = Integer.MIN_VALUE;
			for (int i = 0; i + 2 < array2d.length; i++) {
				for (int j = 0; j + 2 < array2d[i].length; j++) {
					int temporarySum = array2d[i][j] + array2d[i][j + 1] + array2d[i][j + 2] + array2d[i + 1][j + 1]
							+ array2d[i + 2][j] + array2d[i + 2][j + 1] + array2d[i + 2][j + 2];
					highestHourglasSum = highestHourglasSum < temporarySum ? temporarySum : highestHourglasSum;
				}
			}
			System.out.println(highestHourglasSum);
		}
	}
}
