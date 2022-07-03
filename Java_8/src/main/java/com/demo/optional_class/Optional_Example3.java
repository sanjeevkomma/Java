package com.demo.optional_class;

import java.util.Optional;

// Optional orElse() and orElseGet() methods

public class Optional_Example3 { 
	
	public static void main(String[] args) {
		
		//Creating Optional object from a String
		Optional<String> GOT = Optional.of("Game of Thrones");  
		
		//Optional.empty() creates an empty Optional object  
		Optional<String> nothing = Optional.empty();

		//orElse() method
		System.out.println( GOT.orElse("Default Value") ); 
		
		System.out.println( nothing.orElse("Default Value") ); 

		//orElseGet() method
		System.out.println( GOT.orElseGet( () -> "Default Value") ); 
		
		System.out.println( nothing.orElseGet( () -> "Default Value") ); 

	}
}