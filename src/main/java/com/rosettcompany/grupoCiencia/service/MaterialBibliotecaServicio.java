package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.filtroBibliotecaBean;
import com.rosettcompany.grupoCiencia.repository.MaterialBiblioteca;
import com.rosettcompany.grupoCiencia.repositoryI.MaterialBibliotecaRepositoryI;

@Service
public class MaterialBibliotecaServicio {

	@Autowired
	private MaterialBibliotecaRepositoryI materialBiblioteca;
	
	public String listarTemasBiblioteca(MaterialBiblioteca material) {
		
		return materialBiblioteca.listarMaterialBiblioteca(material.getIdtema());
	}
	
	public String listarMaterialesBiblioteca(filtroBibliotecaBean bean) {
		return materialBiblioteca.listarMaterialBibliotecaAdmin(
				bean.getNumero(),
				bean.getUniversidad(),
				bean.getCurso(),
				bean.getTema()
				);
	}
	
	public String insertarMaterialesBiblioteca(MaterialBiblioteca materiales) {
		return materialBiblioteca.insertarMaterialesBibliotecas(materiales.getNombre_material());
	}
	
	public void editarMaterialBiblioteca(MaterialBiblioteca material) {
		materialBiblioteca.save(material);
	}
	
	public String eliminarMaterialBiblioteca(int idmaterial) {
		return materialBiblioteca.eliminarMaterialesBibliotecas(idmaterial);
	}
	
}
