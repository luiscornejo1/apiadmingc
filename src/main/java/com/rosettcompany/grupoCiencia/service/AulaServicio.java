package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Anio;
import com.rosettcompany.grupoCiencia.repository.AulasEntity;
import com.rosettcompany.grupoCiencia.repositoryI.AnioRepositoryI;
import com.rosettcompany.grupoCiencia.repositoryI.AulasRepositoryI;
import com.rosettcompany.grupoCiencia.repositoryI.CiclosNormalizadosRepositoryI;

@Service
public class AulaServicio {

	@Autowired
	private AulasRepositoryI iAulasRepository;

	public String f_listar_aulas() {
		return iAulasRepository.f_listar_aulas();
	}
	
	public String f_listar_aulas_por_ciclo(AulasEntity aula) {
		return iAulasRepository.f_listar_aulas_por_ciclo(aula.getIdusuario());
	}

	public String f_insertar_aula(AulasEntity aula) {
		return iAulasRepository.f_insertar_aula(aula.getIduniversidad(), aula.getNombre(), aula.getAreas());
	}

	public String f_actualizar_aula(AulasEntity aula) {
		return iAulasRepository.f_actualizar_aula(aula.getIdaula(), aula.getNombre(), aula.getIduniversidad(),
				aula.getAreas());
	}

	public String f_eliminar_aula(AulasEntity aula) {
		return iAulasRepository.f_eliminar_aula(aula.getIdaula());
	}
}
