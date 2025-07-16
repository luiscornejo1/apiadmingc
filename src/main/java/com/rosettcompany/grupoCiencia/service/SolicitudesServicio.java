package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Solicitudes;
import com.rosettcompany.grupoCiencia.repositoryI.SolicitudesRepositoryI;

@Service
public class SolicitudesServicio {

	@Autowired
	private SolicitudesRepositoryI solicitudRepositoryI;

	public String f_actualizar_estudiante_qr(String json_input) throws Exception {
		return solicitudRepositoryI.f_actualizar_estudiante_qr(json_input);

	}

	public String ActualizarFotoSolicitud(Solicitudes solicitud) throws Exception {
		return solicitudRepositoryI.ActualizarFotoSolicitud(solicitud.getIdsolicitud(), solicitud.getRuta_foto_perfil(),
				solicitud.getRuta_foto_dni(), solicitud.getRuta_comprobante());
	}

	public String actualizarSolicitudes() {
		return solicitudRepositoryI.actualizarSolicitudes();
	}

	public String RegistrarSolicitud(Solicitudes solicitud) throws Exception {
		return solicitudRepositoryI.RegistrarSolicitud(solicitud.getNombres(), solicitud.getApellidos(),
				solicitud.getDni(), solicitud.getUniversidad(), solicitud.getCiclo(), solicitud.getIdciclonormalizado(),
				solicitud.getIdmodalidad(), solicitud.getIdsede(), solicitud.getCarrera_interes(),
				solicitud.getCelular(), solicitud.getCorreo(), solicitud.getDireccion(), solicitud.getPerfil_facebook(),
				solicitud.getRuta_foto_perfil(), solicitud.getRuta_foto_dni(), solicitud.getRuta_foto_facebook(),
				solicitud.getRuta_foto_voucher_pago(), solicitud.getRuta_video_registro(),
				solicitud.getApoderado().getNombres(), solicitud.getApoderado().getApellidos(),
				solicitud.getApoderado().getDni(), solicitud.getApoderado().getCelular(),
				solicitud.getApoderado().getDireccion(), solicitud.getApoderado().getCorreo(),
				solicitud.getApoderado().getRuta_foto_dni(), solicitud.getMedio_info(), solicitud.getRuta_foto_dni2(),
				solicitud.getReferido(), solicitud.getFacturacion(), solicitud.getId_orden(), solicitud.getEstado(),
				solicitud.getTipo_pago(), solicitud.getRuta_comprobante(), solicitud.getMonto_pago(),
				solicitud.getFecha_nacimiento(), solicitud.getRuta_comprobante2(), solicitud.getRuta_comprobante3(),
				solicitud.getFecha_inscripcion(), solicitud.getEsColegio(), solicitud.getJson_por_pagar(),
				solicitud.getTipo_solicitud());
	}

	public String ListarSolicitudes(int indicador) throws Exception {
		return solicitudRepositoryI.ListarSolicitudes((indicador));
	}

	public String funcion_listar_solicitudes_preliminar(Solicitudes solicitud) throws Exception {
		return solicitudRepositoryI.funcion_listar_solicitudes_preliminar(solicitud.row, solicitud.getNombres(),
				solicitud.descripcion_ciclo, solicitud.fecha);
	}

	public String funcion_reporte_solicitudes_preliminar(Solicitudes solicitud) throws Exception {
		return solicitudRepositoryI.funcion_reporte_solicitudes_preliminar(solicitud.row, solicitud.getNombres(),
				solicitud.descripcion_ciclo, solicitud.fecha);
	}

	public String EliminarSolicitud(Solicitudes solicitud) throws Exception {
		return solicitudRepositoryI.EliminarSolicitud(solicitud.getIdsolicitud(), solicitud.getEliminado_por());
	}

	public String AprobarSolicitud(Solicitudes solicitud) throws Exception {
		return solicitudRepositoryI.AprobarSolicitud(solicitud.getIdsolicitud(), solicitud.getAprobado_por());
	}

	public String funcion_cambiar_estado(Solicitudes solicitud) throws Exception {
		return solicitudRepositoryI.funcion_cambiar_estado(solicitud.getId_orden());
	}

	public String f_actualizar_solicitudes_observado(Solicitudes solicitud) throws Exception {
		return solicitudRepositoryI.f_actualizar_solicitudes_observado(solicitud.getIdsolicitud(),
				solicitud.getObservado(), solicitud.getObservado_por(), solicitud.getMotivo_observacion());
	}

	public String f_actualizar_cronograma_observado(Solicitudes solicitud) throws Exception {
		return solicitudRepositoryI.f_actualizar_cronograma_observado(solicitud.getIdsolicitud(),
				solicitud.getObservado_por(), solicitud.getMonto_pago(), solicitud.getRuta_comprobante());
	}

	public String f_aprobar_pago_solicitud(Solicitudes solicitud) throws Exception {
		return solicitudRepositoryI.f_aprobar_pago_solicitud(solicitud.getIdsolicitud(), solicitud.getValidado_por());
	}
	
	public String funcion_reporte_solicitudes_eliminadas_mensual() {
		return solicitudRepositoryI.funcion_reporte_solicitudes_eliminadas_mensual();
	}
	
	public String funcion_reporte_solicitudes_vendedores() {
		return solicitudRepositoryI.funcion_reporte_solicitudes_vendedores();
	}
}
