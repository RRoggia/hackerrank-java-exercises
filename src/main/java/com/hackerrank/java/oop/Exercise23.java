package com.hackerrank.java.oop;

public class Exercise23 {

	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
		System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
	}

}

class Arithmetic {
	public int add(int first, int second) {
		return first + second;
	}
}

class Adder extends Arithmetic {

}