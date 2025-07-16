package com.rosettcompany.grupoCiencia.repository;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalle_area_curso")

public class DetalleAreaCurso {
	
	@Id
	@Column(name="iddetalle")
	private int iddetalle;


	@Column(name="idcurso")
	private int idcurso;
	
	
	@Column(name="idarea")
	private int idarea;
	
	@Column(name="cantidad_preguntas")
	private int cantidad_preguntas;

	public DetalleAreaCurso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetalleAreaCurso(int iddetalle, int idcurso, int idarea, int cantidad_preguntas) {
		super();
		this.iddetalle = iddetalle;
		this.idcurso = idcurso;
		this.idarea = idarea;
		this.cantidad_preguntas = cantidad_preguntas;
	}

	public int getIddetalle() {
		return iddetalle;
	}

	public void setIddetalle(int iddetalle) {
		this.iddetalle = iddetalle;
	}

	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public int getIdarea() {
		return idarea;
	}

	public void setIdarea(int idarea) {
		this.idarea = idarea;
	}

	public int getCantidad_preguntas() {
		return cantidad_preguntas;
	}

	public void setCantidad_preguntas(int cantidad_preguntas) {
		this.cantidad_preguntas = cantidad_preguntas;
	}

	
	
}
