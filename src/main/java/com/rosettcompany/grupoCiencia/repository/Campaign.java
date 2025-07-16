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
@Table(name = "campaign")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_insertar_campaign", procedureName = "f_insertar_campaign", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_imagen", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_codigo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_usuario_registro", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_preguntas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_listar_campaigns", procedureName = "f_listar_campaigns", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_row", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_modificacion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_buscar_campaign_cod", procedureName = "f_buscar_campaign_cod", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_codigo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_actualizar_campaign", procedureName = "f_actualizar_campaign", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcampaign", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_imagen", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_inicio", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_usuario_modificacion", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_preguntas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_eliminar_campaign", procedureName = "f_eliminar_campaign", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcampaign", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
})

public class Campaign {
	@Id
	@Column(name = "idcampaign")
	private int idcampaign;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "imagen")
	private String imagen;

	@Column(name = "fecha_inicio")
	private Date fecha_inicio;

	@Column(name = "fecha_fin")
	private Date fecha_fin;

	@Column(name = "codigo")
	private String codigo;

	@Column(name = "usuario_registro")
	private int usuario_registro;

	@Column(name = "usuario_modificacion")
	private int usuario_modificacion;

	@Column(name = "estado")
	private int estado;

	public String preguntas;

	public int row;

	private String fecha_modificacion;

	public Campaign() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Campaign(int idcampaign, String nombre, String imagen, Date fecha_inicio, Date fecha_fin, String codigo,
			int usuario_registro, int usuario_modificacion, int estado, String preguntas, int row,
			String fecha_modificacion) {
		super();
		this.idcampaign = idcampaign;
		this.nombre = nombre;
		this.imagen = imagen;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.codigo = codigo;
		this.usuario_registro = usuario_registro;
		this.usuario_modificacion = usuario_modificacion;
		this.estado = estado;
		this.preguntas = preguntas;
		this.row = row;
		this.fecha_modificacion = fecha_modificacion;
	}

	public int getIdcampaign() {
		return idcampaign;
	}

	public void setIdcampaign(int idcampaign) {
		this.idcampaign = idcampaign;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public String getFecha_modificacion() {
		return fecha_modificacion;
	}

	public void setFecha_modificacion(String fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getUsuario_registro() {
		return usuario_registro;
	}

	public void setUsuario_registro(int usuario_registro) {
		this.usuario_registro = usuario_registro;
	}

	public int getUsuario_modificacion() {
		return usuario_modificacion;
	}

	public void setUsuario_modificacion(int usuario_modificacion) {
		this.usuario_modificacion = usuario_modificacion;
	}

	public String getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(String preguntas) {
		this.preguntas = preguntas;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	@Override
	public String toString() {
		return "Campaign [idcampaign=" + idcampaign + ", nombre=" + nombre + ", imagen=" + imagen + ", fecha_inicio="
				+ fecha_inicio + ", fecha_fin=" + fecha_fin + ", fecha_modificacion=" + fecha_modificacion + ", codigo="
				+ codigo + ", usuario_registro=" + usuario_registro + ", estado=" + estado + ", preguntas=" + preguntas
				+ ", row=" + row + "]";
	}

}
