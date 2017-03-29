package com.techmedevoted.java8Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LamdaExpressionEx3 {
//Passing Behaviors into methods
	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(1,5,8,9);
		System.out.println(sumWithCondition(num,n->true));
		
		System.out.println(sumWithCondition(num,i->i%2==0));
		
		System.out.println(sumWithCondition(num,i->i>5));

	}
	public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
	    return numbers.parallelStream()
	    		.filter(predicate)
	    		.mapToInt(i -> i)
	    		.sum();
	}
}
