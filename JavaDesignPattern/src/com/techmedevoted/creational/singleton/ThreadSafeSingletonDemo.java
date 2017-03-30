package com.techmedevoted.creational.singleton;

public class ThreadSafeSingletonDemo {

	public static void main(String[] args) {
		String str=ThreadSafeSingleton.getInstance().show();
		System.out.println(str);
	}

}
