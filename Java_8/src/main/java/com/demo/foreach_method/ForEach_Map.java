package com.demo.foreach_method;

import java.util.Map;
import java.util.HashMap;

public class ForEach_Map {

	// forEach to iterate a Map

	public static void main(String[] args) {

		Map<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "Monkey");

		hmap.put(2, "Dog"); 

		hmap.put(3, "Cat");  

		hmap.put(4, "Lion");   

		hmap.put(5, "Tiger");   

		hmap.put(6, "Bear");

		hmap.forEach(  ( Integer key,String value ) ->  { System.out.println( key + " - " + value ); }  );

		hmap.forEach( ( Integer key, String value ) -> { 

			if( key == 4 ) {  

				System.out.println("Value associated with key 4 is: " + value ); 
			}  
		} );    

		hmap.forEach( ( Integer key, String value ) -> {

			if("Cat".equals(value)){ 

				System.out.println("Key associated with Value Cat is: " + key);
			}

		}); 
	}
}