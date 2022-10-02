package com.masai.usecase;

import java.sql.SQLException;

import java.util.Scanner;
import com.masai.bean.Project;
import com.masai.dao.ProjectDAO;
import com.masai.dao.ProjectDAOImpl;
import com.masai.exception.ProjectException;

public class AddProject {
	
	public static void main() throws ProjectException, SQLException {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Name of Project");
		String pname = 	in.nextLine();
		
		System.out.println("Enter Location Project ");
		String loc = in.nextLine();
		

		
		ProjectDAO newProject = new ProjectDAOImpl();
		
		String message  =  newProject.addProject(new Project(pname , loc));
		
		System.out.println(message);
//	in.close();	
		
	}
}
