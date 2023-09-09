package com.sesi.senai.alunoCad.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sesi.senai.alunoCad.entidades.Aluno;
import com.sesi.senai.alunoCad.repositorios.AlunoRepositorio;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private AlunoRepositorio alunoRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Aluno a2 = new Aluno(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		alunoRepository.saveAll(Arrays.asList(a1,a2));
		
	}
	
	
	
	/*
	 * 
	 * */
	

}
