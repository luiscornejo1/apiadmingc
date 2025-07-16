package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Matriculas;
import com.rosettcompany.grupoCiencia.repositoryI.MatriculasRepositoryI;

@Service
public class MatriculasServicio {

	@Autowired
	private MatriculasRepositoryI iMatriculasRepository;

	public String insertarMatriculas(Matriculas matriculas) {
		return iMatriculasRepository.insertarMatricula(matriculas.getIdciclonormalizado(),
				matriculas.getIduniversidad(), matriculas.getIdmodalidad(), matriculas.getIdsede(),
				matriculas.getDniestudiante(), matriculas.getDescripcion(),matriculas.getFecha_matricula());
	}

}
