package com.hackerrank.java.datastructure;

import java.util.Scanner;

import com.hackerrank.java.IOUtils;

public class Exercise40 {
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise40.txt");
		try (Scanner scan = new Scanner(System.in)) {
			int arraySize = scan.nextInt();
			int[] array = new int[arraySize];

			for (int i = 0; i < arraySize; i++) {
				array[i] = scan.nextInt();
			}

			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
	}
}
