package com.hackerrank.java.introduction;

import java.util.Scanner;

import com.hackerrank.java.IOUtils;

public class Exercise9 {

	private static int B;
	private static int H;
	private static boolean flag = true;

	static {
		IOUtils.initializeInputStreamForFile("exercise9.txt");
		try (Scanner scan = new Scanner(System.in);) {
			B = scan.nextInt();
			H = scan.nextInt();
		}

		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			flag = false;
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
	}
}
