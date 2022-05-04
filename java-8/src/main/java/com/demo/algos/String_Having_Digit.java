package com.demo.algos;

public class String_Having_Digit {

	public static void main(String[] args) {
		
		String str = "I like mangoes";
		
		String str1 = "I like 55454";
		
		System.out.println(evaluateString(str));
		
		System.out.println(evaluateString(str1));
		

	}
	
	
	public static int evaluateString(String str ) {

		int result = 0; 

		char[] chars = str.toCharArray();

		for ( int i = 0 ; i < chars.length ; i ++ ) {

			if ( Character.isDigit(chars[i]) ) {
				
				result = 1;
				
				break;
			}
			
			
		}

		return result;
	}

}
