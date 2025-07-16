package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Subsubsubtema;
import com.rosettcompany.grupoCiencia.repositoryI.SubsubsubtemaRepositoryI;

@Service
public class SubsubsubtemaServicio {

	@Autowired
	private SubsubsubtemaRepositoryI subsubsubtemaRepository;

	public List<Subsubsubtema> getAllSubsubsubtemas() {

		return (List<Subsubsubtema>) subsubsubtemaRepository.findAll();
	}

	public String f_listar_subsubsubtema_subsubtema(int id_sub_subtema) {
		return subsubsubtemaRepository.listarSubsubsubtemas(id_sub_subtema);
	}

	public String f_listar_subsubsubtema_subsubtema_all() {
		return subsubsubtemaRepository.f_listar_subsubsubtema_subsubtema_all();
	}

}
