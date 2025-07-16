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
@Table(name = "aulas")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_insertar_aula", procedureName = "f_insertar_aula", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_areas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_actualizar_aula", procedureName = "f_actualizar_aula", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idaula", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_areas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_eliminar_aula", procedureName = "f_eliminar_aula", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idaula", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_aulas_por_ciclo", procedureName = "f_listar_aulas_por_ciclo", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }), 

		
})


public class AulasEntity {

	@Id
	@Column(name = "idaula")
	public int idaula;

	@Column(name = "iduniversidad")
	public int iduniversidad;

	@Column(name = "nombre")
	public String nombre;

	public String areas;

	@Column(name = "estado")
	public int estado;
	
	public int idusuario;

	public AulasEntity() {
		super();
	}

	public AulasEntity(int idaula, int iduniversidad, String nombre, String areas, int estado, int idusuario) {
		super();
		this.idaula = idaula;
		this.iduniversidad = iduniversidad;
		this.nombre = nombre;
		this.areas = areas;
		this.estado = estado;
		this.idusuario = idusuario;
	}

	public int getIdaula() {
		return idaula;
	}

	public void setIdaula(int idaula) {
		this.idaula = idaula;
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

	public int getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(int iduniversidad) {
		this.iduniversidad = iduniversidad;
	}

	public String getAreas() {
		return areas;
	}

	public void setAreas(String areas) {
		this.areas = areas;
	}


	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	@Override
	public String toString() {
		return "AulasEntity [idaula=" + idaula + ", iduniversidad=" + iduniversidad + ", nombre=" + nombre + ", areas="
				+ areas + ", estado=" + estado + ", idusuario=" + idusuario + "]";
	}
	
	
	
	

}
