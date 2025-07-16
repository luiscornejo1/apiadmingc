package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detalle_pregunta")
public class DetallePregunta {

	@Id
	@Column(name="idpregunta")
	private int idpregunta;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="alternativa")
	private String alternativa;
	@Column(name="estado")
	private int estado;
	@Column(name="detalle_observacion")
	private String detalle_observacion;
	
	@Column(name="idcabecerapregunta")
	private int cabecerapregunta;
	
	public DetallePregunta() {
		super();
	}

	public DetallePregunta(int idpregunta, int cabecerapregunta, String descripcion, String alternativa, int estado,
			String detalle_observacion) {
		super();
		this.idpregunta = idpregunta;
		this.cabecerapregunta = cabecerapregunta;
		this.descripcion = descripcion;
		this.alternativa = alternativa;
		this.estado = estado;
		this.detalle_observacion = detalle_observacion;
	}

	public int getIdpregunta() {
		return idpregunta;
	}

	public void setIdpregunta(int idpregunta) {
		this.idpregunta = idpregunta;
	}

	public int getCabecerapregunta() {
		return cabecerapregunta;
	}

	public void setCabecerapregunta(int cabecerapregunta) {
		this.cabecerapregunta = cabecerapregunta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getAlternativa() {
		return alternativa;
	}

	public void setAlternativa(String alternativa) {
		this.alternativa = alternativa;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getDetalle_observacion() {
		return detalle_observacion;
	}

	public void setDetalle_observacion(String detalle_observacion) {
		this.detalle_observacion = detalle_observacion;
	}
	
}
