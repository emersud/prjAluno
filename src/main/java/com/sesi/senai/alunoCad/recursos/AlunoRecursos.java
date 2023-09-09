package com.sesi.senai.alunoCad.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesi.senai.alunoCad.entidades.Aluno;
import com.sesi.senai.alunoCad.servicos.Alunoservico;

@RestController
@RequestMapping(value="/alunos")
public class AlunoRecursos {
	
	@Autowired
	private Alunoservico servico;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> findAll(){
		List<Aluno> list = servico.findAll();
			return ResponseEntity.ok().body(list);
		     
	}

}
