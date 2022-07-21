package com.demo.emp_mgt_system;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.demo.algos.model.Employee;

public class Oldest_Emp_By_Age_In_Organization {

	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		
		Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt( Employee :: getAge));
        
		Employee oldestEmployee = oldestEmployeeWrapper.get();
		         
		System.out.println("Name : "+oldestEmployee.getName());
		         
		System.out.println("Age : "+oldestEmployee.getAge());
		         
		System.out.println("Department : "+oldestEmployee.getDepartment());
		
		
		Math.random();
	}

}
