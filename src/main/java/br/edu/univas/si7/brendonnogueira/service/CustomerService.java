package br.edu.univas.si7.brendonnogueira.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.univas.si7.brendonnogueira.entities.CustomerEntity;
import br.edu.univas.si7.brendonnogueira.repository.CustomerRepository;

@Service
public class CustomerService {
	private CustomerRepository repo;
	
	@Autowired
	public CustomerService(CustomerRepository cs) {
		this.repo = cs;
	}
	

	public CustomerEntity findById(long code) {
		Optional<CustomerEntity> obj = repo.findById(code);
		CustomerEntity entity = obj.orElseThrow(() -> new RuntimeException());
		return entity;
	}
	
	public void createCustomer(CustomerEntity customer) {
		repo.save(customer);
	}
		
	
}

