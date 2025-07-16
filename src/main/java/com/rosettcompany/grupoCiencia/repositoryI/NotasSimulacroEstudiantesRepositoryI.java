package com.rosettcompany.grupoCiencia.repositoryI;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.NotasSimulacroEstudiantes;

@Repository
public interface NotasSimulacroEstudiantesRepositoryI
		extends CrudRepository<NotasSimulacroEstudiantes, Integer> {
	
	@Procedure(name = "f_subir_notas_simulacros_estudiantes")
	public String f_subir_notas_simulacros_estudiantes(
			@Param("in_nombre") String nombre,
			@Param("in_url") String url,
			@Param("in_usuario") Integer usuario_subida);
	
	@Procedure(name = "f_listar_notas_simulacro_estudiantes")
	public String f_listar_notas_simulacro_estudiantes(
			@Param("in_offset") int offset,
			@Param("in_limit") int limit);

}