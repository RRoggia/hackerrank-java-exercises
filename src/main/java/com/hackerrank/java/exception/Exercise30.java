package com.hackerrank.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise30 {

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise30.txt");
		try (Scanner scan = new Scanner(System.in)) {
			int x = scan.nextInt();
			int y = scan.nextInt();

			System.out.println(x / y);
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} catch (ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
	}

}
