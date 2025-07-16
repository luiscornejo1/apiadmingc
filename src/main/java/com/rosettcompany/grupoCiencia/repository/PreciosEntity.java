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
@Table(name = "precios")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_filtrar_precio_ciclo", procedureName = "f_filtrar_precio_ciclo", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmodalidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_actualizar_precio_ciclo", procedureName = "f_actualizar_precio_ciclo", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmodalidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_precio", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_precio_preventa", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_preventa", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_precio_promocion", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_precio_mensual", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_cuotas", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_inscripcion", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }), })

public class PreciosEntity {

	@Id
	@Column(name = "idprecios")
	public int idprecios;

	@Column(name = "iduniversidad")
	public int iduniversidad;

	@Column(name = "idciclonormalizado")
	public int idciclonormalizado;

	@Column(name = "idmodalidad")
	public int idmodalidad;

	@Column(name = "precio")
	public double precio;

	@Column(name = "precio_preventa")
	public double precio_preventa;

	@Column(name = "fecha_preventa")
	public Date fecha_preventa;

	@Column(name = "precio_promocion")
	public double precio_promocion;

	@Column(name = "precio_mensual")
	public double precio_mensual;

	@Column(name = "inscripcion")
	public double inscripcion;

	@Column(name = "cuotas")
	public int cuotas;

	@Column(name = "estado")
	public int estado;

	public PreciosEntity() {
		super();
	}

	public PreciosEntity(int idprecios, int iduniversidad, int idciclonormalizado, int idmodalidad, double precio,
			double precio_preventa, Date fecha_preventa, double precio_promocion, double precio_mensual,
			double inscripcion, int cuotas, int estado) {
		super();
		this.idprecios = idprecios;
		this.iduniversidad = iduniversidad;
		this.idciclonormalizado = idciclonormalizado;
		this.idmodalidad = idmodalidad;
		this.precio = precio;
		this.precio_preventa = precio_preventa;
		this.fecha_preventa = fecha_preventa;
		this.precio_promocion = precio_promocion;
		this.precio_mensual = precio_mensual;
		this.inscripcion = inscripcion;
		this.cuotas = cuotas;
		this.estado = estado;
	}

	public PreciosEntity(int idprecios, int iduniversidad, int idciclonormalizado, int idmodalidad, double precio,
			double inscripcion, int cuotas, int estado) {
		super();
		this.idprecios = idprecios;
		this.iduniversidad = iduniversidad;
		this.idciclonormalizado = idciclonormalizado;
		this.idmodalidad = idmodalidad;
		this.precio = precio;
		this.inscripcion = inscripcion;
		this.cuotas = cuotas;
		this.estado = estado;
	}

	public PreciosEntity(int idprecios, int iduniversidad, int idciclonormalizado, int idmodalidad, double precio,
			double precio_mensual, double inscripcion, int cuotas, int estado) {
		super();
		this.idprecios = idprecios;
		this.iduniversidad = iduniversidad;
		this.idciclonormalizado = idciclonormalizado;
		this.idmodalidad = idmodalidad;
		this.precio = precio;
		this.precio_mensual = precio_mensual;
		this.inscripcion = inscripcion;
		this.cuotas = cuotas;
		this.estado = estado;
	}

	public double getPrecio_preventa() {
		return precio_preventa;
	}

	public void setPrecio_preventa(double precio_preventa) {
		this.precio_preventa = precio_preventa;
	}

	public Date getFecha_preventa() {
		return fecha_preventa;
	}

	public void setFecha_preventa(Date fecha_preventa) {
		this.fecha_preventa = fecha_preventa;
	}

	public double getPrecio_promocion() {
		return precio_promocion;
	}

	public void setPrecio_promocion(double precio_promocion) {
		this.precio_promocion = precio_promocion;
	}

	public double getPrecio_mensual() {
		return precio_mensual;
	}

	public void setPrecio_mensual(double precio_mensual) {
		this.precio_mensual = precio_mensual;
	}

	public int getIdprecios() {
		return idprecios;
	}

	public void setIdprecios(int idprecios) {
		this.idprecios = idprecios;
	}

	public int getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(int iduniversidad) {
		this.iduniversidad = iduniversidad;
	}

	public int getIdciclonormalizado() {
		return idciclonormalizado;
	}

	public void setIdciclonormalizado(int idciclonormalizado) {
		this.idciclonormalizado = idciclonormalizado;
	}

	public int getIdmodalidad() {
		return idmodalidad;
	}

	public void setIdmodalidad(int idmodalidad) {
		this.idmodalidad = idmodalidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getinscripcion() {
		return inscripcion;
	}

	public void setinscripcion(double inscripcion) {
		this.inscripcion = inscripcion;
	}

	public int getCuotas() {
		return cuotas;
	}

	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}