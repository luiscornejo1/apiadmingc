package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Detallesubtema;
import com.rosettcompany.grupoCiencia.repositoryI.DetallesubtemaRepositoryI;

@Service
public class DetallesubtemaServicio {

	@Autowired
	private DetallesubtemaRepositoryI detallesubtemaRepository;

	public List<Detallesubtema> getAllSubsubsubtemas() {

		return (List<Detallesubtema>) detallesubtemaRepository.findAll();
	}

	public String f_listar_detallesubtema_subsubsubtema(int id_sub_sub_subtema) {
		return detallesubtemaRepository.listarDetallesubtemas(id_sub_sub_subtema);
	}

	public String f_listar_detallesubtema_subsubsubtema_all() {
		return detallesubtemaRepository.f_listar_detallesubtema_subsubsubtema_all();
	}

}
