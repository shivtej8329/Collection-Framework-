package com.crud;

import java.util.ArrayList;
import java.util.ListIterator;

public class OperatorClass {

	static ArrayList<Student> student = new ArrayList<Student>();

	public static String addStudent(Student s) {
		student.add(s);

		return "Student Added\n=========================================";
	}

	public static String removeStudent(String name) {
		student.remove(name);

		return "Student removed";
	}

	public static void displayStudent() {
		
		for(Student s : student) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getCource());
			System.out.println(s.getFees());
			System.out.println("\n=========================================");
		}
	}
}
