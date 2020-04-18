package com.demo.web.dao;

import java.util.List;

import com.demo.web.domain.Funcionario;

public interface FuncionarioDAO {
	
void save(Funcionario funcionario);
	
	void update(Funcionario funcionario);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();

}
