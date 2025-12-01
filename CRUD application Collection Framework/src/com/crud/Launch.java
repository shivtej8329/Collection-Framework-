package com.crud;

import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			
			System.out.println("1. Add student");
			System.out.println("2. Remove student");
			System.out.println("3. Show students");
			System.out.println("=========================================");

			System.out.println("Enter your choice : \n");
			int choice = sc.nextInt();
			
			System.out.println("=========================================");

			switch (choice) {

			case 1: {

				System.out.println("Enter id : ");
				int id = sc.nextInt();
				System.out.println("Enter Name : ");
				String name = sc.next();
				System.out.println("Enter Cource : ");
				String cource = sc.next();
				System.out.println("Enter Fees : ");
				double fees = sc.nextDouble();

				Student s = new Student(id, name, cource, fees);
				String message = OperatorClass.addStudent(s);

				System.out.println(message);
			}
				break;

			case 2: {

			}
				break;

			case 3: {
				OperatorClass.displayStudent();
			}
				break;

			case 4: {
				OperatorClass.displayStudent();
			}
				break;

			case 5: {
				System.exit(0);
			}
			}
		}
	}
}
