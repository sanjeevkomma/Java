package com.demo.algos;

public class Pattern_Print {

//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15


public static void main(String args[]){

int n = 5 ; // no of rows

print(n);


}

static void  print(int n) {
	
	int counter = 0; 
	
	for ( int i = 1 ; i <= n ; i ++ ) {
	  
	  for ( int j = 1 ; j <= i ; j ++ ) {
		
		counter ++;
		
		System.out.print(counter);
	  
	  }
	  System.out.println();
	}
		
}

}