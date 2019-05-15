package com.hackerrank.java.introduction;

import java.util.Calendar;
import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise11.txt");
		try (Scanner scan = new Scanner(System.in)) {
			while (scan.hasNextLine() && scan.hasNext()) {
				int month = Integer.parseInt(scan.next());
				int date = Integer.parseInt(scan.next());
				int year = Integer.parseInt(scan.next());

				System.out.println(findDay(month, date, year));
			}
		}
	}

	public static String findDay(int month, int date, int year) {

		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, date);
		int day = calendar.get(Calendar.DAY_OF_WEEK);

		switch (day) {
		case 1:
			return "SUNDAY";
		case 2:
			return "MONDAY";
		case 3:
			return "TUESDAY";
		case 4:
			return "WEDNESDAY";
		case 5:
			return "THURSDAY";
		case 6:
			return "FRIDAY";
		default:
			return "SATURDAY";
		}

	}

}
