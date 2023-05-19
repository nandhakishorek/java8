package com.onesoft_Java8_interface;

import java.util.Optional;

public class OptionalProgram_1 {
	public static void main(String[]args) {
		String word="lokesh";
		Optional<String>a=Optional.ofNullable(word);
		if(a.isEmpty()) {
			System.out.println(word.toUpperCase());	
		}
		else {
			System.out.println("It is null");
		}
		}

}
