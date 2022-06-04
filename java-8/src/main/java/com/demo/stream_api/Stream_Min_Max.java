package com.demo.stream_api;

import java.util.Arrays;
import java.util.List;

public class Stream_Min_Max {
	
	public static void main(String[] args) {  
		
		// Min and Max values from a Stream (Numbers):

		List<Integer> elements = Arrays.asList(1,2,3,4,5);
		
		Integer min = elements.stream().min( Integer :: compareTo).get();
		
		Integer max = elements.stream().max( Integer :: compareTo).get();
		
		System.out.println("Min value : "+ min);
		
		System.out.println("Max value : "+ max);
		
		// Min and Max values from a Stream (Strings):
		
		List<String> strings = Arrays.asList("a1","a2","a3","a4");
		
		String min_string = strings.stream().min(String :: compareTo).get();
		
		String max_string = strings.stream().max(String :: compareTo).get();
		
		System.out.println("Min value : "+ min_string);
		
		System.out.println("Max value : "+ max_string);
	} 

}
