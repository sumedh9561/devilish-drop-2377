package com.masai.usecase;


import java.util.Formatter;
import java.util.List;

import com.masai.bean.Project;
import com.masai.dao.ProjectDAO;
import com.masai.dao.ProjectDAOImpl;

public class ViewAllProject {
	
	public static void main() {
		
		ProjectDAO pO = new ProjectDAOImpl();
		
		Formatter fmt = new Formatter();
		System.out.println("===========================================================================================");
		fmt.format("%22s %30s %22s\n", "|  ProjectNo  |","  |  ProjectName  |  ", "  |  Location  |");
		System.out.println(fmt);
		
		
		List<Project> list =  pO.viewAllProjects();
		
		list.forEach(p->System.out.println(p.forString()));
		System.out.println("===========================================================================================");
		
		
		 
	}
}