package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.modelo.Persona;



public interface IPersonaRepository {
	
	public List<Persona> buscarPorNombre(String nombre);
	
	public Persona buscarPorCedula(String cedula);
	
	public Persona buscarPorId(Integer id);
	
	public void insertar(Persona persona);
	
	public void actualizar(Persona persona);
	
	public void eliminar(Integer id);
	
	

	public List<Persona> buscarTodos();
}
