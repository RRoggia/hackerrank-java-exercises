package com.hackerrank.java.advanced;

public class Exercise32 {

	private static Exercise32 INSTANCE = new Exercise32();
	public String str;

	private Exercise32() {
	}

	public static Exercise32 getSingleInstance() {
		return INSTANCE;
	}

}
