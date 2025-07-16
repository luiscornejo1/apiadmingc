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
@Table(name = "universidad")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "listar_universidades", procedureName = "f_listar_universidades", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_obtener_query_funciones", procedureName = "f_obtener_query_funciones", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_update_estado_universidad", procedureName = "f_update_estado_universidad", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_activo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_usuario_modificacion", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_insertar_universidad", procedureName = "f_insertar_universidad", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_update_nombre_universidad", procedureName = "f_update_nombre_universidad", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_usuario_modificacion", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

})
public class Universidad {

	@Id
	@Column(name = "iduniversidad")
	private int iduniversidad;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "fecha_creacion")
	private Date fecha_creacion;

	@Column(name = "activo")
	private int activo;

	@Column(name = "usuario_modificacion")
	private int usuario_modificacion;

	public Universidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Universidad(int iduniversidad, String nombre, Date fecha_creacion, int activo, int usuario_modificacion) {
		super();
		this.iduniversidad = iduniversidad;
		this.nombre = nombre;
		this.fecha_creacion = fecha_creacion;
		this.activo = activo;
		this.usuario_modificacion = usuario_modificacion;
	}

	public int getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(int iduniversidad) {
		this.iduniversidad = iduniversidad;
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

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public int getUsuario_modificacion() {
		return usuario_modificacion;
	}

	public void setUsuario_modificacion(int usuario_modificacion) {
		this.usuario_modificacion = usuario_modificacion;
	}

}
