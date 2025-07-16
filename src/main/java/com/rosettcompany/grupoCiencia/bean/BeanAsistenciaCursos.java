package com.rosettcompany.grupoCiencia.bean;


import java.sql.Date;

public class BeanAsistenciaCursos {

	private int idciclo;
	private Date fecha;
	private int idcurso;
	

	
	public BeanAsistenciaCursos(int idciclo, Date fecha, int idcurso) {
		super();
		this.idciclo = idciclo;
		this.fecha = fecha;
		this.idcurso = idcurso;
	}
	public int getIdciclo() {
		return idciclo;
	}
	public void setIdciclo(int idciclo) {
		this.idciclo = idciclo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getIdcurso() {
		return idcurso;
	}
	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}
	
	
}
