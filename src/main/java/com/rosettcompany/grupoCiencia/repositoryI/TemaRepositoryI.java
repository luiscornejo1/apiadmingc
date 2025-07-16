package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Tema;

@Repository
public interface TemaRepositoryI extends CrudRepository<Tema,Integer>{
	
	@Procedure(name="listar_temas")
	public String listarTemas(
			@Param("in_id_usuario") int idusuario
			);


	
	@Procedure(name="insertar_temas")
	public String insertarTema(
			@Param("in_id_curso") int idcurso,
			@Param("in_nombre_tema") String nombre_tema
			); 
	
	@Procedure(name="actualizar_temas")
	public String actualizarTema(
			@Param("in_id_tema") int idtema,
			@Param("in_id_curso") int idcurso,
			@Param("in_nombre_tema") String nombre_tema
			); 

	@Procedure(name="buscar_temas")
	public String buscarTema(
			@Param("in_nombre_tema") String nombre_tema
			);
	
	@Procedure(name="f_eliminar_tema")
	public String eliminarTema(
			@Param("in_idtema") int idtema
			);
	
	@Procedure(name="f_listar_temas_cursos")
	public String listarTemasCursos(
			@Param("in_id_curso") int idtema
			);
	
	@Procedure(name="f_listar_tema_normalizado_cursos")
	public String f_listar_tema_normalizado_cursos(
			@Param("in_id_curso") int idtema
			);
	
	@Procedure(name="f_actualizar_orden_temas_mantenimiento")
	public String actualizarOrdenTema(
			@Param("lista_temas") String nombre
			);
}
