package com.rosettcompany.grupoCiencia.repositoryI;

import java.sql.Date;
import java.sql.Time;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Codis;

@Repository
public interface CodisRespuestaRepositoryI extends CrudRepository<Codis, Integer> {

	@Procedure(name = "f_guardar_respuestas_codis")
	public String f_guardar_respuestas_codis(
			@Param("in_idestudiante") int idestudiante, 
			@Param("in_idcodis") int idcodis,
			@Param("in_respuestas") String respuesta);
	
	@Procedure(name = "f_listar_codis_respuestas_por_estudiante")
	public String f_listar_codis_respuestas_por_estudiante(
			@Param("in_idcodis") int idcodis,
			@Param("in_offset") int offset,
			@Param("in_limit") int limit);
	
	@Procedure(name = "f_listar_codis_respuestas_general")
	public String f_listar_codis_respuestas_general(
			@Param("in_idcodis") int idcodis);

	@Procedure(name = "f_descargar_codis_respuestas")
	public String f_descargar_codis_respuestas(
			@Param("in_idcodis") int idcodis);
	@Procedure(name = "f_listar_codis_por_estudiantes")
	public String f_listar_codis_por_estudiantes(
			@Param("in_idciclo") int idciclo,
			@Param("in_idestudiante") int idestudiante);
	@Procedure(name = "f_descargar_codis_profesores_por_codis")
	public String f_descargar_codis_profesores_por_codis(
		@Param("in_idcodis") int idcodis);
}
