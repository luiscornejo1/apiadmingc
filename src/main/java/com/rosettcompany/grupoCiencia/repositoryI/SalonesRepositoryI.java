package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Salones;

@Repository
public interface SalonesRepositoryI extends CrudRepository<Salones, Integer> {

	@Procedure(name = "f_listar_salones_all")
	public String f_listar_salones_all();

	@Procedure(name = "f_listar_salones")
	public String f_listar_salones();

	@Procedure(name = "f_insertar_salones")
	public String f_insertar_salones(@Param("in_nombre_salon") String nombre_salon, @Param("in_aforo") int aforo,
			@Param("in_idsede") int idsede);

	@Procedure(name = "f_update_salones")
	public String f_update_salones(@Param("in_idsalon") int idsalon, @Param("in_nombre_salon") String nombre_salon,
			@Param("in_aforo") int aforo, @Param("in_usuario_modificacion") int usuario_modificacion);

	@Procedure(name = "f_update_estado_salon")
	public String f_update_estado_salon(@Param("in_idsalon") int idsalon, @Param("in_estado") int estado,
			@Param("in_usuario_modificacion") int usuario_modificacion);

}
