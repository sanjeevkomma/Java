package com.demo.method_references;

@FunctionalInterface 
interface MyInterface {  

	int display();  

}  

public class MethodReference_To_InstanceMethod {  

	public int myMethod(){  

		System.out.println("Instance Method"); 

		return 1;

	}  

	public static void main(String[] args) {  

		// MethodReferenceToInstanceMethod obj = new MethodReferenceToInstanceMethod(); 

		// Method reference using the object of the class

		MyInterface ref = new MethodReference_To_InstanceMethod() :: myMethod ;  

		// Calling the method of functional interface  

		int jj = ref.display(); 

		System.out.println(jj);

	}  
}