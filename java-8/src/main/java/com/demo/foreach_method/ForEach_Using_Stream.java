package com.demo.foreach_method;


import java.util.List;
import java.util.ArrayList;

public class ForEach_Using_Stream {
	
	// forEach method to iterate a Stream
	
	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		
		names.add("Maggie");
		
		names.add("Michonne");
		
		names.add("Rick");
		
		names.add("Merle");
		
		names.add("Governor");
		
		names.stream().filter( ( String str ) -> str.startsWith("M") ).forEach( System.out :: println ); 
		
		System.out.println("******************");
		
		names.stream().filter( ( String str ) -> str.startsWith("M") ).forEach(( String str ) -> System.out.println(str)); 
	}
}
