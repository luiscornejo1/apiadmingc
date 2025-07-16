package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.PreciosEntity;
import com.rosettcompany.grupoCiencia.repositoryI.PreciosRepositoryI;

@Service
public class PreciosServiceImpl{
	
	@Autowired
	private PreciosRepositoryI iPreciosRepository;
	
	public String f_filtrar_precio_ciclo(PreciosEntity precio) {
		return iPreciosRepository.f_filtrar_precio_ciclo(precio.getIduniversidad(),precio.getIdciclonormalizado(),precio.getIdmodalidad());
	}
	
	public String f_actualizar_precio_ciclo(PreciosEntity precio) {
		return iPreciosRepository.f_actualizar_precio_ciclo(precio.getIdciclonormalizado(),precio.getIdmodalidad(),
				precio.getPrecio(),precio.getPrecio_preventa(),precio.getFecha_preventa(),precio.getPrecio_promocion(),precio.getPrecio_mensual(), precio.getCuotas(), precio.getinscripcion());
	}
}
