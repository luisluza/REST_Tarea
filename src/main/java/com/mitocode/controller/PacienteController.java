package com.mitocode.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Paciente;
import com.mitocode.service.IPacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	
	@Autowired
	IPacienteService service;
	
	
	public List<Paciente> listar(){
		List<Paciente> pacientes = new ArrayList<>();
		try {			
			pacientes = service.listar();
		}catch (Exception e) {

		}

		
		
		return pacientes;
	}
	
}
