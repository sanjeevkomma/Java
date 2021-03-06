package com.demo.foreach_method;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ForEach_Using_Collection {


	// forEach(Consumer<T> action) is the default method in Iterable interface 

	// so we can call forEach method on any collection object

	// default void forEach(Consumer<super T>action)  in Iterable interface

	public static void main(String[] args) {

		List<String> gamesList = new ArrayList<String>();  
		
		Arrays.asList(args);
		
		// List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());

		gamesList.add("Football");  

		gamesList.add("Cricket");  

		gamesList.add("Chess");  

		gamesList.add("Hocky");  

		System.out.println("------------Iterating by passing lambda expression--------------");  

		gamesList.forEach( ( String game ) -> { System.out.println( game ); } );


		// Using Collection forEach
		gamesList.forEach( ( String str ) -> System.out.print(str + " ") );
		gamesList.forEach( System.out :: println );

	}

}
