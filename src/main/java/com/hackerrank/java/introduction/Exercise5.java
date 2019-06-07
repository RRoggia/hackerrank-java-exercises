package com.hackerrank.java.introduction;

import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise5 {
	
	/*
	 * Print 10 lines of output; each line i (where 1 <= i <=10) contains the result of (N x i) in the form: N x i = result.
	 */

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise5.txt");

		try (Scanner scan = new Scanner(System.in);) {
			int firstArgument = scan.nextInt();
			for (int i = 1; i < 11; i++) {
				System.out.println(firstArgument + " x " + i + " = " + firstArgument * i);
			}
		}
	}

}
