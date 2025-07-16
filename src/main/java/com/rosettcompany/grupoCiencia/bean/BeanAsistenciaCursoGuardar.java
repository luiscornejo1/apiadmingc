package com.rosettcompany.grupoCiencia.bean;



public class BeanAsistenciaCursoGuardar {
	
	private int idasistencia;
	private int idcurso;
	private int dia;
	private String fecha;
	private int estado;
	private int idciclo;
	
	public BeanAsistenciaCursoGuardar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeanAsistenciaCursoGuardar(int idasistencia, int idcurso, int dia, String fecha, int estado, int idciclo) {
		super();
		this.idasistencia = idasistencia;
		this.idcurso = idcurso;
		this.dia = dia;
		this.fecha = fecha;
		this.estado = estado;
		this.idciclo = idciclo;
	}

	public int getIdasistencia() {
		return idasistencia;
	}

	public void setIdasistencia(int idasistencia) {
		this.idasistencia = idasistencia;
	}

	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getIdciclo() {
		return idciclo;
	}

	public void setIdciclo(int idciclo) {
		this.idciclo = idciclo;
	}



	

}
