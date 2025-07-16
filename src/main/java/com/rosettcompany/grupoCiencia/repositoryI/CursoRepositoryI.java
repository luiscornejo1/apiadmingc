package com.rosettcompany.grupoCiencia.repositoryI;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.rosettcompany.grupoCiencia.repository.Curso;

@Repository
public interface CursoRepositoryI extends CrudRepository<Curso,Integer>{
	
	
	@Query(value = "SELECT * FROM CURSOS",nativeQuery = true)
	List<Curso> findAllCursos();
	
	@Procedure(name="funcion_listar_videos_cursos")
	public String ListarVideosCursos(
			@Param("in_idcurso") int in_idcurso
			);
	
	@Procedure(name="funcion_listar_cursos_universidad")
	public String ListarCursosUniversidad(
			@Param("in_iduniversidad") int in_iduniversidad
			);
	
	@Procedure(name="funcion_listar_cursos_ciclos")
	public String ListarCursosCiclo(
			@Param("in_idciclo") int idciclo
			);
	
	@Procedure(name="funcion_actualizar_temario_curso")
	public String ActualizarTemarioCurso(
			@Param("in_idcurso") int in_idcurso,
			@Param("in_url_temario") String in_url_temario
			);
	
	@Procedure(name="funcion_listar_cursos_universidad_clases")
	public String ListarCursosUniversidadClases(
			@Param("in_iduniversidad") int in_iduniversidad
			);
	
	@Procedure(name="funcion_listar_cursos_universidad_materiales")
	public String ListarCursosUniversidadMateriales(
			@Param("in_iduniversidad") int in_iduniversidad
			);
}
