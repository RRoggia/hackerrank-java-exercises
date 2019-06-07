package com.hackerrank.java.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise39 {
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise39.txt");

		try (Scanner scan = new Scanner(System.in)) {
			int numberOfLists = scan.nextInt();
			List<List<Integer>> lists = new ArrayList<>();
			for (int i = 0; i < numberOfLists; i++) {
				int listSize = scan.nextInt();
				List<Integer> list = new ArrayList<>();
				for (int j = 0; j < listSize; j++) {
					int element = scan.nextInt();
					list.add(element);
				}
				lists.add(list);
			}

			int numberOfQueries = scan.nextInt();
			for (int i = 0; i < numberOfQueries; i++) {
				int x = scan.nextInt() - 1;
				int y = scan.nextInt() - 1;

				try {
					System.out.println(lists.get(x).get(y));
				} catch (IndexOutOfBoundsException e) {
					System.out.println("ERROR!");
				}
			}

		}
	}
}
