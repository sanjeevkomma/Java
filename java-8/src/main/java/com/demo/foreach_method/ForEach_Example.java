package com.demo.foreach_method;

import java.util.List;
import java.util.ArrayList;

public class ForEach_Example {


	// forEach(Consumer<T> action) is the default method in Iterable interface 

	// so we can call forEach method on any collection object

	// default void forEach(Consumer<super T>action)  in Iterable interface

	public static void main(String[] args) {

		List<String> gamesList = new ArrayList<String>();  

		gamesList.add("Football");  

		gamesList.add("Cricket");  

		gamesList.add("Chess");  

		gamesList.add("Hocky");  

		System.out.println("------------Iterating by passing lambda expression--------------");  

		gamesList.forEach( ( String game ) -> { System.out.println( game ); } );

	}

}
