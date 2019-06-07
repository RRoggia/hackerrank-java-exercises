package com.hackerrank.java.introduction;

import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise2 {

	/*
	 * Task Given an integer, N , perform the following conditional actions: If N is
	 * odd, print Weird If N is even and in the inclusive range of 2 to 5, print Not
	 * Weird If N is even and in the inclusive range of 6 to 20, print Weird If N is
	 * even and greater than 20, print Not Weird
	 */

	private static final String NOT_WEIRD = "Not Weird";
	private static final String WEIRD = "Weird";

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise2.txt");
		try (Scanner scan = new Scanner(System.in)) {
			while (scan.hasNextInt()) {
				int value = scan.nextInt();

				if (value % 2 != 0) {
					System.out.println(WEIRD);
				} else if ((value >= 2 && value <= 5) || value > 20) {
					System.out.println(NOT_WEIRD);
				} else if (value >= 6 && value <= 20) {
					System.out.println(WEIRD);
				}
			}
		}
	}

}
