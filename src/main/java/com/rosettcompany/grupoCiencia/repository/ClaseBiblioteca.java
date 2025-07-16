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
@Table(name="clase_biblioteca")

@NamedStoredProcedureQueries(value = {
		@NamedStoredProcedureQuery(name = "funcion_listar_clases_biblioteca", procedureName = "funcion_listar_clases_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idtema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),	
		
		@NamedStoredProcedureQuery(name = "f_registrar_clase_biblioteca", procedureName = "f_registrar_clase_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_clases", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_eliminar_clase_biblioteca", procedureName = "f_eliminar_clase_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idclase", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_clases_biblioteca", procedureName = "f_listar_clases_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_universidad", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_curso", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_tema", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
})
public class ClaseBiblioteca {

	@Id
	@Column(name="idclase")
	private int idclase;
	@Column(name="url_clase")
	private String url_clase;
	@Column(name="idtema")
	private int idtema;
	
	public ClaseBiblioteca() {
		super();
	}

	public ClaseBiblioteca(int idclase, String url_clase, int idtema) {
		super();
		this.idclase = idclase;
		this.url_clase = url_clase;
		this.idtema = idtema;
	}

	public int getIdclase() {
		return idclase;
	}

	public void setIdclase(int idclase) {
		this.idclase = idclase;
	}

	public String getUrl_clase() {
		return url_clase;
	}

	public void setUrl_clase(String url_clase) {
		this.url_clase = url_clase;
	}

	public int getIdtema() {
		return idtema;
	}

	public void setIdtema(int idtema) {
		this.idtema = idtema;
	}
	
	
	
}
