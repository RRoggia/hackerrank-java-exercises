package com.hackerrank.java.exception;

import java.util.Scanner;

import com.hackerrank.java.IOUtils;

public class Exercise31 {
	public static final MyCalculator my_calculator = new MyCalculator();

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise31.txt");
		try (Scanner scan = new Scanner(System.in);) {
			while (scan.hasNextInt()) {
				int n = scan.nextInt();
				int p = scan.nextInt();

				try {
					System.out.println(my_calculator.power(n, p));
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}

}

class MyCalculator {
	public int power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n or p should not be negative.");
		} else if (n == 0 && p == 0) {
			throw new Exception("n and p should not be zero.");
		}
		return (int) Math.pow(n, p);
	}
}
