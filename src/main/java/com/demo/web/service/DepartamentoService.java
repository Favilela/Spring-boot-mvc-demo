package com.demo.web.service;

import java.util.List;

import com.demo.web.domain.Departamento;

public interface DepartamentoService {
	
public void salvar(Departamento	departamento);
	
	public void editar(Departamento departamento);
	
	public void excluir(Long id);
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> buscarTodos();

}
