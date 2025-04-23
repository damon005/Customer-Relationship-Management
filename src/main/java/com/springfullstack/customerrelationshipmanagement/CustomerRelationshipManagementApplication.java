package com.springfullstack.customerrelationshipmanagement;

import com.springfullstack.customerrelationshipmanagement.entity.Customer;
import com.springfullstack.customerrelationshipmanagement.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerRelationshipManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRelationshipManagementApplication.class, args);
	}

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void run(String... args) throws Exception {


	}
}
