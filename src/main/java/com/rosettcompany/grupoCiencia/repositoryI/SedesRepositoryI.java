package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Sedes;

@Repository
public interface SedesRepositoryI extends CrudRepository<Sedes, Integer> {
	@Procedure(name = "f_listar_sedes")
	public String f_listar_sedes();

	@Procedure(name = "f_listar_sedes_all")
	public String f_listar_sedes_all();

	@Procedure(name = "f_listar_sedes_usuarios")
	public String f_listar_sedes_usuarios();

	@Procedure(name = "f_buscar_sede_por_ciclo_modalidad")
	public String f_buscar_sede_por_ciclo_modalidad(@Param("in_idciclonormalizado") int in_idciclonormalizado,
			@Param("in_idmodalidad") int in_idmodalidad);

	@Procedure(name = "f_buscar_sede_por_ciclo")
	public String f_buscar_sede_por_ciclo(@Param("in_idciclonormalizado") int in_idciclonormalizado);

	@Procedure(name = "f_mostrar_facturador_sede")
	public String f_mostrar_facturador_sede(@Param("in_idsede") int in_idsede);

	@Procedure(name = "f_insertar_sede")
	public String f_insertar_sede(@Param("in_nombre") String nombre, @Param("in_serie") String serie,
			@Param("in_tokenfacturador") String tokenfacturador);

	@Procedure(name = "f_update_sedes")
	public String f_update_sedes(@Param("in_idsede") int in_idsede, @Param("in_nombre") String nombre,
			@Param("in_serie") String serie, @Param("in_tokenfacturador") String tokenfacturador,
			@Param("in_usuario_modificacion") int in_usuario_modificacion);

	@Procedure(name = "f_update_estado_sedes")
	public String f_update_estado_sedes(@Param("in_idsede") int in_idsede, @Param("in_estado") int estado,
			@Param("in_usuario_modificacion") int in_usuario_modificacion);
}
