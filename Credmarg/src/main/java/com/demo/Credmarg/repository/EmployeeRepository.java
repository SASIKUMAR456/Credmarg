package com.demo.Credmarg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Credmarg.model.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, String>{

}
