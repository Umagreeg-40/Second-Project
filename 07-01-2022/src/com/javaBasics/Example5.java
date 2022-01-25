package com.javaBasics;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		int len,brd,area;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value of length and breadth: ");
		len=scn.nextInt();
		brd=scn.nextInt();
		area=len*brd;
		System.out.println("The Area of rectangle is: "+area);
		scn.close();

	}

}
