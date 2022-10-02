package com.masai.bean;


public class Employee {
	int empId ; 
	String empName ; 
	String empGender ; 
	int empWage ; 
	int empDuty  ;
	int projAssigned ; 
	int GpoAssigned ;
	
	
	
	
	
	public Employee(String empName, String empGender, int empWage, int empDuty, int projAssigned,
			int gpoAssigned) {
		super();
		this.empName = empName;
		this.empGender = empGender;
		this.empWage = empWage;
		this.empDuty = empDuty;
		this.projAssigned = projAssigned;
		this.GpoAssigned = gpoAssigned;
	}
	
	
	


	





	public Employee(int empId, String empName, String empGender, int empWage, int empDuty, int projAssigned,
			int gpoAssigned) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empGender = empGender;
		this.empWage = empWage;
		this.empDuty = empDuty;
		this.projAssigned = projAssigned;
		GpoAssigned = gpoAssigned;
	}


	public Employee(String ename, String gender, int wage, int day) {
		this.empName = ename;
		this.empGender = gender;
		this.empWage = wage;
		this.empDuty = day;
	}



	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public int getEmpWage() {
		return empWage;
	}
	public void setEmpWage(int empWage) {
		this.empWage = empWage;
	}
	public int getEmpDuty() {
		return empDuty;
	}
	public void setEmpDuty(int empDuty) {
		this.empDuty = empDuty;
	}
	public int getProjAssigned() {
		return projAssigned;
	}
	public void setProjAssigned(int projAssigned) {
		this.projAssigned = projAssigned;
	}
	public int getGpoAssigned() {
		return GpoAssigned;
	}
	public void setGpoAssigned(int gpoAssigned) {
		GpoAssigned = gpoAssigned;
	}
	@Override
	public String toString() {
		return 
				"=============================================\n"
				+ "empId        : " + empId + "\n"
				+ "empName      : " + empName + "\n"
				+ "empGender    : " + empGender + "\n"
				+ "empWage      : " + empWage +"\n" 
				+ "empDuty      : " + empDuty + "\n"
				+ "projAssigned : " + projAssigned + "\n"
				+ "GpoAssigned  : " + GpoAssigned+
				"\n===========================================";
	} 
	
	
	
}
