package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Department 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int depId;
	
	private String depName;
	
	@JsonIgnore
	@OneToMany(mappedBy = "department")
	private Set<Employee> employees = new HashSet<>();


	public void saveEmp(Employee resEmp) 
	{
		employees.add(resEmp);
	}
		
		
}