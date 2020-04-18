package com.demo.web.dao;

import java.util.List;

import com.demo.web.domain.Cargo;

public interface CargoDAO {
	
void save(Cargo cargo);
	
	void update(Cargo cargo);
	
	void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();

}
