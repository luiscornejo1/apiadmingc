package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.beanAdmisionBiblioteca;
import com.rosettcompany.grupoCiencia.bean.filtroBibliotecaBean;
import com.rosettcompany.grupoCiencia.repository.AreasCarrera;
import com.rosettcompany.grupoCiencia.repository.EscaneoBiblioteca;
import com.rosettcompany.grupoCiencia.repositoryI.EscaneoBibliotecaRepositoryI;

@Service
public class EscaneoBibliotecaServicio {

	@Autowired
	private EscaneoBibliotecaRepositoryI escaneoRepository;
	
	public String listarEscaneosBiblioteca(beanAdmisionBiblioteca admision) {
		
		return escaneoRepository.listarEscaneosBiblioteca(admision.getIduniversidad(),admision.getIdanio());
	}
	
	public String insertarEscaneosBiblioteca(EscaneoBiblioteca escan) {
		return escaneoRepository.insertarEscaneosBiblioteca(escan.getNombre_escaneo());
	}
	
	public String listarEscaneosBibliotecaAdmin(filtroBibliotecaBean bean) {
		return escaneoRepository.listarEscaneosBibliotecaAdmin(
				bean.getNumero(), 
				bean.getUniversidad(),
				bean.getCurso(),
				bean.getTema(),
				bean.getSemestre());
	}
	
	public String eliminarEscaneoBiblioteca(int idescaneo) {
		return escaneoRepository.eliminarEscaneosBiblioteca(idescaneo);
	}
	
	public void editarEscaneoBiblioteca(EscaneoBiblioteca escan) {
		escaneoRepository.save(escan);
	}
}
