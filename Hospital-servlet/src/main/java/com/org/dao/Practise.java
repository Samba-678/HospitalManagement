package com.org.dao;

public class Practise {

	public static void main(String[] args) {
		int a=9;
		change( a );
		System.out.println(a);
//creating copy of actual var and passsing it to function is called pass by value
		//
	}
	static void change(int a) {
		a=5;
		System.out.println(a);
	}

}
