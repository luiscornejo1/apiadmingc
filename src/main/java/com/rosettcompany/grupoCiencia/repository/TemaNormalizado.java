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
@Table(name="tema_normalizado")

@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery(name = "f_listar_tema_normalizado", procedureName = "f_listar_tema_normalizado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

	@NamedStoredProcedureQuery(name = "actualizar_temas_normalizado", procedureName = "f_actualizar_temas_normalizados", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_tema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_curso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_subtema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_subsubtema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_subsubsubtema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_detallesubtema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre_tema", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
	
})
public class TemaNormalizado {

	
	@Id
	@Column(name="idtemanormalizado")
	private int idtemanormalizado;
	@Column(name="idcurso")
	private int idcurso;
	@Column(name="nombre")
	private String nombre;
	@Column(name="fecha_creacion")
	private Date fecha_creacion;
	
	public TemaNormalizado() {
		super();
	}


	public TemaNormalizado(int idtemanormalizado, int idcurso, String nombre, Date fecha_creacion) {
		super();
		this.idtemanormalizado = idtemanormalizado;
		this.idcurso = idcurso;
		this.nombre = nombre;
		this.fecha_creacion = fecha_creacion;
	}



	public int getIdtemanormalizado() {
		return idtemanormalizado;
	}


	public void setIdtemanormalizado(int idtemanormalizado) {
		this.idtemanormalizado = idtemanormalizado;
	}


	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}


	@Override
	public String toString() {
		return "TemaNormalizado [idtemanormalizado=" + idtemanormalizado + ", idcurso=" + idcurso + ", nombre=" + nombre
				+ ", fecha_creacion=" + fecha_creacion + "]";
	}

}
