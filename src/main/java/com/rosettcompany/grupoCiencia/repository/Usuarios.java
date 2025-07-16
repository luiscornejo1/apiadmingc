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
@Table(name = "usuarios")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "funcion_inicio_sesion", procedureName = "funcion_inicio_sesion", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_user", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_password", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "registrar_usuario", procedureName = "f_registrar_usuario", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apellidos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_usuario", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_contrasenia", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_celular", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_perfil", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_foto_perfil", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsede", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "listar_usuarios", procedureName = "f_listar_usuarios", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "buscar_usuarios", procedureName = "f_buscar_usuarios", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_condicion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_buscar_usuarios_por_dni", procedureName = "f_buscar_usuarios_por_dni", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "editar_usuario", procedureName = "f_editar_usuario", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apellidos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_celular", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_perfil", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_foto_perfil", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsede", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "validar_dni_unico_usuario", procedureName = "f_validar_dni_unico_usuario", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "cambiar_contrasenia", procedureName = "f_cambiar_contrasenia", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_pass", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "listar_usuario_preguntas", procedureName = "f_listar_usuario_preguntas", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_eliminar_usuario", procedureName = "f_eliminar_usuario", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_asignacion_aulas_idusuario", procedureName = "f_listar_asignacion_aulas_idusuario", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		

})
public class Usuarios {

	@Id
	@Column(name = "idusuario")
	private int idusuario;

	@Column(name = "nombres")
	private String nombres;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "dni")
	private String dni;

	@Column(name = "usuario")
	private String usuario;

	@Column(name = "contrasenia")
	private String contrasenia;

	@Column(name = "celular")
	private String celular;

	@Column(name = "perfil")
	private String perfil;

	@Column(name = "foto_perfil")
	private String foto_perfil;

	@Column(name = "fecha_registro")
	private Date fecha_registro;

	@Column(name = "estado")
	private int estado;

	public String ciclos;
	public int idsede;

	public Usuarios() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuarios(int idusuario, String nombres, String apellidos, String dni, String usuario, String contrasenia,
			String celular, String perfil, String foto_perfil, Date fecha_registro, int estado) {
		super();
		this.idusuario = idusuario;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.celular = celular;
		this.perfil = perfil;
		this.foto_perfil = foto_perfil;
		this.fecha_registro = fecha_registro;
		this.estado = estado;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getFoto_perfil() {
		return foto_perfil;
	}

	public void setFoto_perfil(String foto_perfil) {
		this.foto_perfil = foto_perfil;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
