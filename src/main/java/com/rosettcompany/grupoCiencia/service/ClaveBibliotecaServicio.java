package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.ClaveBiblioteca;
import com.rosettcompany.grupoCiencia.bean.beanAdmisionBiblioteca;
import com.rosettcompany.grupoCiencia.bean.filtroBibliotecaBean;
import com.rosettcompany.grupoCiencia.repository.AreasCarrera;
import com.rosettcompany.grupoCiencia.repositoryI.ClaveBibliotecaRepositoryI;

@Service
public class ClaveBibliotecaServicio {

	@Autowired
	private ClaveBibliotecaRepositoryI claveRepository;
	
	public String listarClavesBiblioteca(beanAdmisionBiblioteca admision) {
		
		return claveRepository.listarClavesBiblioteca(admision.getIduniversidad(),admision.getIdanio());
	}
	
	public String insertarClavesBiblioteca(ClaveBiblioteca clave) {
		return claveRepository.insertarClavesBiblioteca(clave.getNombre_clave());
	}
	
	public void editarClaveBiblioteca(ClaveBiblioteca clave) {
		claveRepository.save(clave);
	}
	
	public String listarClavesBibliotecaAdmin(filtroBibliotecaBean bean) {
		return claveRepository.listarClavesBibliotecaAdmin(
				bean.getNumero(),
				bean.getUniversidad(),
				bean.getCurso(),
				bean.getTema(),
				bean.getSemestre());
	}
	
	public String eliminarClaveBiblioteca(int id) {
		return claveRepository.eliminarClavesBiblioteca(id);
	}
}
