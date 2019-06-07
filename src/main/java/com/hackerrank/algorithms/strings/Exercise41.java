package com.hackerrank.algorithms.strings;

import java.io.IOException;
import java.util.Scanner;

import com.hackerrank.java.IOUtils;

public class Exercise41 {

	public static void main(String[] args) throws IOException {
		IOUtils.initializeInputStreamForFile("exercise41.txt");

		try (Scanner scan = new Scanner(System.in);) {
			int tests = scan.nextInt();
			for (int i = 0; i < tests; i++) {
				String s = scan.nextLine();

				String result = superReducedString(s);

				System.out.println(result);
			}
		}
	}

	public static String superReducedString(String s) {
		if (s.isEmpty())
			return "Empty String";

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1))
				return superReducedString(s.substring(0, i) + s.substring(i + 2, s.length()));
		}
		return s;

	}

}
