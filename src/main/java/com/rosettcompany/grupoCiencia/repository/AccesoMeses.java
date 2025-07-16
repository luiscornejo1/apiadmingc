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
@Table(name="acceso_meses")

@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery(name = "insertar_acceso_meses", procedureName = "f_insertar_acceso_meses", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmes", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idestudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		
					
})

public class AccesoMeses {
	
	@Id
	@Column(name="idmes")
	private int idmes;
	
	@Column(name="idestudiante")
	private int idestudiante;
	
	@Column(name="estado")
	private int estado;

	public AccesoMeses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccesoMeses(int idmes, int idestudiante, int estado) {
		super();
		this.idmes = idmes;
		this.idestudiante = idestudiante;
		this.estado = estado;
	}

	public int getIdmes() {
		return idmes;
	}

	public void setIdmes(int idmes) {
		this.idmes = idmes;
	}

	public int getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(int idestudiante) {
		this.idestudiante = idestudiante;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	

}
