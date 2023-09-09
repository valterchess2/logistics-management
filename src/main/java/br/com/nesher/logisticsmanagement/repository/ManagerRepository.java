package br.com.nesher.logisticsmanagement.repository;

import java.util.List;

import org.apache.catalina.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nesher.logisticsmanagement.domain.dto.ManagerDTO;
import br.com.nesher.logisticsmanagement.domain.vo.ManagerFilterVO;


public interface ManagerRepository extends JpaRepository<Manager, Integer>{
	// implementar método
	List<ManagerDTO> findByFilter(final ManagerFilterVO filter);
	
}
