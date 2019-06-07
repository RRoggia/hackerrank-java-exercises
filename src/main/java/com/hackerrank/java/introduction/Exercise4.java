package com.hackerrank.java.introduction;

import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise4 {
	
	/*
	 * In each line of output there should be two columns: 
	 * The first column contains the String and is left justified using exactly 15 characters. 
	 * The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
	 */

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise4.txt");

		try (Scanner scan = new Scanner(System.in);) {
			System.out.println("================================");
			for (int i = 0; i < 3; i++) {
				String s1 = scan.next();
				int x = scan.nextInt();

				System.out.format("%-15s%03d", s1, x);
				System.out.println();
			}
			System.out.println("================================");

		}
	}
}
