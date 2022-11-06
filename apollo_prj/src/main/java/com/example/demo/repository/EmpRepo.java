package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>
{

	
	@Query(value="select emp.emp_name from employee emp where emp.dep_id = :depid", nativeQuery = true)
	List<String> getempname(@Param("depid")int did);
}