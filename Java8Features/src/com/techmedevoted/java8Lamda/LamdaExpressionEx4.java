package com.techmedevoted.java8Lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//One more advantage of using lambda expression is the lazy evaluation
//Higher Efficiency with Laziness
public class LamdaExpressionEx4 {
// i -> isGreaterThan3(i) or i -> LamdaExpressionEx4.isGreaterThan3(i).
	public static int findSquareOfMaxOdd(List<Integer> numbers) {
		return numbers.stream()
				.filter(LamdaExpressionEx4::isOdd) 		//Predicate is functional interface and
				.filter(LamdaExpressionEx4::isGreaterThan3)	// we are using lambdas to initialize it
				.filter(LamdaExpressionEx4::isLessThan11)	// rather than anonymous inner classes
				.max(Comparator.naturalOrder())
				.map(i -> i * i)
				.get();
	}

	public static boolean isOdd(int i) {
		return i % 2 != 0;
	}
	
	public static boolean isGreaterThan3(int i){
		return i > 3;
	}
	
	public static boolean isLessThan11(int i){
		return i < 11;
	}
	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(1,5,8,9);
		System.out.println(findSquareOfMaxOdd(num));

	}

}
