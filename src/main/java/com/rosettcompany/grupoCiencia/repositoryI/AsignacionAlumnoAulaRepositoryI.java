package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.AsignacionAlumnoAula;

@Repository
public interface AsignacionAlumnoAulaRepositoryI extends CrudRepository<AsignacionAlumnoAula, Integer> {
	@Procedure(name = "f_insertar_asignacion_alumnos_aulas")
	public String asignaraula(@Param("in_idestudiante") int n_dificultad, @Param("in_idaula") int n_deco,
			@Param("in_idciclo") int in_ciclo
			);
	
	@Procedure(name = "f_editar_asignacion_alumnos_aulas")
	public String editarAsignarAula(@Param("in_idestudiante") int idestudiante, @Param("in_idasignacionaula") int idasignacionaula,
			@Param("in_idciclo") int in_ciclo
			);
}