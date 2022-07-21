package com.demo.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

		Stream<String> allNames = names.stream();

		Stream<String> longNames = allNames.filter(str -> str.length() > 6);
		
		// Using Steam forEach
		longNames.forEach( ( String str ) -> System.out.print(str + " ") );
		//longNames.forEach( System.out :: println );
		
		// Using Collection forEach
		names.forEach( ( String str ) -> System.out.print(str + " ") );
		names.forEach( System.out :: println );
		
	}
}