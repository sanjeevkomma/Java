package com.demo.string_joiner;

import java.util.StringJoiner;  
public class StringJoinerExample2 {  

	// Adding prefix and suffix to the output String

	public static void main(String[] args) {  
		/* Passing comma(,) as delimiter and opening bracket
		 * "(" as prefix and closing bracket ")" as suffix
		 */
		StringJoiner mystring = new StringJoiner(",", "(", ")");    

		// Joining multiple strings by using add() method  
		mystring.add("Negan");  
		mystring.add("Rick");  
		mystring.add("Maggie");  
		mystring.add("Daryl");  

		// Displaying the output String
		System.out.println(mystring);  
	}  
}