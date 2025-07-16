package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="anios")
public class Anio {

	
	@Id
	@Column(name="idanio")
	private int idanio;
	@Column(name="anio")
	private String anio;
	@Column(name="fecha_creacion")
	private Date fecha_creacion;
	@Column(name="estado")
	private int estado;
	
	public Anio() {
		super();
	}
	public Anio(int idanio, String anio, Date fecha_creacion) {
		super();
		this.idanio = idanio;
		this.anio = anio;
		this.fecha_creacion = fecha_creacion;
	}
	
	public Anio(int idanio, String anio, Date fecha_creacion, int estado) {
		super();
		this.idanio = idanio;
		this.anio = anio;
		this.fecha_creacion = fecha_creacion;
		this.estado = estado;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getIdanio() {
		return idanio;
	}
	public void setIdanio(int idanio) {
		this.idanio = idanio;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	
	
	
}
