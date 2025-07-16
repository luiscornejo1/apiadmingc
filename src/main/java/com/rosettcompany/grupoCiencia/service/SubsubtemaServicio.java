package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Subsubtema;
import com.rosettcompany.grupoCiencia.repositoryI.SubsubtemaRepositoryI;

@Service
public class SubsubtemaServicio {

	@Autowired
	private SubsubtemaRepositoryI subsubtemaRepository;

	public List<Subsubtema> getAllSubsubtemas() {

		return (List<Subsubtema>) subsubtemaRepository.findAll();
	}

	public String f_listar_subsubtema_subtema(int id_subtema) {
		return subsubtemaRepository.listarSubsubtemas(id_subtema);
	}

	public String f_listar_subsubtema_subtema_all() {

		return subsubtemaRepository.f_listar_subsubtema_subtema_all();
	}
}
