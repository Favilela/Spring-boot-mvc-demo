package com.demo.web.dao.impl;

import org.springframework.stereotype.Repository;

import com.demo.web.dao.AbstractDAO;
import com.demo.web.dao.DepartamentoDAO;
import com.demo.web.domain.Departamento;

@Repository
public class DepartamentoDAOImpl extends AbstractDAO<Departamento, Long> implements DepartamentoDAO {

}
