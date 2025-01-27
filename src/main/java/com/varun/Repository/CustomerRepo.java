package com.varun.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.varun.Entity.Customer;

@Repository
public interface CustomerRepo extends MongoRepository<Customer, Integer>{

}
