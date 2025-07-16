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
@Table(name="areas_carrera")

@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery(name = "listar_areas_carreras_universidad", procedureName = "f_listar_areas_carreras_universidad", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_universidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "listar_cursos_por_area", procedureName = "f_listar_cursos_por_area", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_area", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "guardar_puntajes_preguntas", procedureName = "f_guardar_puntajes_preguntas", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_area", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_pregunta_correcta", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_pregunta_incorrecta", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_pregunta_blanco", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "listar_configuracion_examen", procedureName = "f_listar_configuracion_examen", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		
					
})
public class AreasCarrera {

	@Id
	@Column(name="idarea")
	private int idarea;
	
	@ManyToOne
	@JoinColumn(name="iduniversidad")
	private Universidad iduniversidad;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="pregunta_correcta")
	private double pregunta_correcta;
	
	@Column(name="pregunta_incorrecta")
	private double pregunta_incorrecta;
	
	@Column(name="pregunta_en_blanco")
	private double pregunta_en_blanco;
	
	@Column(name="fecha_creacion")
	private Date fecha_creacion;
	
	public AreasCarrera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AreasCarrera(int idarea, Universidad iduniversidad, String nombre, String descripcion,
			double pregunta_correcta, double pregunta_incorrecta, double pregunta_en_blanco, Date fecha_creacion) {
		super();
		this.idarea = idarea;
		this.iduniversidad = iduniversidad;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.pregunta_correcta = pregunta_correcta;
		this.pregunta_incorrecta = pregunta_incorrecta;
		this.pregunta_en_blanco = pregunta_en_blanco;
		this.fecha_creacion = fecha_creacion;
	}

	public int getIdarea() {
		return idarea;
	}

	public void setIdarea(int idarea) {
		this.idarea = idarea;
	}

	public Universidad getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(Universidad iduniversidad) {
		this.iduniversidad = iduniversidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPregunta_correcta() {
		return pregunta_correcta;
	}

	public void setPregunta_correcta(double pregunta_correcta) {
		this.pregunta_correcta = pregunta_correcta;
	}

	public double getPregunta_incorrecta() {
		return pregunta_incorrecta;
	}

	public void setPregunta_incorrecta(double pregunta_incorrecta) {
		this.pregunta_incorrecta = pregunta_incorrecta;
	}

	public double getPregunta_en_blanco() {
		return pregunta_en_blanco;
	}

	public void setPregunta_en_blanco(double pregunta_en_blanco) {
		this.pregunta_en_blanco = pregunta_en_blanco;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	
	
	
}
