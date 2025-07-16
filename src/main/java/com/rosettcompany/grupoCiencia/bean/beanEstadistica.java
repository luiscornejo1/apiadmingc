package com.rosettcompany.grupoCiencia.bean;

public class beanEstadistica {

	private int idestadistica;
	private int iduniversidad;
	private int idsemestre;
	private String nombre_estadistica;
	private String detalle_estadistica;
	
	public beanEstadistica() {
		super();
	}
	
	public beanEstadistica(int idestadistica, int iduniversidad, int idsemestre, String nombre_estadistica,
			String detalle_estadistica) {
		super();
		this.idestadistica = idestadistica;
		this.iduniversidad = iduniversidad;
		this.idsemestre = idsemestre;
		this.nombre_estadistica = nombre_estadistica;
		this.detalle_estadistica = detalle_estadistica;
	}

	public int getIdestadistica() {
		return idestadistica;
	}

	public void setIdestadistica(int idestadistica) {
		this.idestadistica = idestadistica;
	}

	public int getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(int iduniversidad) {
		this.iduniversidad = iduniversidad;
	}

	public int getIdsemestre() {
		return idsemestre;
	}

	public void setIdsemestre(int idsemestre) {
		this.idsemestre = idsemestre;
	}

	public String getNombre_estadistica() {
		return nombre_estadistica;
	}

	public void setNombre_estadistica(String nombre_estadistica) {
		this.nombre_estadistica = nombre_estadistica;
	}

	public String getDetalle_estadistica() {
		return detalle_estadistica;
	}

	public void setDetalle_estadistica(String detalle_estadistica) {
		this.detalle_estadistica = detalle_estadistica;
	}
	
	
}
