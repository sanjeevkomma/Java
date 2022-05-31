package com.demo.collectors_class;

import java.util.stream.Collectors;  
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.ArrayList;  

class Student {  

	int id;     

	String name;    

	int age;         

	public Student(int id, String name, int age) {  

		this.id = id;    

		this.name = name;         

		this.age = age;     

	} 

}  

public class Collectors_List {  

	public static void main(String[] args) {    

		List<Student> studentlist = new ArrayList<Student>();   

		//Adding Students      

		studentlist.add(new Student(11,"Jon",22));      

		studentlist.add(new Student(22,"Steve",18));        

		studentlist.add(new Student(33,"Lucy",22));        

		studentlist.add(new Student(44,"Sansa",23));         

		studentlist.add(new Student(55,"Maggie",18));  
		
		Thread tt; 
		
		Object jj; 
		
		BlockingQueue jjj; 

		//Fetching student names as List       

		List<String> names = studentlist.stream().map( ( Student s ) -> s.name ).collect( Collectors.toList() );

		System.out.println(names);         
	}  
}
