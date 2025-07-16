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
@Table(name="temas")

@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery(name = "listar_temas", procedureName = "f_listar_temas", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		
		@NamedStoredProcedureQuery(name = "insertar_temas", procedureName = "f_insertar_temas", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_curso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre_tema", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
					
	@NamedStoredProcedureQuery(name = "actualizar_temas", procedureName = "f_actualizar_temas", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_tema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_curso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre_tema", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
					
	@NamedStoredProcedureQuery(name = "buscar_temas", procedureName = "f_buscar_temas", parameters = {
			
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre_tema", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
	
	@NamedStoredProcedureQuery(name = "f_eliminar_tema", procedureName = "f_eliminar_tema", parameters = {
			
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idtema", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
	
	@NamedStoredProcedureQuery(name = "f_listar_temas_cursos", procedureName = "f_listar_temas_cursos", parameters = {
			
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_curso", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
	
	@NamedStoredProcedureQuery(name = "f_listar_tema_normalizado_cursos", procedureName = "f_listar_tema_normalizado_cursos", parameters = {
			
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_curso", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
	
	@NamedStoredProcedureQuery(name = "f_actualizar_orden_temas_mantenimiento", procedureName = "f_actualizar_orden_temas_mantenimiento", parameters = {
			
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "lista_temas", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
	
	
})
public class Tema {

	
	@Id
	@Column(name="idtema")
	private int idtema;
	@Column(name="idcurso")
	private int idcurso;
	@Column(name="nombre_tema")
	private String nombre_tema;
	@Column(name="fecha_creacion")
	private Date fecha_creacion;
	
	public Tema() {
		super();
	}

	public Tema(int idtema, int idcurso, String nombre_tema, Date fecha_creacion) {
		super();
		this.idtema = idtema;
		this.idcurso = idcurso;
		this.nombre_tema = nombre_tema;
		this.fecha_creacion = fecha_creacion;
	}

	public int getIdtema() {
		return idtema;
	}

	public void setIdtema(int idtema) {
		this.idtema = idtema;
	}

	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public String getNombre_tema() {
		return nombre_tema;
	}

	public void setNombre_tema(String nombre_tema) {
		this.nombre_tema = nombre_tema;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	
	
}
