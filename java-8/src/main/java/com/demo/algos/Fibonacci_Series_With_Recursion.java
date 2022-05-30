package com.demo.algos;

public class Fibonacci_Series_With_Recursion {

	// In fibonacci series, next number is the sum of previous two numbers 

	// for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1
	
	static int n1 = 0,n2 = 1,n3 = 0;  

	public static void main(String[] args) {

		int count = 10; 
		
		System.out.print( n1 + " " + n2 );//printing 0 and 1

		fibonacciSeries(count - 2 );

	}

	private static void fibonacciSeries(int count) {

		if( count > 0)   {    

			n3 = n1 + n2;    

			n1 = n2;    

			n2 = n3;    

			System.out.print(" "+n3);   

			fibonacciSeries(count-1);    
		}    
	}

}
