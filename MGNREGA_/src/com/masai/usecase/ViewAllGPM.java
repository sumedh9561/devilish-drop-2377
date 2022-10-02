package com.masai.usecase;


import java.sql.SQLException;

import java.util.Formatter;
import java.util.List;
import com.masai.bean.GPM;
import com.masai.dao.GPDAO;
import com.masai.dao.GPDAOImpl;

public class ViewAllGPM {
	public static void main() throws SQLException {
		
		GPDAO gpa = new GPDAOImpl();
		List<GPM> gpm = gpa.viewAllGPM();
		Formatter f = new Formatter();
		System.out.println("*******************************************************************************************");
		f.format("%15s %15s %15s %15s %15s\n", "ID" , "gname" , "location" , "username" , "password");
		System.out.println(f);
		gpm.forEach(g->System.out.println(g.forString()));
		System.out.println("*******************************************************************************************");
	}
}