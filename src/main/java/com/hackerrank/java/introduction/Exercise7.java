package com.hackerrank.java.introduction;

import java.util.Scanner;

public class Exercise7 {
	
	/*
	 * For each input variable N and appropriate primitive dataType, you must determine if the given primitives are capable of storing it. If yes, then print:
	 * N can be fitted in:
	 * * dataType
	 * If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: byte < short < int < long).
	 * If the number cannot be stored in one of the four aforementioned primitives, print the line:
	 * N can't be fitted anywhere.
	 */
	
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise7.txt");

		try (Scanner scan = new Scanner(System.in);) {
			int testCases = scan.nextInt();

			for (int i = 0; i < testCases; i++) {
				try {
					long x = scan.nextLong();
					System.out.println(x + " can be fitted in:");
					if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
						System.out.println("* byte");
					}

					if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
						System.out.println("* short");
					}

					if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
						System.out.println("* int");
					}

					if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
						System.out.println("* long");
					}
				} catch (Exception e) {
					System.out.println(scan.next() + " can't be fitted anywhere.");
				}
			}
		}
	}
}
