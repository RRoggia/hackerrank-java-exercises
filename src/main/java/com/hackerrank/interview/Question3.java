package com.hackerrank.interview;

public class Question3 {
	public static void main(String[] args) {
		Comparator comparator = new Comparator();

		if (comparator.compare("s1", "s1") && !comparator.compare("s1", "s2"))
			System.out.println("string worked");

		if (comparator.compare(1, 1) && !comparator.compare(1, 2))
			System.out.println("int  worked");

		int[] a1 = { 0, 1, 2, 3 };
		int[] a2 = a1;
		int[] a3 = { 0 };
		int[] a4 = { 9, 9, 9, 9 };

		if (comparator.compare(a1, a2) && !comparator.compare(a1, a3) && !comparator.compare(a1, a4))
			System.out.println("array workd");
	}
}

class Comparator {
	public boolean compare(String element1, String element2) {
		return compareTo(element1, element2);
	}

	public boolean compare(int element1, int element2) {
		return compareTo((Integer) element1, (Integer) element2);
	}

	public boolean compare(int[] array1, int[] array2) {
		if (array1.length != array2.length)
			return false;

		for (int i = 0; i < array1.length; i++) {
			if (!compareTo(array1[i], array2[i]))
				return false;
		}

		return true;
	}

	private <T extends Comparable<T>> boolean compareTo(T element1, T element2) {
		return element1.compareTo(element2) == 0;
	}
}