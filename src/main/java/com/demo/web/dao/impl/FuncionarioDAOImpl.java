package com.demo.web.dao.impl;

import org.springframework.stereotype.Repository;

import com.demo.web.dao.AbstractDAO;
import com.demo.web.dao.FuncionarioDAO;
import com.demo.web.domain.Funcionario;

@Repository
public class FuncionarioDAOImpl extends AbstractDAO<Funcionario, Long> implements FuncionarioDAO {

}
