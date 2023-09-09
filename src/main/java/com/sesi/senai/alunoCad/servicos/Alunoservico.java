package com.sesi.senai.alunoCad.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesi.senai.alunoCad.entidades.Aluno;
import com.sesi.senai.alunoCad.repositorios.AlunoRepositorio;

@Service
public class Alunoservico {
	
	@Autowired
	private AlunoRepositorio repositorio;
	
	public List<Aluno> findAll(){
		return repositorio.findAll();
		
	}
	
	

}
