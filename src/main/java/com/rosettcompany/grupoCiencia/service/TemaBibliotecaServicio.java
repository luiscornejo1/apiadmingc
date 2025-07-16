package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.TemaBiblioteca;
import com.rosettcompany.grupoCiencia.repositoryI.TemaBibliotecaRepositoryI;

@Service
public class TemaBibliotecaServicio {

	@Autowired
	private TemaBibliotecaRepositoryI temabiblioteca;
	
	public String listarTemasBiblioteca(TemaBiblioteca tema) {
		
		return temabiblioteca.listarTemasBiblioteca(tema.getIdcurso());
	}
	
	public String listarTemasBibliotecaClases(TemaBiblioteca tema) {
		
		return temabiblioteca.listarTemasBibliotecaClases(tema.getIdcurso());
	}
	
	public String listarTemasBibliotecaMateriales(TemaBiblioteca tema) {
		
		return temabiblioteca.listarTemasBibliotecaMateriales(tema.getIdcurso());
	}
	
	public String insertarTemasBiblioteca(TemaBiblioteca tema) {
		return temabiblioteca.insertarTemasBiblioteca(tema.getNombre_tema());
	}
	
	public String listarTemasBibliotecaAdmin(int idusuario) {
		return temabiblioteca.listarTemasAdmin(idusuario);
	}
	
	public String actualizarTema(TemaBiblioteca tema) {
		return temabiblioteca.actualizarTema(
				tema.getIdtema(),
				tema.getIdcurso(),
				tema.getNombre_tema());
	}
	
	public String buscarTema(TemaBiblioteca tema) {
		return temabiblioteca.buscarTema(
				tema.getNombre_tema());
	}
	
	public String eliminarTema(int idtema) {
		return temabiblioteca.eliminarTema(idtema);
		
	}
	
	public String actualizarOrdenTemas(TemaBiblioteca tema) {
		return temabiblioteca.actualizarOrdenTema(tema.getNombre_tema());
	}
	
	public String listarTemasBibliotecaOrdenar(TemaBiblioteca tema) {
		
		return temabiblioteca.listarTemasBibliotecaOrdenar(tema.getIdcurso());
	}
}
