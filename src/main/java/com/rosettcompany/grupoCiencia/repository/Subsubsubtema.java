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
@Table(name="subsubsubtema")

@NamedStoredProcedureQueries(value = {
		
	@NamedStoredProcedureQuery(name = "f_listar_subsubsubtema_subsubtema", procedureName = "f_listar_subsubsubtema_subsubtema", parameters = {
			
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_tema", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
})
public class Subsubsubtema {

	
	@Id
	@Column(name="id_sub_sub_subtema")
	private int id_sub_sub_subtema;
	@Column(name="id_sub_subtema")
	private int id_sub_subtema;
	@Column(name="nombre_sub_sub_subtema")
	private String nombre_sub_sub_subtema;
	@Column(name="fecha_creacion")
	private Date fecha_creacion;
	
	public Subsubsubtema() {
		super();
	}

	public Subsubsubtema(int id_sub_sub_subtema, int id_sub_subtema, String nombre_sub_sub_subtema, Date fecha_creacion) {
		super();
		this.id_sub_sub_subtema = id_sub_sub_subtema;
		this.id_sub_subtema = id_sub_subtema;
		this.nombre_sub_sub_subtema = nombre_sub_sub_subtema;
		this.fecha_creacion = fecha_creacion;
	}

	
	public int getId_sub_sub_subtema() {
		return id_sub_sub_subtema;
	}

	public void setId_sub_sub_subtema(int id_sub_sub_subtema) {
		this.id_sub_sub_subtema = id_sub_sub_subtema;
	}

	public int getId_sub_subtema() {
		return id_sub_subtema;
	}

	public void setId_sub_subtema(int id_sub_subtema) {
		this.id_sub_subtema = id_sub_subtema;
	}

	public String getNombre_sub_sub_subtema() {
		return nombre_sub_sub_subtema;
	}

	public void setNombre_sub_sub_subtema(String nombre_sub_sub_subtema) {
		this.nombre_sub_sub_subtema = nombre_sub_sub_subtema;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	


	
	
}
