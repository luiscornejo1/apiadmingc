package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;
import java.time.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name = "campaign")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_insertar_campaign_answers", procedureName = "f_insertar_campaign_answers", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcampaign", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_respuestas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_tiempo", type = long.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_red_social", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_listar_campaign_answers", procedureName = "f_listar_campaign_answers", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_row", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcampaign", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_red_social", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_descargar_campaign_answers", procedureName = "f_descargar_campaign_answers", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcampaign", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_red_social", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

})

public class CampaignAnswers {
	@Id
	@Column(name = "idcampaignanswer")
	private int idcampaignanswer;

	@Column(name = "idcampaign")
	private int idcampaign;

	@Column(name = "respuestas")
	private String respuestas;

	@Column(name = "tiempo")
	private long tiempo;

	@Column(name = "red_social")
	private String red_social;

	@Column(name = "fecha_registro")
	private Date fecha_registro;

	public int row;
	public String nombre;
	public String fecha;

	public CampaignAnswers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CampaignAnswers(int idcampaignanswer, int idcampaign, String respuestas, long tiempo, String red_social,
			Date fecha_registro) {
		super();
		this.idcampaignanswer = idcampaignanswer;
		this.idcampaign = idcampaign;
		this.respuestas = respuestas;
		this.tiempo = tiempo;
		this.red_social = red_social;
		this.fecha_registro = fecha_registro;
	}

	public int getIdcampaignanswer() {
		return idcampaignanswer;
	}

	public void setIdcampaignanswer(int idcampaignanswer) {
		this.idcampaignanswer = idcampaignanswer;
	}

	public int getIdcampaign() {
		return idcampaign;
	}

	public void setIdcampaign(int idcampaign) {
		this.idcampaign = idcampaign;
	}

	public String getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(String respuestas) {
		this.respuestas = respuestas;
	}

	public long getTiempo() {
		return tiempo;
	}

	public void setTiempo(long tiempo) {
		this.tiempo = tiempo;
	}

	public String getRed_social() {
		return red_social;
	}

	public void setRed_social(String red_social) {
		this.red_social = red_social;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	@Override
	public String toString() {
		return "CampaignAnswers [idcampaignanswer=" + idcampaignanswer + ", idcampaign=" + idcampaign + ", respuestas="
				+ respuestas + ", tiempo=" + tiempo + ", red_social=" + red_social + ", fecha_registro="
				+ fecha_registro + "]";
	}

}
