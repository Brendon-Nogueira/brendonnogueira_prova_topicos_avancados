package br.edu.univas.si7.brendonnogueira.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.univas.si7.brendonnogueira.entities.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
	 public List<CustomerEntity>findByActive(Boolean active);
}
