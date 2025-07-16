package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.*;
import com.rosettcompany.grupoCiencia.repositoryI.*;

@Service
public class AsistenciaCursoServicio {

	@Autowired
	private AsistenciaCursoRepositoryI asistenciaCursoRepositoryI;
	
	public String guardarHorarioCurso(BeanAsistenciaCursoGuardar a) {
		return asistenciaCursoRepositoryI.guardarHorarioCurso(
				a.getIdcurso(),
				a.getDia(),
				a.getFecha(),
				a.getEstado(),
				a.getIdciclo());
	}
	
	public String eliminarHorarioCurso(int id) {
		return asistenciaCursoRepositoryI.eliminarHorarioCurso(id);
	}
	
	public String listarHorarioCurso(int id) {
		return asistenciaCursoRepositoryI.listarHorarioCurso(id);
	}
	
	public String ListarAsistenciaCursos_ciclo(BeanAsistenciaCursos asistenciaCurso) throws Exception{
		return asistenciaCursoRepositoryI.listarEstadisticaExamen(asistenciaCurso.getIdciclo(), asistenciaCurso.getIdcurso());
	}
}
