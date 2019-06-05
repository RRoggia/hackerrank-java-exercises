package com.hackerrank.java.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.hackerrank.java.IOUtils;

public class Exercise35 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		IOUtils.initializeInputStreamForFile("exercise35.txt");
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isOdd() {
		return number -> number % 2 == 0 ? false : true;
	}

	public PerformOperation isPrime() {
		return number -> {
			if (number % 2 == 0) {
				if (number == 2) {
					return true;
				} else {
					return false;
				}
			}

			int numberOfDivisor = 0;

			for (int i = 3; i <= number; i += 2) {
				if (number % i == 0) {
					numberOfDivisor++;
				}
				if (numberOfDivisor >= 2) {
					return false;
				}
			}

			return true;

		};
	}

	public PerformOperation isPalindrome() {
		return number -> {
			StringBuilder sb = new StringBuilder();
			sb.append(String.valueOf(number)).reverse();
			return String.valueOf(number).equals(sb.toString());
		};
	}
}
