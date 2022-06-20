package com.demo.algos;

import java.util.Arrays;

public class Alphabetical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alphabetical obj = new Alphabetical();
		
		String str = "xtneiootnrnoeneeeeuoeoheetehounzoiuetrhfefeezuivirfwieotgoottfnrnneghetserhrwsgesfherhtiitrerevreernhveo";
		
		System.out.println(obj.findNumber(obj.createWordList() , str));

	}
	
	public String[] createWordList() {
	    String[] numberWords = {"zero","one", "two" ,"three",  "four", "five", "six", "seven",  "eight", "nine"             };
	
	    return numberWords;
	}
	
	public String sort(String input) {
	    char[] digits = input.toCharArray();
	    Arrays.sort(digits);
	    return new String(digits);
	}
	
	public int findNumber(String[] numberWords, String input) {
	    input = sort(input);

	    int length = input.length();
	    double minPower = Math.floor(length / 5d);
	    double maxPower = Math.ceil(length / 3d);
	    int minimum = (int) Math.pow(10d, minPower);
	    int maximum = (int) Math.pow(10d, maxPower);

	    for (int index = minimum; index < maximum; index++) {
	        String test = createNumberString(numberWords,
	                index);
	        test = sort(test);
	        if (test.equals(input)) {
	            return index;
	        }
	    }

	    return -1;
	}
	
	public String createNumberString(String[] numberWords,
	        int index) {
	    String output = "";

	    while (index > 0) {
	        int digit = index % 10;
	        output = numberWords[digit] + output;
	        index /= 10;
	    }

	    return output;
	}

}
