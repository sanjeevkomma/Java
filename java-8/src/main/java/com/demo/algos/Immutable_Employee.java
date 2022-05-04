package com.demo.algos;

import com.demo.algos.model.Address;
import com.demo.algos.model.Employee;

public class Immutable_Employee {

	public static void main(String[] args) throws Exception {

		Employee emp = new Employee(1 , "Adithya", 34, new Address("Home", "Madhapur", "Hyderabad"));

		Address address = emp.getAddress();

		System.out.println(address);

		address.setArea("Hi-tech City");

		address.setAddressType("Office");

		address.setCity("Hyderabad");

		System.out.println(emp.getAddress());

	}
}