package com.hackerrank.java.datastructure;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.hackerrank.IOUtils;

public class Exercise48 {
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise48.txt");

		try (Scanner scan = new Scanner(System.in)) {
			int numberOfPeople = scan.nextInt();
			String[] pair_left = new String[numberOfPeople];
			String[] pair_right = new String[numberOfPeople];

			for (int i = 0; i < numberOfPeople; i++) {
				pair_left[i] = scan.next();
				pair_right[i] = scan.next();
			}
			Set<String> people = new HashSet<>();
			for (int i = 0; i < numberOfPeople; i++) {
				people.add(pair_left[i] + " " + pair_right[i]);
				System.out.println(people.size());
			}
		}
	}
}
