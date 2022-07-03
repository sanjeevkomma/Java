package com.demo.emp_mgt_system;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.demo.algos.model.Employee;

public class Separate_Emps_By_Age {

	public static void main(String[] args) {

		List<Employee> employeeList = EmployeeList.getEmployeeList();

		Map<Boolean, List<Employee>> partitionEmployeesByAge =

				employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));

		Set<Entry<Boolean, List<Employee>>> entrySet = partitionEmployeesByAge.entrySet();

		for ( Entry<Boolean, List<Employee>> entry : entrySet ) {

			System.out.println("----------------------------");

			if ( entry.getKey() ) {

				System.out.println("Employees older than 25 years :");
			}
			else {
				System.out.println("Employees younger than or equal to 25 years :");
			}

			System.out.println("----------------------------");

			List<Employee> list = entry.getValue();

			for ( Employee e : list ) {

				System.out.println( e.getName() );
			}
		}

	}

}
