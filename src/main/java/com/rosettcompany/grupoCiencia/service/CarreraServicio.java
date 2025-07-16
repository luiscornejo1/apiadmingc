package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repositoryI.CarreraRepositoryI;

@Service
public class CarreraServicio {

	@Autowired
	private CarreraRepositoryI carreraRepositoryI;
	
	public String listarCarreras(int iduniversidad) {
		return carreraRepositoryI.listarCarreras(iduniversidad);
	}
}
