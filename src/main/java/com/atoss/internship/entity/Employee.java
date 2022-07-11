package com.atoss.internship.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Employee {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name ="first_name")
	private String firstName;
	
	
	@Column(name ="last_name")
	private String lastName;
	
	@OneToOne( mappedBy= "employee",fetch = FetchType.LAZY, cascade= CascadeType.ALL)
	@JoinColumn(name= "address_id")
	private Address address;
	
	
	
	public void setAddress (final Address address) {
		if(address == null) {
			
		}
	}



	
	
	

}
