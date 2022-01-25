package com.readDatafromKeyboard;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		int num1,num2,sum;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number1: ");
		num1=scanner.nextInt();
		System.out.println("Enter the number2: ");
		num2=scanner.nextInt();
		sum=num1+num2;
		System.out.println("The sum is "+sum);
		scanner.close();
	}

}
