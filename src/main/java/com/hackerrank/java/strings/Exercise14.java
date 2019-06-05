package com.hackerrank.java.strings;

import java.util.Scanner;

import com.hackerrank.java.IOUtils;

public class Exercise14 {
	public static void main(String[] args) {

		IOUtils.initializeInputStreamForFile("exercise14.txt");
		try (Scanner scan = new Scanner(System.in)) {
			String string = scan.next();
			int start = scan.nextInt();
			int end = scan.nextInt();
			System.out.println(string.substring(start, end));
		}

	}
}
