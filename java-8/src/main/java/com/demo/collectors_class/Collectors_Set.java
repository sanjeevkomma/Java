package com.demo.collectors_class;


import java.util.stream.Collectors;  
import java.util.List;  
import java.util.Set; 
import java.util.ArrayList;  

class Emp {    

	int id;     

	String name;  

	int age;           

	public Emp ( int id, String name, int age ) {   

		this.id = id;         

		this.name = name;       

		this.age = age;      

	} 

}  

public class Collectors_Set {     

	public static void main(String[] args) {       

		List<Emp> emplist = new ArrayList<Emp>();       

		// Adding Students        

		emplist.add(new Emp(11,"Jon",22));         

		emplist.add(new Emp(22,"Steve",18));         

		emplist.add(new Emp(33,"Lucy",22));         

		emplist.add(new Emp(44,"Sansa",23));         

		emplist.add(new Emp(55,"Maggie",18));                  

		// Fetching student data as a Set       

		Set<Emp> emps = emplist.stream().filter( ( Emp emp ) -> emp.id > 22 ).collect( Collectors.toSet() );

		// Iterating Set       

		for( Emp emp : emps ) { 

			System.out.println( emp.id + " " + emp.name + " " + emp.age ); 
		}        
		
		System.out.println(" ************** " ); 
		
		emps.forEach( ( Emp e ) -> System.out.println(e.id + " " + e.name + " " + e.age )  );
	} 
}