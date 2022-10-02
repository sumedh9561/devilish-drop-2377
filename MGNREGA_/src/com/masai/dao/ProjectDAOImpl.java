package com.masai.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Project;
import com.masai.exception.ProjectException;
import com.masai.util.DBConnect;

public class ProjectDAOImpl  implements ProjectDAO{

	
	// Adding new Project 
	@Override
	public String addProject(Project p) throws ProjectException, SQLException {
		
		String message = "There Something Wrong in inserting Project " ;
		
		try(Connection c = DBConnect.getConnected()){
				
			PreparedStatement ps = c.prepareStatement("insert into Projects(Pname,Location) values(?,?)");
			
			ps.setString(1, p.getProjectName());
			ps.setString(2, p.getLocation());
			
			int update = ps.executeUpdate();
			
			if(update > 0 ) {
				message = "Entry added successfully" ;
			}else {
				throw new ProjectException("Something wrong in values");
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return message ; 
	}

	
	// Assigning a GPM to an Project ; 
	@Override
	public String allocateProjectToGPM(String p, String g) throws SQLException {

		
			
		String message = "There is some error while assigning task please try again";
		try(Connection c = DBConnect.getConnected()){
			
			PreparedStatement ps = c.prepareStatement("insert into p_g values("
					+ "(select ProjectNo from projects where PName = ?),"
					+ "(select ID from grampanchayatmember where gname = ?));");
			
			ps.setString(1, p);
			ps.setString(2, g);
			
			int update = ps.executeUpdate();
			
			if(update > 0) {
				message = "Project " + p + " successfully assigned to " + g + " GP memeber";
			}
			
		}catch(SQLException c) {
			System.out.println(c.getMessage());
		}
		return message;
	}


	
	// View All Project
	@Override
	public List<Project> viewAllProjects() {
		List<Project> list = new ArrayList<>();
		
		
		try(Connection c = DBConnect.getConnected()){
			
			PreparedStatement ps = c.prepareStatement("select * from projects");
			
			ResultSet x = ps.executeQuery();
			
			while(x.next()) {
				
				int id = x.getInt("ProjectNo");
				String name = x.getString("Pname");
				String loc = x.getString("Location");
				
				Project p = new Project(id , name , loc)  ;
				
				list.add(p);
			}
			
			
		}catch(SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		return list;
	}
}
