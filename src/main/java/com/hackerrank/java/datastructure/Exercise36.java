package com.hackerrank.java.datastructure;

import java.util.ArrayList;
import java.util.Scanner;

import com.hackerrank.java.IOUtils;

public class Exercise36 {

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise36.txt");
		try (Scanner scan = new Scanner(System.in)) {
			int numberOfIntegers = scan.nextInt();

			ArrayList<Integer> integers = new ArrayList<>();
			for (int i = 0; i < numberOfIntegers; i++) {
				integers.add(scan.nextInt());
			}

			int numberOfQueries = scan.nextInt();

			for (int i = 0; i < numberOfQueries; i++) {
				String next = scan.next();
				int index = 0;
				switch (next) {
				case "Insert":
					index = scan.nextInt();
					int number = scan.nextInt();
					integers.add(index, number);
					break;
				case "Delete":
					index = scan.nextInt();
					integers.remove(index);
					break;
				}
			}

			integers.forEach(number -> System.out.print(number + " "));
		}
	}

}
