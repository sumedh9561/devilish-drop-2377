package com.masai.usecase;

import java.sql.SQLException;

import java.util.Scanner;
import com.masai.dao.ProjectDAO;
import com.masai.dao.ProjectDAOImpl;
import com.masai.exception.ProjectException;

public class AllocateProjectToGPM {

		
		public static void main() throws ProjectException, SQLException {
			
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Name of Project");
			String pname = 	in.nextLine();
			
			System.out.println("Enter Name of Grampanchayat Member ");
			String gname = in.nextLine();
			
			ProjectDAO passign = new  ProjectDAOImpl() ;
			
			String m =  passign.allocateProjectToGPM(pname, gname);
			
			System.out.println(m);
			
			
			
			
//		in.close();	
			
		
		
	}
}