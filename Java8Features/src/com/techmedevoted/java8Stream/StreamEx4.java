package com.techmedevoted.java8Stream;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamEx4 {
//Java Stream Terminal Operations
	public static void main(String[] args) {
		System.out.println("------1. Stream reduce() example:------");
		//use reduce() to perform a reduction on the elements of the stream, using an associative accumulation function, and return an Optional.
		Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		
		Optional<Integer> intOptional = numbers.reduce((i,j) -> {return i*j;});
		if(intOptional.isPresent()) System.out.println("Multiplication = "+intOptional.get()); //120
		
		System.out.println("------2. Stream count() example:------");

		// use this terminal operation to count the number of items in the stream.
		Stream<Integer> numbers1 = Stream.of(1,2,3,4,5);
		System.out.println("Number of elements in stream="+numbers1.count()); //5
		
		System.out.println("------3. Stream forEach() example:------");
		//can be used for iterating over the stream. We can use this in place of iterator.
		Stream<Integer> numbers2 = Stream.of(1,2,3,4,5);
		numbers2.forEach(i -> System.out.print(i+",")); //1,2,3,4,5,
		
		System.out.println("\n------4. Stream match() example:------");
		
		Stream<Integer> numbers3 = Stream.of(1,2,3,4,5);
		System.out.println("Stream contains 4? "+numbers3.anyMatch(i -> i==4));
		//Stream contains 4? true

		Stream<Integer> numbers4 = Stream.of(1,2,3,4,5);
		System.out.println("Stream contains all elements less than 10? "+numbers4.allMatch(i -> i<10));
		//Stream contains all elements less than 10? true

		Stream<Integer> numbers5 = Stream.of(1,2,3,4,5);
		System.out.println("Stream doesn't contain 10? "+numbers5.noneMatch(i -> i==10));
		//Stream doesn't contain 10? true
		
		
		System.out.println("\n------5. Stream findFirst() example:------");
		Stream<String> names4 = Stream.of("Pankaj","Amit","David","Durga", "Lisa");
		Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst();
		if(firstNameWithD.isPresent()){
			System.out.println("First Name starting with D="+firstNameWithD.get()); //David
		}
	}

}
