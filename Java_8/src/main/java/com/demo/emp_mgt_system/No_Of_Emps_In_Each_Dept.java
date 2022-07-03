package com.demo.emp_mgt_system;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.demo.algos.model.Employee;

public class No_Of_Emps_In_Each_Dept {

	public static void main(String[] args) {

		List<Employee> employeeList = EmployeeList.getEmployeeList();

		Map<String, Long> employeeCountByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.counting()));
		
		System.out.println(employeeCountByDepartment);

		/*Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

		for (Entry<String, Long> entry : entrySet) {
			
			System.out.println( entry.getKey() + " : " + entry.getValue() );
		}*/

	}

}
