package com.masai.util;

import java.sql.Connection;
import java.sql.SQLException;

public class DBMain {
	public static void main(String[] args) throws SQLException {
		
		Connection con = DBConnect.getConnected();
		
		
		if(con != null) {
			System.out.println("Connected");
		}else {
			System.out.println("There is some Error while connecting to sql ");
		}
		
		
	}
}