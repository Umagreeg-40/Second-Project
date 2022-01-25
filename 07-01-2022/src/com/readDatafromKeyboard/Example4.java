package com.readDatafromKeyboard;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		String name,add;
		int age;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the name: ");
		name=scn.nextLine();
		
		System.out.println("Enter the age: ");
		age=scn.nextInt();
		
		Scanner scn1=new Scanner(System.in);
		System.out.println("Enter the address: ");
		add=scn1.nextLine();
		
		scn.close();
		scn1.close();
		
		System.out.println("--------");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+add);
	}

}
