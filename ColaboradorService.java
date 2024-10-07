package com.exemple.dem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.dem.entities.Colaborador;
import com.exemple.dem.repositories.ColaboradorRepository;

@Service
public class ColaboradorService {
	private final ColaboradorRepository colaboradorrepository;

	@Autowired
	public ColaboradorService(ColaboradorRepository colaboradorrepository) {
		this.colaboradorrepository = colaboradorrepository;
	}

	// criação do produto
	public Colaborador seveColaborador(Colaborador colaborador) {
		return colaboradorrepository.save(colaborador);
	}

	// buscando o produto:
	public Colaborador getColaboradorById(Long id) {
		return colaboradorrepository.findById(id).orElse(null);
	}

	public List<Colaborador> getAllColaborador() {
		return colaboradorrepository.findAll();
	}

	public void deleteColaborador(Long id) {
		colaboradorrepository.deleteById(id);
	}

}


