package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.rosettcompany.grupoCiencia.repository.EstadisticaExamen;

@Repository
public interface EstadisticaExamenRepositoryI extends CrudRepository<EstadisticaExamen,Integer>{

	@Procedure(name="funcion_listar_estadisticas_biblioteca")
	public String listarEstadisticaExamen(
			@Param("in_idsemestre") int in_idsemestre,
			@Param("in_iduniversidad") int in_iduniversidad,
			@Param("in_idcurso") int in_idcurso
			);
	
	@Procedure(name="funcion_listar_estadisticas_administrador")
	public String listarEstadisticaExamenAdministrador(
			@Param("in_idsemestre") String in_idsemestre,
			@Param("in_iduniversidad") String in_iduniversidad,
			@Param("in_idanio") String in_idanio
			);
	
	@Procedure(name="funcion_listar_cursos_universidad_estadistica")
	public String listarCursosUniversidadEstadistica(
			@Param("in_iduniversidad") int in_iduniversidad
			);
	
	@Procedure(name="funcion_insertar_estadistica_administrador")
	public String insertarEstadisticaAdministrador(
			@Param("in_idsemestre") int in_idsemestre,
			@Param("in_iduniversidad") int in_iduniversidad,
			@Param("in_nombre") String in_nombre
			);
	
	@Procedure(name="funcion_insertar_detalle_estadistica_administrador")
	public String insertarDetalleEstadistica(
			@Param("in_listatemas") String in_listatemas
			);
	
	@Procedure(name="funcion_eliminar_estadistica")
	public String eliminarEstadistica(
			@Param("in_idestadistica") int in_idestadistica
			);
}
