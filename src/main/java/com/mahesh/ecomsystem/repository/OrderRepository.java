package com.mahesh.ecomsystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mahesh.ecomsystem.entities.Order;
@Repository
public interface OrderRepository extends MongoRepository<Order, String> {

}
