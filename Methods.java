package com.onesoft_Java8_interface;

public class Methods {
	public  static int findMaxNum(int[] nums) {
		int max=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=max) {
				max=nums[i];
			}
		}
		return max;
	}
	public  String findMaxLength(String[]words) {
		int res=0;
		String b="";
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>=res) {
				res=words[i].length();
				b=words[i];
			}
		}
		return b;
	}
}
