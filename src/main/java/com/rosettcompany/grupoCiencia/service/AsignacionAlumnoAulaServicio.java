package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.AreasCarrera;
import com.rosettcompany.grupoCiencia.repository.AsignacionAlumnoAula;
import com.rosettcompany.grupoCiencia.repositoryI.AsignacionAlumnoAulaRepositoryI;
import com.rosettcompany.grupoCiencia.repositoryI.ClaveBibliotecaRepositoryI;

@Service
public class AsignacionAlumnoAulaServicio {

	@Autowired
	private AsignacionAlumnoAulaRepositoryI asignacionAlumnoAulaRepository;

	public String asignaraula(AsignacionAlumnoAula asignacionAlumnoAula) {
		return asignacionAlumnoAulaRepository.asignaraula(
				asignacionAlumnoAula.getIdEstudiante(),
				asignacionAlumnoAula.getIdAula(),
				asignacionAlumnoAula.getIdciclo()
				);
		
	}

	public String editarAsignarAula(AsignacionAlumnoAula asignacionAlumnoAula) {
		return asignacionAlumnoAulaRepository.editarAsignarAula(
				asignacionAlumnoAula.getIdEstudiante(),
				asignacionAlumnoAula.getIdAsignacion(),
				asignacionAlumnoAula.getIdciclo()
				);
		
	}

}