package com.example.demo.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;


@SpringBootTest
class EmployeeServiceTest {
	
	@Autowired
	EmployeeService service;
	
	Employee e;
	
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		e=new Employee();
		
	}

	@Test
	void test1() {
		e.setEmployeeID(6);
		e.setFirstName("Fares");
		e.setLastName("Bani Hani");
		e.setAddress("US");
		Assertions.assertNotNull(service.insert(e));
		//fail("Not yet implemented");
	}

}
