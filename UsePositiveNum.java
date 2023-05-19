package com.onesoft_Java8_interface;

public class UsePositiveNum {
	public static void main(String[]args) {
		int[] nums= {9,8,7,6,5,4,3};
		PositiveNum res=(z)->{for(int i=0;i<z.length;i++) {
			if(z[i]>0) {System.out.println(z[i]);}}};
			res.findPosNum(nums);
			
		}
	}


