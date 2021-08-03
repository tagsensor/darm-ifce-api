package com.ifce.darm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.darm.model.Aluno;
import com.ifce.darm.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository repository;
	
	public List<Aluno> listar(){
		return repository.findAll();
	}
	
	public Optional<Aluno> getAluno(Long id){
		return repository.findById(id);
	}
	
	public Aluno adicionar (Aluno aluno) {
		return repository.save(aluno);
	}

	public Aluno alterar (Aluno aluno) {
		return repository.save(aluno);
	}
	
	public void deletar (Aluno aluno) {
		repository.delete(aluno);
	}
}
