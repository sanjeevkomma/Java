package com.demo.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Reduce {

	public static void main(String[] args) {
		
		// List<Integer> numbers = Arrays.asList(1, 7 , 344, 12 );
		
		int arr[] = { 3, 1, 5 ,8 };
		
		// List<Integer> numbers = Arrays.asList(arr);
		
		List<Integer> numbers = Arrays.stream(arr).boxed().collect( Collectors.toList() );
		
		int sum = numbers.stream().reduce( 0 , Integer :: sum );
		
		System.out.println(sum);

	}

}
