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
@Table(name="clave_biblioteca")

@NamedStoredProcedureQueries(value = {
		@NamedStoredProcedureQuery(name = "funcion_listar_claves_biblioteca", procedureName = "funcion_listar_claves_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idanio", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),	
		
		@NamedStoredProcedureQuery(name = "f_registrar_clave_biblioteca", procedureName = "f_registrar_clave_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_claves", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_claves_biblioteca", procedureName = "f_listar_claves_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_numero", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_universidad", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_anio", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_area", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_semestre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_eliminar_clave_biblioteca", procedureName = "f_eliminar_clave_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idclave", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
})
public class ClaveBiblioteca {

	@Id
	@Column(name="idclave")
	private int idclave;
	@Column(name="idsemestre")
	private int idsemestre;
	@Column(name="nombre_clave")
	private String nombre_clave;
	@Column(name="url_clave")
	private String url_clave;
	@Column(name="url_clase_relacionada")
	private String url_clase_relacionada;
	@Column(name="idarea")
	private int idarea;
	@Column(name="estado")
	private int estado;
	
	public ClaveBiblioteca() {
		super();
	}

	public ClaveBiblioteca(int idclave, int idsemestre, String nombre_clave, String url_clave,
			String url_clase_relacionada, int idarea, int estado) {
		super();
		this.idclave = idclave;
		this.idsemestre = idsemestre;
		this.nombre_clave = nombre_clave;
		this.url_clave = url_clave;
		this.url_clase_relacionada = url_clase_relacionada;
		this.idarea = idarea;
		this.estado = estado;
	}

	public int getIdclave() {
		return idclave;
	}

	public void setIdclave(int idclave) {
		this.idclave = idclave;
	}

	public int getIdsemestre() {
		return idsemestre;
	}

	public void setIdsemestre(int idsemestre) {
		this.idsemestre = idsemestre;
	}

	public String getNombre_clave() {
		return nombre_clave;
	}

	public void setNombre_clave(String nombre_clave) {
		this.nombre_clave = nombre_clave;
	}

	public String getUrl_clave() {
		return url_clave;
	}

	public void setUrl_clave(String url_clave) {
		this.url_clave = url_clave;
	}

	public String getUrl_clase_relacionada() {
		return url_clase_relacionada;
	}

	public void setUrl_clase_relacionada(String url_clase_relacionada) {
		this.url_clase_relacionada = url_clase_relacionada;
	}

	public int getIdarea() {
		return idarea;
	}

	public void setIdarea(int idarea) {
		this.idarea = idarea;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	
	
	
}
