package com.rosettcompany.grupoCiencia.bean;

import java.sql.Date;
import java.sql.Time;

public class CodisBean {
	
	private int idcodis;
	private String ciclos;
	private int iduniversidad;
	private int idcurso;
	private int idusuario;
	private Date fecha_codis;
	private Time hora_inicio;
	private Time hora_fin;
	private int usuario_registro;
	private boolean respuesta_ver;
	private String preguntas;
	private String instruccion_profesor;
	private String preguntas_profesor;

	
	public CodisBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CodisBean(int idcodis,String ciclos, int iduniversidad, int idcurso,
			int idusuario, Date fecha_codis, Time hora_inicio, Time hora_fin,
			int usuario_registro, boolean respuesta_ver, String preguntas, 
			String instruccion_profesor, String preguntas_profesor) {
		super();
		this.idcodis = idcodis;
		this.ciclos = ciclos;
		this.iduniversidad = iduniversidad;
		this.idcurso = idcurso;
		this.idusuario = idusuario;
		this.fecha_codis = fecha_codis;
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
		this.usuario_registro = usuario_registro;
		this.respuesta_ver = respuesta_ver;
		this.preguntas = preguntas;
		this.instruccion_profesor = instruccion_profesor;
		this.preguntas_profesor = preguntas_profesor;
	}

	public int getIdcodis() {
		return idcodis;
	}

	public void setIdcodis(int idcodis) {
		this.idcodis = idcodis;
	}

	public String getCiclos() {
		return ciclos;
	}

	public void setCiclos(String ciclos) {
		this.ciclos = ciclos;
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

	public int getUsuario_registro() {
		return usuario_registro;
	}

	public void setUsuario_registro(int usuario_registro) {
		this.usuario_registro = usuario_registro;
	}

	public boolean isRespuesta_ver() {
		return respuesta_ver;
	}

	public void setRespuesta_ver(boolean respuesta_ver) {
		this.respuesta_ver = respuesta_ver;
	}

	public String getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(String preguntas) {
		this.preguntas = preguntas;
	}



	public String getInstruccion_profesor() {
		return instruccion_profesor;
	}

	public void setInstruccion_profesor(String instruccion_profesor) {
		this.instruccion_profesor = instruccion_profesor;
	}

	public String getPreguntas_profesor() {
		return preguntas_profesor;
	}

	public void setPreguntas_profesor(String preguntas_profesor) {
		this.preguntas_profesor = preguntas_profesor;
	}

	@Override
	public String toString() {
		return "CodisBean [idcodis=" + idcodis + ", ciclos=" + ciclos + ", iduniversidad=" + iduniversidad
				+ ", idcurso=" + idcurso + ", idusuario=" + idusuario + ", fecha_codis=" + fecha_codis
				+ ", hora_inicio=" + hora_inicio + ", hora_fin=" + hora_fin + ", usuario_registro=" + usuario_registro
				+ ", respuesta_ver=" + respuesta_ver + ", preguntas=" + preguntas + ", instruccion_profesor=" + instruccion_profesor
				+ ", preguntas_profesor=" + preguntas_profesor + "]";
	}
	
	

	
}
