package com.techmedevoted.java8Lamda;

public class LamdaExpressionEx1 {

	public static void main(String[] args) {
		//Lambda Expressions syntax is (argument) -> (body).
		
		Runnable r1 = () -> System.out.println("My Runnable");
		/*
		-Runnable is a functional interface, that’s why we can use lambda expression to create it’s instance.
		-Since run() method takes no argument, our lambda expression also have no argument.
		-Just like if-else blocks, we can avoid curly braces ({}) since we have a single statement 
		in the method body. For multiple statements, we would have to use curly braces like 
		any other methods.
		 */
		
		Thread t1= new Thread(() -> System.out.println("My Runnable"));
		t1.start();

	}

}
