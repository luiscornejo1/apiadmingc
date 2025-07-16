package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Universidad;

@Repository
public interface UniversidadRepositoryI extends CrudRepository<Universidad, Integer> {

	@Procedure(name = "listar_universidades")
	public String listarUniversidades(@Param("in_id_usuario") int idusuario);

	@Procedure(name = "f_listar_universidades_all")
	public String f_listar_universidades_all();

	@Procedure(name = "f_obtener_query_funciones")
	public String obtenerQueryFuncion(@Param("nombre") String nombre);

	@Procedure(name = "f_insertar_universidad")
	public String f_insertar_universidad(@Param("in_nombre") String nombre);

	@Procedure(name = "f_update_estado_universidad")
	public String f_update_estado_universidad(@Param("in_iduniversidad") int iduniversidad,
			@Param("in_activo") int activo, @Param("in_usuario_modificacion") int usuario_modificacion);
	
	@Procedure(name = "f_update_nombre_universidad")
	public String f_update_nombre_universidad(@Param("in_iduniversidad") int iduniversidad,
			@Param("in_nombre") String nombre, @Param("in_usuario_modificacion") int usuario_modificacion);

}
