package com.techmedevoted.java8Lamda;

import java.util.stream.IntStream;

public class LamdaExpressionEx2 {
	
	private static boolean isPrime(int number) {
	/*	IntPredicate isDivisible = index -> number % index == 0;
		
		return number > 1
				&& IntStream.range(2, number).noneMatch(
						isDivisible);*/
		
		return number > 1
				&& IntStream.range(2, number).noneMatch(
						index -> number % index == 0);
		
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(23));
	}

}
