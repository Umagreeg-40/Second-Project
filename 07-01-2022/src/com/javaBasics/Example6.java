package com.javaBasics;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		int r;
		double pi=3.14,area;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		r=scn.nextInt();
		area=pi*r*r;
		System.out.println("The Area of circle is: "+area);
		scn.close();

	}

}
