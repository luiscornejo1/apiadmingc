package com.rosettcompany.grupoCiencia.repositoryI;

import java.sql.Date;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.PreciosEntity;

@Repository
public interface PreciosRepositoryI extends CrudRepository<PreciosEntity, Integer> {
	@Procedure(name = "f_filtrar_precio_ciclo")
	public String f_filtrar_precio_ciclo(@Param("in_iduniversidad") int iduniversidad,
			@Param("in_idciclonormalizado") int idciclonormalizado, @Param("in_idmodalidad") int idmodalidad);

	@Procedure(name = "f_actualizar_precio_ciclo")
	public String f_actualizar_precio_ciclo(@Param("in_idciclonormalizado") int idciclonormalizado,
			@Param("in_idmodalidad") int idmodalidad, @Param("in_precio") double precio,
			@Param("in_precio_preventa") double precio_preventa, @Param("in_fecha_preventa") Date fecha_preventa,
			@Param("in_precio_promocion") double precio_promocion, @Param("in_precio_mensual") double in_precio_mensual,
			@Param("in_cuotas") int cuotas, @Param("in_inscripcion") double inscripcion);
}
