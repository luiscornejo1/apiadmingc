package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name = "codis")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_guardar_respuestas_codis", procedureName = "f_guardar_respuestas_codis", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idestudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcodis", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_respuestas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_listar_codis_respuestas_por_estudiante", procedureName = "f_listar_codis_respuestas_por_estudiante", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcodis", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_offset", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_limit", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_codis_respuestas_general", procedureName = "f_listar_codis_respuestas_general", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcodis", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_descargar_codis_respuestas", procedureName = "f_descargar_codis_respuestas", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcodis", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		@NamedStoredProcedureQuery(name = "f_descargar_codis_profesores_por_codis", procedureName = "f_descargar_codis_profesores_por_codis", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcodis", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_listar_codis_por_estudiantes", procedureName = "f_listar_codis_por_estudiantes", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idestudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
})

public class CodisRespuesta {
	@Id
	@Column(name = "idrespuestascodis")
	private int idrespuestascodis;

	@Column(name = "idestudiante")
	private int idestudiante;

	@Column(name = "idpreguntacodis")
	private int idpreguntacodis;
	
	@Column(name = "idcodis")
	private int idcodis;
	
	@Column(name = "respuesta")
	private String respuesta;
	
	@Column(name = "fecha_creacion")
	private Date fecha_creacion;
	
	public int offset;
	public int limit;
	public int idciclo;


	public CodisRespuesta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CodisRespuesta(int idrespuestascodis, int idestudiante, int idpreguntacodis, int idcodis, String respuesta, Date fecha_creacion, int offset, int limit, int idciclo) {
		super();
		this.idrespuestascodis = idrespuestascodis;
		this.idestudiante = idestudiante;
		this.idpreguntacodis = idpreguntacodis;
		this.idcodis = idcodis;
		this.respuesta = respuesta;
		this.fecha_creacion = fecha_creacion; 
		this.offset = offset;
		this.limit = limit;
		this.idciclo = idciclo;
	}

	

	public int getIdrespuestascodis() {
		return idrespuestascodis;
	}

	public void setIdrespuestascodis(int idrespuestascodis) {
		this.idrespuestascodis = idrespuestascodis;
	}

	public int getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(int idestudiante) {
		this.idestudiante = idestudiante;
	}

	public int getIdpreguntacodis() {
		return idpreguntacodis;
	}

	public void setIdpreguntacodis(int idpreguntacodis) {
		this.idpreguntacodis = idpreguntacodis;
	}

	public int getIdcodis() {
		return idcodis;
	}

	public void setIdcodis(int idcodis) {
		this.idcodis = idcodis;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	


	public int getIdciclo() {
		return idciclo;
	}

	public void setIdciclo(int idciclo) {
		this.idciclo = idciclo;
	}

	@Override
	public String toString() {
		return "CodisRespuesta [idrespuestascodis=" + idrespuestascodis + ", idestudiante=" + idestudiante
				+ ", idpreguntacodis=" + idpreguntacodis + ", idcodis=" + idcodis + ", respuesta=" + respuesta
				+ ", fecha_creacion=" + fecha_creacion + ", offset=" + offset + ", limit=" + limit + ", idciclo="
				+ idciclo + "]";
	}









}
