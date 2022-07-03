package com.demo.emp_mgt_system;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.demo.algos.model.Employee;

public class Male_Female_Employees_In_Sales_Dept {

	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		
		Map<String, Long> countMaleFemaleEmployeesInSalesMarketing =
				
		employeeList.stream().filter(e -> e.getDepartment()=="Sales And Marketing")
		
		.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
				 
		System.out.println(countMaleFemaleEmployeesInSalesMarketing);
		
	}

}
