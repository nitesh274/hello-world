package com.techmedevoted.creational.singleton;
/*
To implement Singleton pattern, we have different approaches but all of them have following common concepts.

->Private constructor to restrict instantiation of the class from other classes.
->Private static variable of the same class that is the only instance of the class.
->Public static method that returns the instance of the class, this is the global access point 
	for outer world to get the instance of the singleton class.
 */
/*----Eager initialization---
in eager initialization, the instance of Singleton Class is created at the time of class loading, 
this is the easiest method to create a singleton class but it has a drawback that instance is 
created even though client application might not be using it.
 */
public class EagerInitializedSingleton {
	 private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	    
	    //private constructor to avoid client applications to use constructor
	    private EagerInitializedSingleton(){}

	    public static EagerInitializedSingleton getInstance(){
	        return instance;
	    }
	    
	    public String show(){
	    	return "EagerInitializedSingleton approch";	    }
	    
	}