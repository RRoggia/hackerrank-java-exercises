package com.hackerrank.java.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise43 {

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise43.txt");

		try (final Scanner scan = new Scanner(System.in);) {

			String n = scan.nextLine();

			System.out.println(new BigInteger(n).isProbablePrime(10) == true ? "prime" : "not prime");

		}
	}

}
