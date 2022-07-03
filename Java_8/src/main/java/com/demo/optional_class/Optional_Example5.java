package com.demo.optional_class;

import java.util.Optional;

// Optional with filter

public class Optional_Example5 {  

	public static void main(String[] args) {

		//Creating Optional object from a String       
		Optional<String> GOT = Optional.of("Game of Thrones"); 

		// Filter returns an empty Optional instance if the output doesn't         
		// contain any value, else it returns the Optional object of the given value         

		System.out.println( GOT.filter( ( String str ) -> str.equals("GAME OF THRONES")));    

		System.out.println( GOT.filter(( String str ) -> str.equalsIgnoreCase("GAME OF THRONES")));
	}
}
