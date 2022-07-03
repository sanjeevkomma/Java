package com.demo.emp_mgt_system;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.demo.algos.model.Employee;

public class Senior_Employee_By_YearOfJoining {

	public static void main(String[] args) {
		
		// ( sorted() && findFirst() ) OR min() can be used
		
		List<Employee> employeeList = EmployeeList.getEmployeeList();
		
		Optional<Employee> seniorMostEmployeeWrapper =
				
		employeeList.stream().sorted(Comparator.comparingInt( Employee :: getYearOfJoining )).findFirst();
		
		Optional<Employee> seniorMostEmployeeWrapper2 =
				
		employeeList.stream().min(Comparator.comparingInt( Employee :: getYearOfJoining ));
				         
		Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();
        
		System.out.println("Senior Most Employee Details :");
		         
		System.out.println("----------------------------");
		         
		System.out.println("ID : "+seniorMostEmployee.getId());
		         
		System.out.println("Name : "+seniorMostEmployee.getName());
		         
		System.out.println("Age : "+seniorMostEmployee.getAge());
		         
		System.out.println("Gender : "+seniorMostEmployee.getGender());
		         
		System.out.println("Age : "+seniorMostEmployee.getDepartment());
		         
		System.out.println("Year Of Joinging : "+seniorMostEmployee.getYearOfJoining());
		         
		System.out.println("Salary : "+seniorMostEmployee.getSalary());

	}

}
