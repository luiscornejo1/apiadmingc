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

public class VencimientoMontoMetodoEstado {

	private int idcronogramapagos;
	private String descripcion;
	private String fecha_vencimiento;
	private int precioCiclo;
	private int tipoBeneficio;
	private int montoBeneficio;
	private double montoPagar;
	private int estado;
	private String nIdVenta;
	private String codReferencia;
	private String medioPago;
	private String tipoPago;
	private String banco;
	private String nBoleta;
	private String linkBoletaPDF;
	private String linkBoletaXML;

	public VencimientoMontoMetodoEstado(int idcronogramapagos, String descripcion, String fecha_vencimiento,
			int precioCiclo, int tipoBeneficio, int montoBeneficio, double montoPagar, int estado, String nIdVenta,
			String codReferencia, String medioPago, String tipoPago, String banco, String nBoleta, String linkBoletaPDF,
			String linkBoletaXML) {
		super();
		this.idcronogramapagos = idcronogramapagos;
		this.descripcion = descripcion;
		this.fecha_vencimiento = fecha_vencimiento;
		this.precioCiclo = precioCiclo;
		this.tipoBeneficio = tipoBeneficio;
		this.montoBeneficio = montoBeneficio;
		this.montoPagar = montoPagar;
		this.estado = estado;
		this.nIdVenta = nIdVenta;
		this.codReferencia = codReferencia;
		this.medioPago = medioPago;
		this.tipoPago = tipoPago;
		this.banco = banco;
		this.nBoleta = nBoleta;
		this.linkBoletaPDF = linkBoletaPDF;
		this.linkBoletaXML = linkBoletaXML;
	}

	public int getIdcronogramapagos() {
		return idcronogramapagos;
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

	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public int getPrecioCiclo() {
		return precioCiclo;
	}

	public void setPrecioCiclo(int precioCiclo) {
		this.precioCiclo = precioCiclo;
	}

	public int getTipoBeneficio() {
		return tipoBeneficio;
	}

	public void setTipoBeneficio(int tipoBeneficio) {
		this.tipoBeneficio = tipoBeneficio;
	}

	public int getMontoBeneficio() {
		return montoBeneficio;
	}

	public void setMontoBeneficio(int montoBeneficio) {
		this.montoBeneficio = montoBeneficio;
	}

	public double getMontoPagar() {
		return montoPagar;
	}

	public void setMontoPagar(double montoPagar) {
		this.montoPagar = montoPagar;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getnIdVenta() {
		return nIdVenta;
	}

	public void setnIdVenta(String nIdVenta) {
		this.nIdVenta = nIdVenta;
	}

	public String getCodReferencia() {
		return codReferencia;
	}

	public void setCodReferencia(String codReferencia) {
		this.codReferencia = codReferencia;
	}

	public String getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getnBoleta() {
		return nBoleta;
	}

	public void setnBoleta(String nBoleta) {
		this.nBoleta = nBoleta;
	}

	public String getLinkBoletaPDF() {
		return linkBoletaPDF;
	}

	public void setLinkBoletaPDF(String linkBoletaPDF) {
		this.linkBoletaPDF = linkBoletaPDF;
	}

	public String getLinkBoletaXML() {
		return linkBoletaXML;
	}

	public void setLinkBoletaXML(String linkBoletaXML) {
		this.linkBoletaXML = linkBoletaXML;
	}

}