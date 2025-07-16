package com.rosettcompany.grupoCiencia.repository;

public class ExamenEstudiante {

	private int idestudiante;
	private int idexamen;
	
	public ExamenEstudiante() {
		super();
	}

	public ExamenEstudiante(int idestudiante, int idexamen) {
		super();
		this.idestudiante = idestudiante;
		this.idexamen = idexamen;
	}

	public int getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(int idestudiante) {
		this.idestudiante = idestudiante;
	}

	public int getIdexamen() {
		return idexamen;
	}

	public void setIdexamen(int idexamen) {
		this.idexamen = idexamen;
	}
	
}
