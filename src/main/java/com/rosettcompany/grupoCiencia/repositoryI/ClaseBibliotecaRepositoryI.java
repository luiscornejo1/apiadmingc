package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.ClaseBiblioteca;

@Repository
public interface ClaseBibliotecaRepositoryI extends CrudRepository<ClaseBiblioteca,Integer>{

	@Procedure(name="funcion_listar_clases_biblioteca")
	public String listarClasesBiblioteca(
			@Param("in_idtema") int in_idtema
			);
	
	@Procedure(name="f_registrar_clase_biblioteca")
	public String guardarClasesBiblioteca(
			@Param("in_clases") String clases
			);
	
	@Procedure(name="f_eliminar_clase_biblioteca")
	public String eliminarClasesBiblioteca(
			@Param("in_idclase") int idclase
			);

	@Procedure(name="f_listar_clases_biblioteca")
	public String listarClasesBibliotecaAdmin(
			@Param("in_idusuario") int idusuario,
			@Param("in_universidad") String univesidad,
			@Param("in_curso") String curso,
			@Param("in_tema") String tema
			);
}
