package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Concurso;
import com.empresa.repository.ConcursoRepository;
@Service
public class ConcursoServiceImpl implements ConcursoService{
	@Autowired
	private ConcursoRepository repositorio;

	@Override
	public List<Concurso> listaConcurso() {
		return repositorio.findAll();
	} 
}
