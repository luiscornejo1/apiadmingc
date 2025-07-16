package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.beanAdmisionBiblioteca;
import com.rosettcompany.grupoCiencia.bean.filtroBibliotecaBean;
import com.rosettcompany.grupoCiencia.repository.ProspectoBiblioteca;
import com.rosettcompany.grupoCiencia.repository.Universidad;
import com.rosettcompany.grupoCiencia.repositoryI.ProspectoBibliotecaRepositoryI;

@Service
public class ProspectoBibliotecaServicio {

	@Autowired
	private ProspectoBibliotecaRepositoryI prospectoRepository;
	
	public String listarProspectosBiblioteca(beanAdmisionBiblioteca admision) {
		
		return prospectoRepository.listarProspectosBiblioteca(admision.getIduniversidad(),admision.getIdanio());
	}
	
	public String insertarProspectosBiblioteca(ProspectoBiblioteca pros) {
		return prospectoRepository.insertarProspectosBiblioteca(pros.getNombre_prospecto());
	}
	
	
	public String listarProspectosBibliotecaAdmin(filtroBibliotecaBean bean) {
		return prospectoRepository.listarProspectosBibliotecaAdmin(
				bean.getNumero(), 
				bean.getUniversidad(),
				bean.getCurso(),
				bean.getTema(),
				bean.getSemestre());
	}
	
	public String eliminarProspectoBiblioteca(int idprospecto) {
		return prospectoRepository.eliminarProspectosBiblioteca(idprospecto);
	}
	
	public void editarProspectoBiblioteca(ProspectoBiblioteca pro) {
		prospectoRepository.save(pro);
	}
}
