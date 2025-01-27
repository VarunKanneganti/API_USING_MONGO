package com.varun.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Customer")
public class Customer {
	
	@Id
	Integer id;
	
	String cName;
	String cLocation;
	
	public Customer(Integer id, String cName, String cLocation) {
		
		this.id = id;
		this.cName = cName;
		this.cLocation = cLocation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcLocation() {
		return cLocation;
	}

	public void setcLocation(String cLocation) {
		this.cLocation = cLocation;
	}
	
}
