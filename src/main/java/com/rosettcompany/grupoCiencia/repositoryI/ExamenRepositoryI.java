package com.rosettcompany.grupoCiencia.repositoryI;

import java.sql.Date;
import java.sql.Time;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Examen;

@Repository
public interface ExamenRepositoryI extends CrudRepository<Examen, Integer>{

	@Procedure(name="crear_examen")
	public String crearExamen(
			@Param("in_fecha_examen") Date fecha_examen,
			@Param("in_hora_inicio") Time hora_inicio,
			@Param("in_hora_fin") Time hora_fin,
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_idciclo") int idciclo,
			@Param("in_ciclos") String ciclos,
			@Param("in_idarea") int idarea,
			@Param("in_puede_retroceder") int retroceder,
			@Param("in_encuesta") int encuesta,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin,
			@Param("in_idusuario") int idusuario,
			@Param("in_salto_pregunta") int salto_pregunta,
			@Param("in_tipo_examen") int tipo_examen
			);
	@Procedure(name="crear_examen_normalizado")
	public String crearExamenNormalizado(
			@Param("in_fecha_examen") Date fecha_examen,
			@Param("in_hora_inicio") Time hora_inicio,
			@Param("in_hora_fin") Time hora_fin,
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_idciclo") int idciclo,
			@Param("in_ciclos") String ciclos,
			@Param("in_idarea") int idarea,
			@Param("in_puede_retroceder") int retroceder,
			@Param("in_encuesta") int encuesta,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin,
			@Param("in_idusuario") int idusuario,
			@Param("in_salto_pregunta") int salto_pregunta,
			@Param("in_tipo_examen") int tipo_examen
			);
	
	@Procedure(name="verificar_cantidad_preguntas_usuario")
	public String validarCantidadPreguntas(
			@Param("in_idarea") int idarea,
			@Param("in_idusuario") int idusuario,
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin
			);
	
	@Procedure(name="verificar_cantidad_preguntas_usuario_normalizado")
	public String validarCantidadPreguntasNormalizado(
			@Param("in_idarea") int idarea,
			@Param("in_idusuario") int idusuario,
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin
			);
	
	@Procedure(name="confirmar_examen")
	public String confirmarExamen(
			@Param("in_idexamenes") String idexamenes,
			@Param("in_url_examen_blanco") String url_examen_blanco,
			@Param("in_url_examen_respuestas") String url_examen_respuestas,
			@Param("url_examen_blanco_resumido") String url_examen_blanco_resumido,
			@Param("url_examen_respuestas_resumido") String url_examen_respuestas_resumido,
			@Param("in_estado") int estado
			);
	
	@Procedure(name="confirmar_examen_normalizado")
	public String confirmarExamenNormalizado(
			@Param("in_idexamenes") String idexamenes,
			@Param("in_url_examen_blanco") String url_examen_blanco,
			@Param("in_url_examen_respuestas") String url_examen_respuestas,
			@Param("url_examen_blanco_resumido") String url_examen_blanco_resumido,
			@Param("url_examen_respuestas_resumido") String url_examen_respuestas_resumido,
			@Param("in_estado") int estado
			);
	
	@Procedure(name="listar_examenes")
	public String listarExamenes(
			@Param("in_idexamen") int idexamen
			);
	
	@Procedure(name="listar_examenes_normalizado")
	public String listarExamenesNormalizado(
			@Param("in_idexamen") int idexamen
			);
	
	@Procedure(name="eliminar_examen")
	public String eliminarExamen(
			@Param("in_idexamen") int idexamen
			);
	
	@Procedure(name="eliminar_examen_normalizado")
	public String eliminarExamenNormalizado(
			@Param("in_idexamen") int idexamen
			);
	
	@Procedure(name="editar_examen")
	public String editarExamen(
			@Param("in_fecha_examen") Date fecha_examen,
			@Param("in_hora_inicio") Time hora_inicio,
			@Param("in_hora_fin") Time hora_fin,
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_idciclo") int idciclo,
			@Param("in_idarea") int idarea,
			@Param("in_puede_retroceder") int retroceder,
			@Param("in_encuesta") int encuesta,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin,
			@Param("in_idusuario") int idusuario,
			@Param("in_estado") int estado,
			@Param("in_idexamen") int idexamen,
			@Param("in_salto_pregunta") int salto_pregunta
			);
	
	@Procedure(name="editar_examen_normalizado")
	public String editarExamenNormalizado(
			@Param("in_fecha_examen") Date fecha_examen,
			@Param("in_hora_inicio") Time hora_inicio,
			@Param("in_hora_fin") Time hora_fin,
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_idciclo") int idciclo,
			@Param("in_idarea") int idarea,
			@Param("in_puede_retroceder") int retroceder,
			@Param("in_encuesta") int encuesta,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin,
			@Param("in_idusuario") int idusuario,
			@Param("in_estado") int estado,
			@Param("in_idexamen") int idexamen,
			@Param("in_salto_pregunta") int salto_pregunta
			);
	
	@Procedure(name="obtener_preguntas_curso")
	public String obtenerPreguntasCurso(
			@Param("in_curso") int idcurso,
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_ciclos") String ciclos,
			@Param("in_idarea") int idarea,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin,
			@Param("in_idusuario") int idusuario,
			@Param("in_idexamen") int idexamen
			);
	
	@Procedure(name="obtener_preguntas_curso_normalizado")
	public String obtenerPreguntasCursoNormalizado(
			@Param("in_curso") int idcurso,
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_ciclos") String ciclos,
			@Param("in_idarea") int idarea,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin,
			@Param("in_idusuario") int idusuario,
			@Param("in_idexamen") int idexamen
			);
	
	@Procedure(name="funcion_reporte_notas_dia")
    public String reporteNotasDia(
            @Param("in_fecha") Date in_fecha
            );
	
	@Procedure(name="funcion_reporte_notas_dia_normalizado")
    public String reporteNotasDiaNormalizado(
            @Param("in_fecha") Date in_fecha
            );
	
	@Procedure(name="funcion_listar_detalle_examen")
	public String ListarDetalleExamen(
			@Param("in_idexamen") int in_idexamen
			);
	
	@Procedure(name="funcion_listar_detalle_examen_normalizado")
	public String ListarDetalleExamenNormalizado(
			@Param("in_idexamen") int in_idexamen
			);
	
	
	@Procedure(name="f_crear_examen_temas")
	public String crearExamenTemas(
			@Param("in_fecha_examen") Date fecha_examen,
			@Param("in_hora_inicio") Time hora_inicio,
			@Param("in_hora_fin") Time hora_fin,
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_idciclo") int idciclo,
			@Param("in_ciclos") String ciclos,
			@Param("in_idarea") int idarea,
			@Param("in_puede_retroceder") int retroceder,
			@Param("in_encuesta") int encuesta,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin,
			@Param("in_idusuario") int idusuario,
			@Param("in_salto_pregunta") int salto_pregunta,
			@Param("in_tipo_examen") int tipo_examen,
			@Param("in_lista_temas") String temas
			);
	@Procedure(name="f_crear_examen_temas_normalizado")
	public String crearExamenTemasNormalizados(
			@Param("in_fecha_examen") Date fecha_examen,
			@Param("in_hora_inicio") Time hora_inicio,
			@Param("in_hora_fin") Time hora_fin,
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_idciclo") int idciclo,
			@Param("in_ciclos") String ciclos,
			@Param("in_idarea") int idarea,
			@Param("in_puede_retroceder") int retroceder,
			@Param("in_encuesta") int encuesta,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin,
			@Param("in_idusuario") int idusuario,
			@Param("in_salto_pregunta") int salto_pregunta,
			@Param("in_tipo_examen") int tipo_examen,
			@Param("in_lista_temas") String temas
			);
	
	@Procedure(name="f_obtener_preguntas_curso_temas")
	public String obtenerPreguntasCursoTemas(
			@Param("in_curso") int idcurso,
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_ciclos") String ciclos,
			@Param("in_idarea") int idarea,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin,
			@Param("in_idusuario") int idusuario,
			@Param("in_idexamen") int idexamen,
			@Param("in_lista_temas") String temas
			);
	
	@Procedure(name="f_obtener_preguntas_curso_temas_normalizado")
	public String obtenerPreguntasCursoTemasNormalizado(
			@Param("in_curso") int idcurso,
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_ciclos") String ciclos,
			@Param("in_idarea") int idarea,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin,
			@Param("in_idusuario") int idusuario,
			@Param("in_idexamen") int idexamen,
			@Param("in_lista_temas") String temas
			);
	
	@Procedure(name="f_crear_examen_uni")
	public String crearExamenUni(
			@Param("in_fecha_examen") Date fecha_examen,
			@Param("in_hora_inicio") Time hora_inicio,
			@Param("in_hora_fin") Time hora_fin,
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_idciclo") int idciclo,
			@Param("in_ciclos") String ciclos,
			@Param("in_idarea") int idarea,
			@Param("in_puede_retroceder") int retroceder,
			@Param("in_encuesta") int encuesta,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin,
			@Param("in_idusuario") int idusuario,
			@Param("in_salto_pregunta") int salto_pregunta,
			@Param("in_tipo_examen") int tipo_examen
			);
	
	@Procedure(name="f_crear_examen_uni_normalizado")
	public String crearExamenUniNormalizado(
			@Param("in_fecha_examen") Date fecha_examen,
			@Param("in_hora_inicio") Time hora_inicio,
			@Param("in_hora_fin") Time hora_fin,
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_idciclo") int idciclo,
			@Param("in_ciclos") String ciclos,
			@Param("in_idarea") int idarea,
			@Param("in_puede_retroceder") int retroceder,
			@Param("in_encuesta") int encuesta,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin,
			@Param("in_idusuario") int idusuario,
			@Param("in_salto_pregunta") int salto_pregunta,
			@Param("in_tipo_examen") int tipo_examen
			);
	
	@Procedure(name="f_obtener_preguntas_curso_uni")
	public String obtenerPreguntasCursoUni(
			@Param("in_curso") int idcurso,
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_ciclos") String ciclos,
			@Param("in_idarea") int idarea,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin,
			@Param("in_idusuario") int idusuario,
			@Param("in_idexamen") int idexamen
			);
	
	@Procedure(name="f_obtener_preguntas_curso_uni_normalizado")
	public String obtenerPreguntasCursoUniNormalizado(
			@Param("in_curso") int idcurso,
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_ciclos") String ciclos,
			@Param("in_idarea") int idarea,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin,
			@Param("in_idusuario") int idusuario,
			@Param("in_idexamen") int idexamen
			);
	
}
