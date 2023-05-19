package com.onesoft_Java8_interface;
@FunctionalInterface
public interface Calculator {
	public int math(int a,int b);


public static int add(int price) {
	return price+(price*2/100);
}
public default String calculatorName(String name) {
return "Lokesh";
}
}