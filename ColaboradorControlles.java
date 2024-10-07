package com.exemple.dem.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.dem.entities.Colaborador;
import com.exemple.dem.services.ColaboradorService;

@RestController
@RequestMapping("/colaborador")
public class ColaboradorControlles {
	
	private final ColaboradorService colaboradorservice;
	
	@Autowired
	public ColaboradorControlles(ColaboradorService colaboradorservice) {
		this.colaboradorservice = colaboradorservice;
	}

	@PostMapping
	public Colaborador createColaborador(@RequestBody Colaborador colaborador) {
		return colaboradorservice.seveColaborador(colaborador);
	}

	@GetMapping
	public List<Colaborador> getAllColaborador() {
		return colaboradorservice.getAllColaborador();
	}

	@GetMapping("/{id}")
	public Colaborador getColaborador(@PathVariable Long id) {
		return colaboradorservice.getColaboradorById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id) {

	}

}





