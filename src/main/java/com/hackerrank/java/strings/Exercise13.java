package com.hackerrank.java.strings;

import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise13 {
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise13.txt");
		try (Scanner scan = new Scanner(System.in)) {
			String firstString = scan.next();
			String secondString = scan.next();

			System.out.println(firstString.length() + secondString.length());
			System.out.println(firstString.compareTo(secondString) > 0 ? "Yes" : "No");
			StringBuilder sb = new StringBuilder();
			String string = sb.append(firstString.substring(0, 1).toUpperCase())
					.append(firstString.substring(1, firstString.length())).append(" ")
					.append(secondString.substring(0, 1).toUpperCase())
					.append(secondString.substring(1, secondString.length())).toString();
			System.out.println(string);
		}
	}
}
