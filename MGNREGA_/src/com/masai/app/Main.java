package com.masai.app;

import java.sql.SQLException;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.masai.dao.EmployeeDAO;
import com.masai.dao.EmployeeDAOImpl;
import com.masai.dao.ProjectDAO;
import com.masai.dao.ProjectDAOImpl;
import com.masai.exception.EmployeeException;
import com.masai.exception.GPException;
import com.masai.exception.ProjectException;
import com.masai.usecase.AddEmployee;
import com.masai.usecase.AddGPM;
import com.masai.usecase.AddProject;
import com.masai.usecase.AllocateProjectToGPM;
import com.masai.usecase.AssignEmpToProject;
import com.masai.usecase.FindEmp;
import com.masai.usecase.ViewAllGPM;
import com.masai.usecase.ViewAllProject;
import com.masai.usecase.ViewEmpByProject;

public class Main {
	
	public static void main(String[] args) throws SQLException, ProjectException, GPException, EmployeeException, InputMismatchException {
		int choice = 0 ; 
		Scanner in = new Scanner(System.in); 
		System.out.println( "  " );

		System.out.println( "                                               Welcome to MGNREGA          " );
		System.out.println( "__________________________________________________________________________________________________________________" );
		System.out.println( "  " );

		System.out.println("Press 1 to Login as BDO(Block_Department_Officer)");
		System.out.println("Press 2 to Login as Gram Panchayat Member" );
		System.out.println("Press 3 to Login Exit" );
		System.out.println("______________________________________________");
		try {
			
			 choice = in.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Enter Valid Number");
		}
		
		if(choice == 1) {
			System.out.println("Enter UserName");
			String username = in.next();
			
			System.out.println("Enter Password");	
			String password = in.next();
			
			EmployeeDAO edao = new EmployeeDAOImpl();
			
			boolean flag = edao.backEndUserCheck(username, password);
			if(flag == false ) {
				
				System.out.println("UserName or Password is wrong please try Again");
				Main.main(args);
				
			}else {
				
				System.out.println("Sucessfully LoggedIn");
			}
//********************************************************************************************************************************	
			
//                                                 BDO(Block Department Officer)		
//*******************************************************************************************************************************
			
			while(flag) {
				if(choice == 1 ) {
					
					boolean flag1 = true ;
					   while(flag1) {
							System.out.println("________________________________________________________________________");
							
							System.out.println("Please Select Queries which you want to Apply ");
							System.out.println("________________________________________________________________________");

							
							System.out.println("Press 1 to create New Project");
							System.out.println("Press 2 to watch all Project");
							System.out.println("Press 3 to Create new GramPanchayat Members");
							System.out.println("Press 4 to Watch all GramPanchayat Members");
							System.out.println("Press 5 to Allocate Project to GramPanchayatMember");
							System.out.println("Press 6 to see all the list of employee working on Project");
							System.out.println("Press 7 to Go Back to login page");
							System.out.println("Press 8 to Exit");
							System.out.println("_________________________________________________________________________");
							
							
							
							
								String BODQ =  in.next();
						
							
							
							
							switch(BODQ) {
								
								case "1" : AddProject.main();
									break ;
								case "2" : ViewAllProject.main();
									break ;
								case "3" : AddGPM.main();
									break ;
								case "4" : ViewAllGPM.main();
									break;
								case "5" : AllocateProjectToGPM.main();
									break ;
								case "6" : ViewEmpByProject.main();
									break;
								case "7" : Main.main(args); 
									break ;
								case "8" : System.exit(0);
							}
							break ; 
						}

					}
				}
		}
//********************************************************************************************************************************	
		
//                                       Gram Panchayt Officer		
//*******************************************************************************************************************************		
		
		else if(choice == 2) {
			System.out.println("Enter UserName");
			String username = in.next();
			
			System.out.println("Enter Password");	
			String password = in.next();
			
			EmployeeDAO edao = new EmployeeDAOImpl();
			boolean flag =  edao.GPOUserCheck(username, password);
			if(flag == false) {
				System.err.println("UserName or Password is wrong please try Again");
				Main.main(args);
			}else {
				System.out.println("Successfully Logged In ");
			}
			while(flag) {
				
				System.out.println("_____________________________________________________________________________________");

				System.out.println("Press 1 Create Employee");
				System.out.println("Press 2 to View details of employee");
				System.out.println("Press 3 to Assign a project to existing employee");
				System.out.println("Press 4 View total number of days Employee worked in a project and also their wages");
				System.out.println("Press 5 to Go back to login page");
				System.out.println("Press 6 for EXIT");
				System.out.println("______________________________________________________________________________________");

				String  query = in.next();
				
				switch(query) {
				
				
				case "1" : AddEmployee.main2();
						break ;
					case "2" : FindEmp.main();
						break;
					case "3" : AssignEmpToProject.main(username);
						break ;
					case "4" : ViewEmpByProject.main();
						break ;
					case "5" : Main.main(args);
						break ;
					case "6" : System.exit(0);
						break;
				}
			}
			
			
		}else if(choice == 3) {
			System.exit(0);
		}else {
			System.err.println("Please enter valid Choice");
			Main.main(args);
		}

	}

}