package com.demo.core.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.demo.core.model.Book;

public class Deserialization_Ex {

	public static void main(String[] args) {

		try {  

			ObjectInputStream in=new ObjectInputStream(new FileInputStream("./src/main/java/com/demo/core/model/book.txt"));  

			Book b = (Book)in.readObject();  

			System.out.println(b.getId()+" "+b.getName());  

			in.close();  
		}

		catch(Exception e){System.out.println(e);}  
	}  
}  