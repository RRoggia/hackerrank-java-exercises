package com.hackerrank.java.introduction;

import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise1 {

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise1.txt");
		readThreeIntegersAndPrintIt();
	}

	public static void readThreeIntegersAndPrintIt() {
		try (Scanner scan = new Scanner(System.in)) {
			for (int i = 0; i < 3; i++) {
				System.out.println(scan.nextInt());
			}
		}
	}
}
