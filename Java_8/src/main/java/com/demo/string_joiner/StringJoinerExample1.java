package com.demo.string_joiner;

import java.util.StringJoiner;  

public class StringJoinerExample1 {  

	public static void main(String[] args) {  

		StringJoiner mystring = new StringJoiner("-");    

		mystring.add("Logan");  

		mystring.add("Magneto");  

		mystring.add("Rogue");  

		mystring.add("Storm");  

		System.out.println(mystring);  
	}  
}