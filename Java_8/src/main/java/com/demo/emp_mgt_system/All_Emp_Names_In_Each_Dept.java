package com.demo.emp_mgt_system;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.demo.algos.model.Employee;

public class All_Emp_Names_In_Each_Dept {

	public static void main(String[] args) {

		List<Employee> employeeList = EmployeeList.getEmployeeList();

		Map<String, List<Employee>> employeeListByDepartment =

				employeeList.stream().collect(Collectors.groupingBy(Employee :: getDepartment));

		Set<Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();

		for ( Entry<String, List<Employee>> entry : entrySet ) {
			
			System.out.println("--------------------------------------");

			System.out.println("Employees In "+entry.getKey() + " : ");

			System.out.println("--------------------------------------");

			List<Employee> list = entry.getValue();

			for (Employee e : list) {
				
				System.out.println(e.getName());
			}
		}

	}

}
