package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.beanAdmisionBiblioteca;
import com.rosettcompany.grupoCiencia.repositoryI.SemestreRepositoryI;

@Service
public class SemestreServicio {

	@Autowired
	private SemestreRepositoryI semestreRepositoryI;
	
	public String listarSemestresAnio(int idanio) {
		return semestreRepositoryI.listarSemestreAnio(idanio);
	}
	
	public String listarSemestres(beanAdmisionBiblioteca admision) {
		
		return semestreRepositoryI.listarSemestres(admision.getIdanio());
	}

}
