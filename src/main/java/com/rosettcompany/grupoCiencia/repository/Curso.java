package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="cursos")

@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery(name = "funcion_listar_videos_cursos", procedureName = "funcion_listar_videos_cursos", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcurso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_listar_cursos_universidad", procedureName = "funcion_listar_cursos_universidad", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_listar_cursos_ciclos", procedureName = "funcion_listar_cursos_ciclos", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_actualizar_temario_curso", procedureName = "funcion_actualizar_temario_curso", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcurso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_url_temario", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_listar_cursos_universidad_clases", procedureName = "funcion_listar_cursos_universidad_clases", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),
		 
		@NamedStoredProcedureQuery(name = "funcion_listar_cursos_universidad_materiales", procedureName = "funcion_listar_cursos_universidad_materiales", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),
		
		})

public class Curso {

	@Id
	@Column(name="idcurso")
	private int idcurso;
	
	@Column(name="idareaconocimiento")
	private int areaconocimiento;
	
	@Column(name="nombre_curso")
	private String nombre_curso;
	
	@Column(name="fecha_creacion")
	private Date fecha_creacion;
	
	@Column(name="orden")
	private int orden;
	
	@Column(name="url_temario_biblioteca")
	private String url_temario_biblioteca;
	
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "curso")
    public List<Video> video;

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Curso(int idcurso, int areaconocimiento, String nombre_curso, Date fecha_creacion, int orden,
			String url_temario_biblioteca, List<Video> video) {
		super();
		this.idcurso = idcurso;
		this.areaconocimiento = areaconocimiento;
		this.nombre_curso = nombre_curso;
		this.fecha_creacion = fecha_creacion;
		this.orden = orden;
		this.url_temario_biblioteca = url_temario_biblioteca;
		this.video = video;
	}



	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public int getAreaconocimiento() {
		return areaconocimiento;
	}

	public void setAreaconocimiento(int areaconocimiento) {
		this.areaconocimiento = areaconocimiento;
	}

	public String getNombre_curso() {
		return nombre_curso;
	}

	public void setNombre_curso(String nombre_curso) {
		this.nombre_curso = nombre_curso;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public String getUrl_temario_biblioteca() {
		return url_temario_biblioteca;
	}

	public void setUrl_temario_biblioteca(String url_temario_biblioteca) {
		this.url_temario_biblioteca = url_temario_biblioteca;
	}

	public List<Video> getVideo() {
		return video;
	}

	public void setVideo(List<Video> video) {
		this.video = video;
	}
	
	
}
