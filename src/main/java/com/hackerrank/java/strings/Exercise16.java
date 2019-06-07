package com.hackerrank.java.strings;

import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise16 {

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise16.txt");
		try (Scanner sc = new Scanner(System.in);) {
			String A = sc.next();
			StringBuilder sb = new StringBuilder(A);
			System.out.println(A.equals(sb.reverse().toString()) ? "Yes" : "No");
		}
	}
}
