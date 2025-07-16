package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="recurso")

@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery(name = "funcion_registrar_recurso", procedureName = "funcion_registrar_recurso", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idanio", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idcurso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_mes", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_ruta_recurso", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_listar_recursos_administrador", procedureName = "funcion_listar_recursos_administrador", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcurso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idanio", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_mes", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_eliminar_recurso", procedureName = "funcion_eliminar_recurso", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idrecurso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_actualizar_orden_recurso", procedureName = "f_actualizar_orden_recurso", parameters = {

                @StoredProcedureParameter(mode = ParameterMode.IN, name = "lista_recursos", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) })

					
})

public class Recurso {

	
	@Id
	@Column(name="idrecurso")
	private int idrecurso;
	@Column(name="idanio")
	private int idanio;
	@Column(name="idcurso")
	private int idcurso;
	@Column(name="idciclo")
	private int idciclo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="fecha_registro")
	private Date fecha_registro;
	@Column(name="mes")
	private int mes;
	@Column(name="ruta_recurso")
	private String ruta_recurso;
	@Column(name="estado")
	private int estado;
	
	public Recurso() {
		super();
	}

	public Recurso(int idrecurso, int idanio, int idcurso, int idciclo, String nombre, Date fecha_registro, int mes,
			String ruta_recurso, int estado) {
		super();
		this.idrecurso = idrecurso;
		this.idanio = idanio;
		this.idcurso = idcurso;
		this.idciclo = idciclo;
		this.nombre = nombre;
		this.fecha_registro = fecha_registro;
		this.mes = mes;
		this.ruta_recurso = ruta_recurso;
		this.estado = estado;
	}

	public int getIdrecurso() {
		return idrecurso;
	}

	public void setIdrecurso(int idrecurso) {
		this.idrecurso = idrecurso;
	}

	public int getIdanio() {
		return idanio;
	}

	public void setIdanio(int idanio) {
		this.idanio = idanio;
	}

	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public int getIdciclo() {
		return idciclo;
	}

	public void setIdciclo(int idciclo) {
		this.idciclo = idciclo;
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

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String getRuta_recurso() {
		return ruta_recurso;
	}

	public void setRuta_recurso(String ruta_recurso) {
		this.ruta_recurso = ruta_recurso;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}


}
