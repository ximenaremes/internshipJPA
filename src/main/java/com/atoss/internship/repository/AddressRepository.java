package com.atoss.internship.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.atoss.internship.entity.Address;


public interface AddressRepository extends CrudRepository <Address, Long> {
	
	ArrayList<Address> findAll();

}
