package com.rosettcompany.grupoCiencia.bean;

public class beanAdmisionBiblioteca {

	private int idarea;
	private int idanio;
	private int iduniversidad;
	private int idcurso;
	private int idsemestre;
	
	private String t_idanio;
	private String t_iduniversidad;
	private String t_idsemestre;
	
	public beanAdmisionBiblioteca() {
		super();
	}

	public beanAdmisionBiblioteca(int idarea, int idanio, int iduniversidad, int idcurso, int idsemestre,
			String t_idanio, String t_iduniversidad, String t_idsemestre) {
		super();
		this.idarea = idarea;
		this.idanio = idanio;
		this.iduniversidad = iduniversidad;
		this.idcurso = idcurso;
		this.idsemestre = idsemestre;
		this.t_idanio = t_idanio;
		this.t_iduniversidad = t_iduniversidad;
		this.t_idsemestre = t_idsemestre;
	}

	public int getIdarea() {
		return idarea;
	}
	public void setIdarea(int idarea) {
		this.idarea = idarea;
	}
	public int getIdanio() {
		return idanio;
	}
	public void setIdanio(int idanio) {
		this.idanio = idanio;
	}

	public int getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(int iduniversidad) {
		this.iduniversidad = iduniversidad;
	}

	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public int getIdsemestre() {
		return idsemestre;
	}

	public void setIdsemestre(int idsemestre) {
		this.idsemestre = idsemestre;
	}

	public String getT_idanio() {
		return t_idanio;
	}

	public void setT_idanio(String t_idanio) {
		this.t_idanio = t_idanio;
	}

	public String getT_iduniversidad() {
		return t_iduniversidad;
	}

	public void setT_iduniversidad(String t_iduniversidad) {
		this.t_iduniversidad = t_iduniversidad;
	}

	public String getT_idsemestre() {
		return t_idsemestre;
	}

	public void setT_idsemestre(String t_idsemestre) {
		this.t_idsemestre = t_idsemestre;
	}
	
	
}
