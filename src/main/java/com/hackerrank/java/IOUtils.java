package com.hackerrank.java;

import java.io.InputStream;

import com.hackerrank.java.introduction.Exercise1;

public class IOUtils {
	public static void initializeInputStreamForFile(String filename) {
		InputStream inputStream = Exercise1.class.getClassLoader().getResourceAsStream(filename);
		System.setIn(inputStream);
	}

}
