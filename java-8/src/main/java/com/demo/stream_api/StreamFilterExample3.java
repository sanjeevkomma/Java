package com.demo.stream_api;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample3 {
	
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

		List<String> longnames = names.stream().filter( ( String str ) -> str.length() > 6 && str.length() < 8)
				
				.collect(Collectors.toList());  

		longnames.forEach( System.out :: println );           

	}

}