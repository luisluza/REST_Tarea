package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Paciente;


public interface IPacienteService {
	void registrar(Paciente per);
	void modificar(Paciente per);
	void eliminar(Integer id);
	List<Paciente> listar();
	Paciente listarId(Integer id);
}
