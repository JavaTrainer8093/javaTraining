package com.nt.Runner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.entity.Employee;

public class TestJackson {

	public static void main(String[] args) {
		/*
		 * try { //json to Object String
		 * json="{\"id\":55,\"name\":\"sham\",\"sal\":33.0}";
		 * 
		 * ObjectMapper om = new ObjectMapper();
		 * 
		 * 
		 * Employee emp =om.readValue(json, Employee.class);
		 * 
		 * System.out.println(emp.toString()); } catch (JsonProcessingException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */
		 
		try {
			Employee emp = new Employee(55,"Sam",404.0);
			
			ObjectMapper om = new ObjectMapper();
			String json = om.writeValueAsString(emp);
			
			System.out.println(json);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
