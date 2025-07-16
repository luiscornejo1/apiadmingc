package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="asignacion_precios")

public class AsignacionPreciosEntity {

	@Id
	@Column(name = "idciclo")
	public int idciclo;
	
	@Column(name = "idprecios")
	public int idprecios;
	
	@Column(name = "estado")
	public int estado;


	public AsignacionPreciosEntity() {
		super();
	}


	public AsignacionPreciosEntity(int idciclo, int idprecios, int estado) {
		super();
		this.idciclo = idciclo;
		this.idprecios = idprecios;
		this.estado = estado;
	}


	public int getIdciclo() {
		return idciclo;
	}


	public void setIdciclo(int idciclo) {
		this.idciclo = idciclo;
	}


	public int getIdprecios() {
		return idprecios;
	}


	public void setIdprecios(int idprecios) {
		this.idprecios = idprecios;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}
}
