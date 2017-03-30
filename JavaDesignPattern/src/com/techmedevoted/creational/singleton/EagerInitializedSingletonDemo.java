package com.techmedevoted.creational.singleton;

public class EagerInitializedSingletonDemo {

	public static void main(String[] args) {
		String string=EagerInitializedSingleton.getInstance().show();
		System.out.println(string);
		
	}

}
