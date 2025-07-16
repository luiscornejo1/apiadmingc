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
@Table(name="semestre")
@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery (name = "f_listar_semestres_anio", procedureName = "f_listar_semestres_anio", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_anio", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_listar_semestre_biblioteca", procedureName = "funcion_listar_semestre_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idanio", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),	

		
		
					
})
public class Semestre {
	
	@Id
	@Column(name="idsemestre")
	private int idsemestre;
	
	@Column(name="idanio")
	private int idanio;
	
	@Column(name="nombre_semestre")
	private String nombre_semestre;

	public Semestre() {
		// TODO Auto-generated constructor stub
	}

	public Semestre(int idsemestre, int idanio, String nombre_semestre) {
		super();
		this.idsemestre = idsemestre;
		this.idanio = idanio;
		this.nombre_semestre = nombre_semestre;
	}

	public int getIdsemestre() {
		return idsemestre;
	}

	public void setIdsemestre(int idsemestre) {
		this.idsemestre = idsemestre;
	}

	public int getIdanio() {
		return idanio;
	}

	public void setIdanio(int idanio) {
		this.idanio = idanio;
	}

	public String getNombre_semestre() {
		return nombre_semestre;
	}

	public void setNombre_semestre(String nombre_semestre) {
		this.nombre_semestre = nombre_semestre;
	}
	
	

}
