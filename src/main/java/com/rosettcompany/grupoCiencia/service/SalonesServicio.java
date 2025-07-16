package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Salones;
import com.rosettcompany.grupoCiencia.repositoryI.SalonesRepositoryI;

@Service
public class SalonesServicio {
	@Autowired
	private SalonesRepositoryI salonesRepositoryI;

	public String f_listar_salones_all() {
		return salonesRepositoryI.f_listar_salones_all();
	}

	public String f_listar_salones() {
		return salonesRepositoryI.f_listar_salones();
	}

	public String f_insertar_salones(Salones salon) {
		return salonesRepositoryI.f_insertar_salones(salon.getNombre_salon(), salon.getAforo(), salon.getIdsede());
	}

	public String f_update_salones(Salones salon) {
		return salonesRepositoryI.f_update_salones(salon.getIdsalon(), salon.getNombre_salon(), salon.getAforo(),
				salon.getUsuario_modificacion());
	}

	public String f_update_estado_salon(Salones salon) {
		return salonesRepositoryI.f_update_estado_salon(salon.getIdsalon(), salon.getEstado(),
				salon.getUsuario_modificacion());
	}
}
