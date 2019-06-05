package com.hackerrank.java.introduction;

import java.util.Scanner;

import com.hackerrank.java.IOUtils;

public class Exercise3 {

	/*
	 * There are three lines of input: The first line contains an integer. The
	 * second line contains a double. The third line contains a String.
	 * 
	 * There are three lines of output: On the first line, print String: followed by
	 * the unaltered String read from stdin. On the second line, print Double:
	 * followed by the unaltered double read from stdin. On the third line, print
	 * Int: followed by the unaltered integer read from stdin.
	 */

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise3.txt");
		try (Scanner scan = new Scanner(System.in)) {

			int integerInput = scan.nextInt();
			double doubleInput = scan.nextDouble();
			scan.nextLine();
			String stringInput = scan.nextLine();

			System.out.println("String: " + stringInput);
			System.out.println("Double: " + doubleInput);
			System.out.println("Int: " + integerInput);
		}

	}

}
