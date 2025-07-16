package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.AreasCarrera;
import com.rosettcompany.grupoCiencia.repositoryI.AreasCarreraRepositoryI;

@Service
public class AreasCarreraServicio {

	@Autowired
	private AreasCarreraRepositoryI areas_carreraRepositoryI;
	
	public String listarCarrerasPorUniversidad(int iduniversidad) {
		return areas_carreraRepositoryI.listarCarrerasPorUniversidad(iduniversidad);
	}
	
	public String listarDetalleAreaCurso(int idarea) {
		return areas_carreraRepositoryI.listarDetalleAreaCurso(idarea);
	}
	
	public String guardarPuntajesPreguntas(AreasCarrera area) {
		return areas_carreraRepositoryI.guardarPuntajesPreguntas(
				area.getIdarea(),
				area.getPregunta_correcta(),
				area.getPregunta_incorrecta(),
				area.getPregunta_en_blanco());
	}
	
	public String listarConfiguracionExamen(int idusuario) {
		return areas_carreraRepositoryI.listarConfiguracionExamen(idusuario);
	}
}
