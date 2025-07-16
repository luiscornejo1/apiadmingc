package com.rosettcompany.grupoCiencia.bean;

import com.rosettcompany.grupoCiencia.repository.Apoderado;
import com.rosettcompany.grupoCiencia.repository.Estudiante;

public class EstudianteApoderado {
	
	private Estudiante estudiante;
	
	private Apoderado apoderado;

	public EstudianteApoderado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EstudianteApoderado(Estudiante estudiante, Apoderado apoderado) {
		super();
		this.estudiante = estudiante;
		this.apoderado = apoderado;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Apoderado getApoderado() {
		return apoderado;
	}

	public void setApoderado(Apoderado apoderado) {
		this.apoderado = apoderado;
	}
	
	

}
