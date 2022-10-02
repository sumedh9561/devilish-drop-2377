package com.masai.dao;

import java.sql.SQLException;
import java.util.List;
import com.masai.bean.Employee;
import com.masai.exception.EmployeeException;

public interface EmployeeDAO  {
	
	public String addEmployee(Employee e) throws EmployeeException , SQLException ; 
	
	public  boolean backEndUserCheck(String username ,String password) throws SQLException ;
	
	public  boolean GPOUserCheck(String username ,String password) throws SQLException ;
	
	public List<String> viewEmpByProjectName(String proj) throws SQLException; 
	
	public Employee checkEmployee(String empN, int id) throws EmployeeException , SQLException ;
	
	public List<String> checkWageByProject(String projName) throws EmployeeException , SQLException ;
		
	public String assignProjToEmp(String pname , int Id , String ename , String gname) throws EmployeeException , SQLException ;
	
	public String addEmloyee1(Employee e) throws EmployeeException , SQLException ;
	
	
}