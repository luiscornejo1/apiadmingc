package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.DetalleCicloSedeModalidad;
import com.rosettcompany.grupoCiencia.repository.Anio;
import com.rosettcompany.grupoCiencia.repositoryI.AnioRepositoryI;
import com.rosettcompany.grupoCiencia.repositoryI.ModalidadRepositoryI;

@Service
public class ModalidadServicio {

	@Autowired
	private ModalidadRepositoryI modalidadRepository;

	public String f_listar_modalidad() {
		return modalidadRepository.f_listar_modalidad();
	}

	public String f_buscar_modalidad_sede_ciclo(DetalleCicloSedeModalidad det) {
		return modalidadRepository.f_buscar_modalidad_sede_ciclo(det.getIdciclonormalizado());
	}
}
