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
@Table(name = "codis")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_insertar_codis", procedureName = "f_insertar_codis", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcurso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_codis", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_inicio", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_fin", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_usuario_registro", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_respuesta_ver", type = Boolean.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_preguntas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_instruction", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_preguntas_profesor", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_listar_codis", procedureName = "f_listar_codis", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_offset", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_limit", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_codis", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_descargar_excel_codis_profesores_promedio", procedureName = "f_descargar_excel_codis_profesores_promedio", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_codis", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_codis_detalle", procedureName = "f_listar_codis_detalle", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcodis", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_buscar_codis_cod", procedureName = "f_buscar_codis_cod", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_codigo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_actualizar_codis", procedureName = "f_actualizar_codis", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcodis", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_iduniversidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcurso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha_codis", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_inicio", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_hora_fin", type = Time.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_usuario_modifico", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_preguntas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_preguntas_profesor", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_eliminar_codis", procedureName = "f_eliminar_codis", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcodis", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
})

public class Codis {
	@Id
	@Column(name = "idcodis")
	private int idcodis;

	@Column(name = "idciclo")
	private int idciclo;

	@Column(name = "iduniversidad")
	private int iduniversidad;
	
	@Column(name = "idcurso")
	private int idcurso;
	
	@Column(name = "idusuario")
	private int idusuario;

	@Column(name = "fecha_codis")
	private Date fecha_codis;

	@Column(name = "hora_inicio")
	private Time hora_inicio;

	@Column(name = "hora_fin")
	private Time hora_fin;
	
	@Column(name = "fecha_creacion")
	private Date fecha_creacion;

	@Column(name = "usuario_registro")
	private int usuario_registro;

	@Column(name = "usuario_modifico")
	private int usuario_modifico;

	@Column(name = "estado")
	private int estado;
	
	public int row;
	
	public String preguntas; 
	public String preguntas_profesor; 
	public String opciones;
	public String nombre;
	public String fecha;
	public String instruccion_profesor;
	public boolean respuesta_ver;
	public int limit;
	public int offset;


	private String fecha_modificacion;

	public Codis() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Codis(int idcodis, int idciclo, int iduniversidad, int idcurso, int idusuario, Date fecha_codis, Time hora_inicio, Time hora_fin,
			Date fecha_creacion,String fecha_modificacion, int usuario_registro, int usuario_modifico, int estado, int row, String preguntas,
			String nombre, String fecha, String instruccion_profesor, boolean respuesta_ver, int limit, int offset) {
		super();
		this.idcodis = idcodis;
		this.idciclo = idciclo;
		this.iduniversidad = iduniversidad;
		this.idcurso = idcurso;
		this.idusuario = idusuario;
		this.fecha_codis = fecha_codis;
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
		this.fecha_creacion = fecha_creacion; 
		this.fecha_modificacion = fecha_modificacion;
		this.usuario_registro = usuario_registro;
		this.usuario_modifico = usuario_modifico;
		this.estado = estado;
		this.row = row;
		this.preguntas = preguntas;
		this.nombre = nombre;
		this.fecha = fecha;
		this.instruccion_profesor = instruccion_profesor;
		this.respuesta_ver = respuesta_ver;
		this.limit = limit;
		this.offset = offset;
	}

	public int getIdcodis() {
		return idcodis;
	}

	public void setIdcodis(int idcodis) {
		this.idcodis = idcodis;
	}

	public int getIdciclo() {
		return idciclo;
	}

	public void setIdciclo(int idciclo) {
		this.idciclo = idciclo;
	}

	public int getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(int iduniversidad) {
		this.iduniversidad = iduniversidad;
	}

	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public Date getFecha_codis() {
		return fecha_codis;
	}

	public void setFecha_codis(Date fecha_codis) {
		this.fecha_codis = fecha_codis;
	}

	public Time getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(Time hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public Time getHora_fin() {
		return hora_fin;
	}

	public void setHora_fin(Time hora_fin) {
		this.hora_fin = hora_fin;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public int getUsuario_registro() {
		return usuario_registro;
	}

	public void setUsuario_registro(int usuario_registro) {
		this.usuario_registro = usuario_registro;
	}

	

	public int getUsuario_modifico() {
		return usuario_modifico;
	}

	public void setUsuario_modifico(int usuario_modifico) {
		this.usuario_modifico = usuario_modifico;
	}

	public String getOpciones() {
		return opciones;
	}

	public void setOpciones(String opciones) {
		this.opciones = opciones;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getFecha_modificacion() {
		return fecha_modificacion;
	}

	public void setFecha_modificacion(String fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public String getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(String preguntas) {
		this.preguntas = preguntas;
	}
	
	

	public String getPreguntas_profesor() {
		return preguntas_profesor;
	}

	public void setPreguntas_profesor(String preguntas_profesor) {
		this.preguntas_profesor = preguntas_profesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getInstruccion_profesor() {
		return instruccion_profesor;
	}

	public void setInstruccion_profesor(String instruccion_profesor) {
		this.instruccion_profesor = instruccion_profesor;
	}

	
	public boolean isRespuesta_ver() {
		return respuesta_ver;
	}

	public void setRespuesta_ver(boolean respuesta_ver) {
		this.respuesta_ver = respuesta_ver;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	@Override
	public String toString() {
		return "Codis [idcodis=" + idcodis + ", idciclo=" + idciclo + ", iduniversidad=" + iduniversidad + ", idcurso="
				+ idcurso + ", idusuario=" + idusuario + ", fecha_codis=" + fecha_codis + ", hora_inicio=" + hora_inicio
				+ ", hora_fin=" + hora_fin + ", fecha_creacion=" + fecha_creacion + ", usuario_registro="
				+ usuario_registro + ", usuario_modifico=" + usuario_modifico + ", estado=" + estado + ", row=" + row
				+ ", preguntas=" + preguntas + ", preguntas_profesor=" + preguntas_profesor + ", opciones=" + opciones
				+ ", nombre=" + nombre + ", fecha=" + fecha + ", instruccion_profesor=" + instruccion_profesor
				+ ", respuesta_ver=" + respuesta_ver + ", limit=" + limit + ", offset=" + offset
				+ ", fecha_modificacion=" + fecha_modificacion + "]";
	}






}
