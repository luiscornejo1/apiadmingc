package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Subtema;
import com.rosettcompany.grupoCiencia.repositoryI.SubtemaRepositoryI;

@Service
public class SubtemaServicio {

	@Autowired
	private SubtemaRepositoryI subtemaRepository;

	public List<Subtema> getAllSubtemas() {

		return (List<Subtema>) subtemaRepository.findAll();
	}

	public String f_listar_subtema_temanormalizado(int idtemanormalizado) {
		return subtemaRepository.listarSubtemas(idtemanormalizado);
	}

	public String f_listar_subtema_temanormalizado_all() {

		return subtemaRepository.f_listar_subtema_temanormalizado_all();
	}

}
