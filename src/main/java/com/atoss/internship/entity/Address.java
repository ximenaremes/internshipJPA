package com.atoss.internship.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Address {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name ="street")
	private String street;
	
	@Column(name ="town")
	private String town;
	
	@Column(name ="country")
	private String country;
	
	
	@OneToOne( fetch= FetchType.LAZY)
	@JoinColumn(name= "employee_id")
	private Employee employee;








}
