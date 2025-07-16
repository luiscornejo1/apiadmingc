package com.rosettcompany.grupoCiencia.bean;

import java.sql.Date;

public class beanReporte {

	private int idestudiante;
	private int idciclo;
	private Date fecha_inicio;
	private Date fecha_fin;
	private int minimo;
	private int maximo;
	
	public beanReporte() {
		super();
	}



	public beanReporte(int idestudiante, int idciclo, Date fecha_inicio, Date fecha_fin, int minimo, int maximo) {
		super();
		this.idestudiante = idestudiante;
		this.idciclo = idciclo;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.minimo = minimo;
		this.maximo = maximo;
	}



	public int getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(int idestudiante) {
		this.idestudiante = idestudiante;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public int getIdciclo() {
		return idciclo;
	}

	public void setIdciclo(int idciclo) {
		this.idciclo = idciclo;
	}



	public int getMinimo() {
		return minimo;
	}



	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}



	public int getMaximo() {
		return maximo;
	}



	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}
	
	
}
