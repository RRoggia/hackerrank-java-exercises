package com.hackerrank.java.advanced;

import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise44 {
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise44.txt");
		try (Scanner scan = new Scanner(System.in);) {
			int n1 = Integer.parseInt(scan.nextLine());
			int n2 = Integer.parseInt(scan.nextLine());
			int n3 = Integer.parseInt(scan.nextLine());
			int n4 = Integer.parseInt(scan.nextLine());
			int n5 = Integer.parseInt(scan.nextLine());
			int n6 = Integer.parseInt(scan.nextLine());
			Add ob = new Add();
			ob.add(n1, n2);
			ob.add(n1, n2, n3);
			ob.add(n1, n2, n3, n4, n5);
			ob.add(n1, n2, n3, n4, n5, n6);
		}
	}
}

class Add {

	public void add(int... integers) {
		String result = "";
		int sum = 0;
		for (int i = 0; i < integers.length; i++) {
			result += integers[i];
			if (i != integers.length - 1) {
				result += "+";
			} else {
				result += "=";
			}
			sum += integers[i];
		}
		System.out.println(result + sum);
	}
}