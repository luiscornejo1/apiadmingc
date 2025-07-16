package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.MaterialBiblioteca;

@Repository
public interface MaterialBibliotecaRepositoryI extends CrudRepository<MaterialBiblioteca,Integer>{

	@Procedure(name="funcion_listar_materiales_biblioteca")
	public String listarMaterialBiblioteca(
			@Param("in_idtema") int in_idtema
			);
	
	@Procedure(name="f_listar_materiales_biblioteca")
	public String listarMaterialBibliotecaAdmin(
			@Param("in_numero") int numero,
			@Param("in_universidad") String universidad,
			@Param("in_curso") String curso,
			@Param("in_tema") String tema
			);
	
	@Procedure(name="f_registrar_material_biblioteca")
	public String insertarMaterialesBibliotecas(
			@Param("in_materiales") String materiales
			);
	
	@Procedure(name="f_eliminar_material_biblioteca")
	public String eliminarMaterialesBibliotecas(
			@Param("in_idmaterial") int idmaterial
			);
}
