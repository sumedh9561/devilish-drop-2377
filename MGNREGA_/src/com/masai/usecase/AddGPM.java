package com.masai.usecase;

import java.sql.SQLException;

import java.util.Scanner;

import com.masai.bean.GPM;
import com.masai.dao.GPDAO;
import com.masai.dao.GPDAOImpl;
import com.masai.exception.GPException;

public class AddGPM {
	 
	public static void main() throws SQLException, GPException {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Name of Assigned Gram Panchayat Member Name");
		String gname = 	in.next();
		
		System.out.println("Enter Location of where he is assigned ");
		String loc = in.next();
		
		System.out.println("Give Username to Gram Panchayat Member");
		String username = in.next();
		
		
		System.out.println("Give Password to Gram Panchayat Member");
		String password = in.next();
		
		
		GPDAO gpmemeber = new GPDAOImpl();
		
		String message  =  gpmemeber.AddnewGPMemeber(new GPM(gname, loc, username, password));
		
		System.out.println(message);
//	in.close();	
		
	}
}