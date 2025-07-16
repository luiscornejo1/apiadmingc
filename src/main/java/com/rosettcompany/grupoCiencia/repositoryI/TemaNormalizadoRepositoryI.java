package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.TemaNormalizado;

@Repository
public interface TemaNormalizadoRepositoryI extends CrudRepository<TemaNormalizado,Integer>{

	
	@Procedure(name="f_listar_tema_normalizado")
	public String f_listar_tema_normalizado(
			@Param("in_id_usuario") int idusuario
			);
	



}
