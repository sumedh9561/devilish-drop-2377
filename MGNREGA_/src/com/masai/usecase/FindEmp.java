package com.masai.usecase;

import java.sql.SQLException;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.masai.bean.Employee;
import com.masai.dao.EmployeeDAO;
import com.masai.dao.EmployeeDAOImpl;
import com.masai.exception.EmployeeException;

public class FindEmp {
	
	public static void main() throws EmployeeException, SQLException {
		
		
		
		try {
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter the Name of Employee");
			String name = in.next();
			
			System.out.println("Enter Employees Id ");
			int id = in.nextInt();
			
			
			EmployeeDAO ed = new EmployeeDAOImpl();
			Employee e  = ed.checkEmployee(name, id);
			if(e == null) {
				System.out.println("Employee with name "+name +" and Id "+id+" doesNot Exist");
			}else {
				System.out.println(e);
			}
		}catch(InputMismatchException ee){
			System.out.println("Please Id Must be Number");
			
		}
	}
	
}