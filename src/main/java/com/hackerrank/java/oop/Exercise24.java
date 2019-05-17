package com.hackerrank.java.oop;

import java.util.Scanner;

import com.hackerrank.java.introduction.IOUtils;

public class Exercise24 {
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise24.txt");
		try (Scanner sc = new Scanner(System.in);) {
			String title = sc.nextLine();
			MyBook newNovel = new MyBook();
			newNovel.setTitle(title);
			System.out.println("The title is: " + newNovel.getTitle());
		}
	}
}

abstract class Book {
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}
}

class MyBook extends Book {
	void setTitle(String s) {
		this.title = s;
	}
}