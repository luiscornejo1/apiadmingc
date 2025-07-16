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
@Table(name = "becas_archivos_masivos")
@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_insertar_archivo_becas_masivo", procedureName = "f_insertar_archivo_becas_masivo", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_url", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_listar_archivo_becas_masivo", procedureName = "f_listar_archivo_becas_masivo", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_offset", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_limit", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

})

public class BecaArchivoMasivo {
	@Id
	@Column(name = "idarchivo")
	private Integer idarchivo;

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

	public BecaArchivoMasivo(Integer idarchivo, String nombre, String url, int usuario_subida, Date fecha_creacion,
			Time hora_subida, int offset, int limit) {
		super();
		this.idarchivo = idarchivo;
		this.nombre = nombre;
		this.url = url;
		this.usuario_subida = usuario_subida;
		this.fecha_creacion = fecha_creacion;
		this.hora_subida = hora_subida;
		this.offset = offset;
		this.limit = limit;
	}

	public Integer getIdarchivo() {
		return idarchivo;
	}

	public void setIdarchivo(Integer idarchivo) {
		this.idarchivo = idarchivo;
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
		return "BecaArchivoMasivo [idarchivo=" + idarchivo + ", nombre=" + nombre + ", url=" + url + ", usuario_subida="
				+ usuario_subida + ", fecha_creacion=" + fecha_creacion + ", hora_subida=" + hora_subida + ", offset="
				+ offset + ", limit=" + limit + "]";
	}

}