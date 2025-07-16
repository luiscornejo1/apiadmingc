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
@Table(name="escaneo_biblioteca")

@NamedStoredProcedureQueries(value = {
		@NamedStoredProcedureQuery(name = "funcion_listar_escaneos_biblioteca", procedureName = "funcion_listar_escaneos_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idanio", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),	
		
		@NamedStoredProcedureQuery(name = "f_registrar_escaneo_biblioteca", procedureName = "f_registrar_escaneo_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_escaneos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_escaneos_biblioteca", procedureName = "f_listar_escaneos_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_numero", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_universidad", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_anio", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_area", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_semestre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_eliminar_escaneo_biblioteca", procedureName = "f_eliminar_escaneo_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idescaneo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		
})
public class EscaneoBiblioteca {

	@Id
	@Column(name="idescaneo")
	private int idescaneo;
	@Column(name="idarea")
	private int idarea;
	@Column(name="idsemestre")
	private int idsemestre;
	@Column(name="nombre_escaneo")
	private String nombre_escaneo;
	@Column(name="url_escaneo")
	private String url_escaneo;
	@Column(name="url_clase_relacionada")
	private String url_clase_relacionada;
	@Column(name="estado")
	private int estado;
	
	public EscaneoBiblioteca() {
		super();
	}

	public EscaneoBiblioteca(int idescaneo, int idarea, int idsemestre, String nombre_escaneo, String url_escaneo,
			String url_clase_relacionada, int estado) {
		super();
		this.idescaneo = idescaneo;
		this.idarea = idarea;
		this.idsemestre = idsemestre;
		this.nombre_escaneo = nombre_escaneo;
		this.url_escaneo = url_escaneo;
		this.url_clase_relacionada = url_clase_relacionada;
		this.estado = estado;
	}

	public int getIdescaneo() {
		return idescaneo;
	}

	public void setIdescaneo(int idescaneo) {
		this.idescaneo = idescaneo;
	}

	public int getIdarea() {
		return idarea;
	}

	public void setIdarea(int idarea) {
		this.idarea = idarea;
	}

	public int getIdsemestre() {
		return idsemestre;
	}

	public void setIdsemestre(int idsemestre) {
		this.idsemestre = idsemestre;
	}

	public String getNombre_escaneo() {
		return nombre_escaneo;
	}

	public void setNombre_escaneo(String nombre_escaneo) {
		this.nombre_escaneo = nombre_escaneo;
	}

	public String getUrl_escaneo() {
		return url_escaneo;
	}

	public void setUrl_escaneo(String url_escaneo) {
		this.url_escaneo = url_escaneo;
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
