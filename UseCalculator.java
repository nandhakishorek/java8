package com.onesoft_Java8_interface;

public class UseCalculator {
	public static void main(String[]args) {
		Calculator add=(num1,num2)->num1+num2;
		System.out.println(add.math(10,5));
		Calculator sub=(a,b)->a-b;
		System.out.println(sub.math(10, 2));
		Calculator mul=(a1,a2)->a1*a2;
		System.out.println(mul.math(20, 2));
		Calculator div=(l1,l2)->l1/l2;
		System.out.println(div.math(40, 2));
	}

}
