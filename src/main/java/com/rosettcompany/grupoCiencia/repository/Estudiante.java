package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import com.rosettcompany.grupoCiencia.repository.Ciclo;

@Entity
@Table(name = "estudiantes")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "listar_estudiantes", procedureName = "f_listar_estudiantes", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_numero_rows", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apellidos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ruta_foto_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "buscar_estudiantes", procedureName = "f_buscar_estudiantes", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_condicion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "buscar_estudiantes_deudores", procedureName = "f_buscar_estudiantes_deudores", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_condicion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "eliminar_estudiante", procedureName = "f_eliminar_estudiante", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "usuario_delete", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "editar_estudiante", procedureName = "f_editar_estudiante", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmodalidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsede", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idaula", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apellidos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_carrera", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_celular", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_correo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_perfil", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_foto_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_foto_facebook", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_foto_voucher", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_video", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_foto_perfil", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "ruta_foto_dni2", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "validar_dni_unico_estudiante", procedureName = "f_validar_dni_unico_estudiante", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_validar_dni_unico_estudiante_solicitudes", procedureName = "f_validar_dni_unico_estudiante_solicitudes", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_estudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "funcion_eliminar_examen_estudiante", procedureName = "funcion_eliminar_examen_estudiante", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idestudiante", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idexamen", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_mostrar_carnet_dni", procedureName = "f_mostrar_carnet_dni", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "listar_estudiantes_pendientes", procedureName = "f_listar_estudiantes_pendientes", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_usuario", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_apellidos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_pago_cronograma_estudiante", procedureName = "f_pago_cronograma_estudiante", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "json_input", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_buscar_datos_nrooperacion_repetida", procedureName = "f_buscar_datos_nrooperacion_repetida", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nrooperacion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_actualizar_asignacion_alumno_aula", procedureName = "f_actualizar_asignacion_alumno_aula", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo_antiguo", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo_nuevo", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idestudiante", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idusuario", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_buscar_estudiante_por_dni", procedureName = "f_buscar_estudiante_por_dni", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_buscar_ciclos_estudiante_por_dni", procedureName = "f_buscar_ciclos_estudiante_por_dni", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_buscar_historial_esnuevo", procedureName = "f_buscar_historial_esnuevo", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "funcion_listar_estudiantes_ciclo", procedureName = "funcion_listar_estudiantes_ciclo", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcurso", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "registrar_asistencia_estudiantes", procedureName = "funcion_registrar_asistencia_estudiantes", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idasistencia", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_lista_estudiantes", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
})

public class Estudiante {

	@Id
	@Column(name = "idestudiante")
	private int idestudiante;

	@ManyToOne
	@JoinColumn(name = "idciclo")
	private Ciclo idciclo;

	@ManyToOne
	@JoinColumn(name = "idapoderado")
	private Apoderado idapoderado;

	@Column(name = "nombres")
	private String nombres;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "dni")
	private String dni;

	@Column(name = "carrera")
	private int carrera;

	@Column(name = "celular")
	private String celular;

	@Column(name = "correo")
	private String correo;

	@Column(name = "usuario")
	private String usuario;

	@Column(name = "contrasenia")
	private String contrasenia;

	@Column(name = "perfil_facebook")
	private String perfil_facebook;

	@Column(name = "ruta_foto_perfil")
	public String ruta_foto_perfil;

	@Column(name = "ruta_foto_dni")
	private String ruta_foto_dni;

	@Column(name = "ruta_foto_facebook")
	private String ruta_foto_facebook;

	@Column(name = "ruta_foto_voucher_pago")
	private String ruta_foto_voucher_pago;

	@Column(name = "ruta_video_registro")
	private String ruta_video_registro;

	@Column(name = "estado")
	private int estado;

	@Column(name = "id_usuario_delete")
	private int id_usuario_delete;

	private int idciclo_antiguo;
	private int idciclo_nuevo;

	public int idciclonormalizado;
	public int idmodalidad;
	public int idsede;
	public int idaula;
	
	public int idusuario;
	public int numero_rows;

	public int getIdciclo_antiguo() {
		return idciclo_antiguo;
	}

	public void setIdciclo_antiguo(int idciclo_antiguo) {
		this.idciclo_antiguo = idciclo_antiguo;
	}

	public int getIdciclo_nuevo() {
		return idciclo_nuevo;
	}

	public void setIdciclo_nuevo(int idciclo_nuevo) {
		this.idciclo_nuevo = idciclo_nuevo;
	}

	public Estudiante(int idestudiante, Ciclo idciclo, Apoderado idapoderado, String nombres, String apellidos,
			String dni, int carrera, String celular, String correo, String usuario, String contrasenia,
			String perfil_facebook, String ruta_foto_perfil, String ruta_foto_dni, String ruta_foto_facebook,
			String ruta_foto_voucher_pago, String ruta_video_registro, int estado, int usuario_delete,
			String medio_info, String ruta_foto_dni2) {
		super();
		this.idestudiante = idestudiante;
		this.idciclo = idciclo;
		this.idapoderado = idapoderado;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.carrera = carrera;
		this.celular = celular;
		this.correo = correo;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.perfil_facebook = perfil_facebook;
		this.ruta_foto_perfil = ruta_foto_perfil;
		this.ruta_foto_dni = ruta_foto_dni;
		this.ruta_foto_facebook = ruta_foto_facebook;
		this.ruta_foto_voucher_pago = ruta_foto_voucher_pago;
		this.ruta_video_registro = ruta_video_registro;
		this.estado = estado;
		this.id_usuario_delete = usuario_delete;
		this.medio_info = medio_info;
		this.ruta_foto_dni2 = ruta_foto_dni2;
	}

	public int getUsuario_delete() {
		return id_usuario_delete;
	}

	public void setUsuario_delete(int usuario_delete) {
		this.id_usuario_delete = usuario_delete;
	}

	@Column(name = "medio_info")
	public String medio_info;

	@Column(name = "ruta_foto_dni2")
	public String ruta_foto_dni2;

	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_usuario_delete() {
		return id_usuario_delete;
	}

	public void setId_usuario_delete(int id_usuario_delete) {
		this.id_usuario_delete = id_usuario_delete;
	}

	public int getIdestudiante() {
		return idestudiante;
	}

	public void setIdestudiante(int idestudiante) {
		this.idestudiante = idestudiante;
	}

	public Ciclo getIdciclo() {
		return idciclo;
	}

	public void setIdciclo(Ciclo idciclo) {
		this.idciclo = idciclo;
	}

	public Apoderado getIdapoderado() {
		return idapoderado;
	}

	public void setIdapoderado(Apoderado idapoderado) {
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

	public int getCarrera() {
		return carrera;
	}

	public void setCarrera(int carrera) {
		this.carrera = carrera;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
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

	public String getPerfil_facebook() {
		return perfil_facebook;
	}

	public void setPerfil_facebook(String perfil_facebook) {
		this.perfil_facebook = perfil_facebook;
	}

	public String getRuta_foto_perfil() {
		return ruta_foto_perfil;
	}

	public void setRuta_foto_perfil(String ruta_foto_perfil) {
		this.ruta_foto_perfil = ruta_foto_perfil;
	}

	public String getRuta_foto_dni() {
		return ruta_foto_dni;
	}

	public void setRuta_foto_dni(String ruta_foto_dni) {
		this.ruta_foto_dni = ruta_foto_dni;
	}

	public String getRuta_foto_facebook() {
		return ruta_foto_facebook;
	}

	public void setRuta_foto_facebook(String ruta_foto_facebook) {
		this.ruta_foto_facebook = ruta_foto_facebook;
	}

	public String getRuta_foto_voucher_pago() {
		return ruta_foto_voucher_pago;
	}

	public void setRuta_foto_voucher_pago(String ruta_foto_voucher_pago) {
		this.ruta_foto_voucher_pago = ruta_foto_voucher_pago;
	}

	public String getRuta_video_registro() {
		return ruta_video_registro;
	}

	public void setRuta_video_registro(String ruta_video_registro) {
		this.ruta_video_registro = ruta_video_registro;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getMedio_info() {
		return medio_info;
	}

	public void setMedio_info(String medio_info) {
		this.medio_info = medio_info;
	}

	public String getRuta_foto_dni2() {
		return ruta_foto_dni2;
	}

	public void setRuta_foto_dni2(String ruta_foto_dni2) {
		this.ruta_foto_dni2 = ruta_foto_dni2;
	}

	@Override
	public String toString() {
		return "Estudiante [idestudiante=" + idestudiante + ", idciclo=" + idciclo + ", idapoderado=" + idapoderado
				+ ", nombres=" + nombres + ", apellidos=" + apellidos + ", dni=" + dni + ", carrera=" + carrera
				+ ", celular=" + celular + ", correo=" + correo + ", usuario=" + usuario + ", contrasenia="
				+ contrasenia + ", perfil_facebook=" + perfil_facebook + ", ruta_foto_perfil=" + ruta_foto_perfil
				+ ", ruta_foto_dni=" + ruta_foto_dni + ", ruta_foto_facebook=" + ruta_foto_facebook
				+ ", ruta_foto_voucher_pago=" + ruta_foto_voucher_pago + ", ruta_video_registro=" + ruta_video_registro
				+ ", estado=" + estado + ", id_usuario_delete=" + id_usuario_delete + ", idciclo_antiguo="
				+ idciclo_antiguo + ", idciclo_nuevo=" + idciclo_nuevo + ", medio_info=" + medio_info
				+ ", ruta_foto_dni2=" + ruta_foto_dni2 + "]";
	}

}
