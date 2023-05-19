package com.onesoft_Java8_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
public static void main(String[] args) {
        
        // Predicate functional interface
        Predicate<String> isStringEmpty = s -> s.isEmpty();
        System.out.println(isStringEmpty.test("")); // false
        System.out.println(isStringEmpty.test("Lokesh")); // true
        
        // Consumer functional interface
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("Lokesh Seenu");
        
        // Supplier functional interface
        Supplier<Integer> getRandomNum = () -> (int) (Math.random() * 100);
        System.out.println(getRandomNum.get());
        
        // Function functional interface
        Function<String, Integer> getLength = s -> s.length();
        System.out.println(getLength.apply("God of war Ragnarok")); 
}
}

