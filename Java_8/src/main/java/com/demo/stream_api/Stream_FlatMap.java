package com.demo.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_FlatMap {

	public static void main(String[] args) {

		List<Integer> primeNumbers = Arrays.asList(5, 7, 11,13);

		List<Integer> oddNumbers = Arrays.asList(1, 3, 5,8);

		List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);

		List<List<Integer>> listOfListofInts = Arrays.asList(primeNumbers, oddNumbers, evenNumbers,evenNumbers);

		System.out.println("The Structure before flattening is : " + listOfListofInts);

		List<Integer> listofInts  = listOfListofInts.stream().flatMap( ( List<Integer> list ) -> list.stream() ).collect(Collectors.toList());
		
		System.out.println("The Structure after flattening is : " + listofInts);
		
		List<Integer> list = primeNumbers.stream().map((Integer i) ->  ( i =  ++ i ) ).collect(Collectors.toList());
		
		System.out.println(list);
	}
}
