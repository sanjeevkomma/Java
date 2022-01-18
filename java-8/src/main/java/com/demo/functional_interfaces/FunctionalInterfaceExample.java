package com.demo.functional_interfaces;

interface Sayable2 {

	void say(String msg); // Single Abstract Method

	boolean equals(Object obj);  // Object class method

	int hashCode(); // Object class method

	String toString(); // Object class method

}


public class FunctionalInterfaceExample implements Sayable2 {  

	public void say(String msg) { 

		System.out.println(msg);  
	}  

	public static void main(String[] args) {  

		FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  

		fie.say("Hello there");  
	}  
}