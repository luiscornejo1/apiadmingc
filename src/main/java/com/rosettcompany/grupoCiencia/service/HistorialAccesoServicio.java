package com.rosettcompany.grupoCiencia.service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Historial;
import com.rosettcompany.grupoCiencia.repository.HistorialAcceso;
import com.rosettcompany.grupoCiencia.repositoryI.HistorialAccesoRepositoryI;
import com.rosettcompany.grupoCiencia.repositoryI.HistorialRepositoryI;

@Service
public class HistorialAccesoServicio {

	@Autowired
	private HistorialAccesoRepositoryI historialAccesoRepositoryI;

	public String f_insertar_historial_acceso(HistorialAcceso historial) {
		return historialAccesoRepositoryI.f_insertar_historial_acceso(historial.getIdusuario(),
				historial.getIdestudiante(), historial.getObservaciones());
	}

	public String listarAsistencias(HistorialAcceso historial) {

		return historialAccesoRepositoryI.f_listar_asistencias(historial.getIndex(), historial.getIdusuario(),
				historial.getObservaciones());
	}
	
	public String f_detalle_asistencia_anual(HistorialAcceso historial) {

		// Llamar al repositorio y obtener el resultado
		String resultado = historialAccesoRepositoryI.f_detalle_asistencia_anual(historial.getIdestudiante(),
				historial.getAnio());

		// Retornar el resultado (puedes hacer algún procesamiento adicional si es
		// necesario)
		return resultado != null ? resultado : "[]"; // Retorna un arreglo vacío si el resultado es null
	}

	public String listarAsistenciasTotal(String observaciones) {
		return historialAccesoRepositoryI.f_listar_asistencias_total(observaciones);
	}

	public String f_buscar_asistencias_fecha(HistorialAcceso historial) {
		return historialAccesoRepositoryI.f_buscar_asistencias_fecha(historial.getObservaciones());
	}

	public String f_justificar_asistencia(HistorialAcceso historial) {
		return historialAccesoRepositoryI.f_justificar_asistencia(historial.getIdusuario(),
				historial.getIdhistorialacceso(), historial.getObservaciones(), historial.getDocumento(),
				historial.getEstado());
	}

	public void insertar_historial_faltas() {
		LocalDate localDate = LocalDate.now(); // Fecha de hoy
		Date fechaHoy = Date.valueOf(localDate);
		historialAccesoRepositoryI.insertar_historial_faltas(fechaHoy);
	}

	public String f_listar_resumen_asistencias(HistorialAcceso historial) {
		return historialAccesoRepositoryI.f_listar_resumen_asistencias(historial.getIdusuario(),
				historial.getObservaciones(), historial.mes_inicio);
	}
	
	public String f_listar_resumen_asistencias_virtual(HistorialAcceso historial) {
		return historialAccesoRepositoryI.f_listar_resumen_asistencias_virtual(historial.getIdusuario(),
				historial.getObservaciones(), historial.mes_inicio);
	}

	public String f_listar_resumen_asistencias_idestudiante(HistorialAcceso historial) {
		return historialAccesoRepositoryI.f_listar_resumen_asistencias_idestudiante(historial.getIdestudiante(),
				historial.mes_inicio);
	}

}
