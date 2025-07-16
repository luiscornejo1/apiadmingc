package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.AccesoMeses;

@Repository
public interface AccesoMesesRepositoryI extends CrudRepository<AccesoMeses, Integer> {

	
	@Procedure(name="insertar_acceso_meses")
	public String insertarAccesoMeses(
			@Param("in_idmes") int idmes,
			@Param("in_idestudiante") int idestudiante,
			@Param("in_estado") int estado
			);
	
	
}
