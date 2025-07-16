package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.SolucionarioBiblioteca;
@Repository
public interface SolucionarioBibliotecaRepositoryI extends CrudRepository<SolucionarioBiblioteca,Integer>{
	
	@Procedure(name="funcion_listar_solucionarios_biblioteca")
	public String listarSolucionariosBiblioteca(
			@Param("in_iduniversidad") int in_iduniversidad,
			@Param("in_idanio") int in_idanio
			);
	
	@Procedure(name="f_listar_solucionarios_biblioteca")
	public String listarSolucionariosBibliotecaAdmin(
			@Param("in_numero") int numero,
			@Param("in_universidad") String universidad,
			@Param("in_anio") String anio,
			@Param("in_semestre") String semestre
			);
	
	@Procedure(name="f_eliminar_solucionario_biblioteca")
	public String eliminarSolucionarioBiblioteca(
			@Param("in_idsolucionario") int idsolucionario
			);
	
	@Procedure(name="f_registrar_solucionario_biblioteca")
	public String insertarSolucionarioBiblioteca(
			@Param("in_solucionarios") String solucionarios
			);
	
}
