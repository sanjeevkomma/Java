package com.demo.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Map_Example4 {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> squares = num.stream().map( ( Integer n ) ->  n = n * n  ).collect(Collectors.toList());
		
		System.out.println(squares);        

	}

}