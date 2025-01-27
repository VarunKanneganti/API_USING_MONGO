package com.varun.Controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.varun.Entity.Customer;
import com.varun.Service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@PostMapping(value="/insert")
	public String saveRecord(@RequestBody Customer cust) {
		service.insertRecord(cust);
		return "Record Inserted -->";
		
	}
	
	@GetMapping("/retrieveAll")
	public Iterable<Customer> retrieveAllRecords() {
	    return service.retriveAllRecord();
	}
	
	@GetMapping(value="/retrieveSingleRecord")
	public Optional<Customer> retrivRecord(@RequestParam Integer id){
		return service.retrivRecord(id);
	}
	
	@DeleteMapping(value="/delete")
	public String deleteRecord(@RequestParam Integer id) {
		service.deleteRecord(id);
		return "Record got Deleted- ->";
	}
	
	@DeleteMapping(value="/deleteAll")
	public String deleteAllRecord() {
		service.deleteAllRecord();
		return "All Records got Deleted";
	}
		
}
