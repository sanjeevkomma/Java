package com.demo.core.exception_handling;

public class JavaExceptionExample {

	public static void main(String args[]){  

		try {  
			
			int data = 100 / 0;  
			
			System.out.println("try block code...");  

		}
		catch(ArithmeticException e){

			System.out.println(e);

		}  
		finally {

			System.out.println("finally block");

		} 
		
		System.out.println("rest of the code...");  
	}  
}  
