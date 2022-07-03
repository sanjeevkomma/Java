package com.demo.emp_mgt_system;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.demo.algos.model.Employee;

public class Average_Salary_Of_Male_Female {

	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		
		Map<String, Double> avgSalaryOfMaleAndFemaleEmployees =
		
		employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
				         
	    System.out.println(avgSalaryOfMaleAndFemaleEmployees);

	}

}
