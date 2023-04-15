package br.edu.univas.si7.brendonnogueira;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.univas.si7.brendonnogueira.entities.CustomerEntity;
import br.edu.univas.si7.brendonnogueira.repository.CustomerRepository;


@SpringBootApplication
public class BrendonnogueiraApplication implements CommandLineRunner {
	@Autowired
	private CustomerRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(BrendonnogueiraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		CustomerEntity xpto = new CustomerEntity(1,"123", "brendon", "01/05/1999", "M", "brendonnogueira@gmail.com", "trust", true );
		repo.save(xpto);
	}
	
	
}
