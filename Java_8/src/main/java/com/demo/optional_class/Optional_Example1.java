package com.demo.optional_class;

//Importing Optional class
import java.util.Optional; 

public class Optional_Example1 { 

	public static void main(String[] args) {    

		String[] str = new String[10];     

		Optional<String> isNull = Optional.ofNullable( str[9] ); 

		if( isNull.isPresent() ){     

			// Getting the substring    

			String str2 = str[9].substring(2, 5);    

			//Displaying substring           

			System.out.println("Substring is: "+ str2);       
		}     
		else
		{      
			System.out.println("Cannot get the substring from an empty string");     
		}      

		str[9] = "AgraIsCool";   

		Optional<String> isNull2 = Optional.ofNullable( str[9] );  

		if( isNull2.isPresent() ){   

			//Getting the substring      

			String str2 = str[9].substring(2, 5);   

			//Displaying substring           
			System.out.print( "Substring is: "+ str2 );          
		}         
		else
		{         
			System.out.println("Cannot get the substring from an empty string");         
		}    
	}  
}