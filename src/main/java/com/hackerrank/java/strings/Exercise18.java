package com.hackerrank.java.strings;

import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise18 {

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise18.txt");

		try (Scanner scan = new Scanner(System.in)) {
			String phrase = scan.nextLine();

			String replace = phrase.replaceAll(" +", " ").trim();
			if (replace.isEmpty()) {
				System.out.println(0);
				return;
			}
			String[] split = replace.split("[^a-zA-Z]+");

			System.out.println(split.length);
			for (String string : split) {
				System.out.println(string);
			}
		}
	}

}
