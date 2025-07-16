package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Anio;
import com.rosettcompany.grupoCiencia.repositoryI.AnioRepositoryI;

@Service
public class AnioServicio {

	@Autowired
	private AnioRepositoryI anioRepository;
	
	public List<Anio> ListarAnios(){
		return (List<Anio>) anioRepository.listarAnios();
	}
}
