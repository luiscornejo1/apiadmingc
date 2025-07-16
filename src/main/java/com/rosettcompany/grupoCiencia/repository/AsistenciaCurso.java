package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="asistencia_curso")

@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery(name = "guardar_horario_curso", procedureName = "f_guardar_horario_curso", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_curso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dia", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_indicador", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_eliminar_horario_curso", procedureName = "f_eliminar_horario_curso", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idasistencia", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_horario_curso_por_ciclo", procedureName = "f_listar_horario_curso_por_ciclo", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "listar_asistencia_cursos_ciclos", procedureName = "funcion_listar_asistencia_cursos_ciclos", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dia", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

})
public class AsistenciaCurso {
	
	@Id
	@Column(name="idasistencia")
	private int idasistencia;
	
	@Column(name="idcurso")
	private int idcurso;
	
	@Column(name="dia")
	private int dia;
	
	@Column(name="fecha")
	private Timestamp fecha;
	
	@Column(name="estado")
	private int estado;
	
	@Column(name="idciclo")
	private int idciclo;


	


	public AsistenciaCurso(int idasistencia, int idcurso, int dia, Timestamp fecha, int estado, int idciclo) {
		super();
		this.idasistencia = idasistencia;
		this.idcurso = idcurso;
		this.dia = dia;
		this.fecha = fecha;
		this.estado = estado;
		this.idciclo = idciclo;
	}


	public AsistenciaCurso() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdasistencia() {
		return idasistencia;
	}


	public void setIdasistencia(int idasistencia) {
		this.idasistencia = idasistencia;
	}


	public int getIdcurso() {
		return idcurso;
	}


	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}


	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public Timestamp getFecha() {
		return fecha;
	}


	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}


	public int getIdciclo() {
		return idciclo;
	}


	public void setIdciclo(int idciclo) {
		this.idciclo = idciclo;
	}



}
