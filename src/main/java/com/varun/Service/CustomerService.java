package com.varun.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.Entity.Customer;
import com.varun.Repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo repo;
	
	public void insertRecord(Customer c) {
		repo.save(c);
	}
	
	public void updateRecord(Customer c) {
		repo.save(c);
	}
	
	public Optional<Customer> retrivRecord(Integer age){
		return repo.findById(age);
	}
	
	public Iterable<Customer> retriveAllRecord(){
		return repo.findAll();
		
	}
	
	public void deleteRecord(Integer age) {
		repo.deleteById(age);
	}
	
	public void deleteAllRecord() {
		repo.deleteAll();
	}
	
}