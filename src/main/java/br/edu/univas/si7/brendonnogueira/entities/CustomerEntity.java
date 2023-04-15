package br.edu.univas.si7.brendonnogueira.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long code;
	private String cpf;
	private String name;
	private String birthdate;
	private String gender;
	private String email;
	private String loyaltyrate;
	private boolean active;
		
	
}
