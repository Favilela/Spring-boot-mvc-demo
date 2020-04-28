package com.demo.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.demo.web.domain.Departamento;
import com.demo.web.service.DepartamentoService;

@Component
public class StringToDepartamentoConverter implements Converter<String, Departamento> {
	
	@Autowired
	DepartamentoService service;

	@Override
	public Departamento convert(String text) {
		
		if(text.isEmpty()) {
			return null;
		}
		
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}

}
