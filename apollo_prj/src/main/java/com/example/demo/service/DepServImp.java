package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.repository.DepRepo;

@Service
public class DepServImp implements DepServ
{
	@Autowired
	private DepRepo drepo;

	@Override
	public List<Department> alldep() 
	{
		return drepo.findAll();
	}
}
