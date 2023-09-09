package com.sesi.senai.alunoCad.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.senai.alunoCad.entidades.Aluno;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {

}
