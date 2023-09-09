package br.com.nesher.logisticsmanagement.domain.vo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ManagerFilterVO {
	
	private String name;
	
	@Email(message = "O atributo precisa ser um E-mail.")
	private String email;
	
	@NotBlank
	private String conjunto;
}
