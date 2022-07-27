package com.nt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMgmtService;

@SpringBootApplication
public class Datajpaproj3Application {

	public static void main(String[] args) {
	
		
	BeanFactory fi =	SpringApplication.run(Datajpaproj3Application.class, args);
	IEmployeeMgmtService srvc =fi.getBean("empService",IEmployeeMgmtService.class);
	
	
	/*
	 * System.out.println(srvc.registerEmployee(new
	 * EmployeeDTO("ram","hyd",6789.0f)));
	 * System.out.println(srvc.registerEmployee(new
	 * EmployeeDTO("sham","bng",67769.0f)));
	 */
	List<EmployeeDTO> dtoo= new ArrayList();
	dtoo.add(new EmployeeDTO("sham","bng",67769.0f));
	dtoo.add(new EmployeeDTO("shaktiman","bbsr",67121.0f));


	System.out.println(srvc.registerEmployeeGroup(List.of(new EmployeeDTO("sham","bng",67769.0f))));
	
	
	

}
