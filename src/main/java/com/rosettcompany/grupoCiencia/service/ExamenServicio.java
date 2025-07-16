package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.ExamenBean;
import com.rosettcompany.grupoCiencia.repository.Examen;
import com.rosettcompany.grupoCiencia.repositoryI.ExamenRepositoryI;

@Service
public class ExamenServicio {

	@Autowired
	private ExamenRepositoryI examenRepositoryI;
	
	public String crearExamen(ExamenBean examen) {
		return examenRepositoryI.crearExamen(
				examen.getFecha_examen(),
				examen.getHora_inicio(),
				examen.getHora_fin(),
				examen.getIduniversidad(),
				examen.getIdciclo(),
				examen.getCiclos(),
				examen.getIdarea(),
				examen.getPuede_retroceder(),
				examen.getEncuesta(),
				examen.getFecha_inicio(),
				examen.getFecha_fin(),
				examen.getIdusuario(),
				examen.getSalto_pregunta(),
				examen.getTipo_examen()
				);
	}
	public String crearExamenNormalizado(ExamenBean examen) {
		return examenRepositoryI.crearExamenNormalizado(
				examen.getFecha_examen(),
				examen.getHora_inicio(),
				examen.getHora_fin(),
				examen.getIduniversidad(),
				examen.getIdciclo(),
				examen.getCiclos(),
				examen.getIdarea(),
				examen.getPuede_retroceder(),
				examen.getEncuesta(),
				examen.getFecha_inicio(),
				examen.getFecha_fin(),
				examen.getIdusuario(),
				examen.getSalto_pregunta(),
				examen.getTipo_examen()
				);
	}
	
	public String validarCantidadPreguntas(ExamenBean examen) {
		return examenRepositoryI.validarCantidadPreguntas(
				examen.getIdarea(),
				examen.getIdusuario(),
				examen.getIduniversidad(),
				examen.getFecha_inicio(),
				examen.getFecha_fin());
	}
	
	public String validarCantidadPreguntasNormalizado(ExamenBean examen) {
		return examenRepositoryI.validarCantidadPreguntasNormalizado(
				examen.getIdarea(),
				examen.getIdusuario(),
				examen.getIduniversidad(),
				examen.getFecha_inicio(),
				examen.getFecha_fin());
	}
	
	public String confirmarExamen(Examen examen) {
		return examenRepositoryI.confirmarExamen(
				examen.getLista_preguntas(),
				examen.getUrl_examen_blanco(),
				examen.getUrl_examen_respuestas(),
				examen.getUrl_examen_blanco_resumido(),
				examen.getUrl_examen_respuestas_resumido(),
				examen.getEstado());
	}
	
	public String confirmarExamenNormalizado(Examen examen) {
		return examenRepositoryI.confirmarExamenNormalizado(
				examen.getLista_preguntas(),
				examen.getUrl_examen_blanco(),
				examen.getUrl_examen_respuestas(),
				examen.getUrl_examen_blanco_resumido(),
				examen.getUrl_examen_respuestas_resumido(),
				examen.getEstado());
	}
	
	public String listarExamenes(int idexamen) {
		return examenRepositoryI.listarExamenes(idexamen);
	}
	
	public String listarExamenesNormalizado(int idexamen) {
		return examenRepositoryI.listarExamenesNormalizado(idexamen);
	}
	
	public String eliminarExamen(int idexamen) {
		return examenRepositoryI.eliminarExamen(idexamen);
	}
	
	public String eliminarExamenNormalizado(int idexamen) {
		return examenRepositoryI.eliminarExamenNormalizado(idexamen);
	}
	
	public String editarExamen(ExamenBean examen) {
		return examenRepositoryI.editarExamen(
				examen.getFecha_examen(),
				examen.getHora_inicio(),
				examen.getHora_fin(),
				examen.getIduniversidad(),
				examen.getIdciclo(),
				examen.getIdarea(),
				examen.getPuede_retroceder(),
				examen.getEncuesta(),
				examen.getFecha_inicio(),
				examen.getFecha_fin(),
				examen.getIdusuario(),
				examen.getEstado(),
				examen.getIdexamen(),
				examen.getSalto_pregunta());
	}
	public String editarExamenNormalizado(ExamenBean examen) {
		return examenRepositoryI.editarExamenNormalizado(
				examen.getFecha_examen(),
				examen.getHora_inicio(),
				examen.getHora_fin(),
				examen.getIduniversidad(),
				examen.getIdciclo(),
				examen.getIdarea(),
				examen.getPuede_retroceder(),
				examen.getEncuesta(),
				examen.getFecha_inicio(),
				examen.getFecha_fin(),
				examen.getIdusuario(),
				examen.getEstado(),
				examen.getIdexamen(),
				examen.getSalto_pregunta());
	}
	
	public String obtenerPreguntasCurso(ExamenBean examen) {
		return examenRepositoryI.obtenerPreguntasCurso(
				examen.getEstado(),
				examen.getIduniversidad(),
				examen.getCiclos(),
				examen.getIdarea(),
				examen.getFecha_inicio(),
				examen.getFecha_fin(),
				examen.getIdusuario(),
				examen.getIdexamen());
	}
	public String obtenerPreguntasCursoNormalizado(ExamenBean examen) {
		return examenRepositoryI.obtenerPreguntasCursoNormalizado(
				examen.getEstado(),
				examen.getIduniversidad(),
				examen.getCiclos(),
				examen.getIdarea(),
				examen.getFecha_inicio(),
				examen.getFecha_fin(),
				examen.getIdusuario(),
				examen.getIdexamen());
	}
	
	public String ReporteNotasDia(Examen examen) {
        return examenRepositoryI.reporteNotasDia(
                examen.getFecha_registro());
    }
	
	public String ReporteNotasDiaNormalizado(Examen examen) {
        return examenRepositoryI.reporteNotasDiaNormalizado(
                examen.getFecha_registro());
    }
	
	public String ListarDetalleExamen(Examen examen) {
        return examenRepositoryI.ListarDetalleExamen(examen.getIdexamen());
    }
	
	public String ListarDetalleExamenNormalizado(Examen examen) {
        return examenRepositoryI.ListarDetalleExamenNormalizado(examen.getIdexamen());
    }
	
	public String crearExamenTemas(ExamenBean examen) {
		return examenRepositoryI.crearExamenTemas(
				examen.getFecha_examen(),
				examen.getHora_inicio(),
				examen.getHora_fin(),
				examen.getIduniversidad(),
				examen.getIdciclo(),
				examen.getCiclos(),
				examen.getIdarea(),
				examen.getPuede_retroceder(),
				examen.getEncuesta(),
				examen.getFecha_inicio(),
				examen.getFecha_fin(),
				examen.getIdusuario(),
				examen.getSalto_pregunta(),
				examen.getTipo_examen(),
				examen.getLista_temas()
				);
	}
	
	public String crearExamenTemasNormalizados(ExamenBean examen) {
		return examenRepositoryI.crearExamenTemasNormalizados(
				examen.getFecha_examen(),
				examen.getHora_inicio(),
				examen.getHora_fin(),
				examen.getIduniversidad(),
				examen.getIdciclo(),
				examen.getCiclos(),
				examen.getIdarea(),
				examen.getPuede_retroceder(),
				examen.getEncuesta(),
				examen.getFecha_inicio(),
				examen.getFecha_fin(),
				examen.getIdusuario(),
				examen.getSalto_pregunta(),
				examen.getTipo_examen(),
				examen.getLista_temas()
				);
	}
	
	public String obtenerPreguntasCursoTemas(ExamenBean examen) {
		return examenRepositoryI.obtenerPreguntasCursoTemas(
				examen.getEstado(),
				examen.getIduniversidad(),
				examen.getCiclos(),
				examen.getIdarea(),
				examen.getFecha_inicio(),
				examen.getFecha_fin(),
				examen.getIdusuario(),
				examen.getIdexamen(),
				examen.getLista_temas());
	}
	
	public String obtenerPreguntasCursoTemasNormalizado(ExamenBean examen) {
		return examenRepositoryI.obtenerPreguntasCursoTemasNormalizado(
				examen.getEstado(),
				examen.getIduniversidad(),
				examen.getCiclos(),
				examen.getIdarea(),
				examen.getFecha_inicio(),
				examen.getFecha_fin(),
				examen.getIdusuario(),
				examen.getIdexamen(),
				examen.getLista_temas());
	}
	
	public String crearExamenUni(ExamenBean examen) {
		return examenRepositoryI.crearExamenUni(
				examen.getFecha_examen(),
				examen.getHora_inicio(),
				examen.getHora_fin(),
				examen.getIduniversidad(),
				examen.getIdciclo(),
				examen.getCiclos(),
				examen.getIdarea(),
				examen.getPuede_retroceder(),
				examen.getEncuesta(),
				examen.getFecha_inicio(),
				examen.getFecha_fin(),
				examen.getIdusuario(),
				examen.getSalto_pregunta(),
				examen.getTipo_examen()
				);
	}
	
	public String crearExamenUniNormalizado(ExamenBean examen) {
		return examenRepositoryI.crearExamenUniNormalizado(
				examen.getFecha_examen(),
				examen.getHora_inicio(),
				examen.getHora_fin(),
				examen.getIduniversidad(),
				examen.getIdciclo(),
				examen.getCiclos(),
				examen.getIdarea(),
				examen.getPuede_retroceder(),
				examen.getEncuesta(),
				examen.getFecha_inicio(),
				examen.getFecha_fin(),
				examen.getIdusuario(),
				examen.getSalto_pregunta(),
				examen.getTipo_examen()
				);
	}
	
	public String obtenerPreguntasCursoUni(ExamenBean examen) {
		return examenRepositoryI.obtenerPreguntasCursoUni(
				examen.getEstado(),
				examen.getIduniversidad(),
				examen.getCiclos(),
				examen.getIdarea(),
				examen.getFecha_inicio(),
				examen.getFecha_fin(),
				examen.getIdusuario(),
				examen.getIdexamen());
	}
	
	public String obtenerPreguntasCursoUniNormalizado(ExamenBean examen) {
		return examenRepositoryI.obtenerPreguntasCursoUniNormalizado(
				examen.getEstado(),
				examen.getIduniversidad(),
				examen.getCiclos(),
				examen.getIdarea(),
				examen.getFecha_inicio(),
				examen.getFecha_fin(),
				examen.getIdusuario(),
				examen.getIdexamen());
	}
	
}
