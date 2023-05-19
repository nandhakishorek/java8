package com.onesoft_Java8_interface;

import java.util.Scanner;

public class ScannerProgram {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=s.nextLine();
		System.out.println ("Enter your age:");
		int age=s.nextInt();
		System.out.println("Name is "+name+"Age is "+age);
		System.out.println("Enter your FatherName");
		        String b = s.next();

		        System.out.println("FatherName is " + b);
		        System.out.println("Enter your weight");
		        float weight=s.nextFloat();
		        System.out.println("My Weight is ");

 }
}

