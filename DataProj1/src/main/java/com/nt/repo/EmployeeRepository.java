package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Employeeo;

public interface EmployeeRepository extends JpaRepository<Employeeo, Integer> {

}
