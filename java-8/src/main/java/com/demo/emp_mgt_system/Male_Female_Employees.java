package com.demo.emp_mgt_system;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.demo.algos.model.Employee;

public class Male_Female_Employees {
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeList.getEmployeeList();

		Map<String, Long> noOfMaleAndFemaleEmployees =
				
				employeeList.stream().collect(Collectors.groupingBy( Employee :: getGender, Collectors.counting() ));
				         
				System.out.println(noOfMaleAndFemaleEmployees);
		
	}

}
