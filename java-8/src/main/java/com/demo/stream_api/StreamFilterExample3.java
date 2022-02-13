package com.demo.stream_api;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample3 {
	
	// Stream filter() with multiple conditions

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

		List<String> longnames = names.stream()  
				.filter(str -> str.length() > 6 && str.length() < 8) //Multiple conditions
				.collect(Collectors.toList());  

		longnames.forEach(System.out::println);           

	}

}