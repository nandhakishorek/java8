package com.onesoft_Java8_interface;

public interface Electronics {
	public int capacity(int capacity);
	public static int reSaleAmount(int price) {
		return price+(price*10/100);
	}
	public default boolean onOff(boolean ison) {
		if(ison==true) {
			return true;
		}
		else {
			return false;
		}
	}

}
