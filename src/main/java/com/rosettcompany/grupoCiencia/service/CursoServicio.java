package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repositoryI.CursoRepositoryI;
import com.rosettcompany.grupoCiencia.repository.Curso;
@Service
public class CursoServicio {

	@Autowired
	private CursoRepositoryI cursoRepository;
	
	public List<Curso> findAllCursos(){
		return (List<Curso>) cursoRepository.findAllCursos();
	}
	
	public String ListarVideosCursos(int idcurso) {
		
		return cursoRepository.ListarVideosCursos(idcurso);
	}
	
	public String ListarCursosUniversida(int iduniversidad) {
		
		return cursoRepository.ListarCursosUniversidad(iduniversidad);
	}
	
	public String listarCursosCiclos(int idciclo) {
		return cursoRepository.ListarCursosCiclo(idciclo);
	}
	
	public String ActualizarTemarioCurso(Curso curso) {
		return cursoRepository.ActualizarTemarioCurso(curso.getIdcurso(), curso.getUrl_temario_biblioteca());
	}
	
	public String ListarCursosUniversidadClases(int iduniversidad) {
		
		return cursoRepository.ListarCursosUniversidadClases(iduniversidad);
	}
	
	public String ListarCursosUniversidadMateriales(int iduniversidad) {
		
		return cursoRepository.ListarCursosUniversidadMateriales(iduniversidad);
	}
}
