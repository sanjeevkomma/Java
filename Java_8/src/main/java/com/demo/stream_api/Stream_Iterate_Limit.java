package com.demo.stream_api;

import java.util.stream.*;  

public class Stream_Iterate_Limit {

	// Iterating and displaying selected integers

	public static void main(String[] args){  

	Stream.iterate(1, count -> count + 1 ).filter( ( Integer number ) -> number %3 == 0 ).limit(6).forEach( System.out :: println );  

	}  
}




