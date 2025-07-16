package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Universidad;
import com.rosettcompany.grupoCiencia.repositoryI.UniversidadRepositoryI;

@Service
public class UniversidadServicio {

	@Autowired
	private UniversidadRepositoryI universidadRepositoryI;

	public String listarUniversidades(int idusuario) {
		return universidadRepositoryI.listarUniversidades(idusuario);
	}

	public String f_listar_universidades_all() {
		return universidadRepositoryI.f_listar_universidades_all();
	}

	public String obtenerQueryFuncion(Universidad u) {
		return universidadRepositoryI.obtenerQueryFuncion(u.getNombre());
	}

	public String f_update_estado_universidad(Universidad u) {
		return universidadRepositoryI.f_update_estado_universidad(u.getIduniversidad(), u.getActivo(),
				u.getUsuario_modificacion());
	}

	public String f_insertar_universidad(Universidad u) {
		return universidadRepositoryI.f_insertar_universidad(u.getNombre());
	}
	
	public String f_update_nombre_universidad(Universidad u) {
		return universidadRepositoryI.f_update_nombre_universidad(u.getIduniversidad(), u.getNombre(),
				u.getUsuario_modificacion());
	} 
}
