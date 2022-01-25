package com.readDatafromKeyboard;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		String text;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the text");
		text=scn.nextLine();
		scn.close();
		System.out.println(text);

	}

}
