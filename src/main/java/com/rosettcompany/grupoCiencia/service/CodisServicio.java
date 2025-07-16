package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Codis;
import com.rosettcompany.grupoCiencia.repositoryI.CodisRepositoryI;
import com.rosettcompany.grupoCiencia.bean.CodisBean;

@Service
public class CodisServicio {
	@Autowired
	private CodisRepositoryI codisRepositoryI;

	public String f_insertar_codis(CodisBean codis) {
		return codisRepositoryI.f_insertar_codis(
				codis.getCiclos(),
				codis.getIduniversidad(),
				codis.getIdcurso(),
				codis.getIdusuario(),
				codis.getFecha_codis(),
				codis.getHora_inicio(),
				codis.getHora_fin(),
				codis.getUsuario_registro(),
				codis.isRespuesta_ver(),
				codis.getPreguntas(),
				codis.getInstruccion_profesor(),
				codis.getPreguntas_profesor());
	}

	public String f_listar_codis(Codis codis) {
		return codisRepositoryI.f_listar_codis(
				codis.getOffset(),
				codis.getLimit(),
				codis.getNombre(),
				codis.getFecha());
	}
	
	public String f_descargar_excel_codis_profesores_promedio(Codis codis) {
		return codisRepositoryI.f_descargar_excel_codis_profesores_promedio(
				codis.getNombre(),
				codis.getFecha());
	}


	public String f_listar_codis_detalle(int idcodis) {
		return codisRepositoryI.f_listar_codis_detalle(idcodis);
	}

	public String f_eliminar_codis(Codis codis) {
	return codisRepositoryI.f_eliminar_codis(codis.getIdcodis());
}


	public String f_actualizar_codis(Codis codis) {
		return codisRepositoryI.f_actualizar_codis(
				codis.getIdcodis(),
				codis.getIdciclo(),
				codis.getIduniversidad(),
				codis.getIdcurso(),
				codis.getIdusuario(),
				codis.getFecha_codis(),
				codis.getHora_inicio(),
				codis.getHora_fin(),
				codis.getUsuario_modifico(),
				codis.preguntas,
				codis.preguntas_profesor);
	}


}
