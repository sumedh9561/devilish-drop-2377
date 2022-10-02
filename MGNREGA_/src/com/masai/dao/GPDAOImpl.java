package com.masai.dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.masai.bean.GPM;
import com.masai.exception.GPException;
import com.masai.util.DBConnect;



public  class GPDAOImpl implements GPDAO {

	@Override
	public String AddnewGPMemeber(GPM gmp) throws SQLException , GPException {
		
		String m = "There is some error while adding"; 
		
		try(Connection c = DBConnect.getConnected()){
			
		PreparedStatement ps = c.prepareStatement("insert into  grampanchayatmember(Gname,Location,username,password) "+ "values(?,?,?,?);");
		
			ps.setString(1, gmp.getGname());
			ps.setString(2, gmp.getLocation());
			ps.setString(3, gmp.getUsername());
			ps.setString(4, gmp.getPassword());
			
			int ex = ps.executeUpdate() ; 
			
			if(ex > 0 ) {
				
				m = "Values are Added Sucessfully" ;
			}else {
				
				throw new GPException("Values are not added Successfully");
				
			}
			c.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());

		}

		return m;
	}

	@Override
	public List<GPM> viewAllGPM() throws SQLException {
		
		
		List<GPM> list = new ArrayList<>();
		
		
		try(Connection c = DBConnect.getConnected()){
			
			PreparedStatement ps = c.prepareStatement("select * from grampanchayatmember");
			
			ResultSet rs =  ps.executeQuery();
			
			
			while(rs.next()) {
				
				int id = rs.getInt("ID");
				String name = rs.getString("Gname");
				String loc = rs.getString("Location");
				String usr = rs.getString("username");
				String pass = rs.getString("password");
				
				list.add(new GPM(id, name, loc, usr, pass));
				
			}
			
		}catch(SQLException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		return list;
	}


}