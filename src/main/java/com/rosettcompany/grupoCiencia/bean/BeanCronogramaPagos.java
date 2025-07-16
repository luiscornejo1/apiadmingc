package com.rosettcompany.grupoCiencia.bean;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

public class BeanCronogramaPagos {

	public int idcronogramapagos;
	public int idsolicitud;
	private Integer idcronogramapagosjson;
	public String dniestudiante;
	public int idciclonormalizado;
	private List<VencimientoMontoMetodoEstado> vencimiento_monto_metodo_estado;
	public int estado;
	private String dni;

	public BeanCronogramaPagos() {
		super();
	}

	public BeanCronogramaPagos(int idcronogramapagos, int idsolicitud, Integer idcronogramapagosjson,
			String dniestudiante, int idciclonormalizado,
			List<VencimientoMontoMetodoEstado> vencimiento_monto_metodo_estado, int estado, String dni) {
		super();
		this.idcronogramapagos = idcronogramapagos;
		this.idsolicitud = idsolicitud;
		this.idcronogramapagosjson = idcronogramapagosjson;
		this.dniestudiante = dniestudiante;
		this.idciclonormalizado = idciclonormalizado;
		this.vencimiento_monto_metodo_estado = vencimiento_monto_metodo_estado;
		this.estado = estado;
		this.dni = dni;
	}

	public int getIdcronogramapagos() {
		return idcronogramapagos;
	}

	public void setIdcronogramapagos(int idcronogramapagos) {
		this.idcronogramapagos = idcronogramapagos;
	}

	public int getIdsolicitud() {
		return idsolicitud;
	}

	public void setIdsolicitud(int idsolicitud) {
		this.idsolicitud = idsolicitud;
	}

	public Integer getIdcronogramapagosjson() {
		return idcronogramapagosjson;
	}

	public void setIdcronogramapagosjson(Integer idcronogramapagosjson) {
		this.idcronogramapagosjson = idcronogramapagosjson;
	}

	public String getDniestudiante() {
		return dniestudiante;
	}

	public void setDniestudiante(String dniestudiante) {
		this.dniestudiante = dniestudiante;
	}

	public int getIdciclonormalizado() {
		return idciclonormalizado;
	}

	public void setIdciclonormalizado(int idciclonormalizado) {
		this.idciclonormalizado = idciclonormalizado;
	}

	public List<VencimientoMontoMetodoEstado> getVencimiento_monto_metodo_estado() {
		return vencimiento_monto_metodo_estado;
	}

	public void setVencimiento_monto_metodo_estado(List<VencimientoMontoMetodoEstado> vencimiento_monto_metodo_estado) {
		this.vencimiento_monto_metodo_estado = vencimiento_monto_metodo_estado;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}