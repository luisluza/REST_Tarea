package com.mitocode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IPacienteDAO;
import com.mitocode.model.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	IPacienteDAO dao;
	
	@Override
	public void registrar(Paciente p) {
		dao.save(p);		
	}

	@Override
	public void modificar(Paciente p) {
		dao.save(p);
		
	}

	@Override
	public void eliminar(Integer id) {
		
		
	}

	@Override
	public List<Paciente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Paciente listarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
