package com.hackerrank.java.strings;

import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise15 {
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise15.txt");
		try (Scanner scan = new Scanner(System.in)) {
			String word = scan.next();
			int substringSize = scan.nextInt();
			System.out.println(getSmallestAndLargest(word, substringSize));
		}
	}

	public static String getSmallestAndLargest(String word, int size) {
		String smallest = "";
		String largest = "";

		for (int i = 0; i <= word.length() - size; i++) {
			String set = word.substring(i, i + size);

			if (smallest.isEmpty() || smallest.compareTo(set) > 0)
				smallest = set;

			if (largest.isEmpty() || largest.compareTo(set) < 1)
				largest = set;

		}

		return smallest + "\n" + largest;
	}

}
