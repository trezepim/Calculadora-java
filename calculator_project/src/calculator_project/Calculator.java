package calculator_project;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1 = 0;
		double num2 = 0;
		double result = 0;
		char operator = 0;
		
		System.out.println("Enter the first number: ");
		num1 = sc.nextDouble();
		
		System.out.println("Enter the operator (+, -, *, /): ");
		operator = sc.next().charAt(0);
		
		System.out.println("Enter the second number: ");
		num2 = sc.nextDouble();
		
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("Invalid operator.");
	}
		
		System.out.println(num1 + " " + operator + " " + num2 + ": " + result);
		
		sc.close();
	}

}
