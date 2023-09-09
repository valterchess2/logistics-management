package br.com.nesher.logisticsmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.nesher.logisticsmanagement.domain.dto.ManagerDTO;
import br.com.nesher.logisticsmanagement.domain.vo.ManagerFilterVO;
import br.com.nesher.logisticsmanagement.service.ManagerService;

@RestController
@RequestMapping("/gerentes")
public class ManagerController {
	
	@Autowired
	private ManagerService managerService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ManagerDTO> findManagers(final ManagerFilterVO filter){
		return managerService.findManagerByFilter(filter);
	}

}
