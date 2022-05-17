package com.demo.algos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_Duplicates {

	public static void main(String[] args) {
		
		
		int arr[] = { 10, 30, 10, 20, 50, 20, 30, 70 };
		
		int aa[] = new int[9];
		
		System.out.println(countDuplicates(arr));

	}
	
	
	public static Map<Integer,Integer> countDuplicates(int arr[]) {

		List<Integer> list = Arrays.asList(12,67);
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();

		Map<Integer,Long> map2 = list.stream().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));

		// return map;
		
		for ( int i = 0 ; i < arr.length ; i ++ ) {
			
			
			if ( map.containsKey(arr[i]) ) {

				map.put(arr[i], map.get(arr[i]) + 1 );
			}
			
			else 
				map.put(arr[i], 1);
		}

		return map ;

	}

}
