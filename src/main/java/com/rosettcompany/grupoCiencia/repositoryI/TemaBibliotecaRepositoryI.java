package com.rosettcompany.grupoCiencia.repositoryI;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.TemaBiblioteca;

@Repository
public interface TemaBibliotecaRepositoryI extends CrudRepository<TemaBiblioteca,Integer> {

	@Procedure(name="funcion_listar_temas_biblioteca")
	public String listarTemasBiblioteca(
			@Param("in_idcurso") int in_idcurso
			);
	
	@Procedure(name="funcion_listar_temas_biblioteca_clases")
	public String listarTemasBibliotecaClases(
			@Param("in_idcurso") int in_idcurso
			);
	
	@Procedure(name="funcion_listar_temas_biblioteca_materiales")
	public String listarTemasBibliotecaMateriales(
			@Param("in_idcurso") int in_idcurso
			);
	
	@Procedure(name="f_insertar_temas_biblioteca")
	public String insertarTemasBiblioteca(
			@Param("in_nombre_tema") String nombre
			);
	
	@Procedure(name="f_listar_temas_biblioteca_admin")
	public String listarTemasAdmin(
			@Param("in_id_usuario") int idusuario
			);
	
	@Procedure(name="f_actualizar_temas_biblioteca")
	public String actualizarTema(
			@Param("in_id_tema") int idtema,
			@Param("in_id_curso") int idcurso,
			@Param("in_nombre_tema") String nombre_tema
			); 

	@Procedure(name="f_buscar_temas_biblioteca")
	public String buscarTema(
			@Param("in_nombre_tema") String nombre_tema
			);
	
	@Procedure(name="f_eliminar_tema_biblioteca")
	public String eliminarTema(
			@Param("in_idtema") int idtema
			);
	
	@Procedure(name="f_actualizar_orden_temas_biblioteca")
	public String actualizarOrdenTema(
			@Param("lista_temas") String nombre
			);
	
	@Procedure(name="funcion_listar_temas_biblioteca_orden_admin")
	public String listarTemasBibliotecaOrdenar(
			@Param("in_idcurso") int in_idcurso
			);
}
