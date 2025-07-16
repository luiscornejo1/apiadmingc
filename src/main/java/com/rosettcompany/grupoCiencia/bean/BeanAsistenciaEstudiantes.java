package com.rosettcompany.grupoCiencia.bean;

public class BeanAsistenciaEstudiantes {

	private int idasistencia;
	private String lista_estudiantes;
	
	public BeanAsistenciaEstudiantes(int idasistencia, String lista_estudiantes) {
		super();
		this.idasistencia = idasistencia;
		this.lista_estudiantes = lista_estudiantes;
	}

	public int getIdasistencia() {
		return idasistencia;
	}

	public void setIdasistencia(int idasistencia) {
		this.idasistencia = idasistencia;
	}

	public String getLista_estudiantes() {
		return lista_estudiantes;
	}

	public void setLista_estudiantes(String lista_estudiantes) {
		this.lista_estudiantes = lista_estudiantes;
	}
	
	
}
