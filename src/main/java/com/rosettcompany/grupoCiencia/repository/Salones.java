package com.rosettcompany.grupoCiencia.repository;

import javax.persistence.*;

@Entity
@Table(name = "salones")

@NamedStoredProcedureQueries(value = {
		@NamedStoredProcedureQuery(name = "f_insertar_salones", procedureName = "f_insertar_salones", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre_salon", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_aforo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsede", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_update_salones", procedureName = "f_update_salones", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsalon", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre_salon", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_aforo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_usuario_modificacion", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_update_estado_salon", procedureName = "f_update_estado_salon", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsalon", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_usuario_modificacion", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

})
public class Salones {
	@Id
	@Column(name = "idsalon")
	private int idsalon;

	@Column(name = "nombre_salon")
	private String nombre_salon;

	@Column(name = "aforo")
	private int aforo;

	@Column(name = "idsede")
	private int idsede;

	@Column(name = "estado")
	private int estado;

	@Column(name = "usuario_modificacion")
	private int usuario_modificacion;

	public Salones(int idsalon, String nombre_salon, int aforo, int idsede, int estado, int usuario_modificacion) {
		super();
		this.idsalon = idsalon;
		this.nombre_salon = nombre_salon;
		this.aforo = aforo;
		this.idsede = idsede;
		this.estado = estado;
		this.usuario_modificacion = usuario_modificacion;
	}

	public int getIdsalon() {
		return idsalon;
	}

	public void setIdsalon(int idsalon) {
		this.idsalon = idsalon;
	}

	public String getNombre_salon() {
		return nombre_salon;
	}

	public void setNombre_salon(String nombre_salon) {
		this.nombre_salon = nombre_salon;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public int getIdsede() {
		return idsede;
	}

	public void setIdsede(int idsede) {
		this.idsede = idsede;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getUsuario_modificacion() {
		return usuario_modificacion;
	}

	public void setUsuario_modificacion(int usuario_modificacion) {
		this.usuario_modificacion = usuario_modificacion;
	}

}
