package com.fujitsu.service;

import com.fujitsu.bo.StudentBo;
import com.fujitsu.dao.IStudentDAO;
import com.fujitsu.dao.StudentDAOImpl;
import com.fujitsu.dto.StudentDTO;

public class StudentMgmtimpl implements IStudentMgmtService {



	private IStudentDAO dao;
	public StudentMgmtimpl() throws Exception{
		System.out.println("StudentMgmtServiceImpl.0-param constructor");
		//dao=new  StudentDAOImpl();
		dao=new  StudentDAOImpl();
	}

	@Override
	public String generateResult(StudentDTO dto) throws Exception {
		//write b.logic
		 int total=dto.getMath()+dto.getScience()+dto.getEnglish();
		 //calculate avg
		 Integer avg=total/3;
		 //generate result
		 String result=null;
		 if(dto.getMath()<35 || dto.getScience()<35 || dto.getEnglish()<35)
			 result="fail";
		 else if(avg<35)
			 result="fail";
		 else if(avg<50)
			 result="third class";
		 else if(avg<60)
			 result="second class";
		 else 
			 result="first class";
		 //create StudentBO class obj
		 StudentBo bo=new StudentBo();
		 bo.setSname(dto.getSname());
		 bo.setAddd(dto.getSadd());
		 bo.setTotal(total); bo.setAvg(avg); bo.setResult(result);
		 //use DAO
		 int count=dao.insert(bo);
		return count==0?"Student Registration failed":"Student Registration succeded ::"+"total:"+total+" avg::"+avg+" result:"+result;
	}//method
}


