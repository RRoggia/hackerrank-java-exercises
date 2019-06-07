package com.hackerrank.java.advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.hackerrank.IOUtils;

public class Exercise33 {

	public static void main(String[] args) throws Exception {
		IOUtils.initializeInputStreamForFile("exercise33.txt");
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int num = Integer.parseInt(br.readLine().trim());
			Object o;
			Exercise33.Inner.Private a = new Exercise33.Inner().new Private();
			System.out.println(num + " is " + a.powerof2(num));
			o = a;
			System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
		}
	}

	static class Inner {
		private class Private {
			private String powerof2(int num) {
				return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
			}
		}
	}
}
