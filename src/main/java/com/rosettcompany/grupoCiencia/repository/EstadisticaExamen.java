package com.rosettcompany.grupoCiencia.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="estadistica_examen")

@NamedStoredProcedureQueries(value = {
		@NamedStoredProcedureQuery(name = "funcion_listar_estadisticas_biblioteca", procedureName = "funcion_listar_estadisticas_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsemestre", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcurso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),	
		
		@NamedStoredProcedureQuery(name = "funcion_listar_estadisticas_administrador", procedureName = "funcion_listar_estadisticas_administrador", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsemestre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idanio", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_listar_cursos_universidad_estadistica", procedureName = "funcion_listar_cursos_universidad_estadistica", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_insertar_estadistica_administrador", procedureName = "funcion_insertar_estadistica_administrador", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsemestre", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_insertar_detalle_estadistica_administrador", procedureName = "funcion_insertar_detalle_estadistica_administrador", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_listatemas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_eliminar_estadistica", procedureName = "funcion_eliminar_estadistica", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idestadistica", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
})
public class EstadisticaExamen {

	@Id
	@Column(name="idestadistica")
	private int idestadistica;
	@Column(name="iduniversidad")
	private int iduniversidad;
	@Column(name="idsemestre")
	private int idsemestre;
	@Column(name="nombre_estadistica")
	private String nombre_estadistica;
	public EstadisticaExamen() {
		super();
	}
	public EstadisticaExamen(int idestadistica, int iduniversidad, int idsemestre, String nombre_estadistica) {
		super();
		this.idestadistica = idestadistica;
		this.iduniversidad = iduniversidad;
		this.idsemestre = idsemestre;
		this.nombre_estadistica = nombre_estadistica;
	}
	public int getIdestadistica() {
		return idestadistica;
	}
	public void setIdestadistica(int idestadistica) {
		this.idestadistica = idestadistica;
	}
	public int getIduniversidad() {
		return iduniversidad;
	}
	public void setIduniversidad(int iduniversidad) {
		this.iduniversidad = iduniversidad;
	}
	public int getIdsemestre() {
		return idsemestre;
	}
	public void setIdsemestre(int idsemestre) {
		this.idsemestre = idsemestre;
	}
	public String getNombre_estadistica() {
		return nombre_estadistica;
	}
	public void setNombre_estadistica(String nombre_estadistica) {
		this.nombre_estadistica = nombre_estadistica;
	}
	
	
}
