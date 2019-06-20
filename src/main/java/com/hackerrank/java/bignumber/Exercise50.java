package com.hackerrank.java.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise50 {

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise50.txt");
		try (Scanner scan = new Scanner(System.in)) {
			BigInteger firstValue = new BigInteger(scan.nextLine());
			BigInteger secondValue = new BigInteger(scan.nextLine());

			System.out.println(firstValue.add(secondValue));
			System.out.println(firstValue.multiply(secondValue));
		}
	}

}
