package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.ClaveBiblioteca;
@Repository
public interface ClaveBibliotecaRepositoryI extends CrudRepository<ClaveBiblioteca,Integer>{
	
	@Procedure(name="funcion_listar_claves_biblioteca")
	public String listarClavesBiblioteca(
			@Param("in_iduniversidad") int in_iduniversidad,
			@Param("in_idanio") int in_idanio
			);
	
	@Procedure(name="f_registrar_clave_biblioteca")
	public String insertarClavesBiblioteca(
			@Param("in_claves") String claves
			);
	
	@Procedure(name="f_listar_claves_biblioteca")
	public String listarClavesBibliotecaAdmin(
			@Param("in_numero") int numero,
			@Param("in_universidad") String universidad,
			@Param("in_anio") String anio,
			@Param("in_area") String area,
			@Param("in_semestre") String semestre
			);
	
	@Procedure(name="f_eliminar_clave_biblioteca")
	public String eliminarClavesBiblioteca(
			@Param("in_idclave") int idclave
			);
}
