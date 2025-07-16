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

@Entity
@Table(name = "solicitudes")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "funcion_registrar_solicitud", procedureName = "funcion_registrar_solicitud", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_apellidos", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_universidad", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_ciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idmodalidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_idsede", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_carrera_interes", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_celular", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_correo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_direccion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_perfil_facebook", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_ruta_foto_perfil", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_ruta_foto_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_ruta_foto_facebook", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_ruta_foto_voucher_pago", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_ruta_video_registro", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_nombres_apoderado", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_apellidos_apoderado", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_dni_apoderado", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_celular_apoderado", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_direccion_apoderado", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_correo_apoderado", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_ruta_foto_dni_apoderado", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_medio_info", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_ruta_foto_dni2", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_referido", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_facturacion", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_id_orden", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_estado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_tipo_pago", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_ruta_comprobante", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_monto_pago", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_fecha_nacimiento", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_ruta_comprobante2", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_ruta_comprobante3", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_fecha_inscripcion", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_esColegio", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_json_por_pagar", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_tipo_solicitud", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_actualizar_fotoestudiante", procedureName = "funcion_actualizar_fotoestudiante", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsolicitud", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_linkfotoalumno", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_linkfotodnialumno", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ruta_comprobante", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_listar_solicitudes", procedureName = "funcion_listar_solicitudes", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_indicador", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_listar_solicitudes_preliminar", procedureName = "funcion_listar_solicitudes_preliminar", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_rows", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_reporte_solicitudes_preliminar", procedureName = "funcion_reporte_solicitudes_preliminar", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_rows", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombres", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_eliminar_solicitud", procedureName = "funcion_eliminar_solicitud", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsolicitud", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_eliminado_por", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "funcion_aprobar_solicitud", procedureName = "funcion_aprobar_solicitud", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsolicitud", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_aprobado_por", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_obtener_aulas_por_ciclo", procedureName = "f_obtener_aulas_por_ciclo", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmodalidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsede", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idarea", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_obtener_aulas_editar_estudiante", procedureName = "f_obtener_aulas_editar_estudiante", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmodalidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsede", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcarrera", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "funcion_cambiar_estado", procedureName = "funcion_cambiar_estado", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "n_id_orden", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_actualizar_solicitudes_observado", procedureName = "f_actualizar_solicitudes_observado", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsolicitud", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_observado", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_observado_por", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_motivo_observacion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_actualizar_cronograma_observado", procedureName = "f_actualizar_cronograma_observado", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsolicitud", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_observado_por", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_monto_pago", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ruta_comprobante", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_actualizar_estudiante_qr", procedureName = "f_actualizar_estudiante_qr", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "json_input", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_aprobar_pago_solicitud", procedureName = "f_aprobar_pago_solicitud", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsolicitud", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_validado_por", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class), }),

		@NamedStoredProcedureQuery(name = "f_listar_ciclos_editar_estudiante", procedureName = "f_listar_ciclos_editar_estudiante", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclo", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idmodalidad", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsede", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

})

public class Solicitudes {

	@Id
	@Column(name = "idsolicitud")
	public int idsolicitud;
	@Column(name = "nombres")
	public String nombres;
	@Column(name = "apellidos")
	public String apellidos;
	@Column(name = "dni")
	public String dni;
	@Column(name = "universidad")
	public String universidad;
	@Column(name = "ciclo")
	public int ciclo;
	@Column(name = "idciclonormalizado")
	public int idciclonormalizado;
	@Column(name = "idsede")
	public int idsede;
	@Column(name = "idmodalidad")
	public int idmodalidad;
	@Column(name = "carrea_interes")
	public String carrera_interes;
	@Column(name = "celular")
	public String celular;
	@Column(name = "correo")
	public String correo;
	@Column(name = "direccion")
	public String direccion;
	@Column(name = "perfil_facebook")
	public String perfil_facebook;
	@Column(name = "ruta_foto_perfil")
	public String ruta_foto_perfil;
	@Column(name = "ruta_foto_dni")
	public String ruta_foto_dni;
	@Column(name = "ruta_foto_facebook")
	public String ruta_foto_facebook;
	@Column(name = "ruta_foto_voucher_pago")
	public String ruta_foto_voucher_pago;
	@Column(name = "ruta_video_registro")
	public String ruta_video_registro;
	@Column(name = "estado")
	public int estado;
	@Column(name = "medio_info")
	public String medio_info;
	@Column(name = "ruta_foto_dni2")
	public String ruta_foto_dni2;
	@Column(name = "tipo_pago")
	public int tipo_pago;
	@Column(name = "referido")
	public String referido;
	@Column(name = "ruta_comprobante")
	public String ruta_comprobante;
	@Column(name = "facturacion")
	public int facturacion;
	@Column(name = "id_orden")
	public String id_orden;
	@Column(name = "monto_pago")
	public double monto_pago;
	@Column(name = "aprobado_por")
	public int aprobado_por;
	@Column(name = "fecha_nacimiento")
	public Date fecha_nacimiento;
	@Column(name = "validado_por")
	public int validado_por;
	@Column(name = "ruta_comprobante2")
	public String ruta_comprobante2;
	@Column(name = "ruta_comprobante3")
	public String ruta_comprobante3;
	@Column(name = "fecha_inscripcion")
	public Date fecha_inscripcion;
	@Column(name = "esColegio")
	public int esColegio;
	@Column(name = "json_por_pagar")
	public String json_por_pagar;
	@Column(name = "tipo_solicitud")
	public int tipo_solicitud;
	@Column(name = "observado")
	public int observado;
	@Column(name = "observado_por")
	public int observado_por;
	@Column(name = "motivo_observacion")
	public String motivo_observacion;
	@Column(name = "eliminado_por")
	public int eliminado_por;

	public int row;
	public String fecha;
	public String descripcion_ciclo;
	public int idarea;

	@ManyToOne
	@JoinColumn(name = "idapoderado")
	public Apoderado apoderado;

	public Solicitudes() {
		super();
	}

	

	public Solicitudes(int idsolicitud, String nombres, String apellidos, String dni, String universidad, int ciclo,
			int idciclonormalizado, int idsede, int idmodalidad, String carrera_interes, String celular, String correo,
			String direccion, String perfil_facebook, String ruta_foto_perfil, String ruta_foto_dni,
			String ruta_foto_facebook, String ruta_foto_voucher_pago, String ruta_video_registro, int estado,
			String medio_info, String ruta_foto_dni2, int tipo_pago, String referido, String ruta_comprobante,
			int facturacion, String id_orden, double monto_pago, int aprobado_por, Date fecha_nacimiento,
			int validado_por, String ruta_comprobante2, String ruta_comprobante3, Date fecha_inscripcion, int esColegio,
			String json_por_pagar, int tipo_solicitud, int observado, int observado_por, String motivo_observacion,
			int eliminado_por, int row, String fecha, String descripcion_ciclo, int idarea, Apoderado apoderado) {
		super();
		this.idsolicitud = idsolicitud;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.universidad = universidad;
		this.ciclo = ciclo;
		this.idciclonormalizado = idciclonormalizado;
		this.idsede = idsede;
		this.idmodalidad = idmodalidad;
		this.carrera_interes = carrera_interes;
		this.celular = celular;
		this.correo = correo;
		this.direccion = direccion;
		this.perfil_facebook = perfil_facebook;
		this.ruta_foto_perfil = ruta_foto_perfil;
		this.ruta_foto_dni = ruta_foto_dni;
		this.ruta_foto_facebook = ruta_foto_facebook;
		this.ruta_foto_voucher_pago = ruta_foto_voucher_pago;
		this.ruta_video_registro = ruta_video_registro;
		this.estado = estado;
		this.medio_info = medio_info;
		this.ruta_foto_dni2 = ruta_foto_dni2;
		this.tipo_pago = tipo_pago;
		this.referido = referido;
		this.ruta_comprobante = ruta_comprobante;
		this.facturacion = facturacion;
		this.id_orden = id_orden;
		this.monto_pago = monto_pago;
		this.aprobado_por = aprobado_por;
		this.fecha_nacimiento = fecha_nacimiento;
		this.validado_por = validado_por;
		this.ruta_comprobante2 = ruta_comprobante2;
		this.ruta_comprobante3 = ruta_comprobante3;
		this.fecha_inscripcion = fecha_inscripcion;
		this.esColegio = esColegio;
		this.json_por_pagar = json_por_pagar;
		this.tipo_solicitud = tipo_solicitud;
		this.observado = observado;
		this.observado_por = observado_por;
		this.motivo_observacion = motivo_observacion;
		this.eliminado_por = eliminado_por;
		this.row = row;
		this.fecha = fecha;
		this.descripcion_ciclo = descripcion_ciclo;
		this.idarea = idarea;
		this.apoderado = apoderado;
	}



	public String getJson_por_pagar() {
		return json_por_pagar;
	}

	public void setJson_por_pagar(String json_por_pagar) {
		this.json_por_pagar = json_por_pagar;
	}

	public int getTipo_solicitud() {
		return tipo_solicitud;
	}

	public void setTipo_solicitud(int tipo_solicitud) {
		this.tipo_solicitud = tipo_solicitud;
	}

	public Date getFecha_inscripcion() {
		return fecha_inscripcion;
	}

	public void setFecha_inscripcion(Date fecha_inscripcion) {
		this.fecha_inscripcion = fecha_inscripcion;
	}

	public String getRuta_comprobante2() {
		return ruta_comprobante2;
	}

	public void setRuta_comprobante2(String ruta_comprobante2) {
		this.ruta_comprobante2 = ruta_comprobante2;
	}

	public String getRuta_comprobante3() {
		return ruta_comprobante3;
	}

	public void setRuta_comprobante3(String ruta_comprobante3) {
		this.ruta_comprobante3 = ruta_comprobante3;
	}

	public int getValidado_por() {
		return validado_por;
	}

	public void setValidado_por(int validado_por) {
		this.validado_por = validado_por;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public int getAprobado_por() {
		return aprobado_por;
	}

	public void setAprobado_por(int aprobado_por) {
		this.aprobado_por = aprobado_por;
	}

	public double getMonto_pago() {
		return monto_pago;
	}

	public void setMonto_pago(double monto_pago) {
		this.monto_pago = monto_pago;
	}

	public String getRuta_comprobante() {
		return ruta_comprobante;
	}

	public void setRuta_comprobante(String ruta_comprobante) {
		this.ruta_comprobante = ruta_comprobante;
	}

	public int getIdsolicitud() {
		return idsolicitud;
	}

	public void setIdsolicitud(int idsolicitud) {
		this.idsolicitud = idsolicitud;
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

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public int getCiclo() {
		return ciclo;
	}

	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}

	public int getIdciclonormalizado() {
		return idciclonormalizado;
	}

	public void setIdciclonormalizado(int idciclonormalizado) {
		this.idciclonormalizado = idciclonormalizado;
	}

	public int getIdsede() {
		return idsede;
	}

	public void setIdsede(int idsede) {
		this.idsede = idsede;
	}

	public int getIdmodalidad() {
		return idmodalidad;
	}

	public void setIdmodalidad(int idmodalidad) {
		this.idmodalidad = idmodalidad;
	}

	public String getCarrera_interes() {
		return carrera_interes;
	}

	public void setCarrera_interes(String carrera_interes) {
		this.carrera_interes = carrera_interes;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public Apoderado getApoderado() {
		return apoderado;
	}

	public void setApoderado(Apoderado apoderado) {
		this.apoderado = apoderado;
	}

	public String getReferido() {
		return referido;
	}

	public void setReferido(String referido) {
		this.referido = referido;
	}

	public int getFacturacion() {
		return facturacion;
	}

	public void setFacturacion(int facturacion) {
		this.facturacion = facturacion;
	}

	public String getId_orden() {
		return id_orden;
	}

	public void setId_orden(String id_orden) {
		this.id_orden = id_orden;
	}

	public int getTipo_pago() {
		return tipo_pago;
	}

	public void setTipo_pago(int tipo_pago) {
		this.tipo_pago = tipo_pago;
	}

	public int getEsColegio() {
		return esColegio;
	}

	public void setEsColegio(int esColegio) {
		this.esColegio = esColegio;

	}

	public int getObservado() {
		return observado;
	}

	public void setObservado(int observado) {
		this.observado = observado;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion_ciclo() {
		return descripcion_ciclo;
	}

	public void setDescripcion_ciclo(String descripcion_ciclo) {
		this.descripcion_ciclo = descripcion_ciclo;
	}

	public int getObservado_por() {
		return observado_por;
	}

	public void setObservado_por(int observado_por) {
		this.observado_por = observado_por;
	}

	public String getMotivo_observacion() {
		return motivo_observacion;
	}

	public void setMotivo_observacion(String motivo_observacion) {
		this.motivo_observacion = motivo_observacion;
	}

	public int getEliminado_por() {
		return eliminado_por;
	}

	public void setEliminado_por(int eliminado_por) {
		this.eliminado_por = eliminado_por;
	}

	public int getIdarea() {
		return idarea;
	}

	public void setIdarea(int idarea) {
		this.idarea = idarea;
	}

	@Override
	public String toString() {
		return "Solicitudes [idsolicitud=" + idsolicitud + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", dni=" + dni + ", universidad=" + universidad + ", ciclo=" + ciclo + ", idciclonormalizado="
				+ idciclonormalizado + ", idsede=" + idsede + ", idmodalidad=" + idmodalidad + ", carrera_interes="
				+ carrera_interes + ", celular=" + celular + ", correo=" + correo + ", direccion=" + direccion
				+ ", perfil_facebook=" + perfil_facebook + ", ruta_foto_perfil=" + ruta_foto_perfil + ", ruta_foto_dni="
				+ ruta_foto_dni + ", ruta_foto_facebook=" + ruta_foto_facebook + ", ruta_foto_voucher_pago="
				+ ruta_foto_voucher_pago + ", ruta_video_registro=" + ruta_video_registro + ", estado=" + estado
				+ ", medio_info=" + medio_info + ", ruta_foto_dni2=" + ruta_foto_dni2 + ", tipo_pago=" + tipo_pago
				+ ", referido=" + referido + ", ruta_comprobante=" + ruta_comprobante + ", facturacion=" + facturacion
				+ ", id_orden=" + id_orden + ", monto_pago=" + monto_pago + ", aprobado_por=" + aprobado_por
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", validado_por=" + validado_por + ", ruta_comprobante2="
				+ ruta_comprobante2 + ", ruta_comprobante3=" + ruta_comprobante3 + ", fecha_inscripcion="
				+ fecha_inscripcion + ", esColegio=" + esColegio + ", tipo_solicitud=" + tipo_solicitud + ", apoderado="
				+ apoderado + "]";
	}

}