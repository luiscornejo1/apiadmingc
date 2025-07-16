package com.rosettcompany.grupoCiencia.bean;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

public class CronogramaTempEntity {

	public int idcronogramapagos;

	public String descripcion;

	public Date fecha_vencimiento;

	public Date fecha_pago;

	public double preciociclo;

	public int tipobeneficio;

	public double montobeneficio;

	public double antesbeneficio;

	public String motivo_beneficio;

	public double montopagar;

	public double inscripcion;

	public String nidventa;

	public String codreferencia;

	public String mediopago;

	public String tipopago;

	public String banco;

	public String nboleta;

	public String linkboletapdf;

	public String linkboletaxml;

	public int estado;
	public int idsolicitud;

	public CronogramaTempEntity() {
		super();
	}

	public CronogramaTempEntity(int idcronogramapagos, String descripcion, Date fecha_vencimiento, Date fecha_pago,
			double preciociclo, int tipobeneficio, double montobeneficio, double antesbeneficio, double montopagar,
			double inscripcion, String nidventa, String codreferencia, String mediopago, String tipopago, String banco,
			String nboleta, String linkboletapdf, String linkboletaxml, int estado) {
		super();
		this.idcronogramapagos = idcronogramapagos;
		this.descripcion = descripcion;
		this.fecha_vencimiento = fecha_vencimiento;
		this.fecha_pago = fecha_pago;
		this.preciociclo = preciociclo;
		this.tipobeneficio = tipobeneficio;
		this.montobeneficio = montobeneficio;
		this.antesbeneficio = antesbeneficio;
		this.montopagar = montopagar;
		this.inscripcion = inscripcion;
		this.nidventa = nidventa;
		this.codreferencia = codreferencia;
		this.mediopago = mediopago;
		this.tipopago = tipopago;
		this.banco = banco;
		this.nboleta = nboleta;
		this.linkboletapdf = linkboletapdf;
		this.linkboletaxml = linkboletaxml;
		this.estado = estado;
	}

	public int getIdsolicitud() {
		return idsolicitud;
	}

	public void setIdsolicitud(int idsolicitud) {
		this.idsolicitud = idsolicitud;
	}

	public double getInscripcion() {
		return inscripcion;
	}

	public void setInscripcion(double inscripcion) {
		this.inscripcion = inscripcion;
	}

	public Date getFecha_pago() {
		return fecha_pago;
	}

	public void setFecha_pago(Date fecha_pago) {
		this.fecha_pago = fecha_pago;
	}

	public void setIdcronogramapagos(int idcronogramapagos) {
		this.idcronogramapagos = idcronogramapagos;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public double getpreciociclo() {
		return preciociclo;
	}

	public void setpreciociclo(double preciociclo) {
		this.preciociclo = preciociclo;
	}

	public int gettipobeneficio() {
		return tipobeneficio;
	}

	public void settipobeneficio(int tipobeneficio) {
		this.tipobeneficio = tipobeneficio;
	}

	public double getmontobeneficio() {
		return montobeneficio;
	}

	public void setmontobeneficio(double montobeneficio) {
		this.montobeneficio = montobeneficio;
	}

	public double getmontopagar() {
		return montopagar;
	}

	public void setmontopagar(double montopagar) {
		this.montopagar = montopagar;
	}

	public String getnidventa() {
		return nidventa;
	}

	public void setnidventa(String nidventa) {
		this.nidventa = nidventa;
	}

	public String getcodreferencia() {
		return codreferencia;
	}

	public void setcodreferencia(String codreferencia) {
		this.codreferencia = codreferencia;
	}

	public String getmediopago() {
		return mediopago;
	}

	public void setmediopago(String mediopago) {
		this.mediopago = mediopago;
	}

	public String gettipopago() {
		return tipopago;
	}

	public void settipopago(String tipopago) {
		this.tipopago = tipopago;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getnboleta() {
		return nboleta;
	}

	public void setnboleta(String nboleta) {
		this.nboleta = nboleta;
	}

	public String getlinkboletapdf() {
		return linkboletapdf;
	}

	public void setlinkboletapdf(String linkboletapdf) {
		this.linkboletapdf = linkboletapdf;
	}

	public String getlinkboletaxml() {
		return linkboletaxml;
	}

	public void setlinkboletaxml(String linkboletaxml) {
		this.linkboletaxml = linkboletaxml;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public double getAntesbeneficio() {
		return antesbeneficio;
	}

	public void setAntesbeneficio(double antesbeneficio) {
		this.antesbeneficio = antesbeneficio;
	}

	public String getMotivo_beneficio() {
		return motivo_beneficio;
	}

	public void setMotivo_beneficio(String motivo_beneficio) {
		this.motivo_beneficio = motivo_beneficio;
	}

}