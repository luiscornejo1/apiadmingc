package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.beanCiclo;
import com.rosettcompany.grupoCiencia.repository.AsignacionAulasEntity;
import com.rosettcompany.grupoCiencia.repository.Ciclo;
import com.rosettcompany.grupoCiencia.repository.Solicitudes;
import com.rosettcompany.grupoCiencia.repositoryI.CicloRepositoryI;
import com.rosettcompany.grupoCiencia.repositoryI.SolicitudesRepositoryI;

@Service
public class CicloServicio {

	@Autowired
	private CicloRepositoryI cicloRepositoryI;

	@Autowired
	private SolicitudesRepositoryI solicitudesRepositoryI;

	public String listarCiclos(int idusuario) {
		return cicloRepositoryI.listarCiclos(idusuario);
	}

	public String f_listar_ciclos_por_usuario(int idusuario) {
		return cicloRepositoryI.f_listar_ciclos_por_usuario(idusuario);
	}

	public String listarCiclosBanco(int idusuario) {
		return cicloRepositoryI.listarCiclosBanco(idusuario);
	}

	public String filtrarEstudiantesPorCiclo(int idciclo) {
		return cicloRepositoryI.filtrarEstudiantesPorCiclo(idciclo);
	}

	public String listarCiclosPorUniversidad(int iduniversidad) {
		return cicloRepositoryI.listarCiclosPorUniversidad(iduniversidad);
	}

	public String f_listar_ciclos_banco_preguntas_universidad(int iduniversidad) {
		return cicloRepositoryI.f_listar_ciclos_banco_preguntas_universidad(iduniversidad);
	}

	public String listarCiclosMantenimiento(Ciclo ciclo) {
		return cicloRepositoryI.listarCiclosMantenimiento(ciclo.getIdciclo(), ciclo.getDescripcion());
	}

	public String eliminarCiclo(beanCiclo ciclo) {
		return cicloRepositoryI.eliminarCiclo(ciclo.getIdciclo(), ciclo.getIdasignacionaula());
	}

//	public String insertarCiclo(Ciclo ciclo) {
//		return cicloRepositoryI.insertarCiclo(ciclo.getIduniversidad().getIduniversidad(), ciclo.getDescripcion(),
//				ciclo.getPrecio());
//	}

//	public String editarCiclo(Ciclo ciclo) {
//		return cicloRepositoryI.editarCiclo(ciclo.getIdciclo(), ciclo.getDescripcion(), ciclo.getPrecio());
//	}

	public String cambiarVisibilidadCiclo(Ciclo ciclo) {
		return cicloRepositoryI.cambiarVisibilidadCiclo(ciclo.getIdciclo(), ciclo.getVisible_landing());
	}

	public String listarAula(Solicitudes solicitudes) {
		return solicitudesRepositoryI.listarAula(solicitudes.getIdciclonormalizado(), solicitudes.getIdmodalidad(),
				solicitudes.getIdsede(), solicitudes.idarea);
	}

	public String f_obtener_aulas_editar_estudiante(Solicitudes solicitudes) {
		return solicitudesRepositoryI.f_obtener_aulas_editar_estudiante(solicitudes.getIdciclonormalizado(),
				solicitudes.getIdmodalidad(), solicitudes.getIdsede(), solicitudes.getCarrera_interes());
	}

	public String listarCiclosEditarEstudiante(beanCiclo ciclo) {
		return solicitudesRepositoryI.listarCiclosEditarEstudiante(ciclo.getIdciclo(), ciclo.getIdciclonormalizado(),
				ciclo.getIdmodalidad(), ciclo.getIdsede());
	}

	public String f_listar_ciclos_usuarios() {
		return solicitudesRepositoryI.f_listar_ciclos_usuarios();
	}

	public String insertarCiclo(beanCiclo ciclo) {
		return cicloRepositoryI.insertarCiclo(ciclo.getIduniversidad(), ciclo.getIdciclonormalizado(),
				ciclo.getIdaula(), ciclo.getIdmodalidad(), ciclo.getIdsede(), ciclo.getIdturno(),
				ciclo.getIdnumeracion(), ciclo.getNumero_aula(), ciclo.getPrecio(), ciclo.getSalones());
	}

	public String editarCiclo(beanCiclo ciclo) {
		return cicloRepositoryI.editarCiclo(ciclo.getIdciclo(), ciclo.getIduniversidad(), ciclo.getIdciclonormalizado(),
				ciclo.getIdaula(), ciclo.getIdmodalidad(), ciclo.getIdsede(), ciclo.getIdturno(),
				ciclo.getIdnumeracion(), ciclo.getNumero_aula(), ciclo.getPrecio(), ciclo.getIdasignacionaula(),
				ciclo.getIdsalon());
	}
}
