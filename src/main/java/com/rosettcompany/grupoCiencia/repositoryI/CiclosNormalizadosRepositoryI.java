package com.rosettcompany.grupoCiencia.repositoryI;

import java.sql.Date;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.CiclosNormalizadosEntity;

@Repository
public interface CiclosNormalizadosRepositoryI extends CrudRepository<CiclosNormalizadosEntity, Integer>{ 

	@Procedure(name="f_insertar_ciclo_normalizado")
	public String f_insertar_ciclo_normalizado(
			@Param("in_id_universidad") int iduniversidad,
			@Param("in_descripcion") String descripcion,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin,
			@Param("in_duracion_semanas") String duracion_semanas,
			@Param("in_anio") int anio,
			@Param("in_frecuencia_pago") String frecuencia_pago
			);
	
	@Procedure(name="f_actualizar_ciclo_normalizado")
	public String f_actualizar_ciclo_normalizado(
			@Param("in_idciclonormalizado") int in_idciclonormalizado,
			@Param("in_id_universidad") int iduniversidad,
			@Param("in_descripcion") String descripcion,
			@Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin,
			@Param("in_duracion_semanas") String duracion_semanas,
			@Param("in_anio") int anio,
			@Param("in_frecuencia_pago") String frecuencia_pago
			);
	
	@Procedure(name="f_listar_ciclos_normalizados")
	public String f_listar_ciclos_normalizados();
	
	@Procedure(name="f_listar_ciclos_normalizados_activos")
	public String f_listar_ciclos_normalizados_activos();
	
	@Procedure(name="f_listar_ciclos_normalizados_activos_usuario")
	public String f_listar_ciclos_normalizados_activos_usuario(
			@Param("in_usuario") int idusuario);
	
	@Procedure(name="listar_ciclos_normalizados_universidad")
	public String listarCiclosNormalizadosPorUniversidad(
			@Param("in_id_universidad") int iduniversidad
			);
	
	@Procedure(name="f_buscar_ciclos_normalizados_id")
	public String buscarCiclosNormalizadosPorID(
			@Param("in_idciclonormalizado") int idciclonormalizado
			);
	
	@Procedure(name="f_cambiar_visibilidad_ciclo_normalizado")
	public String cambiarVisibilidadCiclo(
			@Param("in_idciclonormalizado") int idciclonormalizado,
			@Param("in_visible_solicitudes") int visible_solicitudes
			);
	
	@Procedure(name="f_eliminar_ciclo_normalizado")
	public String eliminarCicloNormalizado(
			@Param("in_idciclonormalizado") int idciclonormalizado
			);
	
	@Procedure(name="f_prueba_cambiar_cronograma")
	public String f_prueba_cambiar_cronograma(
			@Param("in_idciclonormalizado") int idciclonormalizado
			);
}
