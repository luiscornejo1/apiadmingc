package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import com.rosettcompany.grupoCiencia.repository.Usuarios;

@Entity
@Table(name = "cabecera_pregunta")

@NamedStoredProcedureQueries(value = {

			@NamedStoredProcedureQuery(name = "funcion_registrar_pregunta", procedureName = "funcion_registrar_pregunta", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_dificultad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_deco", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_tipo_pregunta", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_observacion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_texto", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_tema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_ciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_preguntas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class),}),
			
			@NamedStoredProcedureQuery(name = "funcion_registrar_pregunta_normalizado", procedureName = "funcion_registrar_pregunta_normalizado", parameters = {

					@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_dificultad", type = Integer.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_deco", type = String.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_tipo_pregunta", type = String.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_observacion", type = String.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_texto", type = String.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_estado", type = Integer.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_ciclo", type = Integer.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_usuario", type = Integer.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_preguntas", type = String.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_tema", type = Integer.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_subtema", type = Integer.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_subsubtema", type = Integer.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_subsubsubtema", type = Integer.class),
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_detalle", type = Integer.class),
					@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_listar_banco_preguntas", procedureName = "funcion_listar_banco_preguntas", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcurso", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idtema", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dificultad", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_estadopregunta", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_deco", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_palabra", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_rango_fecha", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_min", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_max", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcabecera_pregunta", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_listar_banco_preguntas_normalizado", procedureName = "funcion_listar_banco_preguntas_normalizado", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcurso", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idtema", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsubtema", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsubsubtema", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsubsubsubtema", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iddetallesubtema", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dificultad", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_estadopregunta", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_deco", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_palabra", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_rango_fecha", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_min", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_max", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcabecera_pregunta", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_espejo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_eliminar_cabecera_pregunta", procedureName = "funcion_eliminar_cabecera_pregunta", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcabecera", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_eliminar_pregunta", procedureName = "funcion_eliminar_pregunta", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idpregunta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_actualizar_cabecera_pregunta", procedureName = "funcion_actualizar_cabecera_pregunta", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idcabecerapregunta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_texto", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idtema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_deco", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_dificultad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),
		
		@NamedStoredProcedureQuery(name = "funcion_actualizar_cabecera_pregunta_normalizado", procedureName = "funcion_actualizar_cabecera_pregunta_normalizado", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idcabecerapregunta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_texto", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idtema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idsubtema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idsubsubtema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idsubsubsubtema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_iddetallesubtema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_deco", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_dificultad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),


		@NamedStoredProcedureQuery(name = "funcion_actualizar_detalle_pregunta", procedureName = "funcion_actualizar_detalle_pregunta", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idpregunta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_descripcion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_alternativa", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_actualizar_detalle_pregunta_normalizados", procedureName = "f_actualizar_detalle_pregunta_normalizados", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idpregunta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_descripcion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_alternativa", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_actualizar_observacion_cabecera_pregunta", procedureName = "funcion_actualizar_observacion_cabecera_pregunta", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idcabecerapregunta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_observacion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_actualizar_observacion_detalle_pregunta", procedureName = "funcion_actualizar_observacion_detalle_pregunta", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idpregunta", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_observacion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_reporte_datos_estudiante", procedureName = "f_reporte_datos_estudiante", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_reporte_datos_estudiante_ciclo", procedureName = "f_reporte_datos_estudiante_ciclo", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_ciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_reporte_datos_estudiantes_uni_ciclo", procedureName = "f_reporte_datos_estudiantes_uni_ciclo", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_ciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_reporte_simulacro_mes", procedureName = "f_reporte_simulacro_mes", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_reporte_areas_mes", procedureName = "f_reporte_areas_mes", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),
		
		@NamedStoredProcedureQuery(name = "f_reporte_areas_mes_subido", procedureName = "f_reporte_areas_mes_subido", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),
		
		@NamedStoredProcedureQuery(name = "f_reporte_areas_mes_subido_uni", procedureName = "f_reporte_areas_mes_subido_uni", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_reporte_detalle_simulacro", procedureName = "f_reporte_detalle_simulacro", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),
		
		@NamedStoredProcedureQuery(name = "f_reporte_detalle_simulacro_subido", procedureName = "f_reporte_detalle_simulacro_subido", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),
		
		@NamedStoredProcedureQuery(name = "f_reporte_detalle_simulacro_subido_uni", procedureName = "f_reporte_detalle_simulacro_subido_uni", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_reporte_datos_estudiante_meses", procedureName = "f_reporte_datos_estudiante_meses", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),
		
		@NamedStoredProcedureQuery(name = "f_reporte_datos_estudiante_meses_subido", procedureName = "f_reporte_datos_estudiante_meses_subido", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),
		
		@NamedStoredProcedureQuery(name = "f_reporte_datos_estudiante_meses_subido_uni", procedureName = "f_reporte_datos_estudiante_meses_subido_uni", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_reporte_detalle_simulacro_meses", procedureName = "f_reporte_detalle_simulacro_meses", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_numero_minimo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_numero_maximo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_reporte_datos_estudiante_uni", procedureName = "f_reporte_datos_estudiante_uni", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),
		
		@NamedStoredProcedureQuery(name = "f_buscar_pregunatas_similares", procedureName = "f_buscar_pregunatas_similares", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_texto", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class), }),
				

})

public class CabeceraPregunta {

	@Id
	@Column(name = "idcabecerapregunta")
	private int idcabecerapregunta;
	@Column(name = "fecha_registro")
	private Date fecha_registro;
	@Column(name = "dificultad")
	private int dificultad;
	@Column(name = "deco")
	private String deco;
	@Column(name = "tipo_pregunta")
	private String tipo_pregunta;
	@Column(name = "observacion")
	private String observacion;
	@Column(name = "texto")
	private String texto;
	@Column(name = "estado")
	private int estado;
	

	@ManyToOne
	@JoinColumn(name = "idusuario")
	private Usuarios usuario;
	@ManyToOne
	@JoinColumn(name = "idtema")
	private Tema tema;

	@ManyToOne
	@JoinColumn(name = "id_subtema")
	private Subtema subtema;

	@ManyToOne
	@JoinColumn(name = "id_sub_subtema")
	private Subsubtema subsubtema;

	@ManyToOne
	@JoinColumn(name = "id_sub_sub_subtema")
	private Subsubsubtema subsubsubtema;

	@ManyToOne
	@JoinColumn(name = "id_detalle_subtema")
	private Detallesubtema detallesubtema;

	@ManyToOne
	@JoinColumn(name = "idciclo")
	private Ciclo ciclo;

	@ManyToOne
	@JoinColumn(name = "idtemanormalizado")
	private TemaNormalizado temanormalizado;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cabecerapregunta")
	private List<DetallePregunta> detallePregunta;


	public int idtemanormalizadoo;
	public CabeceraPregunta() {
		super();
	}

	public CabeceraPregunta(int idcabecerapregunta, Date fecha_registro, int dificultad, String deco,
			String tipo_pregunta, String observacion, String texto, int estado, Usuarios usuario, Tema tema,
			Ciclo ciclo, List<DetallePregunta> detallePregunta) {
		super();
		this.idcabecerapregunta = idcabecerapregunta;
		this.fecha_registro = fecha_registro;
		this.dificultad = dificultad;
		this.deco = deco;
		this.tipo_pregunta = tipo_pregunta;
		this.observacion = observacion;
		this.texto = texto;
		this.estado = estado;
		this.usuario = usuario;
		this.tema = tema;
		this.ciclo = ciclo;
		this.detallePregunta = detallePregunta;
	}

	public int getIdcabecerapregunta() {
		return idcabecerapregunta;
	}

	public void setIdcabecerapregunta(int idcabecerapregunta) {
		this.idcabecerapregunta = idcabecerapregunta;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public int getDificultad() {
		return dificultad;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	public String getDeco() {
		return deco;
	}

	public void setDeco(String deco) {
		this.deco = deco;
	}

	public String getTipo_pregunta() {
		return tipo_pregunta;
	}

	public void setTipo_pregunta(String tipo_pregunta) {
		this.tipo_pregunta = tipo_pregunta;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Ciclo getCiclo() {
		return ciclo;
	}

	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}

	public List<DetallePregunta> getDetallePregunta() {
		return detallePregunta;
	}

	public void setDetallePregunta(List<DetallePregunta> detallePregunta) {
		this.detallePregunta = detallePregunta;
	}

	public Subtema getSubtema() {
		return subtema;
	}

	public void setSubtema(Subtema subtema) {
		this.subtema = subtema;
	}

	public Subsubtema getSubsubtema() {
		return subsubtema;
	}

	public void setSubsubtema(Subsubtema subsubtema) {
		this.subsubtema = subsubtema;
	}

	public Subsubsubtema getSubsubsubtema() {
		return subsubsubtema;
	}

	public void setSubsubsubtema(Subsubsubtema subsubsubtema) {
		this.subsubsubtema = subsubsubtema;
	}

	public Detallesubtema getDetallesubtema() {
		return detallesubtema;
	}

	public void setDetallesubtema(Detallesubtema detallesubtema) {
		this.detallesubtema = detallesubtema;
	}

	public TemaNormalizado getTemanormalizado() {
		return temanormalizado;
	}

	public void setTemanormalizado(TemaNormalizado temanormalizado) {
		this.temanormalizado = temanormalizado;
	}

	@Override
	public String toString() {
		return "CabeceraPregunta [idcabecerapregunta=" + idcabecerapregunta + ", fecha_registro=" + fecha_registro
				+ ", dificultad=" + dificultad + ", deco=" + deco + ", tipo_pregunta=" + tipo_pregunta
				+ ", observacion=" + observacion + ", texto=" + texto + ", estado=" + estado + ", usuario=" + usuario
				+ ", tema=" + tema + ", subtema=" + subtema + ", subsubtema=" + subsubtema + ", subsubsubtema="
				+ subsubsubtema + ", detallesubtema=" + detallesubtema + ", ciclo=" + ciclo + ", temanormalizado="
				+ temanormalizado + ", detallePregunta=" + detallePregunta + "]";
	}
	
	

}
