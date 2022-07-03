package com.demo.emp_mgt_system;

import java.util.List;

import com.demo.algos.model.Employee;

public class Emp_Names_DOJ_After_2015 {

	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015)
		
		.map( Employee :: getName).forEach(  System.out :: println );
	}

}
