package br.edu.univas.si7.brendonnogueira.dto;

import br.edu.univas.si7.brendonnogueira.entities.CustomerEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerDTO {
	private long code;
	private String cpf;
	private String name;
	private String birthdate;
	private String gender;
	private String email;
	private String loyaltyrate;
	private boolean active;
	
	public CustomerDTO(CustomerEntity customer) {
		this.code = customer.getCode();
		this.cpf = customer.getCpf();
		this.name = customer.getName();
		this.birthdate = customer.getBirthdate();
		this.gender = customer.getGender();
		this.email = customer.getEmail();
		this.loyaltyrate = customer.getLoyaltyrate();
		this.active = customer.isActive();
	}
}
