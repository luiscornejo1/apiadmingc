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

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

@Entity
@Table(name = "det_est_beca_descuento")
@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_actualizar_becaestudiante_estado", procedureName = "f_actualizar_becaestudiante_estado", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iddetallebeca", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "usuario_parametro", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = Integer.class) }),

		@NamedStoredProcedureQuery(name = "f_registrar_beca_descuento", procedureName = "f_registrar_beca_descuento", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "tipo_parametro", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "monto_parametro", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "dni_parametro", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "nombre_parametro", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_correo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "usuario_parametro", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsolicitud", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_motivo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni_asociado", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmodalidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_fin", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = Integer.class) }),

		@NamedStoredProcedureQuery(name = "f_buscar_beca_descuento_por_dni", procedureName = "f_buscar_beca_descuento_por_dni", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_listar_detalle_estudiantes_beca_descuento", procedureName = "f_listar_detalle_estudiantes_beca_descuento", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_rows", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_registro", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_tipo_beneficio", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_descargar_detalle_estudiantes_beca_descuento", procedureName = "f_descargar_detalle_estudiantes_beca_descuento", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_registro", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_tipo_beneficio", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		
		@NamedStoredProcedureQuery(name = "f_becas_descuentos_masivo", procedureName = "f_becas_descuentos_masivo", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

})

public class DetalleEstudiantesBecaDescuento {
	@Id
	@Column(name = "iddetallebeca")
	private Integer iddetallebeca;

	@Column(name = "esbeca")
	private Boolean esbeca;

	@Column(name = "esdescuento")
	private Boolean esdescuento;

	@Column(name = "porcentajebeca")
	private Double porcentajebeca;

	@Column(name = "montodescuento")
	private Double montodescuento;

	@Column(name = "dni")
	private String dni;

	@Column(name = "correo")
	private String correo;

	@Column(name = "usuario")
	private int usuario;

	@Column(name = "fecha_creacion")
	private Date fecha_creacion;

	@Column(name = "fecha_modificacion")
	private Date fecha_modificacion;

	@Column(name = "idsolicitud")
	private int idsolicitud;

	@Column(name = "motivo")
	private String motivo;

	@Column(name = "dni_asociado")
	private String dni_asociado;

	@Column(name = "idmodalidad")
	private int idmodalidad;

	private String fecha_fin;

	private Double tipo;

	private Double monto;

	private String nombre;

	public int rows;

	public String tipo_beneficio;

	public String fecha_registro;

	public String ciclo;

	public DetalleEstudiantesBecaDescuento(Integer iddetallebeca, Boolean esbeca, Boolean esdescuento,
			Double porcentajebeca, Double montodescuento, String dni, String correo, int usuario, Date fecha_creacion,
			Date fecha_modificacion, int idsolicitud, String motivo, String dni_asociado, int idmodalidad,
			String fecha_fin, Double tipo, Double monto, String nombre, int rows, String tipo_beneficio,
			String fecha_registro, String ciclo) {
		super();
		this.iddetallebeca = iddetallebeca;
		this.esbeca = esbeca;
		this.esdescuento = esdescuento;
		this.porcentajebeca = porcentajebeca;
		this.montodescuento = montodescuento;
		this.dni = dni;
		this.correo = correo;
		this.usuario = usuario;
		this.fecha_creacion = fecha_creacion;
		this.fecha_modificacion = fecha_modificacion;
		this.idsolicitud = idsolicitud;
		this.motivo = motivo;
		this.dni_asociado = dni_asociado;
		this.idmodalidad = idmodalidad;
		this.fecha_fin = fecha_fin;
		this.tipo = tipo;
		this.monto = monto;
		this.nombre = nombre;
		this.rows = rows;
		this.tipo_beneficio = tipo_beneficio;
		this.fecha_registro = fecha_registro;
		this.ciclo = ciclo;
	}

	public Integer getIddetallebeca() {
		return iddetallebeca;
	}

	public void setIddetallebeca(Integer iddetallebeca) {
		this.iddetallebeca = iddetallebeca;
	}

	public Boolean getEsbeca() {
		return esbeca;
	}

	public void setEsbeca(Boolean esbeca) {
		this.esbeca = esbeca;
	}

	public Boolean getEsdescuento() {
		return esdescuento;
	}

	public void setEsdescuento(Boolean esdescuento) {
		this.esdescuento = esdescuento;
	}

	public Double getPorcentajebeca() {
		return porcentajebeca;
	}

	public void setPorcentajebeca(Double porcentajebeca) {
		this.porcentajebeca = porcentajebeca;
	}

	public Double getMontodescuento() {
		return montodescuento;
	}

	public void setMontodescuento(Double montodescuento) {
		this.montodescuento = montodescuento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Date getFecha_modificacion() {
		return fecha_modificacion;
	}

	public void setFecha_modificacion(Date fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}

	public int getIdsolicitud() {
		return idsolicitud;
	}

	public void setIdsolicitud(int idsolicitud) {
		this.idsolicitud = idsolicitud;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getDni_asociado() {
		return dni_asociado;
	}

	public void setDni_asociado(String dni_asociado) {
		this.dni_asociado = dni_asociado;
	}

	public Double getTipo() {
		return tipo;
	}

	public void setTipo(Double tipo) {
		this.tipo = tipo;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdmodalidad() {
		return idmodalidad;
	}

	public void setIdmodalidad(int idmodalidad) {
		this.idmodalidad = idmodalidad;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public String getTipo_beneficio() {
		return tipo_beneficio;
	}

	public void setTipo_beneficio(String tipo_beneficio) {
		this.tipo_beneficio = tipo_beneficio;
	}

	public String getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

}