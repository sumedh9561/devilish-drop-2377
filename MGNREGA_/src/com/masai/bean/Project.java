package com.masai.bean;


import java.util.Formatter;

public class Project {
	int projectId ; 
	String projectName ; 
	String location ; 
	
	public Project() {
		
	}
	public Project(String pn , String l) {
		
		this.projectName = pn ;
		this.location = l ;
		
	}
	public Project(int id, String name, String loc) {
		this.projectId = id ; 
		this.projectName = name ;
		this.location = loc ;
	}

	public Formatter forString() {
		Formatter fmt = new Formatter();
		return  fmt.format("%15s %29s %26s\n" ,projectId, projectName,location)  ;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
