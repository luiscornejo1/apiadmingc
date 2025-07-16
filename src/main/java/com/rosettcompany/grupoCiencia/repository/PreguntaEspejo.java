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
@Table(name="preguntas_temp_similares_fn")

@NamedStoredProcedureQueries(value = {
		
	@NamedStoredProcedureQuery(name = "f_listar_preguntas_espejo", procedureName = "f_listar_preguntas_espejo", parameters = {
			
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idpregunta", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_min", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_max", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
	

	

})
public class PreguntaEspejo {

	@Id
	@Column(name="idsimilar")
	private int idsimilar;
	@Column(name="idpregunta")
	private int idpregunta;
	@Column(name="idpregunta_sim")
	private int idpregunta_sim;
	@Column(name="descripcion_limpia")
	private String descripcion_limpia;
	@Column(name="descripcion_limpia_sim")
	private String descripcion_limpia_sim;
	
	public PreguntaEspejo() {
		super();
	}

	public PreguntaEspejo(int idsimilar, int idpregunta, int idpregunta_sim, String descripcion_limpia, String descripcion_limpia_sim) {
		super();
		this.idsimilar = idsimilar;
		this.idpregunta = idpregunta;
		this.idpregunta_sim = idpregunta_sim;
		this.descripcion_limpia = descripcion_limpia;
		this.descripcion_limpia_sim = descripcion_limpia_sim;
	}
	
	

	public int getIdsimilar() {
		return idsimilar;
	}

	public void setIdsimilar(int idsimilar) {
		this.idsimilar = idsimilar;
	}

	public int getIdpregunta() {
		return idpregunta;
	}

	public void setIdpregunta(int idpregunta) {
		this.idpregunta = idpregunta;
	}

	public int getIdpregunta_sim() {
		return idpregunta_sim;
	}

	public void setIdpregunta_sim(int idpregunta_sim) {
		this.idpregunta_sim = idpregunta_sim;
	}

	public String getDescripcion_limpia() {
		return descripcion_limpia;
	}

	public void setDescripcion_limpia(String descripcion_limpia) {
		this.descripcion_limpia = descripcion_limpia;
	}

	public String getDescripcion_limpia_sim() {
		return descripcion_limpia_sim;
	}

	public void setDescripcion_limpia_sim(String descripcion_limpia_sim) {
		this.descripcion_limpia_sim = descripcion_limpia_sim;
	}

	

	
}
