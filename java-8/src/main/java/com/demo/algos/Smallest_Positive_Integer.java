package com.demo.algos;

import java.util.*;
import java.util.stream.*;

public  class Smallest_Positive_Integer {

	public static void main(String args[]) {

		int arr[] = { 1, 3, 4, 6 };

		System.out.println("the smalles postive integer :: " + smallestPositiveInteger(arr) );

	}

	static int smallestPositiveInteger(int[] arr) {

		int res = 1; 

		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		// List<Integer> listArray = Arrays.asList(arr);
		
		String str[] = { "Homer", "Marge", "Bart", "Lisa", "Maggie" };
		
		List<String> lst = Arrays.asList(str);
				
		List<Integer> ll = Arrays.stream(arr).boxed().collect(Collectors.toList());

		for ( int i = 1; i <= list.size() + 1; i ++ ) {

			if ( !list.contains(i) ) {

				return i;
			}
		}
		return res;
	}
}

