package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.CronogramaTempEntity;
import com.rosettcompany.grupoCiencia.repository.NotasSimulacroEstudiantes;
import com.rosettcompany.grupoCiencia.repositoryI.NotasSimulacroEstudiantesRepositoryI;

@Service
public class NotasSimulacroEstudiantesServicio {

	@Autowired
	private NotasSimulacroEstudiantesRepositoryI notasSimulacroEstudiantesRepositoryI;

	

	public String f_subir_notas_simulacros_estudiantes(NotasSimulacroEstudiantes notasSimulacroEstudiantes) {
		return notasSimulacroEstudiantesRepositoryI.f_subir_notas_simulacros_estudiantes(
				notasSimulacroEstudiantes.getNombre(), 
				notasSimulacroEstudiantes.getUrl(),
				notasSimulacroEstudiantes.getUsuario_subida());
	}


	public String f_listar_notas_simulacro_estudiantes(NotasSimulacroEstudiantes notasSimulacroEstudiantes) {
		return notasSimulacroEstudiantesRepositoryI.f_listar_notas_simulacro_estudiantes(
				notasSimulacroEstudiantes.getOffset(),
				notasSimulacroEstudiantes.getLimit());
	}

}