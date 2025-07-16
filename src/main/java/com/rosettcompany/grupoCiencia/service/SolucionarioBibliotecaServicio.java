package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.beanAdmisionBiblioteca;
import com.rosettcompany.grupoCiencia.bean.filtroBibliotecaBean;
import com.rosettcompany.grupoCiencia.repository.SolucionarioBiblioteca;
import com.rosettcompany.grupoCiencia.repository.Universidad;
import com.rosettcompany.grupoCiencia.repositoryI.SolucionarioBibliotecaRepositoryI;

@Service
public class SolucionarioBibliotecaServicio {

	@Autowired
	private SolucionarioBibliotecaRepositoryI solucionarioRepository;
	
	public String listarSolucionariosBiblioteca(beanAdmisionBiblioteca admision) {
		
		return solucionarioRepository.listarSolucionariosBiblioteca(admision.getIduniversidad(),admision.getIdanio());
	}
	
	public String listarSolucionariosBibliotecaAdmin(filtroBibliotecaBean bean) {
		return solucionarioRepository.listarSolucionariosBibliotecaAdmin(
				bean.getNumero(),
				bean.getUniversidad(),
				bean.getCurso(),
				bean.getTema());
	}
	
	public String eliminarSolucionarioBiblioteca(int idsolucionario) {
		return solucionarioRepository.eliminarSolucionarioBiblioteca(idsolucionario);
	}
	
	public String insertarSolucionariosBiblioteca(SolucionarioBiblioteca sol) {
		return solucionarioRepository.insertarSolucionarioBiblioteca(sol.getUrl_solucionario());
	}
	
	public void editarSolucionarioBiblioteca(SolucionarioBiblioteca sol) {
		solucionarioRepository.save(sol);
	}
}
