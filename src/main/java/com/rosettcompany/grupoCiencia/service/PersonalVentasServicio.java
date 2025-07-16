package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.PersonalVentas;
import com.rosettcompany.grupoCiencia.repositoryI.PersonalVentasRepositoryI;

@Service
public class PersonalVentasServicio {

	@Autowired
	private PersonalVentasRepositoryI personalVentasRepository;
	
	public String f_listar_personal_ventas() {
		return personalVentasRepository.f_listar_personal_ventas();
	}
	
	public String f_buscar_personal_ventas_cod(PersonalVentas personal) {
		return personalVentasRepository.f_buscar_personal_ventas_cod(personal.getCodigo());
	}
}
