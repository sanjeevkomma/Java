package com.demo.emp_mgt_system;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.demo.algos.model.Employee;

public class Highest_Paid_Emp_Details {

	public static void main(String[] args) {

		List<Employee> employeeList = EmployeeList.getEmployeeList();

		Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream().collect( Collectors.maxBy( Comparator.comparingDouble( Employee :: getSalary ) ) );
		
		// Optional<Employee> empOp1 = Optional.of(null); // throws NullPointerException
		
		Optional<Employee> empOp2 = Optional.ofNullable(null); // It will return Optional.empty 
		
		// System.out.println("empOp1 :: "+empOp1);
		
		System.out.println("empOp2 :: "+empOp2);

		Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();

		System.out.println("Details Of Highest Paid Employee : ");

		System.out.println("==================================");

		System.out.println("ID : "+highestPaidEmployee.getId());

		System.out.println("Name : "+highestPaidEmployee.getName());

		System.out.println("Age : "+highestPaidEmployee.getAge());

		System.out.println("Gender : "+highestPaidEmployee.getGender());

		System.out.println("Department : "+highestPaidEmployee.getDepartment());

		System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());

		System.out.println("Salary : "+highestPaidEmployee.getSalary());


	}

}
