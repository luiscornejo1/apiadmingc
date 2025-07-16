package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.EscaneoBiblioteca;

@Repository
public interface EscaneoBibliotecaRepositoryI extends CrudRepository<EscaneoBiblioteca,Integer>{
	
	@Procedure(name="funcion_listar_escaneos_biblioteca")
	public String listarEscaneosBiblioteca(
			@Param("in_iduniversidad") int in_iduniversidad,
			@Param("in_idanio") int in_idanio
			);
	
	@Procedure(name="f_registrar_escaneo_biblioteca")
	public String insertarEscaneosBiblioteca(
			@Param("in_escaneos") String escaneos
			);
	
	@Procedure(name="f_listar_escaneos_biblioteca")
	public String listarEscaneosBibliotecaAdmin(
			@Param("in_numero") int numero,
			@Param("in_universidad") String universidad,
			@Param("in_anio") String anio,
			@Param("in_area") String area,
			@Param("in_semestre") String semestre
			);
	
	@Procedure(name="f_eliminar_escaneo_biblioteca")
	public String eliminarEscaneosBiblioteca(
			@Param("in_idescaneo") int idescaneo
			);
}
