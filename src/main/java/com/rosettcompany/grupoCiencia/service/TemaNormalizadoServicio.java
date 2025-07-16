package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Tema;
import com.rosettcompany.grupoCiencia.repository.TemaNormalizado;
import com.rosettcompany.grupoCiencia.repositoryI.TemaNormalizadoRepositoryI;

@Service
public class TemaNormalizadoServicio {
	
	@Autowired
	private TemaNormalizadoRepositoryI temanormalizadoRepository;
	
	
	public List<TemaNormalizado> getAllTemas(){
		
		return (List<TemaNormalizado>) temanormalizadoRepository.findAll();
	}
	
	public String f_listar_tema_normalizado(int idusuario) {
		return temanormalizadoRepository.f_listar_tema_normalizado(idusuario);
	}
	


}
