package com.hackerrank.java.datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise37 {
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise37.txt");
		try (Scanner scan = new Scanner(System.in);) {
			int numberOfPerson = scan.nextInt();
			scan.nextLine();

			Map<String, Integer> phoneBook = new HashMap<>();
			for (int i = 0; i < numberOfPerson; i++) {
				String name = scan.nextLine();
				int phone = scan.nextInt();
				phoneBook.put(name, phone);
				scan.nextLine();
			}
			while (scan.hasNext()) {
				String name = scan.nextLine();
				if (!phoneBook.containsKey(name)) {
					System.out.println("Not found");
				} else {
					System.out.println(name + "=" + phoneBook.get(name));
				}
			}
		}
	}
}
