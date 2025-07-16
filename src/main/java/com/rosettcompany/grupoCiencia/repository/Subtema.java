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
@Table(name="subtema")

@NamedStoredProcedureQueries(value = {
		
	@NamedStoredProcedureQuery(name = "f_listar_subtema_temanormalizado", procedureName = "f_listar_subtema_temanormalizado", parameters = {
			
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_tema", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
	

})
public class Subtema {

	
	@Id
	@Column(name="id_subtema")
	private int id_subtema;
	@Column(name="idtemanormalizado")
	private int idtemanormalizado;
	@Column(name="nombre_subtema")
	private String nombre_subtema;
	@Column(name="fecha_creacion")
	private Date fecha_creacion;
	
	public Subtema() {
		super();
	}

	public Subtema(int id_subtema, int idtemanormalizado, String nombre_subtema, Date fecha_creacion) {
		super();
		this.id_subtema = id_subtema;
		this.idtemanormalizado = idtemanormalizado;
		this.nombre_subtema = nombre_subtema;
		this.fecha_creacion = fecha_creacion;
	}

	

	public int getId_subtema() {
		return id_subtema;
	}

	public void setId_subtema(int id_subtema) {
		this.id_subtema = id_subtema;
	}

	public int getIdtemanormalizado() {
		return idtemanormalizado;
	}

	public void setIdtemanormalizado(int idtemanormalizado) {
		this.idtemanormalizado = idtemanormalizado;
	}

	public String getNombre_subtema() {
		return nombre_subtema;
	}

	public void setNombre_subtema(String nombre_subtema) {
		this.nombre_subtema = nombre_subtema;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	
	
}
