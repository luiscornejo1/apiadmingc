package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.PersonalVentas;


@Repository
public interface PersonalVentasRepositoryI extends CrudRepository<PersonalVentas, Integer> {
	@Procedure(name = "f_listar_personal_ventas")
	public String f_listar_personal_ventas();
	
	@Procedure(name = "f_buscar_personal_ventas_cod")
	public String f_buscar_personal_ventas_cod(@Param("in_codigo") String codigo);
	
}
