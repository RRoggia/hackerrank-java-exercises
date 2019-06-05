package com.hackerrank.java.introduction;

import java.util.Scanner;

import com.hackerrank.java.IOUtils;

public class Exercise6 {

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise6.txt");
		
		try (Scanner scan = new Scanner(System.in);) {
			int t = scan.nextInt();
			for (int i = 0; i < t; i++) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				int n = scan.nextInt();

				int result = a;

				for (int j = 0; j <= n - 1; j++) {
					result += (int) Math.pow(2, j) * b;
					System.out.print(result + " ");
				}
				System.out.println();
			}
		}

	}

}
