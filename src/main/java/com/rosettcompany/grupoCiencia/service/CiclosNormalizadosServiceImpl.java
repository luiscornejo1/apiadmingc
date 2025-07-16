package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Ciclo;
import com.rosettcompany.grupoCiencia.repository.CiclosNormalizadosEntity;
import com.rosettcompany.grupoCiencia.repository.CronogramaPagos;
import com.rosettcompany.grupoCiencia.repository.Estudiante;
import com.rosettcompany.grupoCiencia.repositoryI.CiclosNormalizadosRepositoryI;

@Service
public class CiclosNormalizadosServiceImpl {

	@Autowired
	private CiclosNormalizadosRepositoryI iCicloNormalizadoRepository;

	public String f_listar_ciclos_normalizados() {
		return iCicloNormalizadoRepository.f_listar_ciclos_normalizados();
	}
	
	public String f_listar_ciclos_normalizados_activos() {
		return iCicloNormalizadoRepository.f_listar_ciclos_normalizados_activos();
	}
	
	public String f_listar_ciclos_normalizados_activos_usuario(CiclosNormalizadosEntity ciclos) {
		return iCicloNormalizadoRepository.f_listar_ciclos_normalizados_activos_usuario(ciclos.getIdusuario());
	}

	public String f_insertar_ciclo_normalizado(CiclosNormalizadosEntity ciclos) {
		return iCicloNormalizadoRepository.f_insertar_ciclo_normalizado(ciclos.getIduniversidad(),
				ciclos.getDescripcion(), ciclos.getFecha_inicio(), ciclos.getFecha_fin(),
				ciclos.getDuracion_semanas(), ciclos.getAnio(), ciclos.getFrecuencia_pago());
	}

	public String f_actualizar_ciclo_normalizado(CiclosNormalizadosEntity ciclos) {
		return iCicloNormalizadoRepository.f_actualizar_ciclo_normalizado(ciclos.getIdciclonormalizado(),
				ciclos.getIduniversidad(), ciclos.getDescripcion(), ciclos.getFecha_inicio(), ciclos.getFecha_fin(),
				ciclos.getDuracion_semanas(), ciclos.getAnio(), ciclos.getFrecuencia_pago());
	}

	public String listarCiclosNormalizadosPorUniversidad(int iduniversidad) {
		return iCicloNormalizadoRepository.listarCiclosNormalizadosPorUniversidad(iduniversidad);
	}

	public String buscarCiclosNormalizadosPorID(int idciclonormalizado) {
		return iCicloNormalizadoRepository.buscarCiclosNormalizadosPorID(idciclonormalizado);
	}

	public String cambiarVisibilidadCiclo(CiclosNormalizadosEntity ciclo) {
		return iCicloNormalizadoRepository.cambiarVisibilidadCiclo(ciclo.getIdciclonormalizado(),
				ciclo.getVisible_solicitudes());
	}

	public String eliminarCicloNormalizado(CiclosNormalizadosEntity ciclo) {
		return iCicloNormalizadoRepository.eliminarCicloNormalizado(ciclo.getIdciclonormalizado());
	}
	
	public String f_prueba_cambiar_cronograma(CiclosNormalizadosEntity ciclo) {
		return iCicloNormalizadoRepository.f_prueba_cambiar_cronograma(ciclo.getIdciclonormalizado());
	}
}
