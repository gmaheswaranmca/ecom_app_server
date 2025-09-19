package com.mahesh.ecomsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mahesh.ecomsystem.entities.Customer;
import com.mahesh.ecomsystem.entities.LoginCustomer;
import com.mahesh.ecomsystem.jwt.JwtUtil;
import com.mahesh.ecomsystem.repository.CustomerRepository;

@RestController
@CrossOrigin("*")
public class CustomerController {
	@Autowired
	private CustomerRepository repo;
	
	@PostMapping(path = "/signup")
	public Customer signUp(@RequestBody Customer customer) {
		customer.setId(null);
		Customer savedCustomer = repo.save(customer);
		return savedCustomer;
	}
	
	@PostMapping(path = "/login")
	public String login(@RequestBody LoginCustomer loginCustomer) {
		//jwt - token based authentication //code later
		Customer customer = repo.findByEmail(loginCustomer.getEmail());
		return "token" + customer.getId();
	}
	
	@PostMapping(path = "/admin/login")
	public String adminLogin(@RequestBody LoginCustomer loginCustomer) {
		if(loginCustomer.getEmail().equals("system") && 
			loginCustomer.getPassword().equals("1234"))
		{
			String token = JwtUtil.generateToken(loginCustomer.getEmail(), "admin");
			return token;
		}
		return "";
	}
}
