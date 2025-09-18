package com.mahesh.ecomsystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mahesh.ecomsystem.entities.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
	Customer findByEmail(String email);
}
