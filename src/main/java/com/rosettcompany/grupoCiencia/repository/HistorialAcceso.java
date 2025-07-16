package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name = "historial_acceso")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_insertar_historial_acceso", procedureName = "f_insertar_historial_acceso", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idestudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_observaciones", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_buscar_asistencias_fecha", procedureName = "f_buscar_asistencias_fecha", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_condicion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_listar_asistencias", procedureName = "f_listar_asistencias", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_rows", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_buscar", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_listar_asistencias_total", procedureName = "f_listar_asistencias_total", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_observaciones", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_justificar_asistencia", procedureName = "f_justificar_asistencia", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idhistorialacceso", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_observaciones", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_documento", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_estado", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "insertar_historial_faltas", procedureName = "insertar_historial_faltas", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_registro", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_listar_resumen_asistencias", procedureName = "f_listar_resumen_asistencias", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_observaciones", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_mes_inicio", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_resumen_asistencias_virtual", procedureName = "f_listar_resumen_asistencias_virtual", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_observaciones", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_mes_inicio", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_detalle_asistencia_anual", procedureName = "f_detalle_asistencia_anual", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idestudiante", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_anio", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

})
public class HistorialAcceso {

	@Id
	@Column(name = "idhistorialacceso")
	private int idhistorialacceso;

	@Column(name = "idusuario")
	private int idusuario;

	@Column(name = "idestudiante")
	private int idestudiante;

	@Column(name = "observaciones")
	private String observaciones;

	@Column(name = "documento")
	private String documento;

	@Column(name = "estado")
	private String estado;

	private int index;
	public int anio;

	public Date fecha_registro;
	public String mes_inicio;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public HistorialAcceso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HistorialAcceso(int idhistorialacceso, int idusuario, int idestudiante, String observaciones,
			String documento, String estado, int index, int anio) {
		super();
		this.idhistorialacceso = idhistorialacceso;
		this.idusuario = idusuario;
		this.idestudiante = idestudiante;
		this.observaciones = observaciones;
		this.documento = documento;
		this.estado = estado;
		this.index = index;
		this.anio = anio;
	}

	public int getIdhistorialacceso() {
		return idhistorialacceso;
	}

	public void setIdhistorialacceso(int idhistorialacceso) {
		this.idhistorialacceso = idhistorialacceso;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public int getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(int idestudiante) {
		this.idestudiante = idestudiante;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	

	
	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "HistorialAcceso [idhistorialacceso=" + idhistorialacceso + ", idusuario=" + idusuario
				+ ", idestudiante=" + idestudiante + ", observaciones=" + observaciones + ", documento=" + documento
				+ ", estado=" + estado + ", index=" + index + "]";
	}

}