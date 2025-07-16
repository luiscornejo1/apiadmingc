package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="carreras")

@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery(name = "listar_carreras", procedureName = "f_listar_carreras", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_universidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		
					
})

public class Carrera {

	@Id
	@Column(name="idcarrera")
	private int idcarrera;
	
	@ManyToOne
	@JoinColumn(name="idarea")
	private AreasCarrera idarea;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="fecha_registro")
	private Date fecha_registro;
	
	@Column(name="estado")
	private int estado;

	public Carrera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carrera(int idcarrera, AreasCarrera idarea, String nombre, Date fecha_registro, int estado) {
		super();
		this.idcarrera = idcarrera;
		this.idarea = idarea;
		this.nombre = nombre;
		this.fecha_registro = fecha_registro;
		this.estado = estado;
	}

	public int getIdcarrera() {
		return idcarrera;
	}

	public void setIdcarrera(int idcarrera) {
		this.idcarrera = idcarrera;
	}

	public AreasCarrera getIdarea() {
		return idarea;
	}

	public void setIdarea(AreasCarrera idarea) {
		this.idarea = idarea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
