package com.hackerrank.java.strings;

import java.util.Scanner;

import com.hackerrank.java.introduction.IOUtils;

public class Exercise17 {

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise17.txt");
		try (Scanner scan = new Scanner(System.in);) {
			String firstWord = scan.next();
			String secondWord = scan.next();
			boolean ret = isAnagram(firstWord, secondWord);
			System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		}
	}

	public static boolean isAnagram(String firstWord, String secondWord) {
		if (firstWord.length() != secondWord.length())
			return false;

		firstWord = firstWord.toLowerCase();
		secondWord = secondWord.toLowerCase();

		while (firstWord.length() > 0) {
			Character letter = firstWord.charAt(0);
			firstWord = firstWord.replaceAll(letter.toString(), "");
			secondWord = secondWord.replaceAll(letter.toString(), "");
			if (firstWord.length() != secondWord.length())
				return false;
		}
		return true;
	}

}
