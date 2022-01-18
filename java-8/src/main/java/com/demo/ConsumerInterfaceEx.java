package com.demo;

import java.util.function.Consumer;

public class ConsumerInterfaceEx {

	static void printMessage(String name){  

		System.out.println("Hello "+name);  

	}  
	static void printValue(int val){  

		System.out.println(val);  
	}  


	public static void main(String[] args) {
		
		Consumer<String> consumer1 = ConsumerInterfaceEx :: printMessage ; 
		
		consumer1.accept("AA");
		
		Consumer<Integer> consumer2 = ConsumerInterfaceEx :: printValue ; 

		consumer2.accept(2);

	}

}
