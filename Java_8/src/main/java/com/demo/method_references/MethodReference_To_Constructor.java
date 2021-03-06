package com.demo.method_references;

@FunctionalInterface 
interface MyInterface2 {  

	Hello display(String say);  

}  

class Hello {  

	public Hello(String say) {  

		System.out.print(say);  
	}  
}  

public class MethodReference_To_Constructor {  

	public static void main(String[] args) { 

		// Method reference to a constructor

		MyInterface2 ref = Hello :: new  ;  

		ref.display("Hello World!");  
	}  
}