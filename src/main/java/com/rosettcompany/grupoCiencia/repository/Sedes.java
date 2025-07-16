package com.rosettcompany.grupoCiencia.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name = "sedes_normalizadas")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_buscar_sede_por_ciclo_modalidad", procedureName = "f_buscar_sede_por_ciclo_modalidad", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmodalidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_buscar_sede_por_ciclo", procedureName = "f_buscar_sede_por_ciclo", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_mostrar_facturador_sede", procedureName = "f_mostrar_facturador_sede", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsede", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_update_sedes", procedureName = "f_update_sedes", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsede", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_serie", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_tokenfacturador", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_usuario_modificacion", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_insertar_sede", procedureName = "f_insertar_sede", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_serie", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_tokenfacturador", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_update_estado_sedes", procedureName = "f_update_estado_sedes", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsede", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_usuario_modificacion", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

})

public class Sedes {
	@Id
	@Column(name = "idsede")
	private int idsede;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "ciudad")
	private String ciudad;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "serie")
	private String serie;

	@Column(name = "tokenfacturador")
	private String tokenfacturador;

	@Column(name = "usuario_modificacion")
	private int usuario_modificacion;

	@Column(name = "estado")
	private int estado;

	public Sedes(int idsede, String nombre, String direccion, String ciudad, String telefono, String serie,
			String tokenfacturador, int usuario_modificacion, int estado) {
		super();
		this.idsede = idsede;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.serie = serie;
		this.tokenfacturador = tokenfacturador;
		this.usuario_modificacion = usuario_modificacion;
		this.estado = estado;
	}

	public int getIdsede() {
		return idsede;
	}

	public void setIdsede(int idsede) {
		this.idsede = idsede;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getTokenfacturador() {
		return tokenfacturador;
	}

	public void setTokenfacturador(String tokenfacturador) {
		this.tokenfacturador = tokenfacturador;
	}

	public int getUsuario_modificacion() {
		return usuario_modificacion;
	}

	public void setUsuario_modificacion(int usuario_modificacion) {
		this.usuario_modificacion = usuario_modificacion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
