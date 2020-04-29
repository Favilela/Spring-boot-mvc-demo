package com.demo.web.service;

import java.util.List;

import com.demo.web.domain.Cargo;

public interface CargoService {
	
	public void salvar(Cargo cargo);
	
	public void editar(Cargo cargo);
	
	public void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();
	
	boolean cargoTemFuncionarios(Long id);

}
