package com.demo.algos.model;

public final class Employee {

	private final Integer id;
	private final String name;
	private final Integer age;
	private final Address address;

	public Employee(Integer id , String name, Integer age, Address address) {

		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	
	public Integer getId() {
		return id;
	}
	
	/* public Address getAddress() {
	      return address;
	      }
	 */
	
	public Address getAddress() throws CloneNotSupportedException {
		
		return (Address) address.clone();
	}


}
