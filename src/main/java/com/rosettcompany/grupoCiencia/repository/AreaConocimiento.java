package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="area_conocimiento")
@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery(name = "listar_areas_conocimiento", procedureName = "f_listar_areas_conocimiento", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_area", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		
		
					
})
public class AreaConocimiento {
	
	@Id
	@Column(name="idareaconocimiento")
	private int idareaconocimiento;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="estado")
	private int estado;
	
	@Column(name="fecha_creacion")
	private Date fecha_creacion;
	
	@Column(name="orden")
	private int orden;
	
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "areaconocimiento")
    public List<Curso> cursos;
    
	public AreaConocimiento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AreaConocimiento(int idareaconocimiento, String nombre, int estado, Date fecha_creacion, List<Curso> cursos) {
		super();
		this.idareaconocimiento = idareaconocimiento;
		this.nombre = nombre;
		this.estado = estado;
		this.fecha_creacion = fecha_creacion;
		this.cursos = cursos;
	}

	public int getIdareaconocimiento() {
		return idareaconocimiento;
	}

	public void setIdareaconocimiento(int idareaconocimiento) {
		this.idareaconocimiento = idareaconocimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	
	
}
