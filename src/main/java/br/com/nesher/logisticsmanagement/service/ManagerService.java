package br.com.nesher.logisticsmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nesher.logisticsmanagement.domain.dto.ManagerDTO;
import br.com.nesher.logisticsmanagement.domain.vo.ManagerFilterVO;
import br.com.nesher.logisticsmanagement.repository.ManagerRepository;

@Service
public class ManagerService {
	
	@Autowired
	private ManagerRepository managerRepository;
	
	public List<ManagerDTO> findManagerByFilter(final ManagerFilterVO filter){
		return managerRepository.findByFilter(filter);
	}

}
