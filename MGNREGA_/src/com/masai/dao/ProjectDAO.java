package com.masai.dao;

import java.sql.SQLException;

import java.util.List;
import com.masai.bean.Project;
import com.masai.exception.ProjectException;

public interface ProjectDAO {
	
	public String addProject(Project p) throws ProjectException , SQLException ;  
	
	public String allocateProjectToGPM(String p , String g ) throws  SQLException ;
	
	public List<Project> viewAllProjects();
	
	
	
}