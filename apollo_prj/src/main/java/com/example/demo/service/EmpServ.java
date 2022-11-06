package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmpServ {

	List<Employee> allemp();

	Employee insemp(Employee employee, int did);

	List<String> getempname(int did);

}
