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
@Table(name="examen_estudiante")
@NamedStoredProcedureQueries(value = {
		
		@NamedStoredProcedureQuery(name = "f_insertar_examen_estudiante", procedureName = "f_insertar_examen_estudiante", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_examen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_lista_respuestas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nota_total", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_correctas", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_incorrectas", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_en_blanco", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_tiempo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_examenes_resueltos_estudiante", procedureName = "f_listar_examenes_resueltos_estudiante", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_comunicados_estudiante", procedureName = "f_listar_comunicados_estudiante", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_verificar_examen_activo", procedureName = "f_verificar_examen_activo", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_examen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_obtener_resumen_examen_estudiante", procedureName = "f_obtener_resumen_examen_estudiante", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_examen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) })
})
public class Examen_estudiante {
	
	@Id
	@Column(name="idexamen")
	private int idexamen;
	
	@Column(name="idestudiante")
	private int idestudiante;
	
	@Column(name="lista_respuestas")
	private String lista_respuestas;
	
	@Column(name="nota_total")
	private double nota_total;
	
	@Column(name="total_correctas")
	private int total_correctas;
	
	@Column(name="total_incorrectas")
	private int total_incorrectas;
	
	@Column(name="total_en_blanco")
	private int total_en_blanco;
	
	@Column(name="tiempo")
	private String tiempo;

	public Examen_estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Examen_estudiante(int idexamen, int idestudiante, String lista_respuestas, double nota_total,
			int total_correctas, int total_incorrectas, int total_en_blanco, String tiempo) {
		super();
		this.idexamen = idexamen;
		this.idestudiante = idestudiante;
		this.lista_respuestas = lista_respuestas;
		this.nota_total = nota_total;
		this.total_correctas = total_correctas;
		this.total_incorrectas = total_incorrectas;
		this.total_en_blanco = total_en_blanco;
		this.tiempo = tiempo;
	}

	public int getIdexamen() {
		return idexamen;
	}

	public void setIdexamen(int idexamen) {
		this.idexamen = idexamen;
	}

	public int getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(int idestudiante) {
		this.idestudiante = idestudiante;
	}

	public String getLista_respuestas() {
		return lista_respuestas;
	}

	public void setLista_respuestas(String lista_respuestas) {
		this.lista_respuestas = lista_respuestas;
	}

	public double getNota_total() {
		return nota_total;
	}

	public void setNota_total(double nota_total) {
		this.nota_total = nota_total;
	}

	public int getTotal_correctas() {
		return total_correctas;
	}

	public void setTotal_correctas(int total_correctas) {
		this.total_correctas = total_correctas;
	}

	public int getTotal_incorrectas() {
		return total_incorrectas;
	}

	public void setTotal_incorrectas(int total_incorrectas) {
		this.total_incorrectas = total_incorrectas;
	}

	public int getTotal_en_blanco() {
		return total_en_blanco;
	}

	public void setTotal_en_blanco(int total_en_blanco) {
		this.total_en_blanco = total_en_blanco;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}


	

}
