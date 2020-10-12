package com.sapient.service;

import java.util.Scanner;

public class MathRunner {
	public static void execute(int choice) {
		MathService mathService = new MathService();
		Scanner sc = new Scanner(System.in);
		switch (choice) {
		case 1:
			System.out.println("Enter index");
			int no = sc.nextInt();
			System.out.println(mathService.getFibonacciNo(no));
			break;
		case 2:
			System.out.println("Enter no");
			int noFactorial = sc.nextInt();

			System.out.println(mathService.getFactorial(noFactorial));
			break;
		case 3:
			System.out.println("Enter no");
			int noPrime = sc.nextInt();
			System.out.println(mathService.checkPrime(noPrime));
			break;
		case 4:
			System.out.println("Enter starting and ending nos");
			int start = sc.nextInt();
			int end = sc.nextInt();
			System.out.println(mathService.returnPrimeArray(start, end));
			break;
		}
		sc.close();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter option");

		System.out.println("1. Fibonacci Element at given Index");
		System.out.println("2. Factorial of No");
		System.out.println("3. Check Prime");
		System.out.println("4. Array of Prime nos");

		int choice = sc.nextInt();
		execute(choice);
		sc.close();
	}
}
