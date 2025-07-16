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
@Table(name="asignacion_aulas")

public class AsignacionAulasEntity {

	@Id
	@Column(name = "idciclonormalizado")
	public int idciclonormalizado;
	
	@Column(name = "idsede")
	public int idsede;
	
	@Column(name = "idmodalidad")
	public int idmodalidad;
	
	@Column(name = "idaula")
	public int idaula;
	
	@Column(name = "numero_aula")
	public int numero_aula;
	
	@Column(name = "capacidad")
	public int capacidad;
	
	@Column(name = "estado")
	public int estado;
	
	@Column(name = "idasignacionaula")
	public int idasignacionaula;


	public AsignacionAulasEntity() {
		super();
	}


	public AsignacionAulasEntity(int idciclonormalizado, int idsede, int idmodalidad, int idaula, int numero_aula,
			int capacidad, int estado, int idasignacionaula) {
		super();
		this.idciclonormalizado = idciclonormalizado;
		this.idsede = idsede;
		this.idmodalidad = idmodalidad;
		this.idaula = idaula;
		this.numero_aula = numero_aula;
		this.capacidad = capacidad;
		this.estado = estado;
		this.idasignacionaula = idasignacionaula;
	}

	public int getIdasignacionaula() {
		return idasignacionaula;
	}

	public void setIdasignacionaula(int idasignacionaula) {
		this.idasignacionaula = idasignacionaula;
	}


	public int getIdciclonormalizado() {
		return idciclonormalizado;
	}


	public void setIdciclonormalizado(int idciclonormalizado) {
		this.idciclonormalizado = idciclonormalizado;
	}


	public int getIdsede() {
		return idsede;
	}


	public void setIdsede(int idsede) {
		this.idsede = idsede;
	}


	public int getIdmodalidad() {
		return idmodalidad;
	}


	public void setIdmodalidad(int idmodalidad) {
		this.idmodalidad = idmodalidad;
	}


	public int getIdaula() {
		return idaula;
	}


	public void setIdaula(int idaula) {
		this.idaula = idaula;
	}


	public int getNumero_aula() {
		return numero_aula;
	}


	public void setNumero_aula(int numero_aula) {
		this.numero_aula = numero_aula;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}

}
