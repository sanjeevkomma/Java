package com.demo.emp_mgt_system;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.demo.algos.model.Employee;

public class Highest_Paid_Emp_Details {

	public static void main(String[] args) {

		List<Employee> employeeList = EmployeeList.getEmployeeList();

		Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream().collect( Collectors.maxBy( Comparator.comparingDouble( Employee :: getSalary ) ) );

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
