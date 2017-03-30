package com.techmedevoted.creational.singleton;

public class LazyInitializedSingletonDemo {

	public static void main(String[] args) {
		String str=LazyInitializedSingleton.getInstance().show();
		System.out.println(str);

	}

}
