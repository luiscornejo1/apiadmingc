package com.rosettcompany.grupoCiencia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Parametros;
import com.rosettcompany.grupoCiencia.repositoryI.ParametrosRepositoryI;

@Service
public class ParametrosServicio {

	@Autowired 
	private ParametrosRepositoryI parametrosRepository;
	
	public Optional<Parametros> getParametroById(int idParametro){
			
		return parametrosRepository.findById(idParametro);
	}
	
	public Parametros guardarParametro(Parametros parametro) {
		
		return parametrosRepository.save(parametro);
	}
	
	public String listarDepartamentos(int idusuario) {
		return parametrosRepository.listarDeparatementos(idusuario);
	}
}
