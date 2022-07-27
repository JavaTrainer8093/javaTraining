package com.fujitsu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.fujitsu.bo.StudentBo;



public class StudentDAOImpl implements IStudentDAO {
	private  static final String   INSERT_LAYERED_STUDENT="INSERT INTO STUDENT VALUES(?,?,?,?,?)";
    
	//private  DataSource ds;

	/*
	 * public StudentDAOImpl()throws Exception { //create InitialContext obj
	 * InitialContext ic=new InitialContext(); //get DataSource obj from Jndi
	 * registry throug lookup method ds=(DataSource)
	 * ic.lookup("java:/comp/env/DsJndi"); }
	 */
	@Override
	public int insert(StudentBo bo) throws Exception {
		//get Pooled jdbc con object
		//Connection con=getPooledJdbcConnection();
		 Class.forName("oracle.jdbc.driver.OracleDriver");
	     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","System", "8093");
		//get Jdbc PreparedStatement object
		PreparedStatement ps=con.prepareStatement(INSERT_LAYERED_STUDENT);
		//set values to query params
		ps.setString(1,bo.getSname());
		ps.setString(2,bo.getAddd());
		ps.setInt(3,bo.getTotal());
		ps.setInt(4,bo.getAvg());
		ps.setString(5,bo.getResult());
		
		
		//execute the quey
		int result=ps.executeUpdate();
		//close jdbc objs
		 ps.close();
		 con.close();
		//return the reult
		return result;
	}//method
	
	
}//class
