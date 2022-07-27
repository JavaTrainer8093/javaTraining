package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dto.EmployeeDTO;
import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepo;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private  IEmployeeRepo  empRepo;

	@Override
	public int registerEmployee(EmployeeDTO dto) {
		
		Employee entity=new Employee();
		BeanUtils.copyProperties(dto, entity);
		
		return  empRepo.save(entity).getEno();
	}

	public int[] registerEmployeeGroup(List<EmployeeDTO> listdto) {
List<Employee> listEntity = new ArrayList();
		
		listdto.forEach(dto->{
			
			Employee entity = new Employee();
			BeanUtils.copyProperties(dto, entity);
			listEntity.add(entity);
		});
		
		List<Employee> listentity1=(List<Employee>)empRepo.saveAll(listEntity);
		
		int ids[] =new int[listentity1.size()];
		for(int i=0;i<listentity1.size();i++)
		{
			ids[i]=listentity1.get(i).getEno();
		}
		return ids;
	}

	

		
	
}//class
