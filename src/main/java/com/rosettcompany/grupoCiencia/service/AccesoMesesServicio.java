package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.AccesoMeses;
import com.rosettcompany.grupoCiencia.repositoryI.AccesoMesesRepositoryI;

@Service
public class AccesoMesesServicio {

	@Autowired
	private AccesoMesesRepositoryI accesoMesesRepositoryI;
	
	public String insertarAccesoMeses(AccesoMeses accesoMeses) {
		return accesoMesesRepositoryI.insertarAccesoMeses(
				accesoMeses.getIdmes(),
				accesoMeses.getIdestudiante(),
				accesoMeses.getEstado());
	}
}
