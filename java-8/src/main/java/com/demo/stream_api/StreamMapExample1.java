package com.demo.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

		// List<String> allNames = names.stream().map( ( String str ) -> str.toUpperCase() ).collect(Collectors.toList()) ;
		
		List<String> allNames = names.stream().map( ( String str ) -> str.toUpperCase() ).filter( ( String str ) -> ( str.length() > 6 ) ).collect(Collectors.toList()) ;

		allNames.forEach( str -> System.out.print( str + " " ) );
		
		System.out.println();
		
		System.out.println("========");
		
		allNames.forEach( System.out :: println );

	}

}
