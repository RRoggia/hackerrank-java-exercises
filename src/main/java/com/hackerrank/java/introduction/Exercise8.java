package com.hackerrank.java.introduction;

import java.util.Scanner;

import com.hackerrank.java.IOUtils;

public class Exercise8 {
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise8.txt");
		try (Scanner scan = new Scanner(System.in);) {
			int lineCounter = 1;
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				System.out.println(lineCounter++ + " " + line);
			}
		}
	}
}
