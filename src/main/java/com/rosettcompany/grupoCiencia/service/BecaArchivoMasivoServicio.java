package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.CronogramaTempEntity;
import com.rosettcompany.grupoCiencia.repository.BecaArchivoMasivo;
import com.rosettcompany.grupoCiencia.repository.CodisRespuesta;
import com.rosettcompany.grupoCiencia.repositoryI.BecaArchivoMasivoRepositoryI;

@Service
public class BecaArchivoMasivoServicio {

	@Autowired
	private BecaArchivoMasivoRepositoryI becaArchivoMasivoRepositoryI;

	

	public String f_insertar_archivo_becas_masivo(BecaArchivoMasivo becaArchivoMasivo) {
		return becaArchivoMasivoRepositoryI.f_insertar_archivo_becas_masivo(
				becaArchivoMasivo.getNombre(), 
				becaArchivoMasivo.getUrl(),
				becaArchivoMasivo.getUsuario_subida());
	}


	public String f_listar_archivo_becas_masivo(BecaArchivoMasivo becaArchivoMasivo) {
		return becaArchivoMasivoRepositoryI.f_listar_archivo_becas_masivo(
				becaArchivoMasivo.getOffset(),
				becaArchivoMasivo.getLimit());
	}

}