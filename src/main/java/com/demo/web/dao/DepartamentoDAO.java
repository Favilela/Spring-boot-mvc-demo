package com.demo.web.dao;

import java.util.List;

import com.demo.web.domain.Departamento;

public interface DepartamentoDAO {

	void save(Departamento departamento);
	
	void update(Departamento departamento);
	
	void delete(Long id);
	
	Departamento findById(Long id);
	
	List<Departamento> findAll();
}
