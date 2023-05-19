package com.onesoft_Java8_interface;

public interface Furniture {
	public String brand(String brand) ;
	public default int findPrice(String type) {
		if(type.equals("wood")) {
			return 5000;
		}
		else {
			return 2000;
		}
	}

}
