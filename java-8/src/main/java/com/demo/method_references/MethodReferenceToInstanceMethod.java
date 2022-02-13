package com.demo.method_references;

@FunctionalInterface 
interface MyInterface {  

	void display();  

}  
public class MethodReferenceToInstanceMethod {  

	public void myMethod(){  

		System.out.println("Instance Method"); 

	}  

	public static void main(String[] args) {  

		MethodReferenceToInstanceMethod obj = new MethodReferenceToInstanceMethod(); 

		// Method reference using the object of the class

		MyInterface ref = obj :: myMethod ;  

		// Calling the method of functional interface  

		ref.display();  

	}  
}