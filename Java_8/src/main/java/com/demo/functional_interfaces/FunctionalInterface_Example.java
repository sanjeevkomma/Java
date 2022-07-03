package com.demo.functional_interfaces;

@FunctionalInterface
interface Sayable2 {

	void say(String msg); // Single Abstract Method

	boolean equals(Object obj);  // Object class method

	int hashCode(); // Object class method

	String toString(); // Object class method

}


public class FunctionalInterface_Example implements Sayable2 {  

	public void say(String msg) { 

		System.out.println(msg);  
	}  

	public static void main(String[] args) {  

		Sayable2 fie = new FunctionalInterface_Example();  

		fie.say("Hello there");  
	}  
}