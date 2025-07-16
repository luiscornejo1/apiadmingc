package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.rosettcompany.grupoCiencia.repository.Parametros;
import org.springframework.stereotype.Repository;

@Repository
public interface ParametrosRepositoryI extends CrudRepository<Parametros,Integer>{
	
	@Procedure(name="listar_departamentos")
	public String listarDeparatementos(
			@Param("in_id_usuario") int idusuario
			);

}
