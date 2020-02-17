package com.hackerrank.engineer.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Question2 {
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("engineer2.txt");
		try (Scanner scan = new Scanner(System.in)) {
			int nextInt = scan.nextInt();

			List<Integer> num = new ArrayList<>();
			for (int i = 0; i < nextInt; i++) {
				num.add(scan.nextInt());
			}

			int last = scan.nextInt();

			int minSum = minSum(num, last);
			System.out.println("a" + minSum);

		}
	}

	public static int minSum(List<Integer> num, int times) {

		for (int k = times; k > 0; k--) {
			Integer higher = num.get(0);
			int position = 0;
			for (int i = 0; i < num.size(); i++) {
				if (num.get(i) > higher) {
					higher = num.get(i);
					position = i;
				}
			}
			num.set(position, higher / 2);
		}

		int total = 0;
		for (int i = 0; i < num.size(); i++) {
			total += num.get(i);
		}

		return total;

	}
}
