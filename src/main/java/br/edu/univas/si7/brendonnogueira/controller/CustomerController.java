package br.edu.univas.si7.brendonnogueira.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.edu.univas.si7.brendonnogueira.entities.CustomerEntity;
import br.edu.univas.si7.brendonnogueira.service.CustomerService;

@RestControllerAdvice
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public void createCustomer(@RequestBody CustomerEntity customer) {
		service.createCustomer(customer);
	}
	
	@GetMapping("/{code}")
	public ResponseEntity<CustomerEntity> getCustomerByID(@PathVariable Long code){
		CustomerEntity cs = new CustomerEntity();
		cs = service.findById(code);
		return ResponseEntity.ok().body(cs);
	}
}
