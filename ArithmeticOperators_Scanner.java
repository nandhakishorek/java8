package com.onesoft_Java8_interface;

import java.util.Scanner;

public class ArithmeticOperators_Scanner {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("num1");
		int num1=s.nextInt();
		
		System.out.println("num2");
		int num2=s.nextInt();
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
	}

}
