package com.masai.dao;

import java.sql.SQLException;

import java.util.List;

import com.masai.bean.GPM;
import com.masai.exception.GPException;

public interface GPDAO {
	
	public String AddnewGPMemeber(GPM gmp) throws SQLException ,GPException;
	
	
	public List<GPM> viewAllGPM() throws SQLException ;
}