package com.ifce.darm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifce.darm.model.Aluno;
import com.ifce.darm.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

	@Autowired
	private AlunoService service;
	
	@GetMapping("/listar")
	public List<Aluno> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Optional<Aluno> getAluno(@PathVariable Long id){
		return service.getAluno(id);
	}
	
	@PostMapping
	public Aluno adicionar (@RequestBody Aluno aluno) {
		return service.adicionar(aluno);
	}
	
	@PutMapping
	public Aluno alterar (@RequestBody Aluno aluno) {
		return service.alterar(aluno);
	}
	
	@DeleteMapping
	public void deletar (@RequestBody Aluno aluno) {
		service.deletar(aluno);
	}
}
