package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.modelo.Persona;


public interface IPersonaService {
	
	public List<Persona> buscarPorNombre(String nombre);
	
	public Persona buscarPorCedula(String cedula);
	

	public Persona buscarPorId(Integer id);
	public void guardar(Persona persona);
	public void actualizar(Persona persona);
	public void eliminar(Integer id);
	
	public List<Persona> buscarTodos();
}
