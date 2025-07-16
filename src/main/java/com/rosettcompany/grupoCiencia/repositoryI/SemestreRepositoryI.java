package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Semestre;

@Repository
public interface SemestreRepositoryI extends CrudRepository<Semestre,Integer>{
	
	
	@Procedure(name="f_listar_semestres_anio")
	public String listarSemestreAnio(
			@Param("in_anio") int idanio
			);
	
	@Procedure(name="funcion_listar_semestre_biblioteca")
	public String listarSemestres(
			@Param("in_idanio") int in_idanio
			);

}
