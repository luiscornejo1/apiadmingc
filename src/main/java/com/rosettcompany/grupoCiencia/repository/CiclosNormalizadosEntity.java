package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name = "ciclos_normalizados")

@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery(name = "f_insertar_ciclo_normalizado", procedureName = "f_insertar_ciclo_normalizado", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_universidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_descripcion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_duracion_semanas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_anio", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_frecuencia_pago", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_actualizar_ciclo_normalizado", procedureName = "f_actualizar_ciclo_normalizado", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_universidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_descripcion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_duracion_semanas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_anio", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_frecuencia_pago", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "listar_ciclos_normalizados_universidad", procedureName = "f_listar_ciclos_normalizados_universidad", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_universidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_ciclos_normalizados_activos_usuario", procedureName = "f_listar_ciclos_normalizados_activos_usuario", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_buscar_ciclos_normalizados_id", procedureName = "f_buscar_ciclos_normalizados_id", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_cambiar_visibilidad_ciclo_normalizado", procedureName = "f_cambiar_visibilidad_ciclo_normalizado", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_visible_solicitudes", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_eliminar_ciclo_normalizado", procedureName = "f_eliminar_ciclo_normalizado", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_prueba_cambiar_cronograma", procedureName = "f_prueba_cambiar_cronograma", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
})

public class CiclosNormalizadosEntity {

	@Id
	@Column(name = "idciclonormalizado")
	public int idciclonormalizado;

	@Column(name = "iduniversidad")
	public int iduniversidad;

	@Column(name = "descripcion")
	public String descripcion;

	@Column(name = "anio")
	public int anio;

	@Column(name = "frecuencia_pago")
	public String frecuencia_pago;

	@Column(name = "fecha_creacion")
	public Date fecha_creacion;

	@Column(name = "estado")
	public int estado;

	@Column(name = "fecha_inicio")
	public Date fecha_inicio;

	@Column(name = "fecha_fin")
	public Date fecha_fin;

	@Column(name = "duracion_dias")
	public int duracion_dias;

	@Column(name = "duracion_semanas")
	public String duracion_semanas;
	
	@Column(name = "visible_solicitudes")
	public int visible_solicitudes;

	public int idusuario;
	

	public CiclosNormalizadosEntity(int idciclonormalizado, int iduniversidad, String descripcion, int anio,
			String frecuencia_pago, Date fecha_creacion, int estado, Date fecha_inicio, Date fecha_fin,
			int duracion_dias, String duracion_semanas, int visible_solicitudes, int idusuario) {
		super();
		this.idciclonormalizado = idciclonormalizado;
		this.iduniversidad = iduniversidad;
		this.descripcion = descripcion;
		this.anio = anio;
		this.frecuencia_pago = frecuencia_pago;
		this.fecha_creacion = fecha_creacion;
		this.estado = estado;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.duracion_dias = duracion_dias;
		this.duracion_semanas = duracion_semanas;
		this.visible_solicitudes = visible_solicitudes;
		this.iduniversidad = idusuario;
	}

	public CiclosNormalizadosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdciclonormalizado() {
		return idciclonormalizado;
	}

	public void setIdciclonormalizado(int idciclonormalizado) {
		this.idciclonormalizado = idciclonormalizado;
	}

	public int getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(int iduniversidad) {
		this.iduniversidad = iduniversidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getFrecuencia_pago() {
		return frecuencia_pago;
	}

	public void setFrecuencia_pago(String frecuencia_pago) {
		this.frecuencia_pago = frecuencia_pago;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public int getDuracion_dias() {
		return duracion_dias;
	}

	public void setDuracion_dias(int duracion_dias) {
		this.duracion_dias = duracion_dias;
	}

	public String getDuracion_semanas() {
		return duracion_semanas;
	}

	public void setDuracion_semanas(String duracion_semanas) {
		this.duracion_semanas = duracion_semanas;
	}

	public int getVisible_solicitudes() {
		return visible_solicitudes;
	}

	public void setVisible_solicitudes(int visible_solicitudes) {
		this.visible_solicitudes = visible_solicitudes;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	
	

}