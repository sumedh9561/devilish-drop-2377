package com.masai.usecase;

import java.sql.SQLException;

import java.util.Scanner;

import com.masai.dao.EmployeeDAO;
import com.masai.dao.EmployeeDAOImpl;
import com.masai.exception.EmployeeException;

public class FindEmpDetailsByProjName {
	public static void main() throws EmployeeException, SQLException {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter ProjectName");
		String s =  in.next();
		
		EmployeeDAO e = new EmployeeDAOImpl();
		 
		e.checkWageByProject(s);

	}
}