package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;
import java.sql.Time;

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
@Table(name="historial_seguimiento")

@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery(name = "listar_historial", procedureName = "f_listar_historial", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_insertar_historial_seguimiento", procedureName = "f_insertar_historial_seguimiento", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_actividad", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
					
})
public class Historial {
	
	@Id
	@Column(name="idhistorial")
	private int idhistorial;
	
	@ManyToOne
	@JoinColumn(name="idusuario")
	private Usuarios idusuario;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="hora")
	private Time hora;
	
	@Column(name="actividad")
	private String actividad;

	public Historial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Historial(int idhistorial, Usuarios idusuario, Date fecha, Time hora, String actividad) {
		super();
		this.idhistorial = idhistorial;
		this.idusuario = idusuario;
		this.fecha = fecha;
		this.hora = hora;
		this.actividad = actividad;
	}

	public int getIdhistorial() {
		return idhistorial;
	}

	public void setIdhistorial(int idhistorial) {
		this.idhistorial = idhistorial;
	}

	public Usuarios getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Usuarios idusuario) {
		this.idusuario = idusuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	
	
}
