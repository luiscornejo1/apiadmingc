package com.rosettcompany.grupoCiencia.bean;

import java.sql.Date;

import javax.persistence.Column;

public class beanPreciosFiltrados {

	private int idciclonormalizado;
	private int idmodalidad;
	private String frecuencia_pago;
	private String descripcion;
	private double precio;
	private double precio_mensual;
	public double precio_preventa;
	public Date fecha_preventa;
	public double precio_promocion;
	private double inscripcion;
	private double descuento;
	private double beca;
	private int cuotas;
	private int duracion_dias;
	private String duracion_semanas;
	private Date fecha_inicio;
	private Date fecha_fin;

	public beanPreciosFiltrados() {
		super();
	}

	@Override
	public String toString() {
		return "beanPreciosFiltrados [idciclonormalizado=" + idciclonormalizado + ", idmodalidad=" + idmodalidad
				+ ", frecuencia_pago=" + frecuencia_pago + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", precio_mensual=" + precio_mensual + ", inscripcion=" + inscripcion + ", descuento=" + descuento
				+ ", beca=" + beca + ", cuotas=" + cuotas + ", duracion_dias=" + duracion_dias + ", duracion_semanas="
				+ duracion_semanas + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + "]";
	}

	public beanPreciosFiltrados(int idciclonormalizado, int idmodalidad, String frecuencia_pago, String descripcion,
			double precio, double precio_mensual, double inscripcion, double descuento, double beca, int cuotas,
			int duracion_dias, String duracion_semanas, Date fecha_inicio, Date fecha_fin) {
		super();
		this.idciclonormalizado = idciclonormalizado;
		this.idmodalidad = idmodalidad;
		this.frecuencia_pago = frecuencia_pago;
		this.descripcion = descripcion;
		this.precio = precio;
		this.precio_mensual = precio_mensual;
		this.inscripcion = inscripcion;
		this.descuento = descuento;
		this.beca = beca;
		this.cuotas = cuotas;
		this.duracion_dias = duracion_dias;
		this.duracion_semanas = duracion_semanas;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
	}

	public beanPreciosFiltrados(int idciclonormalizado, int idmodalidad, String frecuencia_pago, String descripcion,
			double precio, double precio_mensual, double precio_preventa, Date fecha_preventa, double precio_promocion,
			double inscripcion, double descuento, double beca, int cuotas, int duracion_dias, String duracion_semanas,
			Date fecha_inicio, Date fecha_fin) {
		super();
		this.idciclonormalizado = idciclonormalizado;
		this.idmodalidad = idmodalidad;
		this.frecuencia_pago = frecuencia_pago;
		this.descripcion = descripcion;
		this.precio = precio;
		this.precio_mensual = precio_mensual;
		this.precio_preventa = precio_preventa;
		this.fecha_preventa = fecha_preventa;
		this.precio_promocion = precio_promocion;
		this.inscripcion = inscripcion;
		this.descuento = descuento;
		this.beca = beca;
		this.cuotas = cuotas;
		this.duracion_dias = duracion_dias;
		this.duracion_semanas = duracion_semanas;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
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

	public int getIdciclonormalizado() {
		return idciclonormalizado;
	}

	public void setIdciclonormalizado(int idciclonormalizado) {
		this.idciclonormalizado = idciclonormalizado;
	}

	public String getFrecuencia_pago() {
		return frecuencia_pago;
	}

	public void setFrecuencia_pago(String frecuencia_pago) {
		this.frecuencia_pago = frecuencia_pago;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getBeca() {
		return beca;
	}

	public void setBeca(double beca) {
		this.beca = beca;
	}

	public int getCuotas() {
		return cuotas;
	}

	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
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

	public int getIdmodalidad() {
		return idmodalidad;
	}

	public void setIdmodalidad(int idmodalidad) {
		this.idmodalidad = idmodalidad;
	}

	public double getInscripcion() {
		return inscripcion;
	}

	public void setInscripcion(double inscripcion) {
		this.inscripcion = inscripcion;
	}

}