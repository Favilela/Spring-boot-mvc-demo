package com.demo.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.web.dao.CargoDAO;
import com.demo.web.domain.Cargo;
import com.demo.web.service.CargoService;

@Service
@Transactional
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoDAO dao;
	
	@Override
	public void salvar(Cargo cargo) {

		dao.save(cargo);
	}

	@Override
	public void editar(Cargo cargo) {

		dao.update(cargo);
	}

	@Override
	public void excluir(Long id) {

		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Cargo buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		
		return dao.findAll();
	}

}
