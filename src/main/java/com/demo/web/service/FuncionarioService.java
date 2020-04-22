package com.demo.web.service;

import java.util.List;

import com.demo.web.domain.Funcionario;

public interface FuncionarioService {
	
	public void salvar(Funcionario funcionario);
	
	public void editar(Funcionario funcionario);
	
	public void excluir(Long id);
	
	Funcionario buscarPorId(Long id);
	
	List<Funcionario> buscarTodos();

}
