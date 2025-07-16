package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Historial;
import com.rosettcompany.grupoCiencia.repositoryI.HistorialRepositoryI;

@Service
public class HistorialServicio {

	@Autowired
	private HistorialRepositoryI historialRepositoryI;
	
	public String listarHistorialPorUsuario(int idusuario) {
		return historialRepositoryI.listarHistorialPorUsuario(idusuario);
	}
	
	public String insertarHistoria(Historial historial) {
		return historialRepositoryI.insertarHistorial(
				historial.getIdusuario().getIdusuario(),
				historial.getFecha(),
				historial.getHora(),
				historial.getActividad());
	}
}
