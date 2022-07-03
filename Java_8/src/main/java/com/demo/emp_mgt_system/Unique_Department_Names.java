package com.demo.emp_mgt_system;

import java.util.List;

import com.demo.algos.model.Employee;

public class Unique_Department_Names {

	public static void main(String[] args) {

		List<Employee> employeeList = EmployeeList.getEmployeeList();

		employeeList.stream().map( ( Employee e ) -> ( e.getDepartment() ) ).distinct().forEach( System.out :: println );

		// other way
		
		System.out.println(" **************** ");
		
		employeeList.stream().map( ( Employee e ) -> e.getDepartment() ).
		
		distinct().forEach( (String deptName ) -> System.out.println(deptName));
		
	}

}
