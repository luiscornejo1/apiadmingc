package com.rosettcompany.grupoCiencia.repositoryI;

import java.sql.Date;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.AsignacionAlumnoAula;
import com.rosettcompany.grupoCiencia.repository.Matriculas;

@Repository
public interface MatriculasRepositoryI extends CrudRepository<Matriculas, Integer> {
	@Procedure(name = "f_insertar_matricula")
	public String insertarMatricula(
			@Param("in_idciclonormalizado") int in_idciclonormalizado, 
			@Param("in_iduniversidad") int in_iduniversidad,
			@Param("in_idmodalidad") int in_idmodalidad,
			@Param("in_idsede") int in_idsede,
			@Param("in_dniestudiante") String in_dniestudiante,
			@Param("in_descripcion") String in_descripcion,
			@Param("in_fecha_matricula") Date in_fecha_matricula
			);
}