package com.rosettcompany.grupoCiencia.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="prospecto_biblioteca")

@NamedStoredProcedureQueries(value = {
		@NamedStoredProcedureQuery(name = "funcion_listar_prospectos_biblioteca", procedureName = "funcion_listar_prospectos_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idanio", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),	

		@NamedStoredProcedureQuery(name = "f_registrar_prospecto_biblioteca", procedureName = "f_registrar_prospecto_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_prospectos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_prospectos_biblioteca", procedureName = "f_listar_prospectos_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_numero", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_universidad", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_anio", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_area", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_semestre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_eliminar_prospecto_biblioteca", procedureName = "f_eliminar_prospecto_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idprospecto", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
})
public class ProspectoBiblioteca {

	@Id
	@Column(name="idprospecto")
	private int idprospecto;
	@Column(name="idsemestre")
	private int idsemestre;
	@Column(name="idarea")
	private int idarea;
	@Column(name="nombre_prospecto")
	private String nombre_prospecto;
	@Column(name="url_prospecto")
	private String url_prospecto;
	@Column(name="url_clase_relacionada")
	private String url_clase_relacionada;
	@Column(name="estado")
	private int estado;
	
	public ProspectoBiblioteca() {
		super();
	}

	public ProspectoBiblioteca(int idprospecto, int idsemestre, int idarea, String nombre_prospecto,
			String url_prospecto, String url_clase_relacionada, int estado) {
		super();
		this.idprospecto = idprospecto;
		this.idsemestre = idsemestre;
		this.idarea = idarea;
		this.nombre_prospecto = nombre_prospecto;
		this.url_prospecto = url_prospecto;
		this.url_clase_relacionada = url_clase_relacionada;
		this.estado = estado;
	}

	public int getIdprospecto() {
		return idprospecto;
	}

	public void setIdprospecto(int idprospecto) {
		this.idprospecto = idprospecto;
	}

	public int getIdsemestre() {
		return idsemestre;
	}

	public void setIdsemestre(int idsemestre) {
		this.idsemestre = idsemestre;
	}

	public int getIdarea() {
		return idarea;
	}

	public void setIdarea(int idarea) {
		this.idarea = idarea;
	}

	public String getNombre_prospecto() {
		return nombre_prospecto;
	}

	public void setNombre_prospecto(String nombre_prospecto) {
		this.nombre_prospecto = nombre_prospecto;
	}

	public String getUrl_prospecto() {
		return url_prospecto;
	}

	public void setUrl_prospecto(String url_prospecto) {
		this.url_prospecto = url_prospecto;
	}

	public String getUrl_clase_relacionada() {
		return url_clase_relacionada;
	}

	public void setUrl_clase_relacionada(String url_clase_relacionada) {
		this.url_clase_relacionada = url_clase_relacionada;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	
	
	
}
