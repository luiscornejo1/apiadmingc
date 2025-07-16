package com.rosettcompany.grupoCiencia.bean;

public class filtroBibliotecaBean {
	
	private int numero;
	private String universidad;
	private String curso;
	private String tema;
	private String semestre;
	
	

	public filtroBibliotecaBean() {
		super();
	}



	public filtroBibliotecaBean(int numero, String universidad, String curso, String tema, String semestre) {
		super();
		this.numero = numero;
		this.universidad = universidad;
		this.curso = curso;
		this.tema = tema;
		this.semestre = semestre;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getUniversidad() {
		return universidad;
	}



	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public String getTema() {
		return tema;
	}



	public void setTema(String tema) {
		this.tema = tema;
	}



	public String getSemestre() {
		return semestre;
	}



	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	
	

}
