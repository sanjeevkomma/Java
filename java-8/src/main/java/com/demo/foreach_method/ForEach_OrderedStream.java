package com.demo.foreach_method;

import java.util.List;
import java.util.ArrayList;
public class ForEach_OrderedStream {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("Maggie"); 

		names.add("Michonne");

		names.add("Rick");

		names.add("Merle");

		names.add("Governor"); 

		// forEach - the output would be in any order
		
		System.out.println("Print using forEach");

		names.stream().filter(  ( String str ) -> str.startsWith("M") ).parallel().forEach( ( String str ) -> System.out.println(str) ); 

		// forEachOrdered - the output would always be in this order: Maggie, Michonne, Merle 

		System.out.println("Print using forEachOrdered"); 

		names.stream().filter( ( String str ) -> str.startsWith("M")).parallel().forEachOrdered( ( String str ) -> System.out.println(str));
	}
}