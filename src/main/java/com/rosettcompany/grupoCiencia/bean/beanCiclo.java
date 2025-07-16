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

public class beanCiclo {

	public int idciclo;
	public int iduniversidad;
	public int idciclonormalizado;
	public int idaula;
	public int idmodalidad;
	public int idsede;
	public int idturno;
	public int idnumeracion;
	public int numero_aula;
	public double precio;
	public int idsalon;
	public int idasignacionaula;
	public String salones;

	public beanCiclo() {
		super();
	}

	public beanCiclo(int idciclo, int iduniversidad, int idciclonormalizado, int idaula, int idmodalidad, int idsede,
			int idturno, int idnumeracion, int numero_aula, double precio, int idsalon, int idasignacionaula,
			String salones) {
		super();
		this.idciclo = idciclo;
		this.iduniversidad = iduniversidad;
		this.idciclonormalizado = idciclonormalizado;
		this.idaula = idaula;
		this.idmodalidad = idmodalidad;
		this.idsede = idsede;
		this.idturno = idturno;
		this.idnumeracion = idnumeracion;
		this.numero_aula = numero_aula;
		this.precio = precio;
		this.idsalon = idsalon;
		this.idasignacionaula = idasignacionaula;
		this.salones = salones;
	}

	public int getIdciclo() {
		return idciclo;
	}

	public void setIdciclo(int idciclo) {
		this.idciclo = idciclo;
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

	public int getIdaula() {
		return idaula;
	}

	public void setIdaula(int idaula) {
		this.idaula = idaula;
	}

	public int getIdmodalidad() {
		return idmodalidad;
	}

	public void setIdmodalidad(int idmodalidad) {
		this.idmodalidad = idmodalidad;
	}

	public int getIdsede() {
		return idsede;
	}

	public void setIdsede(int idsede) {
		this.idsede = idsede;
	}

	public int getIdturno() {
		return idturno;
	}

	public void setIdturno(int idturno) {
		this.idturno = idturno;
	}

	public int getIdnumeracion() {
		return idnumeracion;
	}

	public void setIdnumeracion(int idnumeracion) {
		this.idnumeracion = idnumeracion;
	}

	public int getNumero_aula() {
		return numero_aula;
	}

	public void setNumero_aula(int numero_aula) {
		this.numero_aula = numero_aula;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIdsalon() {
		return idsalon;
	}

	public void setIdsalon(int idsalon) {
		this.idsalon = idsalon;
	}

	public int getIdasignacionaula() {
		return idasignacionaula;
	}

	public void setIdasignacionaula(int idasignacionaula) {
		this.idasignacionaula = idasignacionaula;
	}

	public String getSalones() {
		return salones;
	}

	public void setSalones(String salones) {
		this.salones = salones;
	}

	@Override
	public String toString() {
		return "beanCiclo [idciclo=" + idciclo + ", iduniversidad=" + iduniversidad + ", idciclonormalizado="
				+ idciclonormalizado + ", idaula=" + idaula + ", idmodalidad=" + idmodalidad + ", idsede=" + idsede
				+ ", idturno=" + idturno + ", idnumeracion=" + idnumeracion + ", numero_aula=" + numero_aula
				+ ", precio=" + precio + ", idsalon=" + idsalon + ", idasignacionaula=" + idasignacionaula
				+ ", salones=" + salones + "]";
	}

}