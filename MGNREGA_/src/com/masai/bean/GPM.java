package com.masai.bean;

import java.util.Formatter;

public class GPM {
	int ID  ; 
	String gname ; 
	String location ; 
	String username ; 
	String password ; 
	
	public GPM() {
		
	}
	
	public GPM(String g , String loc ,String user , String pass) {
		
		this.gname = g ; 
		this.location = loc ; 
		this.username = user ; 
		this.password = pass ;
		
	}




	public GPM(int id2, String name, String loc, String usr, String pass) {
		this.ID = id2 ;
		this.gname = name ; 
		this.location = loc ; 
		this.username = usr ; 
		this.password = pass ;
	}

	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getGname() {
		return gname;
	}


	public void setGname(String gname) {
		this.gname = gname;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Formatter forString() {
		Formatter f = new Formatter();
		f.format("%15s %15s %15s %15s %15s\n", ID , gname , location , username , password);
		return f;
		
	}
	
	
	
}