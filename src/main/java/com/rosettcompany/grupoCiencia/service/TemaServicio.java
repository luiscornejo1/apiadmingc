package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Tema;
import com.rosettcompany.grupoCiencia.repository.TemaBiblioteca;
import com.rosettcompany.grupoCiencia.repositoryI.TemaRepositoryI;

@Service
public class TemaServicio {
	
	@Autowired
	private TemaRepositoryI temaRepository;
	
	
	public List<Tema> getAllTemas(){
		
		return (List<Tema>) temaRepository.findAll();
	}
	
	public String listarTemas(int idusuario) {
		return temaRepository.listarTemas(idusuario);
	}
	

	
	public String eliminarTema(int idtema) {
		return temaRepository.eliminarTema(idtema);
		
	}
	
	public String insertarTema(Tema tema) {
		return temaRepository.insertarTema(
				tema.getIdcurso(),
				tema.getNombre_tema());
	}
	
	public String actualizarTema(Tema tema) {
		return temaRepository.actualizarTema(
				tema.getIdtema(),
				tema.getIdcurso(),
				tema.getNombre_tema());
	}
	
	public String buscarTema(Tema tema) {
		return temaRepository.buscarTema(
				tema.getNombre_tema());
	}
	
	public String listarTemasCursos(int curso) {
		return temaRepository.listarTemasCursos(curso);
	}
	
	public String f_listar_tema_normalizado_cursos(int curso) {
		return temaRepository.f_listar_tema_normalizado_cursos(curso);
	}
	
	public String actualizarOrdenTemas(Tema tema) {
		return temaRepository.actualizarOrdenTema(tema.getNombre_tema());
	}

} 
