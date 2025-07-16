package com.rosettcompany.grupoCiencia.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="apoderados")
public class Apoderado {

	@Id
	@Column(name="idapoderado")
	private int idapoderado;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="dni")
	private String dni;
	
	@Column(name="celular")
	private String celular;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="ruta_foto_dni")
	private String ruta_foto_dni;
	
	@Column(name="estado")
	private int estado;
	
	public Apoderado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apoderado(int idapoderado, String nombres, String apellidos, String dni, String celular, String direccion,
			String correo, String ruta_foto_dni, int estado) {
		super();
		this.idapoderado = idapoderado;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.celular = celular;
		this.direccion = direccion;
		this.correo = correo;
		this.ruta_foto_dni = ruta_foto_dni;
		this.estado = estado;
	}

	public int getIdapoderado() {
		return idapoderado;
	}

	public void setIdapoderado(int idapoderado) {
		this.idapoderado = idapoderado;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getRuta_foto_dni() {
		return ruta_foto_dni;
	}

	public void setRuta_foto_dni(String ruta_foto_dni) {
		this.ruta_foto_dni = ruta_foto_dni;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}
