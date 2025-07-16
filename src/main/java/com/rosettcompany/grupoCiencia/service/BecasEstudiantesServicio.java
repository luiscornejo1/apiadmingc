package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.CronogramaTempEntity;
import com.rosettcompany.grupoCiencia.repository.DetalleEstudiantesBecaDescuento;
import com.rosettcompany.grupoCiencia.repositoryI.DetalleEstudiantesBecaDescuentoRepositoryI;

@Service
public class BecasEstudiantesServicio {

	@Autowired
	private DetalleEstudiantesBecaDescuentoRepositoryI detalleEstudiantesBecaDescuentoRepository;

	public String f_listar_detalle_estudiantes_beca_descuento(
			DetalleEstudiantesBecaDescuento detalleEstudiantesBecaDescuento) {
		//System.out.println("entra");
		return detalleEstudiantesBecaDescuentoRepository.f_listar_detalle_estudiantes_beca_descuento(
				detalleEstudiantesBecaDescuento.rows, detalleEstudiantesBecaDescuento.getUsuario(),
				detalleEstudiantesBecaDescuento.getNombre(), detalleEstudiantesBecaDescuento.ciclo,
				detalleEstudiantesBecaDescuento.fecha_registro, detalleEstudiantesBecaDescuento.tipo_beneficio);
	}

	public String f_descargar_detalle_estudiantes_beca_descuento(
			DetalleEstudiantesBecaDescuento detalleEstudiantesBecaDescuento) {
//		System.out.println("entra");
		return detalleEstudiantesBecaDescuentoRepository.f_descargar_detalle_estudiantes_beca_descuento(
				detalleEstudiantesBecaDescuento.getNombre(), detalleEstudiantesBecaDescuento.getUsuario(),
				detalleEstudiantesBecaDescuento.ciclo, detalleEstudiantesBecaDescuento.fecha_registro,
				detalleEstudiantesBecaDescuento.tipo_beneficio);
	}

	public String actualizarEstado(DetalleEstudiantesBecaDescuento detalleEstudiantesBecaDescuento) {
		return detalleEstudiantesBecaDescuentoRepository.actualizarEstado(
				detalleEstudiantesBecaDescuento.getIddetallebeca(), detalleEstudiantesBecaDescuento.getUsuario());
	}

	public String registrarBecaDescuento(DetalleEstudiantesBecaDescuento detalleEstudiantesBecaDescuento) {
		return detalleEstudiantesBecaDescuentoRepository.registrarBecaDescuento(
				detalleEstudiantesBecaDescuento.getTipo(), detalleEstudiantesBecaDescuento.getMonto(),
				detalleEstudiantesBecaDescuento.getDni(), detalleEstudiantesBecaDescuento.getNombre(),
				detalleEstudiantesBecaDescuento.getCorreo(), detalleEstudiantesBecaDescuento.getUsuario(),
				detalleEstudiantesBecaDescuento.getIdsolicitud(), detalleEstudiantesBecaDescuento.getMotivo(),
				detalleEstudiantesBecaDescuento.getDni_asociado(), detalleEstudiantesBecaDescuento.getIdmodalidad(),
				detalleEstudiantesBecaDescuento.getFecha_fin());
	}

	public String buscarBecaDNI(String dni) {
		return detalleEstudiantesBecaDescuentoRepository.buscarBecaDNI(dni);
	}





	public String f_desactivar_becas_fecha_fin() {
		return detalleEstudiantesBecaDescuentoRepository.f_desactivar_becas_fecha_fin();
	}
}