package com.hackerrank.java.strings;

import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise20 {
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise20.txt");
		try (Scanner in = new Scanner(System.in);) {
			while (in.hasNext()) {
				String IP = in.next();
				System.out.println(IP.matches(new MyRegex().pattern));
			}
		}
	}

}

class MyRegex {
	public String pattern = "(([0-2][0-5][0-5]|2[0-4][0-9]|0?[0-9][0-9]|0?0?[0-9])\\.){3}([0-2][0-5][0-5]|2[0-4][0-9]|0?[0-9][0-9]|0?0?[0-9])$";
}
