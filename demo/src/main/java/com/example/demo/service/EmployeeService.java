package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	
	public Employee insert(Employee employee)
	{
		return repo.save(employee);
	}
	
	public List<Employee> insertAll(List<Employee> employeeList){
		return repo.saveAll(employeeList);
	}
	
	public List<Employee> findAll(){
		return repo.findAll();
	}
	
	public Optional<Employee> findById(int id){
		return repo.findById(id);
	}
	
	public List<Employee> deleteById(int id){
		
		repo.deleteById(id);
		return findAll();
	}
	
	public Employee update(Employee employee) {
		return repo.save(employee);
	}
	
	
}
