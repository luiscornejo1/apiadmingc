package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.rosettcompany.grupoCiencia.repository.Examen_estudiante;

@Repository
public interface ExamenEstudianteRepositoryI extends CrudRepository<Examen_estudiante, Integer> {

	@Procedure(name="f_insertar_examen_estudiante")
	public String insertarExamenEstudiante(
			@Param("in_id_examen") int idexamen,
			@Param("in_id_estudiante") int idestudiante,
			@Param("in_lista_respuestas") String lista_respuestas,
			@Param("in_nota_total") double total,
			@Param("in_correctas") int correctas,
			@Param("in_incorrectas") int incorrectas,
			@Param("in_en_blanco") int en_blanco,
			@Param("in_tiempo") String tiempo
			);
	
	@Procedure(name="f_listar_examenes_resueltos_estudiante")
	public String listarExamenesEstudiante(
			@Param("in_id_estudiante") int idestudiante
			);
	
	@Procedure(name="f_listar_comunicados_estudiante")
	public String listarComunicados(
			@Param("in_id_estudiante") int idestudiante
			);
	
	@Procedure(name="f_verificar_examen_activo")
	public String verficarFechaExamen(
			@Param("in_id_examen") int idexamen
			);
	
	@Procedure(name="f_obtener_resumen_examen_estudiante")
	public String ObtenerResumenExamenEstudiante(
			@Param("in_id_examen") int idexamen,
			@Param("in_id_estudiante") int idestudiante
			);
}


