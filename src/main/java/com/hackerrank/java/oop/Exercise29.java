package com.hackerrank.java.oop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.hackerrank.java.introduction.IOUtils;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Exercise29 {

	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
		IOUtils.initializeInputStreamForFile("exercise29.txt");
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			for (int i = 0; i < n; i++) {
				mylist.add(sc.nextInt());
			}

			mylist.add("###");
			for (int i = 0; i < m; i++) {
				mylist.add(sc.next());
			}

			Iterator it = func(mylist);
			while (it.hasNext()) {
				Object element = it.next();
				System.out.println((String) element);
			}
		}
	}

	static Iterator func(ArrayList mylist) {
		Iterator it = mylist.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			if (element instanceof String)
				break;
		}
		return it;

	}

}
