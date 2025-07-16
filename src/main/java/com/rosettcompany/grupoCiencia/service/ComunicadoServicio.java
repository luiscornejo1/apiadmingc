package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Comunicado;
import com.rosettcompany.grupoCiencia.repositoryI.ComunicadoRepositoryI;

@Service
public class ComunicadoServicio {

	@Autowired
	private ComunicadoRepositoryI comunicadoRepository;
	
	
	public String RegistrarComunicado(Comunicado comunicado) {
		
		
		return comunicadoRepository.RegistrarComunicado(
				 comunicado.getIdciclo(),
				 comunicado.getFecha_inicio(),
				 comunicado.getFecha_fin(),
				 comunicado.getResumen(),
				 comunicado.getDescripcion(),
				 comunicado.getEstado(),
				 comunicado.getUniversidad());
	}
	
	public String ActualizarComunicado(Comunicado comunicado) {
		
		
		return comunicadoRepository.ActualizarComunicado(
				comunicado.getIdcomunicado(),
				 comunicado.getIdciclo(),
				 comunicado.getFecha_inicio(),
				 comunicado.getFecha_fin(),
				 comunicado.getDescripcion(),
				 comunicado.getUniversidad());
	}
	
	public String ListarComunicados(int i) {
		
		
		return comunicadoRepository.ListarComunicados(i);
	}
	
	public String EliminarComunicado(Comunicado comunicado) {
		
		
		return comunicadoRepository.EliminarComunicado(
				comunicado.getIdcomunicado());
	}
	
	public String RegistrarComunicadoLanding(Comunicado comunicado) {
		
		
		return comunicadoRepository.RegistrarComunicadoLanding(
				 comunicado.getFecha_inicio(),
				 comunicado.getFecha_fin(),
				 comunicado.getDescripcion(),
				 comunicado.getEstado());
	}
	
	public String ActualizarComunicadoLanding(Comunicado comunicado) {
		
		
		return comunicadoRepository.ActualizarComunicadoLanding(
				comunicado.getIdcomunicado(),
				 comunicado.getFecha_inicio(),
				 comunicado.getFecha_fin(),
				 comunicado.getDescripcion());
	}
	
	public String ListarComunicadosLanding() {
		
		return comunicadoRepository.ListarComunicadosLanding(1);
	}
	
	public String EliminarComunicadoLanding(Comunicado comunicado) {
		
		
		return comunicadoRepository.EliminarComunicadoLanding(
				comunicado.getIdcomunicado());
	}
	
	public String ListarComunicadosLandingFechas() {
		
		return comunicadoRepository.ListarComunicadosLanding(2);
	}
	
	public String ListarPrueba() {
		return comunicadoRepository.returnPdf(1);
	}
}
