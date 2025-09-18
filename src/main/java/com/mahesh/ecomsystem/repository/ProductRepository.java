package com.mahesh.ecomsystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mahesh.ecomsystem.entities.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,String>
{

}