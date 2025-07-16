package com.rosettcompany.grupoCiencia.repositoryI;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.rosettcompany.grupoCiencia.repository.AsistenciaCurso;

@Repository
public interface AsistenciaCursoRepositoryI extends CrudRepository<AsistenciaCurso,Integer>{
	
	@Procedure(name="guardar_horario_curso")
	public String guardarHorarioCurso(
			@Param("in_id_curso") int idcurso,
			@Param("in_dia") int dia,
			@Param("in_fecha") String fecha,
			@Param("in_indicador") int indicador,
			@Param("in_idciclo") int idciclo
			);
	
	@Procedure(name="f_eliminar_horario_curso")
	public String eliminarHorarioCurso(
			@Param("in_idasistencia") int idcurso
			);
	
	@Procedure(name="f_listar_horario_curso_por_ciclo")
	public String listarHorarioCurso(
			@Param("in_idciclo") int idcurso
			);
	
	@Procedure(name="listar_asistencia_cursos_ciclos")
	public String listarEstadisticaExamen(
			@Param("in_idciclo") int in_idciclo,
			@Param("in_dia") int in_dia
			);
}
