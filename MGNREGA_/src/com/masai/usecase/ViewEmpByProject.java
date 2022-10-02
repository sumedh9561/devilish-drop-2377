package com.masai.usecase;

import java.sql.SQLException;

import java.util.List;
import java.util.Scanner;
import com.masai.dao.EmployeeDAO;
import com.masai.dao.EmployeeDAOImpl;


public class ViewEmpByProject {
	
	public static void main() throws SQLException {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Add Project Name");
		String x = in.nextLine();
		EmployeeDAO pd = new EmployeeDAOImpl();
		
		List<String> l = pd.viewEmpByProjectName(x);
		
	}
}