package br.edu.univas.si7.brendonnogueira.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.univas.si7.brendonnogueira.dto.CustomerDTO;
import br.edu.univas.si7.brendonnogueira.entities.CustomerEntity;
import br.edu.univas.si7.brendonnogueira.repository.CustomerRepository;

@Service
public class CustomerService {
	private CustomerRepository repo;
	
	@Autowired
	public CustomerService(CustomerRepository cs) {
		this.repo = cs;
	}
	
	public List<CustomerDTO>findAllActive(){
		return repo.findByActive(true).stream().map(c -> new CustomerDTO(c)).collect(Collectors.toList());
	}
	
	public CustomerEntity stateActive (Long id) {
        Optional<CustomerEntity> obj = repo.findById(id);
        CustomerEntity entity = obj.orElseThrow(() -> new RuntimeException());
        entity.setActive(!entity.isActive());
        repo.save(entity);
        return entity;
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

