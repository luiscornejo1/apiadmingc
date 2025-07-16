package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Examen_estudiante;
import com.rosettcompany.grupoCiencia.repositoryI.ExamenEstudianteRepositoryI;

@Service
public class ExamenEstudianteServicio {

	@Autowired
	private ExamenEstudianteRepositoryI examenEstudianteRepositoryI;
	

	
	public String insertarExamenEstudiante(Examen_estudiante examen) {
		return examenEstudianteRepositoryI.insertarExamenEstudiante(
				examen.getIdexamen(),
				examen.getIdestudiante(),
				examen.getLista_respuestas(),
				examen.getNota_total(),
				examen.getTotal_correctas(),
				examen.getTotal_incorrectas(),
				examen.getTotal_en_blanco(),
				examen.getTiempo());
	}
	
	public String listarExamenesEstudiante(int idestudiante) {
		return examenEstudianteRepositoryI.listarExamenesEstudiante(idestudiante);
	}
	
	public String listarComunicados(int idestudiante) {
		return examenEstudianteRepositoryI.listarComunicados(idestudiante);
	}

	public String verificarFechaExamen(int idexamen) {
		return examenEstudianteRepositoryI.verficarFechaExamen(idexamen);
	}
	
	public String ObtenerResumenExamenEstudiante(Examen_estudiante examen) {
		return examenEstudianteRepositoryI.ObtenerResumenExamenEstudiante(examen.getIdexamen(),examen.getIdestudiante());
	}
}
