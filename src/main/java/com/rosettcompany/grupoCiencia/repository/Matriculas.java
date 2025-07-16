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
@Table(name = "matriculas")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_insertar_matricula", procedureName = "f_insertar_matricula", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmodalidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsede", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dniestudiante", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_descripcion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_matricula", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

})

public class Matriculas {

	@Id
	@Column(name = "idmatricula")
	public int idmatricula;

	@Column(name = "idciclonormalizado")
	public int idciclonormalizado;

	@Column(name = "idciclo")
	public int idciclo;

	@Column(name = "iduniversidad")
	public int iduniversidad;

	@Column(name = "idmodalidad")
	public int idmodalidad;

	@Column(name = "idsede")
	public int idsede;

	@Column(name = "dniestudiante")
	public String dniestudiante;

	@Column(name = "descripcion")
	public String descripcion;

	@Column(name = "fecha_matricula")
	public Date fecha_matricula;

	@Column(name = "estado")
	public int estado;

	public Matriculas() {
		super();
	}

	public Matriculas(int idmatricula, int idciclonormalizado, int idciclo, int iduniversidad, int idmodalidad,
			int idsede, String dniestudiante, String descripcion, Date fecha_matricula, int estado) {
		super();
		this.idmatricula = idmatricula;
		this.idciclonormalizado = idciclonormalizado;
		this.idciclo = idciclo;
		this.iduniversidad = iduniversidad;
		this.idmodalidad = idmodalidad;
		this.idsede = idsede;
		this.dniestudiante = dniestudiante;
		this.descripcion = descripcion;
		this.fecha_matricula = fecha_matricula;
		this.estado = estado;
	}

	public int getIdmatricula() {
		return idmatricula;
	}

	public void setIdmatricula(int idmatricula) {
		this.idmatricula = idmatricula;
	}

	public int getIdciclonormalizado() {
		return idciclonormalizado;
	}

	public void setIdciclonormalizado(int idciclonormalizado) {
		this.idciclonormalizado = idciclonormalizado;
	}

	public int getIdciclo() {
		return idciclo;
	}

	public void setIdciclo(int idciclo) {
		this.idciclo = idciclo;
	}

	public int getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(int iduniversidad) {
		this.iduniversidad = iduniversidad;
	}

	public int getIdmodalidad() {
		return idmodalidad;
	}

	public void setIdmodalidad(int idmodalidad) {
		this.idmodalidad = idmodalidad;
	}

	public int getIdsede() {
		return idsede;
	}

	public void setIdsede(int idsede) {
		this.idsede = idsede;
	}

	public String getDniestudiante() {
		return dniestudiante;
	}

	public void setDniestudiante(String dniestudiante) {
		this.dniestudiante = dniestudiante;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha_matricula() {
		return fecha_matricula;
	}

	public void setFecha_matricula(Date fecha_matricula) {
		this.fecha_matricula = fecha_matricula;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}