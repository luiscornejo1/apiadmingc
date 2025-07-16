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

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

@Entity
@Table(name = "notas_simulacro_estudiantes_presencial")
@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_subir_notas_simulacros_estudiantes", procedureName = "f_subir_notas_simulacros_estudiantes", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_url", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_listar_notas_simulacro_estudiantes", procedureName = "f_listar_notas_simulacro_estudiantes", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_offset", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_limit", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

})

public class NotasSimulacroEstudiantes {
	@Id
	@Column(name = "idarchivonotas")
	private Integer idarchivonotas;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "url")
	private String url;

	@Column(name = "usuario_subida")
	private int usuario_subida;

	@Column(name = "fecha_creacion")
	private Date fecha_creacion;

	@Column(name = "hora_subida")
	private Time hora_subida;

	public int offset;

	public int limit;

	public NotasSimulacroEstudiantes(Integer idarchivonotas, String nombre, String url, int usuario_subida, Date fecha_creacion,
			Time hora_subida, int offset, int limit) {
		super();
		this.idarchivonotas = idarchivonotas;
		this.nombre = nombre;
		this.url = url;
		this.usuario_subida = usuario_subida;
		this.fecha_creacion = fecha_creacion;
		this.hora_subida = hora_subida;
		this.offset = offset;
		this.limit = limit;
	}



	public Integer getIdarchivonotas() {
		return idarchivonotas;
	}



	public void setIdarchivonotas(Integer idarchivonotas) {
		this.idarchivonotas = idarchivonotas;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getUsuario_subida() {
		return usuario_subida;
	}

	public void setUsuario_subida(int usuario_subida) {
		this.usuario_subida = usuario_subida;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Time getHora_subida() {
		return hora_subida;
	}

	public void setHora_subida(Time hora_subida) {
		this.hora_subida = hora_subida;
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

	@Override
	public String toString() {
		return "BecaArchivoMasivo [idarchivonotas=" + idarchivonotas + ", nombre=" + nombre + ", url=" + url + ", usuario_subida="
				+ usuario_subida + ", fecha_creacion=" + fecha_creacion + ", hora_subida=" + hora_subida + ", offset="
				+ offset + ", limit=" + limit + "]";
	}

}