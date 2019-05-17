package com.hackerrank.java.oop;

import java.util.Scanner;

import com.hackerrank.java.introduction.IOUtils;

public class Exercise25 {
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise25.txt");
		MyCalculator my_calculator = new MyCalculator();
		System.out.print("I implemented: ");
		ImplementedInterfaceNames(my_calculator);
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			System.out.print(my_calculator.divisor_sum(n) + "\n");
		}
	}

	static void ImplementedInterfaceNames(Object o) {
		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}

}

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisor_sum(int n) {
		if (n == 1)
			return 1;

		int total = n + 1;
		int half = n / 2;

		for (int i = 2; i <= half; i++) {
			if (n % i == 0) {
				total += i;
			}
		}
		return total;
	}

}