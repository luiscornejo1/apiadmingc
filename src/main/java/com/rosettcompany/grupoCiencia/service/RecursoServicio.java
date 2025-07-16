package com.rosettcompany.grupoCiencia.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.beanOrdenRecurso;
import com.rosettcompany.grupoCiencia.repository.Recurso;
import com.rosettcompany.grupoCiencia.repositoryI.RecursoRepositoryI;

@Service
public class RecursoServicio {

	@Autowired
	private RecursoRepositoryI recursoRepository;
	
	public String RegistrarRecursos(Recurso recurso) {
		
		return recursoRepository.RegistrarRecursos(
								recurso.getIdanio(),
								recurso.getIdcurso(),
								recurso.getIdciclo(),
								recurso.getNombre(),
								recurso.getMes(),
								recurso.getRuta_recurso());
	}
	
	public String ListarRecursosAdminsitrador(Recurso recurso) {
		
		return recursoRepository.ListarRecursosAdministrador(
								recurso.getIdcurso(),
								recurso.getIdanio(),
								recurso.getIdciclo(),
								recurso.getMes());
	}
	
	public String EliminarRecurso(Recurso recurso) {
		
		return recursoRepository.EliminarRecurso(recurso.getIdrecurso());
	}
	
	public String ActualizarOrdenRecurso(beanOrdenRecurso bean) {

        return recursoRepository.ActualizarOrdenRecursos(bean.getListRecursos());
    }
}
