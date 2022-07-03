package com.demo.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Integer_List_Array {

	public static void main(String[] args) {
		
				int arr[] = { 3, 1, 5 ,8 };
				
				// List<Integer> numbersd = Arrays.asList(arr); // Wont work -- Compile time error
				
				List<Integer> numbers = Arrays.stream(arr).boxed().collect( Collectors.toList() );
				
				System.out.println(numbers);
				
				int intArray[] = numbers.stream().mapToInt( Integer :: intValue ).toArray();
				
				System.out.println("********************************" );
				
				for ( int i = 0 ; i < intArray.length ;  i ++ ) 
				
				System.out.print(intArray[i] + " , ");

	}
	

}
