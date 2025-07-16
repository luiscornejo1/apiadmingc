package com.rosettcompany.grupoCiencia.bean;

import java.sql.Date;
import java.sql.Time;

public class ExamenBeanNormalizado {
	
	private int idexamen;
	private Date fecha_examen;
	private Time hora_inicio;
	private Time hora_fin;
	private int iduniversidad;
	private int idciclo;
	private int idarea;
	private int puede_retroceder;
	private int encuesta;
	private Date fecha_inicio;
	private Date fecha_fin;
	private int idusuario;
	private int estado;
	private int salto_pregunta;
	private int tipo_examen;
	private String lista_temas;
	private String ciclos;
	
	public ExamenBeanNormalizado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExamenBeanNormalizado(int idexamen, Date fecha_examen, Time hora_inicio, Time hora_fin, int iduniversidad, int idciclo,
			int idarea, int puede_retroceder, int encuesta, Date fecha_inicio, Date fecha_fin, int idusuario,
			int estado, int salto_pregunta, int tipo_examen, String lista_temas, String ciclos) {
		super();
		this.idexamen = idexamen;
		this.fecha_examen = fecha_examen;
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
		this.iduniversidad = iduniversidad;
		this.idciclo = idciclo;
		this.idarea = idarea;
		this.puede_retroceder = puede_retroceder;
		this.encuesta = encuesta;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.idusuario = idusuario;
		this.estado = estado;
		this.salto_pregunta = salto_pregunta;
		this.tipo_examen = tipo_examen;
		this.lista_temas = lista_temas;
		this.ciclos = ciclos;
	}

	public int getIdexamen() {
		return idexamen;
	}

	public void setIdexamen(int idexamen) {
		this.idexamen = idexamen;
	}

	public Date getFecha_examen() {
		return fecha_examen;
	}

	public void setFecha_examen(Date fecha_examen) {
		this.fecha_examen = fecha_examen;
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

	public int getIduniversidad() {
		return iduniversidad;
	}

	public void setIduniversidad(int iduniversidad) {
		this.iduniversidad = iduniversidad;
	}

	public int getIdciclo() {
		return idciclo;
	}

	public void setIdciclo(int idciclo) {
		this.idciclo = idciclo;
	}

	public int getIdarea() {
		return idarea;
	}

	public void setIdarea(int idarea) {
		this.idarea = idarea;
	}

	public int getPuede_retroceder() {
		return puede_retroceder;
	}

	public void setPuede_retroceder(int puede_retroceder) {
		this.puede_retroceder = puede_retroceder;
	}

	public int getEncuesta() {
		return encuesta;
	}

	public void setEncuesta(int encuesta) {
		this.encuesta = encuesta;
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

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getSalto_pregunta() {
		return salto_pregunta;
	}

	public void setSalto_pregunta(int salto_pregunta) {
		this.salto_pregunta = salto_pregunta;
	}

	public int getTipo_examen() {
		return tipo_examen;
	}

	public void setTipo_examen(int tipo_examen) {
		this.tipo_examen = tipo_examen;
	}

	public String getLista_temas() {
		return lista_temas;
	}

	public void setLista_temas(String lista_temas) {
		this.lista_temas = lista_temas;
	}

	public String getCiclos() {
		return ciclos;
	}

	public void setCiclos(String ciclos) {
		this.ciclos = ciclos;
	}


	
}
