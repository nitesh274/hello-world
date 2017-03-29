package com.techmedevoted.java8Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
Capturing and non-capturing lambdas

We have two kinds of lambdas, capturing or stateful lambdas, and non-capturing or stateless 
lambdas. A capturing lambda is bound with the values or references to enclosing variables, 
as such:

int outerY = 42;

(int x) -> outerY;  // current value of outerY captured here.
Capturing lambdas have similar performance characteristics to anonymous classes, with a one 
time cost for setting up the capture, and the overhead of a new instance for each created lambda.

Non-capturing lambdas don't touch the enclosing state:

() -> 1;

(int x) -> x;

(int x, int y) -> {
  if (x < y) {
    return x;
  } else {
    return y;
  }
}
Non-capturing lambdas are very common, often replacing a limited-use method near the context of 
its use. Each non-capturing lambda only requires a single instance, is lazily initialized, 
and offers significant performance gains over the equivalent anonymous class on repeated uses.
 */
public class StreamEx5 {
//Java 8 Stream API Limitations
	public static void main(String[] args) {
		//Stateless lambda expressions: If you are using parallel stream and lambda expressions are stateful, it can result in random responses
		List<Integer> ss = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		List<Integer> result = new ArrayList<Integer>();
		 
		Stream<Integer> stream = ss.parallelStream();
		 
		stream.map(s -> {
		        synchronized (result) {
		          if (result.size() < 10) {
		            result.add(s);
		          }
		        }
				return s;
		    }).forEach( e -> {});
		 System.out.println(result);  
		 
		 //If we use sequential stream, then this problem will not arise.
		 List<Integer> result1 = new ArrayList<Integer>();
		 Stream<Integer> stream1 = ss.stream();
		 
			stream1.map(s -> {
			        synchronized (result1) {
			          if (result1.size() < 10) {
			            result1.add(s);
			          }
			        }
					return s;
			    }).forEach( e -> {});
			 System.out.println(result1);  
	}
}
//Once a Stream is consumed, it can’t be used later on