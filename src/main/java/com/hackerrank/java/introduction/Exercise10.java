package com.hackerrank.java.introduction;

import java.util.Scanner;

import com.hackerrank.java.IOUtils;

public class Exercise10 {

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise10.txt");

		try (Scanner scan = new Scanner(System.in)) {
			int value = scan.nextInt();

			String s = Integer.toString(value);

			if (value == Integer.parseInt(s)) {
				System.out.println("Good Job");
			} else {
				System.out.println("Wrong answer.");
			}
		}
	}
}
