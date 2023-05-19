package com.onesoft_Java8_interface;

public class UsePen {
	public static void main(String[]args) {
		Pen p=(a)->{
			if(a<20) {
				return "GoodQuality";
			}
		
		else {
			return "AverageQuality";
		}
		
		};
		System.out.println(p.findQuality(20));
		
	}

}
