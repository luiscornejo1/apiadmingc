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
@Table(name = "comuniados")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "funcion_registrar_comunicado", procedureName = "funcion_registrar_comunicado", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_resumen", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_descripcion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_universidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_actualizar_comunicado", procedureName = "funcion_actualizar_comunicado", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idcomunicado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_descripcion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_universidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_listar_comunicados", procedureName = "funcion_listar_comunicados", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_indicador", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_eliminar_comunicado", procedureName = "funcion_eliminar_comunicado", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idcomunicado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_registrar_comunicado_landing", procedureName = "funcion_registrar_comunicado_landing", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_descripcion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_actualizar_comunicado_landing", procedureName = "funcion_actualizar_comunicado_landing", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idcomunicado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_descripcion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_listar_comunicados_landing", procedureName = "funcion_listar_comunicados_landing", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_indicador", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_eliminar_comunicado_landing", procedureName = "funcion_eliminar_comunicado_landing", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idcomunicado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_return_pdf", procedureName = "funcion_return_pdf", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_indicador", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

})

public class Comunicado {

	@Id
	@Column(name = "idcomunicado")
	public int idcomunicado;
	@Column(name = "idciclo")
	public int idciclo;
	@Column(name = "fecha_inicio")
	public Date fecha_inicio;
	@Column(name = "fecha_fin")
	public Date fecha_fin;
	@Column(name = "resumen")
	public String resumen;
	@Column(name = "descripcion")
	public String descripcion;
	@Column(name = "estado")
	public int estado;

	@Column(name = "universidad")
	public int universidad;

	public Comunicado() {
		super();
	}

	public Comunicado(int idcomunicado, int idciclo, Date fecha_inicio, Date fecha_fin, String resumen,
			String descripcion, int estado, int universidad) {
		super();
		this.idcomunicado = idcomunicado;
		this.idciclo = idciclo;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.resumen = resumen;
		this.descripcion = descripcion;
		this.estado = estado;
		this.universidad = universidad;
	}

	public int getIdcomunicado() {
		return idcomunicado;
	}

	public void setIdcomunicado(int idcomunicado) {
		this.idcomunicado = idcomunicado;
	}

	public int getIdciclo() {
		return idciclo;
	}

	public void setIdciclo(int idciclo) {
		this.idciclo = idciclo;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getUniversidad() {
		return universidad;
	}

	public void setUniversidad(int universidad) {
		this.universidad = universidad;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

}
