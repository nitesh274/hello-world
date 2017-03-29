package com.techmedevoted.java8Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

//Creating Java Streams
public class StreamEx1 {

	public static void main(String[] args) {
		
		
		System.out.println("-----------1.Stream.of() to create a stream from similar type of data---------");
		Stream<Integer> stream1 = Stream.of(1,2,3,4);
		//stream.anyMatch(i ->i>2);
		stream1.forEach(i-> System.out.println(i));
		
		System.out.println("-----------2.use Stream.of() with an array of Objects to return the stream---------");
		Stream<Integer> stream2=Stream.of(new Integer[]{1,2,3,4});
		stream2.forEach(p->System.out.println(p));
		
		System.out.println("-----------3.use Collection stream() to create sequential stream and parallelStream() to create parallel stream---------");
		List<String> myList=new ArrayList<>();
		myList.add("Java");
		myList.add("Spring");
		myList.add("Hibernate");
		myList.add("SQL");
		
		System.out.println("-----------a.creating sequential stream---------");
		Stream<String> sequentialStream=myList.stream();
		sequentialStream.forEach(str->System.out.println(str));
		
		System.out.println("-----------b.creating parallel stream---------");
		Stream<String> parallelStream=myList.parallelStream();
		parallelStream.forEach(str->System.out.println(str));
		
		System.out.println("---------4.Using Stream.generate() and Stream.iterate() methods to create Stream.----");
		Stream<String> stream3 = Stream.generate(() -> {return "abc";});
		//stream3.forEach(i->System.out.println(i));
		Stream<String> stream4 = Stream.iterate("abc", (i) -> i);
		//stream4.forEach(i->System.out.println(i));
		
		System.out.println("---------5.Using Arrays.stream() and String.chars() methods----");
		LongStream is = Arrays.stream(new long[]{1,2,3,4});
		//is.forEach(i->System.out.println(i));
		
		IntStream is2 = "abc".chars();
		is2.forEach(i->System.out.println(i));

	}

}
