package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.AreasCarrera;

@Repository
public interface AreasCarreraRepositoryI extends CrudRepository<AreasCarrera, Integer> {

	@Procedure(name="listar_areas_carreras_universidad")
	public String listarCarrerasPorUniversidad(
			@Param("in_id_universidad") int iduniversidad
			);
	
	@Procedure(name="listar_cursos_por_area")
	public String listarDetalleAreaCurso(
			@Param("in_id_area") int idarea
			);
	
	@Procedure(name="guardar_puntajes_preguntas")
	public String guardarPuntajesPreguntas(
			@Param("in_id_area") int idarea,
			@Param("in_pregunta_correcta") double pregunta_correcta,
			@Param("in_pregunta_incorrecta") double pregunta_incorrecta,
			@Param("in_pregunta_blanco") double pregunta_en_blanco
			);
	
	@Procedure(name="listar_configuracion_examen")
	public String listarConfiguracionExamen(
			@Param("in_id_usuario")int idusuario
			);
	
}
