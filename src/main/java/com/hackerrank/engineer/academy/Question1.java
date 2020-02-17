package com.hackerrank.engineer.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Question1 {
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("engineer1.txt");
		try (Scanner scan = new Scanner(System.in)) {
			int numberOfArrival = scan.nextInt();
			List<Integer> arrival = new ArrayList<>();
			for (int i = 0; i < numberOfArrival; i++) {
				int nextInt = scan.nextInt();
				arrival.add(nextInt);
			}

			int numberOfDuration = scan.nextInt();
			List<Integer> durations = new ArrayList<>();
			for (int i = 0; i < numberOfDuration; i++) {
				int nextInt = scan.nextInt();
				durations.add(nextInt);
			}

			arrival.forEach(p -> System.out.println(p));
			durations.forEach(p -> System.out.println(p));

			int maxEvents = maxEvents(arrival, durations);
			System.out.println("a" + maxEvents);

		}
	}

	public static int maxEvents(List<Integer> arrival, List<Integer> duration) {
		int count = 1;
		for (int i = 0; i < arrival.size(); i++) {
			Integer integer = arrival.get(i);
			Integer integer2 = duration.get(i);

			if (i + 1 < arrival.size()) {
				int lastEqual = arrival.size();
				for (int j = i + 1; j < arrival.size(); j++) {
					Integer integer3 = arrival.get(j);
					Integer integer4 = duration.get(j);

					if (integer != integer3) {
						lastEqual = j - 1;
						break;
					}
					if (integer2 < integer4)
						continue;
					else {
						integer = arrival.get(j);
						integer2 = duration.get(j);
					}

				}
				i = lastEqual;

				Integer integer3 = arrival.get(lastEqual + 1);

				if (integer + integer2 <= integer3) {
					count++;
				}
			}

		}

		return count;

	}
}
