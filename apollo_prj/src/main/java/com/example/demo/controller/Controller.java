package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.service.DepServ;
import com.example.demo.service.EmpServ;

@RestController
public class Controller 
{
	@Autowired
	private DepServ dserv;
	
	@Autowired
	private EmpServ eserv;
	
	
	@GetMapping("/empList")
	public List<Employee> allEmp()
	{
		return eserv.allemp();
	}
	
	@GetMapping("/depList")
	public List<Department> allDep()
	{
		return dserv.alldep();
	}
	
	@PostMapping("/insertEmp/{depId}")
	public Employee insEmp(@RequestBody Employee employee, @PathVariable("depId") int did)
	{
		return eserv.insemp(employee,did);
	}
	
	
	@GetMapping("/getEmpName/{depId}")
	public List<String> getEmpName(@PathVariable("depId") int did)
	{
		return eserv.getempname(did);
	}
	
	
	
	
}
