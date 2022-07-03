package com.demo.emp_mgt_system;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.demo.algos.model.Employee;

public class Average_Salary_Of_Each_Dept {

	public static void main(String[] args) {

		List<Employee> employeeList = EmployeeList.getEmployeeList();

		Map<String,Double> map = employeeList.stream().collect(Collectors.groupingBy
				
				(Employee :: getDepartment , Collectors.averagingDouble(Employee :: getSalary)));

		System.out.println(map);

	}

}
