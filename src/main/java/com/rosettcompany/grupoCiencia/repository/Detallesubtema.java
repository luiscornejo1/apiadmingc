package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="detallesubtema")

@NamedStoredProcedureQueries(value = {
		
	@NamedStoredProcedureQuery(name = "f_listar_detallesubtema_subsubsubtema", procedureName = "f_listar_detallesubtema_subsubsubtema", parameters = {
			
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_tema", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
})
public class Detallesubtema {

	
	@Id
	@Column(name="id_detalle_subtema")
	private int id_detalle_subtema;
	@Column(name="id_sub_sub_subtema")
	private int id_sub_sub_subtema;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="fecha_creacion")
	private Date fecha_creacion;
	
	public Detallesubtema() {
		super();
	}

	public Detallesubtema(int id_detalle_subtema, int id_sub_sub_subtema, String descripcion, Date fecha_creacion) {
		super();
		this.id_detalle_subtema = id_detalle_subtema;
		this.id_sub_sub_subtema = id_sub_sub_subtema;
		this.descripcion = descripcion;
		this.fecha_creacion = fecha_creacion;
	}

	public int getId_detalle_subtema() {
		return id_detalle_subtema;
	}

	public void setId_detalle_subtema(int id_detalle_subtema) {
		this.id_detalle_subtema = id_detalle_subtema;
	}

	public int getId_sub_sub_subtema() {
		return id_sub_sub_subtema;
	}

	public void setId_sub_sub_subtema(int id_sub_sub_subtema) {
		this.id_sub_sub_subtema = id_sub_sub_subtema;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	
	
}
