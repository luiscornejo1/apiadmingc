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
@Table(name = "personal_ventas")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_buscar_personal_ventas_cod", procedureName = "f_buscar_personal_ventas_cod", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_codigo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
})

public class PersonalVentas {
	@Id
	@Column(name = "idpersonalventas")
	private int idpersonalventas;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "estado")
	private int estado;

	
	public PersonalVentas(int idpersonalventas, String nombre, String codigo, int estado) {
		super();
		this.idpersonalventas = idpersonalventas;
		this.nombre = nombre;
		this.codigo = codigo;
		this.estado = estado;
	}

	public PersonalVentas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdpersonalventas() {
		return idpersonalventas;
	}

	public void setIdpersonalventas(int idpersonalventas) {
		this.idpersonalventas = idpersonalventas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
