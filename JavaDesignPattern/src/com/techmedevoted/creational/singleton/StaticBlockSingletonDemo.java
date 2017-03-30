package com.techmedevoted.creational.singleton;

public class StaticBlockSingletonDemo {

	public static void main(String[] args) {
		String str=StaticBlockSingleton.getInstance().show();
		System.out.println(str);
		

	}

}
