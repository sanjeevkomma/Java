package com.demo.core.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class User implements Externalizable {  
	
	private Integer id ;
	
	private String name;
	
	private Integer age;
	
	

	public User(Integer id, String name,Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public User() {
		
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeInt(age);  
		
		out.writeObject(name);  
        
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		age = in.readInt();
		
		name = (String) in.readObject();  
		   
	}

}
