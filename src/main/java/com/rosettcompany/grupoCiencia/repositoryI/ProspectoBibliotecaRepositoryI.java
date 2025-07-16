package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.ProspectoBiblioteca;
@Repository
public interface ProspectoBibliotecaRepositoryI extends CrudRepository<ProspectoBiblioteca,Integer>{
	
	@Procedure(name="funcion_listar_prospectos_biblioteca")
	public String listarProspectosBiblioteca(
			@Param("in_iduniversidad") int in_iduniversidad,
			@Param("in_idanio") int in_idanio
			);
	
	@Procedure(name="f_registrar_prospecto_biblioteca")
	public String insertarProspectosBiblioteca(
			@Param("in_prospectos") String prospectos
			);
	
	@Procedure(name="f_listar_prospectos_biblioteca")
	public String listarProspectosBibliotecaAdmin(
			@Param("in_numero") int numero,
			@Param("in_universidad") String universidad,
			@Param("in_anio") String anio,
			@Param("in_area") String area,
			@Param("in_semestre") String semestre
			);
	
	@Procedure(name="f_eliminar_prospecto_biblioteca")
	public String eliminarProspectosBiblioteca(
			@Param("in_idprospecto") int idprospecto
			);
}
