package com.hackerrank.java.introduction;

import java.io.InputStream;

public class IOUtils {
	public static void initializeInputStreamForFile(String filename) {
		InputStream inputStream = Exercise1.class.getClassLoader().getResourceAsStream(filename);
		System.setIn(inputStream);
	}

}
