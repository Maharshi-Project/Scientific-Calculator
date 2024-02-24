package com.example.calculator;

import java.util.Scanner;

public class Calculator {
	public double addition(double a, double b) {
		return a + b;
	}

	public double subtraction(double a, double b) {
		return a - b;
	}

	public double multiplication(double a, double b) {
		return a * b;
	}

	public double division(double a, double b) {
		return a / b;
	}

	public double squareRoot(double a) {
		return Math.sqrt(a);
	}

	public double factorial(long a) {
		long ans = 1;
		if (a >= 0) {
			while (a > 0) {
				ans *= a;
				a--;
			}
		}
		else
			return Double.NaN;
		return ans;

	}

	public double naturalLogarithm(double a) {
		return Math.log(a);
	}

	public double power(double a, double b) {
		return Math.pow(a, b);
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("************* Scientific Calculator *************\n");

		int choice;
		double a = 0, b = 0;
		long n = 0;

		while (true) {
			System.out.print("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Square Root\n6. Factorial\n7. Natural Log\n8. Power\n0.Exit...\n\nEnter your choice (0-8): ");
			choice = scanner.nextInt();

			// Getting input numbers
			if (choice == 0) {
				System.out.println("Exiting... Bye Bye....;)\n");
				break;
			} else if (choice == 5 || choice == 7) {
				System.out.print("\nEnter any non-negetive real number : ");
				a = scanner.nextDouble();
			} else if (choice == 6) {
				System.out.print("\nEnter any non-negetive natural number : ");
				n = scanner.nextLong();
			} else if (choice >= 1 && choice <= 8) {
				System.out.print("\nEnter first number : ");
				a = scanner.nextDouble();
				System.out.print("\nEnter second number : ");
				b = scanner.nextDouble();
			}

			switch (choice) {
				case 1:
					System.out.println("\n" + a + " + " + b + "  =  " + addition(a, b));
					scanner.nextLine();
					System.out.println("\nPress any key to continue!!");
					scanner.nextLine();
					break;
				case 2:
					System.out.println("\n" + a + " - " + b + "  =  " + subtraction(a, b));
					scanner.nextLine();
					System.out.println("\nPress any key to continue!!");
					scanner.nextLine();
					break;
				case 3:
					System.out.println("\n" + a + " * " + b + "  =  " + multiplication(a, b));
					scanner.nextLine();
					System.out.println("\nPress any key to continue!!");
					scanner.nextLine();
					break;
				case 4:
					System.out.println("\n" + a + " / " + b + "  =  " + division(a, b));
					scanner.nextLine();
					System.out.println("\nPress any key to continue!!");
					scanner.nextLine();
					break;
				case 5:
					System.out.println("\nSquareroot of " + a + "  =  " + squareRoot(a));
					scanner.nextLine();
					System.out.println("\nPress any key to continue!!");
					scanner.nextLine();
					break;
				case 6:
					System.out.println("\n" + n + "!  =  " + factorial(n));
					scanner.nextLine();
					System.out.println("\nPress any key to continue!!");
					scanner.nextLine();
					break;
				case 7:
					System.out.println("\n Natural Log of " + a + "  =  " + naturalLogarithm(a));
					scanner.nextLine();
					System.out.println("\nPress any key to continue!!");
					scanner.nextLine();
					break;
				case 8:
					System.out.println("\n" + a + " ^ " + b + "  =  " + power(a, b));
					scanner.nextLine();
					System.out.println("\nPress any key to continue!!");
					scanner.nextLine();
					break;
			}
		}
	}
}
