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
@Table(name="parametros")
@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery(name = "listar_departamentos", procedureName = "f_listar_departamentos", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
					
})
public class Parametros {

	@Id
	@Column(name="idparametro")
	private int idparametro;
	@Column(name="descripcion")
	private String descripcion;
	
	public Parametros() {
		super();
	}
	public Parametros(int idparametro, String descripcion) {
		super();
		this.idparametro = idparametro;
		this.descripcion = descripcion;
	}
	
	public int getIdparametro() {
		return idparametro;
	}
	public void setIdparametro(int idparametro) {
		this.idparametro = idparametro;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
