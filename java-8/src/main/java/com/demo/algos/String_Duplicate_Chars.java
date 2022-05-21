package com.demo.algos;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_Duplicate_Chars {

	public static void main(String[] args) {

		String str = "I like reading books";

		findDuplicateChars(str);

		countDuplicateChars(str);

	}


	static void findDuplicateChars(String str) {
		
		
		char ch[] = str.toCharArray();

		System.out.print("Duplicate Characters in above string are: ");
		
		for ( int i = 0; i < ch.length ; i++ ) {
			
		   for ( int j = i + 1; j < ch.length ; j++ ) {
			   
		      if ( ch[i] == ch[j] ) {
		         
		    	  System.out.print( ch[j] + " " );
		         
		    	  break;
		      }
		   }
		}

	}

	static void countDuplicateChars(String str) {

		Map<Character, Integer> output = new HashMap<Character, Integer>();

		for ( int i = 0; i < str.length(); i++ ) {

			char ch = str.charAt(i);

			if (  ch != ' ' ) { 

				if (  output.containsKey(ch) ) {

					output.put(ch, output.get(ch) + 1);

				} else  {

					output.put(ch, 1);
				}

			}

		}
		
		System.out.println(output);
		
		System.out.println(" ************* Using Java 8 ********");
		
		Map<Character, Integer> outputJava8 = new HashMap<Character, Integer>();
       
		for ( int i = 0; i < str.length(); i++ ) {
           
			char ch = str.charAt(i);

			outputJava8.compute(ch, ( Character key, Integer value ) -> (value == null) ? 1 : value + 1);

        }

        System.out.println(outputJava8);
        
        
      //  Map<Integer,Long> map2 = list.stream().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));

	}


}
