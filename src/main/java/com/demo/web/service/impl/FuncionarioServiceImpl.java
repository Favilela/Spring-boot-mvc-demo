package com.demo.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.web.dao.FuncionarioDAO;
import com.demo.web.domain.Funcionario;
import com.demo.web.service.FuncionarioService;

@Service
@Transactional
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioDAO dao;
	
	@Override
	public void salvar(Funcionario funcionario) {

		dao.save(funcionario);
	}

	@Override
	public void editar(Funcionario funcionario) {

		dao.update(funcionario);
	}

	@Override
	public void excluir(Long id) {

		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Funcionario buscarPorId(Long id) {

		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Funcionario> buscarTodos() {

		return dao.findAll();
	}

}
