package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.CampaignAnswers;
import com.rosettcompany.grupoCiencia.repository.Codis;
import com.rosettcompany.grupoCiencia.repository.CodisRespuesta;
import com.rosettcompany.grupoCiencia.repositoryI.CodisRespuestaRepositoryI;

@Service
public class CodisRespuestaServicio {
	@Autowired
	private CodisRespuestaRepositoryI codisrespuestaRepositoryI;

	public String f_guardar_respuestas_codis(CodisRespuesta codis) {
		return codisrespuestaRepositoryI.f_guardar_respuestas_codis(
				codis.getIdestudiante(),
				codis.getIdcodis(),
				codis.getRespuesta());
	}
	
	public String f_listar_codis_respuestas_por_estudiante(CodisRespuesta codis) {
		return codisrespuestaRepositoryI.f_listar_codis_respuestas_por_estudiante(
				codis.getIdcodis(),
				codis.getOffset(),
				codis.getLimit());
	}
	
	public String f_listar_codis_respuestas_general(int idcodis) {
		return codisrespuestaRepositoryI.f_listar_codis_respuestas_general(idcodis);
	}
	
	public String f_descargar_codis_respuestas(int idcodis) {
		return codisrespuestaRepositoryI.f_descargar_codis_respuestas(idcodis);
	}
	
	public String f_descargar_codis_profesores_por_codis(int idcodis) {
	return codisrespuestaRepositoryI.f_descargar_codis_profesores_por_codis(idcodis);
}

	
	public String f_listar_codis_por_estudiantes(CodisRespuesta codis) {
		
		return codisrespuestaRepositoryI.f_listar_codis_por_estudiantes(
				codis.getIdciclo(),
				codis.getIdestudiante()
				);
	}
	

	
}
