package com.demo.algos;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getMinMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY plates as parameter.
     */

    public static int getMinMoves(List<Integer> plates) {
    // Write your code here
    
    int noOfMoves = 0 ; 
    
    int[] platesArr = plates.stream().mapToInt(Integer::intValue).toArray();
    
    int brr[] = new int[platesArr.length];
                            
    for(int i = 0; i < platesArr.length; i++)
      brr[i] = platesArr[i];

    Arrays.sort(brr);
  
    // If both the arrays are equal
    if (platesArr.equals(brr))

        return noOfMoves;
    else

   // Print minimum operations required
   
  noOfMoves = minOperations(platesArr, brr,0, 0);
     
    return noOfMoves;                        

    }
    
    static int minOperations(int arr1[], int arr2[],int i, int j){
     
    if (arr1.equals(arr2))
        return 0;
           
    if (i >= arr1.length || j >= arr2.length)
        return 0;
       
    if (arr1[i] < arr2[j])
     
        return 1 + minOperations(arr1, arr2,i + 1, j + 1);
          
    return Math.max(minOperations(arr1, arr2, i, j + 1),
    
    minOperations(arr1, arr2, i + 1, j));
}

}

public class Calculate_Min_Moves {
    public static void main(String[] args) throws IOException {
       
       List<Integer> plates = Arrays.asList(14,11,9,10,12);

        int result = Result.getMinMoves(plates);
        
        System.out.println(result);

        
    }
}
