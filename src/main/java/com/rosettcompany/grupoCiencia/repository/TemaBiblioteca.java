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
@Table(name="tema_biblioteca")

@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery(name = "funcion_listar_temas_biblioteca", procedureName = "funcion_listar_temas_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcurso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_listar_temas_biblioteca_clases", procedureName = "funcion_listar_temas_biblioteca_clases", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcurso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_listar_temas_biblioteca_materiales", procedureName = "funcion_listar_temas_biblioteca_materiales", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcurso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_insertar_temas_biblioteca", procedureName = "f_insertar_temas_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre_tema", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_temas_biblioteca_admin", procedureName = "f_listar_temas_biblioteca_admin", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_actualizar_temas_biblioteca", procedureName = "f_actualizar_temas_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_tema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_curso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre_tema", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
					
		@NamedStoredProcedureQuery(name = "f_buscar_temas_biblioteca", procedureName = "f_buscar_temas_biblioteca", parameters = {
			
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre_tema", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
	
		@NamedStoredProcedureQuery(name = "f_eliminar_tema_biblioteca", procedureName = "f_eliminar_tema_biblioteca", parameters = {
			
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idtema", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_actualizar_orden_temas_biblioteca", procedureName = "f_actualizar_orden_temas_biblioteca", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "lista_temas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "funcion_listar_temas_biblioteca_orden_admin", procedureName = "funcion_listar_temas_biblioteca_orden_admin", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcurso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),


		
		
})
public class TemaBiblioteca {
	
	@Id
	@Column(name="idtema")
	private int idtema;
	@Column(name="nombre_tema")
	private String nombre_tema;
	@Column(name="idcurso")
	private int idcurso;
	@Column(name="orden")
	private int orden;
	
	public TemaBiblioteca() {
		super();
	}

	public TemaBiblioteca(int idtema, String nombre_tema, int idcurso, int orden) {
		super();
		this.idtema = idtema;
		this.nombre_tema = nombre_tema;
		this.idcurso = idcurso;
		this.orden = orden;
	}

	public int getIdtema() {
		return idtema;
	}

	public void setIdtema(int idtema) {
		this.idtema = idtema;
	}

	public String getNombre_tema() {
		return nombre_tema;
	}

	public void setNombre_tema(String nombre_tema) {
		this.nombre_tema = nombre_tema;
	}

	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	
	
}
