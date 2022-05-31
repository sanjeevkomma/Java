package com.demo.foreach_method;

import java.util.List;
import java.util.ArrayList;

public class ForEach_To_List {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();

		fruits.add("Apple");

		fruits.add("Orange");

		fruits.add("Banana");

		fruits.add("Pear"); 

		fruits.add("Mango");

		fruits.forEach( ( String str ) -> System.out.println(str) );
	}
}
