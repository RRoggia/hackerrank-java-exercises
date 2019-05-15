package com.hackerrank.java.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise12.txt");

		try (Scanner scan = new Scanner(System.in);) {
			double payment = scan.nextDouble();
			scan.close();

			NumberFormat usaFormatter = NumberFormat.getCurrencyInstance(Locale.US);
			NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(new Locale(Locale.ENGLISH.toString(), "IN"));
			NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
			NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);

			System.out.println("US: " + usaFormatter.format(payment));
			System.out.println("India: " + indiaFormatter.format(payment));
			System.out.println("China: " + chinaFormatter.format(payment));
			System.out.println("France: " + franceFormatter.format(payment));
		}

	}
}
