package com.demo.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Map_Filter_List {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
		  
		List<Integer> list2 = list.stream().filter(( Integer i ) -> i % 3 == 0 ).collect(Collectors.toList());
		 
		 System.out.println(list2);
		 
		 List<Integer> list3 = list.stream().map( ( Integer i ) -> i = i * 2 ).collect(Collectors.toList());
		 
		 System.out.println(list3);
		 
		list.stream().forEach( ( Integer i ) -> { i = i * 5 ; System.out.print(i + ", "); });
		
        list.stream().map( ( Integer i ) -> i = i * 2 ).forEach(System.out :: println);

	}

}
