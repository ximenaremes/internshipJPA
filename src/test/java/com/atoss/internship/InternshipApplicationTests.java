package com.atoss.internship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.atoss.internship.entity.Address;
import com.atoss.internship.repository.AddressRepository;
import com.atoss.internship.repository.EmployeeRepository;

@SpringBootTest
class InternshipApplicationTests {

	private EmployeeRepository employeeRepository;

	private AddressRepository addressRepository;

	@Autowired
	public InternshipApplicationTests(EmployeeRepository employeeRepository, AddressRepository addressRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.addressRepository = addressRepository;
	}

	@Test
	void testOneToOneForeignKEY() {
		final Address address = Address.builder().town("town1").country("country1").street("street1").build();

	}

}
