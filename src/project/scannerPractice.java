package project;

import java.util.Scanner;

public class scannerPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1:" );
		int number1 = scanner.nextInt();
		System.out.println("The numer you entered is: " + number1);
		
		System.out.println("Enter Number2:" );
		int number2 = scanner.nextInt();
		System.out.println("The number you entered is: " + number2);
		
		System.out.println("Enter Option:" );
		System.out.println("1: Add" );
		System.out.println("2: Subtract" );
		System.out.println("3: Multiply" );
		System.out.println("4: Divide" );
		int number3 = scanner.nextInt();
		System.out.println("The number you entered is: " + number3);
		
		int result = 0;
		char tool = '+';
	
		
		switch(number3) {
		case 1:
			tool = '+';
			result = number1 + number2;
			break;
		case 2:
			tool = '-';
			result = number1 - number2;
			break;
		case 3:
			tool = '*';
			result = number1 * number2;
			break;
		case 4:
			tool = '/';
			result = number1 / number2;
			break;	
		}
		

		System.out.printf("%d %c %d = %d",number1, tool,number2,  result).println();
	}

}
