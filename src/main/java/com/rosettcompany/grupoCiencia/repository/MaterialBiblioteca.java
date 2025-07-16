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
@Table(name="material_biblioteca")

@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery(name = "funcion_listar_materiales_biblioteca", procedureName = "funcion_listar_materiales_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idtema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_materiales_biblioteca", procedureName = "f_listar_materiales_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_numero", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_universidad", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_curso", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_tema", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_registrar_material_biblioteca", procedureName = "f_registrar_material_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_materiales", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_eliminar_material_biblioteca", procedureName = "f_eliminar_material_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmaterial", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
})
public class MaterialBiblioteca {

	@Id
	@Column(name="idmaterial")
	private int idmaterial;
	@Column(name="nombre_material")
	private String nombre_material;
	@Column(name="url_material")
	private String url_material;
	@Column(name="url_clase_relacionada")
	private String url_clase_relacionada;
	@Column(name="idtema")
	private int idtema;
	@Column(name="estado")
	private int estado;
	
	public MaterialBiblioteca() {
		super();
	}

	public MaterialBiblioteca(int idmaterial, String nombre_material, String url_material, String url_clase_relacionada,
			int idtema, int estado) {
		super();
		this.idmaterial = idmaterial;
		this.nombre_material = nombre_material;
		this.url_material = url_material;
		this.url_clase_relacionada = url_clase_relacionada;
		this.idtema = idtema;
		this.estado = estado;
	}

	public int getIdmaterial() {
		return idmaterial;
	}

	public void setIdmaterial(int idmaterial) {
		this.idmaterial = idmaterial;
	}

	public String getNombre_material() {
		return nombre_material;
	}

	public void setNombre_material(String nombre_material) {
		this.nombre_material = nombre_material;
	}

	public String getUrl_material() {
		return url_material;
	}

	public void setUrl_material(String url_material) {
		this.url_material = url_material;
	}

	public String getUrl_clase_relacionada() {
		return url_clase_relacionada;
	}

	public void setUrl_clase_relacionada(String url_clase_relacionada) {
		this.url_clase_relacionada = url_clase_relacionada;
	}

	public int getIdtema() {
		return idtema;
	}

	public void setIdtema(int idtema) {
		this.idtema = idtema;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
}
