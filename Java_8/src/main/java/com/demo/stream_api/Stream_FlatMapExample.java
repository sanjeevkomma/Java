package com.demo.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_FlatMapExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Geeks", "GFG","GeeksforGeeks", "gfg");

		// Using Stream flatMap(Function mapper)
		list.stream().flatMap( ( String str ) ->  Stream.of(str.charAt(2))).forEach(System.out::println);
		
		System.out.println("************** ");
		
		list.forEach(System.out::println);
		
		System.out.println("************** ");
		
		list.forEach( ( String str ) -> System.out.println(str));

	}

}
