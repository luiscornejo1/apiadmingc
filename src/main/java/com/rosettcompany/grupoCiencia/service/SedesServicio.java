package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.rosettcompany.grupoCiencia.bean.DetalleCicloSedeModalidad;
import com.rosettcompany.grupoCiencia.repository.Anio;
import com.rosettcompany.grupoCiencia.repository.Sedes;
import com.rosettcompany.grupoCiencia.repositoryI.AnioRepositoryI;
import com.rosettcompany.grupoCiencia.repositoryI.ModalidadRepositoryI;
import com.rosettcompany.grupoCiencia.repositoryI.SedesRepositoryI;

@Service
public class SedesServicio {

	@Autowired
	private SedesRepositoryI sedesRepository;

	public String f_listar_sedes() {
		return sedesRepository.f_listar_sedes();
	}

	public String f_listar_sedes_all() {
		return sedesRepository.f_listar_sedes_all();
	}

	public String f_listar_sedes_usuarios() {
		return sedesRepository.f_listar_sedes_usuarios();
	}

	public String f_buscar_sede_por_ciclo_modalidad(DetalleCicloSedeModalidad det) {
		return sedesRepository.f_buscar_sede_por_ciclo_modalidad(det.getIdciclonormalizado(), det.getIdmodalidad());
	}

	public String f_buscar_sede_por_ciclo(DetalleCicloSedeModalidad det) {
		return sedesRepository.f_buscar_sede_por_ciclo(det.getIdciclonormalizado());
	}

	public String f_mostrar_facturador_sede(int idsede) {
		return sedesRepository.f_mostrar_facturador_sede(idsede);
	}

	public String f_update_sedes(Sedes sede) {
		return sedesRepository.f_update_sedes(sede.getIdsede(), sede.getNombre(), sede.getSerie(),
				sede.getTokenfacturador(), sede.getUsuario_modificacion());
	}

	public String f_insertar_sede(Sedes sede) {
		return sedesRepository.f_insertar_sede(sede.getNombre(), sede.getSerie(), sede.getTokenfacturador());
	}

	public String f_update_estado_sedes(Sedes sede) {
		return sedesRepository.f_update_estado_sedes(sede.getIdsede(), sede.getEstado(),
				sede.getUsuario_modificacion());
	}
}
