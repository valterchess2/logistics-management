package br.com.nesher.logisticsmanagement.domain;

import br.com.nesher.logisticsmanagement.domain.constants.SchemaConstants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(schema = SchemaConstants.CONTRIBUTORS, name = "tb_manager")
public class Maganer extends AbstractEntity<Integer>{
	
	@Column(name = "manager_name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "access_code")
	private String access_code;
}
