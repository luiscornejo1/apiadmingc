package com.rosettcompany.grupoCiencia.repositoryI;

import java.sql.Date;
import java.sql.Time;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Historial;
import com.rosettcompany.grupoCiencia.repository.HistorialAcceso;

@Repository
public interface HistorialAccesoRepositoryI extends CrudRepository<HistorialAcceso, Integer> {

	@Procedure(name = "insertar_historial_faltas")
	public String insertar_historial_faltas(@Param("in_fecha_registro") Date in_fecha_registro);

	@Procedure(name = "f_listar_asistencias")
	public String f_listar_asistencias(@Param("in_rows") int in_rows, @Param("in_idusuario") int in_idusuario,
			@Param("in_buscar") String buscar);

	@Procedure(name = "f_listar_asistencias_total")
	public String f_listar_asistencias_total(@Param("in_observaciones") String observaciones);

	@Procedure(name = "f_insertar_historial_acceso")
	public String f_insertar_historial_acceso(@Param("in_idusuario") int idusuario,
			@Param("in_idestudiante") int idestudiante, @Param("in_observaciones") String observaciones);

	@Procedure(name = "f_detalle_asistencia_anual")
	public String f_detalle_asistencia_anual(@Param("in_idestudiante") int in_idestudiante,
			@Param("in_anio") int in_anio);
	
	@Procedure(name = "f_buscar_asistencias_fecha")
	public String f_buscar_asistencias_fecha(@Param("in_condicion") String observaciones);

	@Procedure(name = "f_justificar_asistencia")
	public String f_justificar_asistencia(@Param("in_idusuario") int idusuario,
			@Param("in_idhistorialacceso") int idhistorialacceso, @Param("in_observaciones") String observaciones,
			@Param("in_documento") String documento, @Param("in_estado") String in_estado);

	@Procedure(name = "f_listar_resumen_asistencias")
	public String f_listar_resumen_asistencias(@Param("in_idusuario") int idusuario,
			@Param("in_observaciones") String observaciones, @Param("in_mes_inicio") String mes_inicio);
	
	@Procedure(name = "f_listar_resumen_asistencias_virtual")
	public String f_listar_resumen_asistencias_virtual(@Param("in_idusuario") int idusuario,
			@Param("in_observaciones") String observaciones, @Param("in_mes_inicio") String mes_inicio);

	@Procedure(name = "f_listar_resumen_asistencias_idestudiante")
	public String f_listar_resumen_asistencias_idestudiante(@Param("in_idestudiante") int idestudiante,
			@Param("in_mes_inicio") String mes_inicio);
}
