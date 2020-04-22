package com.demo.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.web.dao.DepartamentoDAO;
import com.demo.web.domain.Departamento;
import com.demo.web.service.DepartamentoService;

@Service
@Transactional
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoDAO dao;
	
	@Override
	public void salvar(Departamento departamento) {

		dao.save(departamento);
	}

	@Override
	public void editar(Departamento departamento) {

		dao.update(departamento);
	}

	@Override
	public void excluir(Long id) {

		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Departamento buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Departamento> buscarTodos() {
		
		return dao.findAll();
	}

}
