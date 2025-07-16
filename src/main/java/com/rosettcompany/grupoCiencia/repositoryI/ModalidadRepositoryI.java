package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Modalidad;

@Repository
public interface ModalidadRepositoryI extends CrudRepository<Modalidad, Integer> {
	@Procedure(name = "f_listar_modalidad")
	public String f_listar_modalidad();

	@Procedure(name = "f_buscar_modalidad_sede_ciclo")
	public String f_buscar_modalidad_sede_ciclo(@Param("in_idciclonormalizado") int in_idciclonormalizado);
}
