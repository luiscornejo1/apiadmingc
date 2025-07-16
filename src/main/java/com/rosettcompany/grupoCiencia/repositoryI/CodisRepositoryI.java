package com.rosettcompany.grupoCiencia.repositoryI;

import java.sql.Date;
import java.sql.Time;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Codis;

@Repository
public interface CodisRepositoryI extends CrudRepository<Codis, Integer> {

	@Procedure(name = "f_insertar_codis")
	public String f_insertar_codis(
			@Param("in_ciclos") String ciclos, 
			@Param("in_iduniversidad") int iduniversidad,
			@Param("in_idcurso") int idcurso,
			@Param("in_idusuario") int in_idusuario,
			@Param("in_fecha_codis") Date fecha_codis, 
			@Param("in_hora_inicio") Time hora_inicio,
			@Param("in_hora_fin") Time hora_fin,
			@Param("in_usuario_registro") int usuario_registro,
			@Param("in_respuesta_ver") boolean respuesta_ver,
			@Param("in_preguntas") String preguntas,
			@Param("in_instruction") String instruccion_profesor,
			@Param("in_preguntas_profesor") String preguntas_profesor);

	@Procedure(name = "f_listar_codis")
	public String f_listar_codis(
			@Param("in_offset") int offset, 
			@Param("in_limit") int limit, 
			@Param("in_idusuario") String nombre,
			@Param("in_fecha_codis") String fecha);
	
	@Procedure(name = "f_descargar_excel_codis_profesores_promedio")
	public String f_descargar_excel_codis_profesores_promedio(
			@Param("in_idusuario") String nombre,
			@Param("in_fecha_codis") String fecha);
	

	
	@Procedure(name = "f_listar_codis_detalle")
	public String f_listar_codis_detalle(
			@Param("in_idcodis") int idcodis);
	

//	@Procedure(name = "f_buscar_codis")
//	public String f_buscar_campaign_cod(@Param("in_codigo") String codigo);

	@Procedure(name = "f_actualizar_codis")
	public String f_actualizar_codis(
			@Param("in_idcodis") int idcodis, 
			@Param("in_idciclo") int idciclo,
			@Param("in_iduniversidad") int iduniversidad, 
			@Param("in_idcurso") int idcurso,
			@Param("in_idusuario") int idusuario,
			@Param("in_fecha_codis") Date fecha_codis,
			@Param("in_hora_inicio") Time hora_inicio,
			@Param("in_hora_fin") Time hora_fin,
			@Param("in_usuario_modifico") int usuario_modificacion,
			@Param("in_preguntas") String preguntas,
			@Param("in_preguntas_profesor") String preguntas_profesor);

	@Procedure(name = "f_eliminar_codis")
	public String f_eliminar_codis(@Param("in_idcodis") int idcodis);
}
