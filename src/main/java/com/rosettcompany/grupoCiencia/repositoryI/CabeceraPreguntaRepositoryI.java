package com.rosettcompany.grupoCiencia.repositoryI;

import java.sql.Date;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.CabeceraPregunta;

@Repository
public interface CabeceraPreguntaRepositoryI extends CrudRepository<CabeceraPregunta, Integer> {

	@Procedure(name="funcion_registrar_pregunta")
public String RegistrarPregunta(
		@Param("n_dificultad") int n_dificultad,
		@Param("n_deco") String n_deco,
		@Param("n_tipo_pregunta") String n_tipo_pregunta,
		@Param("n_observacion") String n_observacion,
		@Param("n_texto") String n_texto,
		@Param("n_estado") int n_estado,
		@Param("n_tema") int n_tema,
		@Param("n_ciclo") int n_ciclo,
		@Param("n_usuario") int n_usuario,
		@Param("n_preguntas") String n_preguntas
		);
	
	@Procedure(name = "funcion_registrar_pregunta_normalizado")
	public String RegistrarPreguntaNormalizado(@Param("n_dificultad") int n_dificultad, @Param("n_deco") String n_deco,
			@Param("n_tipo_pregunta") String n_tipo_pregunta, @Param("n_observacion") String n_observacion,
			@Param("n_texto") String n_texto, @Param("n_estado") int n_estado, @Param("n_ciclo") int n_ciclo, 
			@Param("n_usuario") int n_usuario, @Param("n_preguntas") String n_preguntas,  @Param("n_tema") int n_tema, 
			@Param("n_subtema") int n_subtema,@Param("n_subsubtema") int n_subsubtema,@Param("n_subsubsubtema") int n_subsubsubtema,
			@Param("n_detalle") int n_detalle);

	@Procedure(name = "funcion_listar_banco_preguntas")
	public String ListarBancoPreguntas(@Param("in_iduniversidad") String in_iduniversidad,
			@Param("in_idciclo") String in_idciclo, @Param("in_idcurso") String in_idcurso,
			@Param("in_idtema") String in_idtema, @Param("in_dificultad") String in_dificultad,
			@Param("in_estadopregunta") String in_estadopregunta, @Param("in_deco") String in_deco,
			@Param("in_palabra") String in_palabra, @Param("in_idusuario") String in_idusuario,
			@Param("in_rango_fecha") String in_rango_fecha, @Param("in_min") Integer in_min,
			@Param("in_max") Integer in_max, @Param("in_idcabecera_pregunta") String in_idcabecera_pregunta);

	@Procedure(name = "funcion_listar_banco_preguntas_normalizado")
	public String funcion_listar_banco_preguntas_normalizado(@Param("in_iduniversidad") String in_iduniversidad,
			@Param("in_idcurso") String in_idcurso, @Param("in_idtema") String in_idtema,
			@Param("in_idsubtema") String in_idsubtema, @Param("in_idsubsubtema") String in_idsubsubtema,
			@Param("in_idsubsubsubtema") String in_idsubsubsubtema,
			@Param("in_iddetallesubtema") String in_iddetallesubtema, @Param("in_dificultad") String in_dificultad,
			@Param("in_estadopregunta") String in_estadopregunta, @Param("in_deco") String in_deco,
			@Param("in_palabra") String in_palabra, @Param("in_idusuario") String in_idusuario,
			@Param("in_rango_fecha") String in_rango_fecha, @Param("in_min") Integer in_min,
			@Param("in_max") Integer in_max, @Param("in_idcabecera_pregunta") String in_idcabecera_pregunta,
			@Param("in_espejo") String in_espejo);
	

    @Procedure(name = "f_buscar_pregunatas_similares")
    public String BuscarPreguntasSimilares(@Param("in_texto") String in_texto);

	@Procedure(name = "f_actualizar_cantidad_preguntas_espejo")
	public String f_actualizar_cantidad_preguntas_espejo();

	@Procedure(name = "funcion_eliminar_cabecera_pregunta")
	public String EliminarCabecera(@Param("in_idcabecera") int in_idcabecera);

	@Procedure(name = "funcion_eliminar_pregunta")
	public String EliminarPregunta(@Param("in_idpregunta") int in_idpregunta);

	@Procedure(name = "funcion_actualizar_cabecera_pregunta")
	public String ActualizarCabeceraPregunta(@Param("n_idcabecerapregunta") int in_idpregunta,
			@Param("n_texto") String n_texto, @Param("n_idciclo") int n_idciclo, @Param("n_idtema") int n_idtema,
			@Param("n_deco") String n_deco, @Param("n_dificultad") int n_dificultad, @Param("n_estado") int n_estado);

	@Procedure(name = "funcion_actualizar_cabecera_pregunta_normalizado")
	public String ActualizarCabeceraPreguntaNormalizado(@Param("n_idcabecerapregunta") int in_idpregunta,
	@Param("n_texto") String n_texto,  @Param("n_idtema") int n_idtema,
	@Param("n_idsubtema") int n_idsubtema, @Param("n_idsubsubtema") int n_idsubsubtema,
	@Param("n_idsubsubsubtema") int n_idsubsubsubtema, @Param("n_iddetallesubtema") int n_iddetallesubtema,
	@Param("n_deco") String n_deco, @Param("n_dificultad") int n_dificultad, @Param("n_estado") int n_estado);

	@Procedure(name = "funcion_actualizar_detalle_pregunta")
	public String ActualizarPregunta(@Param("n_idpregunta") int in_idpregunta,
			@Param("n_descripcion") String n_descripcion, @Param("n_alternativa") String n_alternativa,
			@Param("n_estado") int n_estado);

	@Procedure(name = "f_actualizar_detalle_pregunta_normalizados")
	public String ActualizarPreguntaNormalizado(@Param("n_idpregunta") int in_idpregunta,
			@Param("n_descripcion") String n_descripcion, @Param("n_alternativa") String n_alternativa);

	@Procedure(name = "funcion_actualizar_observacion_cabecera_pregunta")
	public String ActualizarObservacionCabeceraPregunta(@Param("n_idcabecerapregunta") int n_idcabecerapregunta,
			@Param("n_observacion") String n_observacion, @Param("n_estado") int n_estado);

	@Procedure(name = "funcion_actualizar_observacion_detalle_pregunta")
	public String ActualizarObservacionPregunta(@Param("n_idpregunta") int n_idcabecerapregunta,
			@Param("n_observacion") String n_observacion, @Param("n_estado") int n_estado);

	@Procedure(name = "f_reporte_datos_estudiante_meses")
	public String ReporteListarDatosEstudiante(@Param("in_id_estudiante") int in_id_estudiante,
			@Param("in_fecha_inicio") Date in_fecha_inicio, @Param("in_fecha_fin") Date in_fecha_fin);
	
	@Procedure(name = "f_reporte_datos_estudiante_meses_subido")
	public String ReporteListarDatosEstudiantePresencial(@Param("in_id_estudiante") int in_id_estudiante,
			@Param("in_fecha_inicio") Date in_fecha_inicio, @Param("in_fecha_fin") Date in_fecha_fin);
	
	@Procedure(name = "f_reporte_datos_estudiante_meses_subido_uni")
	public String ReporteListarDatosEstudiantePresencialUni(@Param("in_id_estudiante") int in_id_estudiante,
			@Param("in_fecha_inicio") Date in_fecha_inicio, @Param("in_fecha_fin") Date in_fecha_fin);

	@Procedure(name = "f_reporte_datos_estudiante_ciclo")
	public String ReporteListarDatosEstudianteCiclo(@Param("in_id_ciclo") int in_id_ciclo,
			@Param("in_fecha_inicio") Date in_fecha_inicio, @Param("in_fecha_fin") Date in_fecha_fin);

	@Procedure(name = "f_reporte_datos_estudiantes_uni_ciclo")
	public String ReporteListarDatosEstudianteUniCiclo(@Param("in_id_ciclo") int in_id_ciclo,
			@Param("in_fecha_inicio") Date in_fecha_inicio);

	@Procedure(name = "f_reporte_detalle_simulacro")
	public String ReporteListarDetalleSimulacro(@Param("in_id_estudiante") int in_id_estudiante,
			@Param("in_fecha_inicio") Date in_fecha_inicio, @Param("in_fecha_fin") Date in_fecha_fin);
	
	@Procedure(name = "f_reporte_detalle_simulacro_subido")
	public String ReporteListarDetalleSimulacroPresencial(@Param("in_id_estudiante") int in_id_estudiante,
			@Param("in_fecha_inicio") Date in_fecha_inicio, @Param("in_fecha_fin") Date in_fecha_fin);

	@Procedure(name = "f_reporte_detalle_simulacro_subido_uni")
	public String ReporteListarDetalleSimulacroPresencialUni(@Param("in_id_estudiante") int in_id_estudiante,
			@Param("in_fecha_inicio") Date in_fecha_inicio, @Param("in_fecha_fin") Date in_fecha_fin);

	@Procedure(name = "f_reporte_simulacro_mes")
	public String ReporteListarSimulacroMes(@Param("in_id_estudiante") int in_id_estudiante,
			@Param("in_fecha_inicio") Date in_fecha_inicio, @Param("in_fecha_fin") Date in_fecha_fin);
	
	@Procedure(name = "f_reporte_areas_mes")
	public String ReporteListarAreasMes(@Param("in_id_estudiante") int in_id_estudiante,
			@Param("in_fecha_inicio") Date in_fecha_inicio, @Param("in_fecha_fin") Date in_fecha_fin);
	
	@Procedure(name = "f_reporte_areas_mes_subido")
	public String ReporteListarAreasMesPresencial(@Param("in_id_estudiante") int in_id_estudiante,
			@Param("in_fecha_inicio") Date in_fecha_inicio, @Param("in_fecha_fin") Date in_fecha_fin);
	
	@Procedure(name = "f_reporte_areas_mes_subido_uni")
	public String ReporteListarAreasMesPresencialUni(@Param("in_id_estudiante") int in_id_estudiante,
			@Param("in_fecha_inicio") Date in_fecha_inicio, @Param("in_fecha_fin") Date in_fecha_fin);

	
	@Procedure(name = "f_reporte_datos_estudiante_meses")
	public String ReporteListarDatosEstudianteMeses(@Param("in_id_estudiante") int in_id_estudiante,
			@Param("in_fecha_inicio") Date in_fecha_inicio, @Param("in_fecha_fin") Date in_fecha_fin);

	@Procedure(name = "f_reporte_detalle_simulacro_meses")
	public String ReporteListarDetalleSimulacroMeses(@Param("in_id_estudiante") int in_id_estudiante,
			@Param("in_fecha_inicio") Date in_fecha_inicio, @Param("in_fecha_fin") Date in_fecha_fin,
			@Param("in_numero_minimo") int in_numero_minimo, @Param("in_numero_maximo") int in_numero_maximo);

	@Procedure(name = "f_reporte_datos_estudiante_uni")
	public String ReporteDatosEstudianteUni(@Param("in_id_estudiante") int in_id_estudiante,
			@Param("in_fecha_inicio") Date in_fecha_inicio, @Param("in_fecha_fin") Date in_fecha_fin);

	@Procedure(name = "actualizar_temas_normalizado")
	public String actualizarTemaNormalizado(@Param("in_id_tema") int idtema, @Param("in_id_curso") int idcurso,
			@Param("in_id_subtema") int idsubtema, @Param("in_id_subsubtema") int idsubsubtema,
			@Param("in_id_subsubsubtema") int idsubsubsubtema, @Param("in_id_detallesubtema") int iddetallesubtema,
			@Param("in_nombre_tema") String nombre);
	
	@Procedure(name = "f_cargar_examenes")
	public String f_cargar_examenes();
}
