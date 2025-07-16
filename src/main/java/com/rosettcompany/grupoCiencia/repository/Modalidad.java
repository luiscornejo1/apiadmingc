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
@Table(name = "modalidad")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_buscar_modalidad_sede_ciclo", procedureName = "f_buscar_modalidad_sede_ciclo", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
})

public class Modalidad {
	@Id
	@Column(name = "idmodalidad")
	private int idmodalidad;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "estado")
	private int estado;

	public Modalidad(int idmodalidad, String nombre, int estado) {
		super();
		this.idmodalidad = idmodalidad;
		this.nombre = nombre;
		this.estado = estado;
	}

	public Modalidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdmodalidad() {
		return idmodalidad;
	}

	public void setIdmodalidad(int idmodalidad) {
		this.idmodalidad = idmodalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
