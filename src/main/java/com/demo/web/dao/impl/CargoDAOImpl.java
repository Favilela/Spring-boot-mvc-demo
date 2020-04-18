package com.demo.web.dao.impl;

import org.springframework.stereotype.Repository;

import com.demo.web.dao.AbstractDAO;
import com.demo.web.dao.CargoDAO;
import com.demo.web.domain.Cargo;

@Repository
public class CargoDAOImpl extends AbstractDAO<Cargo, Long> implements CargoDAO {

}
