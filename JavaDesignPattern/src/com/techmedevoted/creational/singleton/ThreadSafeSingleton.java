package com.techmedevoted.creational.singleton;
/*
Above implementation works fine and provides thread-safety but it reduces the performance 
because of cost associated with the synchronized method
 */
public class ThreadSafeSingleton {
	  private static ThreadSafeSingleton instance;
	    
	    private ThreadSafeSingleton(){}
	    
	    public static synchronized ThreadSafeSingleton getInstance(){
	        if(instance == null){
	            instance = new ThreadSafeSingleton();
	        }
	        return instance;
	    }
	    public String show(){
	    	return "ThreadSafeSingleton approch";	   
	    	} 
	    
/*
 To avoid this extra overhead every time, double checked locking principle is used. 
 In this approach, the synchronized block is used inside the if condition with an additional 
 check to ensure that only one instance of singleton class is created.	    
 */
	    
	    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
	        if(instance == null){
	            synchronized (ThreadSafeSingleton.class) {
	                if(instance == null){
	                    instance = new ThreadSafeSingleton();
	                }
	            }
	        }
	        return instance;
	    }
	}