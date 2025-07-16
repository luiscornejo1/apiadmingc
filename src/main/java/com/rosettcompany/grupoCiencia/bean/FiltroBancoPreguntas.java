package com.rosettcompany.grupoCiencia.bean;

public class FiltroBancoPreguntas {

	private String universidad;
	private String ciclo;
	private String curso;
	private String tema;
	private String dificultad;
	private String estadopregunta;
	private String deco;
	private String palabra;
	private String usuario;
	private String rango_fecha;
	private int minimo;
    private int maximo;
    private String idcabecera_pregunta;

	public String temanormalizado;
	public String subtema;
	public String subsubtema;
	public String subsubsubtema;
	public String detallesubtema;
	public String espejo;
	public String idpregunta;
	
	public FiltroBancoPreguntas() {
		super();
	}

	public FiltroBancoPreguntas(String universidad, String ciclo, String curso, String tema, String dificultad,
			String estadopregunta, String deco, String palabra, String usuario, String rango_fecha, int minimo,
			int maximo, String idcabecera_pregunta, String idpregunta) {
		super();
		this.universidad = universidad;
		this.ciclo = ciclo;
		this.curso = curso;
		this.tema = tema;
		this.dificultad = dificultad;
		this.estadopregunta = estadopregunta;
		this.deco = deco;
		this.palabra = palabra;
		this.usuario = usuario;
		this.rango_fecha = rango_fecha;
		this.idpregunta = idpregunta;
		this.minimo = minimo;
		this.maximo = maximo;
		this.idcabecera_pregunta = idcabecera_pregunta;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public String getEstadopregunta() {
		return estadopregunta;
	}

	public void setEstadopregunta(String estadopregunta) {
		this.estadopregunta = estadopregunta;
	}

	public String getDeco() {
		return deco;
	}

	public void setDeco(String deco) {
		this.deco = deco;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getRango_fecha() {
		return rango_fecha;
	}

	public void setRango_fecha(String rango_fecha) {
		this.rango_fecha = rango_fecha;
	}

	public int getMinimo() {
		return minimo;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	public int getMaximo() {
		return maximo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	public String getIdcabecera_pregunta() {
		return idcabecera_pregunta;
	}

	public void setIdcabecera_pregunta(String idcabecera_pregunta) {
		this.idcabecera_pregunta = idcabecera_pregunta;
	}

	public String getIdpregunta() {
		return idpregunta;
	}

	public void setIdpregunta(String idpregunta) {
		this.idpregunta = idpregunta;
	}



	

}
