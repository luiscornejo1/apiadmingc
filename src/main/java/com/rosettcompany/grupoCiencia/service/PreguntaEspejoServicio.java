package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.FiltroBancoPreguntas;
import com.rosettcompany.grupoCiencia.repository.PreguntaEspejo;
import com.rosettcompany.grupoCiencia.repositoryI.PreguntaEspejoRepositoryI;

@Service
public class PreguntaEspejoServicio {

	@Autowired
	private PreguntaEspejoRepositoryI preguntaEspejoRepository;

	public List<PreguntaEspejo> getAllSubtemas() {

		return (List<PreguntaEspejo>) preguntaEspejoRepository.findAll();
	}

	public String listarPreguntaEspejo(FiltroBancoPreguntas filtro) {
		return preguntaEspejoRepository.listarPreguntaEspejo(filtro.getIdpregunta(),filtro.getMinimo(),
				filtro.getMaximo());
	}
	
	public String f_listar_preguntas_espejo_combo() {
		return preguntaEspejoRepository.f_listar_preguntas_espejo_combo();
	}
	

}
