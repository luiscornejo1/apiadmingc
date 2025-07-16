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
@Table(name="solucionario_biblioteca")

@NamedStoredProcedureQueries(value = {
		@NamedStoredProcedureQuery(name = "funcion_listar_solucionarios_biblioteca", procedureName = "funcion_listar_solucionarios_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idanio", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_solucionarios_biblioteca", procedureName = "f_listar_solucionarios_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_numero", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_universidad", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_anio", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_semestre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_eliminar_solucionario_biblioteca", procedureName = "f_eliminar_solucionario_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsolucionario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_registrar_solucionario_biblioteca", procedureName = "f_registrar_solucionario_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_solucionarios", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
})
public class SolucionarioBiblioteca {

	@Id
	@Column(name="idsolucionario")
	private int idsolucionario;
	@Column(name="idsemestre")
	private int idsemestre;
	@Column(name="iduniversidad")
	private int iduniversidad;
	@Column(name="nombre_solucionario")
	private String nombre_solucionario;
	@Column(name="url_solucionario")
	private String url_solucionario;
	@Column(name="estado")
	private int estado;
	
	public SolucionarioBiblioteca() {
		super();
	}

	public SolucionarioBiblioteca(int idsolucionario, int idsemestre, int iduniversidad, String nombre_solucionario,
			String url_solucionario, int estado) {
		super();
		this.idsolucionario = idsolucionario;
		this.idsemestre = idsemestre;
		this.iduniversidad = iduniversidad;
		this.nombre_solucionario = nombre_solucionario;
		this.url_solucionario = url_solucionario;
		this.estado = estado;
	}

	public int getIdsolucionario() {
		return idsolucionario;
	}

	public void setIdsolucionario(int idsolucionario) {
		this.idsolucionario = idsolucionario;
	}

	public int getIdsemestre() {
		return idsemestre;
	}

	public void setIdsemestre(int idsemestre) {
		this.idsemestre = idsemestre;
	}

	public int getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(int iduniversidad) {
		this.iduniversidad = iduniversidad;
	}

	public String getNombre_solucionario() {
		return nombre_solucionario;
	}

	public void setNombre_solucionario(String nombre_solucionario) {
		this.nombre_solucionario = nombre_solucionario;
	}

	public String getUrl_solucionario() {
		return url_solucionario;
	}

	public void setUrl_solucionario(String url_solucionario) {
		this.url_solucionario = url_solucionario;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
}
