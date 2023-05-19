package com.onesoft_Java8_interface;

import java.util.Optional;

public class OptionalProgram_2 {
	public static void main(String[]args) {
		String res="Lokesh";
		Optional<String>a=Optional.of(res);
		if(res.isEmpty()) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		System.out.println(a);
		
		}
	}


