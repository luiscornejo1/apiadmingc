package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.rosettcompany.grupoCiencia.repository.CabeceraPregunta;
import com.rosettcompany.grupoCiencia.repository.DetallePregunta;
import com.rosettcompany.grupoCiencia.repository.TemaNormalizado;
import com.rosettcompany.grupoCiencia.repositoryI.CabeceraPreguntaRepositoryI;
import com.rosettcompany.grupoCiencia.bean.FiltroBancoPreguntas;
import com.rosettcompany.grupoCiencia.bean.beanReporte;

@Service
public class CabeceraPreguntaServicio {

	@Autowired
	private CabeceraPreguntaRepositoryI cabeceraPreguntaRepository;

	public String RegistrarPregunta(CabeceraPregunta cabeceraPregunta) {
		
	String json = new Gson().toJson(cabeceraPregunta.getDetallePregunta());
	
	return cabeceraPreguntaRepository.RegistrarPregunta(
			cabeceraPregunta.getDificultad(),
			cabeceraPregunta.getDeco(),
			cabeceraPregunta.getTipo_pregunta(),
			cabeceraPregunta.getObservacion(),
			cabeceraPregunta.getTexto(),
			cabeceraPregunta.getEstado(),
			cabeceraPregunta.getTema().getIdtema(),
			cabeceraPregunta.getCiclo().getIdciclo(),
			cabeceraPregunta.getUsuario().getIdusuario(),
			json);
}
	
	public String RegistrarPreguntaNormalizado(CabeceraPregunta cabeceraPregunta) {

		String json = new Gson().toJson(cabeceraPregunta.getDetallePregunta());
		return cabeceraPreguntaRepository.RegistrarPreguntaNormalizado(cabeceraPregunta.getDificultad(),
				cabeceraPregunta.getDeco(), cabeceraPregunta.getTipo_pregunta(), cabeceraPregunta.getObservacion(),
				cabeceraPregunta.getTexto(), cabeceraPregunta.getEstado(), cabeceraPregunta.getCiclo().getIdciclo(), 
				cabeceraPregunta.getUsuario().getIdusuario(), json, cabeceraPregunta.getTemanormalizado().getIdtemanormalizado(),
				cabeceraPregunta.getSubtema().getId_subtema(), cabeceraPregunta.getSubsubtema().getId_sub_subtema(),
				cabeceraPregunta.getSubsubsubtema().getId_sub_sub_subtema(), cabeceraPregunta.getDetallesubtema().getId_detalle_subtema());
	}
	
	
	 public String obtenerPreguntasSimilares(String texto) {
	       
	    	String json = new Gson().toJson(texto);
	    	
	    	return cabeceraPreguntaRepository.BuscarPreguntasSimilares(texto);

	  }
	public String ListarBancoPregunta(FiltroBancoPreguntas filtro) {

		return cabeceraPreguntaRepository.ListarBancoPreguntas(filtro.getUniversidad(), filtro.getCiclo(),
				filtro.getCurso(), filtro.getTema(), filtro.getDificultad(), filtro.getEstadopregunta(),
				filtro.getDeco(), filtro.getPalabra(), filtro.getUsuario(), filtro.getRango_fecha(), filtro.getMinimo(),
				filtro.getMaximo(), filtro.getIdcabecera_pregunta());
	}

	public String funcion_listar_banco_preguntas_normalizado(FiltroBancoPreguntas filtro) {

		return cabeceraPreguntaRepository.funcion_listar_banco_preguntas_normalizado(filtro.getUniversidad(),
				filtro.getCurso(), filtro.temanormalizado, filtro.subtema, filtro.subsubtema, filtro.subsubsubtema,
				filtro.detallesubtema, filtro.getDificultad(), filtro.getEstadopregunta(), filtro.getDeco(),
				filtro.getPalabra(), filtro.getUsuario(), filtro.getRango_fecha(), filtro.getMinimo(),
				filtro.getMaximo(), filtro.getIdcabecera_pregunta(), filtro.espejo);
	}

	public String EliminarCabecera(CabeceraPregunta cabecera) {

		return cabeceraPreguntaRepository.EliminarCabecera(cabecera.getIdcabecerapregunta());
	}

	public String f_actualizar_cantidad_preguntas_espejo() {

		return cabeceraPreguntaRepository.f_actualizar_cantidad_preguntas_espejo();
	}

	public String EliminarPregunta(DetallePregunta pregunta) {

		return cabeceraPreguntaRepository.EliminarPregunta(pregunta.getIdpregunta());
	}

	public String ActualizarCabeceraPregunta(CabeceraPregunta cabecera) {

		return cabeceraPreguntaRepository.ActualizarCabeceraPregunta(cabecera.getIdcabecerapregunta(),
				cabecera.getTexto(), cabecera.getCiclo().getIdciclo(), cabecera.getTema().getIdtema(),
				cabecera.getDeco(), cabecera.getDificultad(), cabecera.getEstado());
	}

	public String ActualizarCabeceraPreguntaNormalizado(CabeceraPregunta cabecera) {

		return cabeceraPreguntaRepository.ActualizarCabeceraPreguntaNormalizado(cabecera.getIdcabecerapregunta(),
				cabecera.getTexto(), cabecera.idtemanormalizadoo, cabecera.getSubtema().getId_subtema(),
				cabecera.getSubsubtema().getId_sub_subtema(), cabecera.getSubsubsubtema().getId_sub_sub_subtema(),
				cabecera.getDetallesubtema().getId_detalle_subtema(), cabecera.getDeco(), cabecera.getDificultad(),
				cabecera.getEstado());
	}

	public String ActualizarPregunta(DetallePregunta pregunta) {

		return cabeceraPreguntaRepository.ActualizarPregunta(pregunta.getIdpregunta(), pregunta.getDescripcion(),
				pregunta.getAlternativa(), pregunta.getEstado());
	}

	public String ActualizarPreguntaNormalizado(DetallePregunta pregunta) {
		return cabeceraPreguntaRepository.ActualizarPreguntaNormalizado(pregunta.getIdpregunta(),
				pregunta.getDescripcion(), pregunta.getAlternativa());
	}

	public String ActualizarObservacionCabeceraPregunta(CabeceraPregunta cabecera) {

		return cabeceraPreguntaRepository.ActualizarObservacionCabeceraPregunta(cabecera.getIdcabecerapregunta(),
				cabecera.getObservacion(), cabecera.getEstado());
	}

	public String ActualizarObservacionPregunta(DetallePregunta pregunta) {

		return cabeceraPreguntaRepository.ActualizarObservacionPregunta(pregunta.getIdpregunta(),
				pregunta.getDetalle_observacion(), pregunta.getEstado());
	}

	public String ReporteListarDatosEstudiante(beanReporte reporte) {

		return cabeceraPreguntaRepository.ReporteListarDatosEstudiante(reporte.getIdestudiante(),
				reporte.getFecha_inicio(), reporte.getFecha_fin());
	}
	
	public String ReporteListarDatosEstudiantePresencial(beanReporte reporte) {

		return cabeceraPreguntaRepository.ReporteListarDatosEstudiantePresencial(reporte.getIdestudiante(),
				reporte.getFecha_inicio(), reporte.getFecha_fin());
	}
	
	public String ReporteListarDatosEstudiantePresencialUni(beanReporte reporte) {

		return cabeceraPreguntaRepository.ReporteListarDatosEstudiantePresencialUni(reporte.getIdestudiante(),
				reporte.getFecha_inicio(), reporte.getFecha_fin());
	}

	public String ReporteListarDatosEstudianteCiclo(beanReporte reporte) {

		return cabeceraPreguntaRepository.ReporteListarDatosEstudianteCiclo(reporte.getIdciclo(),
				reporte.getFecha_inicio(), reporte.getFecha_fin());
	}

	public String ReporteListarDatosEstudianteUniCiclo(beanReporte reporte) {

		return cabeceraPreguntaRepository.ReporteListarDatosEstudianteUniCiclo(reporte.getIdciclo(),
				reporte.getFecha_inicio());
	}

	public String ReporteListarDetalleSimulacro(beanReporte reporte) {

		return cabeceraPreguntaRepository.ReporteListarDetalleSimulacro(reporte.getIdestudiante(),
				reporte.getFecha_inicio(), reporte.getFecha_fin());
	}

	public String ReporteListarDetalleSimulacroPresencial(beanReporte reporte) {

		return cabeceraPreguntaRepository.ReporteListarDetalleSimulacroPresencial(reporte.getIdestudiante(),
				reporte.getFecha_inicio(), reporte.getFecha_fin());
	}
	
	public String ReporteListarDetalleSimulacroPresencialUni(beanReporte reporte) {

		return cabeceraPreguntaRepository.ReporteListarDetalleSimulacroPresencialUni(reporte.getIdestudiante(),
				reporte.getFecha_inicio(), reporte.getFecha_fin());
	}

	
	public String ReporteListarSimulacroMes(beanReporte reporte) {

		return cabeceraPreguntaRepository.ReporteListarSimulacroMes(reporte.getIdestudiante(),
				reporte.getFecha_inicio(), reporte.getFecha_fin());
	}
	
	

	public String ReporteListarAreasMes(beanReporte reporte) {

		return cabeceraPreguntaRepository.ReporteListarAreasMes(reporte.getIdestudiante(), reporte.getFecha_inicio(),
				reporte.getFecha_fin());
	}
	
	public String ReporteListarAreasMesPresencial(beanReporte reporte) {

		return cabeceraPreguntaRepository.ReporteListarAreasMesPresencial(reporte.getIdestudiante(), reporte.getFecha_inicio(),
				reporte.getFecha_fin());
	}
	
	public String ReporteListarAreasMesPresencialUni(beanReporte reporte) {

		return cabeceraPreguntaRepository.ReporteListarAreasMesPresencialUni(reporte.getIdestudiante(), reporte.getFecha_inicio(),
				reporte.getFecha_fin());
	}

	public String ReporteListarDatosEstudianteMeses(beanReporte reporte) {

		return cabeceraPreguntaRepository.ReporteListarDatosEstudiante(reporte.getIdestudiante(),
				reporte.getFecha_inicio(), reporte.getFecha_fin());
	}

	public String ReporteListarDetalleSimulacroMeses(beanReporte reporte) {

		return cabeceraPreguntaRepository.ReporteListarDetalleSimulacroMeses(reporte.getIdestudiante(),
				reporte.getFecha_inicio(), reporte.getFecha_fin(), reporte.getMinimo(), reporte.getMaximo());
	}

	public String ReporteDatosEstudianteUni(beanReporte reporte) {

		return cabeceraPreguntaRepository.ReporteDatosEstudianteUni(reporte.getIdestudiante(),
				reporte.getFecha_inicio(), reporte.getFecha_fin());
	}

	public String f_cargar_examenes() {

		return cabeceraPreguntaRepository.f_cargar_examenes();
	}
}
