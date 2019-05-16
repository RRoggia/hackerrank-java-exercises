package com.hackerrank.java.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import com.hackerrank.java.introduction.IOUtils;

public class Exercise19 {
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise19.txt");
		try (Scanner scan = new Scanner(System.in);) {
			int testCases = Integer.parseInt(scan.nextLine());
			while (testCases > 0) {
				String pattern = scan.nextLine();

				try {
					Pattern.compile(pattern);
					System.out.println("Valid");
				} catch (PatternSyntaxException e) {
					System.out.println("Invalid");
				}

				testCases--;
			}
		}
	}

}
