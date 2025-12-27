package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@PostMapping("/insert")
	public Employee insertIntoDb( @RequestBody Employee employee)
	{
		return service.insert(employee);
	}
	
	@PostMapping("/insertall")
	public List<Employee> insertAll(@RequestBody List<Employee> employees){
		return service.insertAll(employees);
	}
	
	@GetMapping("/get")
	public List<Employee> getDb(){
		return service.findAll();
	}
	
	@GetMapping("/get/{id}")
	public Optional<Employee> getById(@PathVariable int id){
		return service.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Employee> deleteById(@PathVariable int id){
		return service.deleteById(id);
	}
	
	@PutMapping("/update")
	public Employee updateIntoDb(@RequestBody Employee employee) {
		return service.update(employee);
	}
	
}
