package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.beanAdmisionBiblioteca;
import com.rosettcompany.grupoCiencia.bean.beanEstadistica;
import com.rosettcompany.grupoCiencia.repositoryI.EstadisticaExamenRepositoryI;

@Service
public class EstadisticaExamenServicio {

	@Autowired
	private EstadisticaExamenRepositoryI estadisticaExamenRepositoryI;
	
	public String listarEstadisticasBiblioteca(beanAdmisionBiblioteca admision) {
		
		return estadisticaExamenRepositoryI.listarEstadisticaExamen(admision.getIdsemestre(),
											admision.getIduniversidad(),
											admision.getIdcurso());
	}
	
	public String listarEstadisticasAdministrador(beanAdmisionBiblioteca admision) {
		
		return estadisticaExamenRepositoryI.listarEstadisticaExamenAdministrador(admision.getT_idsemestre(),
											admision.getT_iduniversidad(),
											admision.getT_idanio());
	}
	
	public String listarCursosUniversidadEstadistica(beanAdmisionBiblioteca admision) {
		
		return estadisticaExamenRepositoryI.listarCursosUniversidadEstadistica(admision.getIduniversidad());
	}
	
	public String insertarEstadisticaAdministrador(beanEstadistica estadistica) {
		
		return estadisticaExamenRepositoryI.insertarEstadisticaAdministrador(estadistica.getIdsemestre(), estadistica.getIduniversidad(), estadistica.getNombre_estadistica());
	}
	
	public String insertarDetalleEstadistica(beanEstadistica estadistica) {
		
		return estadisticaExamenRepositoryI.insertarDetalleEstadistica(estadistica.getDetalle_estadistica());
	}
	
	public String eliminarEstadistica(beanEstadistica estadistica) {
		
		return estadisticaExamenRepositoryI.eliminarEstadistica(estadistica.getIdestadistica());
	}
}
