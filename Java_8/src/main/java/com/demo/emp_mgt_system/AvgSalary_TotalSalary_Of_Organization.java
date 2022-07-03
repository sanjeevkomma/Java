package com.demo.emp_mgt_system;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.algos.model.Employee;

public class AvgSalary_TotalSalary_Of_Organization {

	public static void main(String[] args) {

		List<Employee> employeeList = EmployeeList.getEmployeeList();

		DoubleSummaryStatistics employeeSalaryStatistics =

				employeeList.stream().collect(Collectors.summarizingDouble(Employee :: getSalary));

		System.out.println("Average Salary = " + employeeSalaryStatistics.getAverage());

		System.out.println("Total Salary = " + employeeSalaryStatistics.getSum());
	}

}
