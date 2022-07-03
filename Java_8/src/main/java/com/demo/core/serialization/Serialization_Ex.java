package com.demo.core.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.demo.core.model.Book;

public class Serialization_Ex {

	public static void main(String[] args) {

		try {  
			
			Book b1 = new Book(1,"docker");
			
			ObjectOutputStream  out = new ObjectOutputStream (new FileOutputStream("./src/main/java/com/demo/core/model/book.txt"));  

			out.writeObject(b1);    

			out.close();  

		}
		catch(Exception e){

			System.out.println(e);
		}  
	}  
}
