package com.demo.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.demo.core.model.User;

public class Externalization_Ex {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		File file = new File("./src/main/java/com/demo/core/model/user.txt");  

		User user = new User( 1 , "Tom",25);  

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));    

		out.writeObject(user);  // Serialization  

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));  

		user = (User)in.readObject(); // Deserialization

		System.out.println("After De externalization username: " +user.getName()+" and age is:"+user.getAge());  
		
		out.close();
		
		in.close();
	}  
}  