package com.demo.lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Collections.sort(list, comparator);

public class LambdaExpression_Comparator_Example {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("zabc");

		list.add("bxyz");

		list.add("axyz");

		// Comparator<String> c1 = ( String s1 , String s2 ) -> {  return s1.compareTo(s2); } ; 

		Collections.sort( list, ( String s1 , String s2 ) -> {  return s2.compareTo(s1); } );

		list.forEach(  ( String str ) -> {  System.out.println(str); } );

	}

}
