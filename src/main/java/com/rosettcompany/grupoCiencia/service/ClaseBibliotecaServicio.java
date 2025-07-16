package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.filtroBibliotecaBean;
import com.rosettcompany.grupoCiencia.repository.ClaseBiblioteca;
import com.rosettcompany.grupoCiencia.repositoryI.ClaseBibliotecaRepositoryI;


@Service
public class ClaseBibliotecaServicio {

	@Autowired
	private ClaseBibliotecaRepositoryI claseBiblioteca;
	
	public String listarClasesBiblioteca(ClaseBiblioteca clase) {
		
		return claseBiblioteca.listarClasesBiblioteca(clase.getIdtema());
	}
	
	public String guardarClaseBiblioteca(ClaseBiblioteca clases) {
		
		return claseBiblioteca.guardarClasesBiblioteca(clases.getUrl_clase());
	}
	
	public String listarClasesBibliotecaAdmin(filtroBibliotecaBean clase) {
		return claseBiblioteca.listarClasesBibliotecaAdmin(
				clase.getNumero(),
				clase.getUniversidad(),
				clase.getCurso(),
				clase.getTema());
	}
	
	public String eliminarClasesBiblioteca(int idclase) {
		return claseBiblioteca.eliminarClasesBiblioteca(idclase);
		 
	}
	
	public void editarClaseBiblioteca(ClaseBiblioteca clase) {
		claseBiblioteca.save(clase);
	}
}
