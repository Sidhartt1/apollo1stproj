package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.repository.DepRepo;
import com.example.demo.repository.EmpRepo;

@Service
public class EmpServImp implements EmpServ
{

	@Autowired
	private EmpRepo erepo;
	
	@Autowired
	private DepRepo drepo;
	
	
	@Override
	public List<Employee> allemp() 
	{
		return erepo.findAll();
	}


	@Override
	public Employee insemp(Employee employee,int did) 
	{
		Department depart = drepo.findById(did).get();
		
		if(depart == null)
		{
			return null;
		}
		employee.setDepartment(depart);
		Employee resEmp = erepo.save(employee);
		return resEmp;
	}


	@Override
	public List<String> getempname(int did) 
	{
		return erepo.getempname(did);
	}
}
