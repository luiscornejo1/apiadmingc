package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Carrera;

@Repository
public interface CarreraRepositoryI extends CrudRepository<Carrera, Integer> { 
	
	@Procedure(name="listar_carreras")
	public String listarCarreras(
			@Param("in_id_universidad") int iduniversidad
			);

}
