package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface IEmployeeMgmtService {
    public    int   registerEmployee(EmployeeDTO dto);
    public  int[] registerEmployeeGroup(List<EmployeeDTO> listdto);
  
}
