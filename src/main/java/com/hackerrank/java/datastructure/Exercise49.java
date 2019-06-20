package com.hackerrank.java.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise49 {

	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise49.txt");

		try (Scanner in = new Scanner(System.in);) {
			int testCases = Integer.parseInt(in.nextLine());

			List<Student> studentList = new ArrayList<Student>();
			while (testCases > 0) {
				int id = in.nextInt();
				String fname = in.next();
				double cgpa = in.nextDouble();

				Student st = new Student(id, fname, cgpa);
				studentList.add(st);

				testCases--;
			}

			Comparator<Student> a = Comparator.comparingDouble(Student::getCgpa).reversed()
					.thenComparing(Student::getFname).thenComparingInt(Student::getId);

			Comparator<Student> b = new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					if (o1.getCgpa() > o2.getCgpa())
						return -1;
					else if (o1.getCgpa() < o2.getCgpa())
						return 1;

					if (o1.getFname().compareTo(o2.getFname()) != 0)
						return o1.getFname().compareTo(o2.getFname());

					return o1.getId() - o2.getId();
				}
			};

			Collections.sort(studentList, b);

			for (Student st : studentList) {
				System.out.println(st.getFname());
			}
		}

	}

}

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}
