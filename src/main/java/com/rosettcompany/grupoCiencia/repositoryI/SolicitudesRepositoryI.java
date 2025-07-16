package com.rosettcompany.grupoCiencia.repositoryI;

import java.sql.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Solicitudes;

@Repository
public interface SolicitudesRepositoryI extends CrudRepository<Solicitudes, Integer> {

	@Query(nativeQuery = true, value = "SELECT actualizarSolicitudes();")
	public String actualizarSolicitudes();

	@Procedure(name = "funcion_actualizar_fotoestudiante")
	public String ActualizarFotoSolicitud(@Param("in_idsolicitud") Integer idsolicitud,
			@Param("in_linkfotoalumno") String ruta_foto_perfil, @Param("in_linkfotodnialumno") String ruta_foto_dni,
			@Param("in_ruta_comprobante") String ruta_comprobante);

	@Procedure(name = "f_actualizar_estudiante_qr")
	public String f_actualizar_estudiante_qr(@Param("json_input") String json_input);

	@Procedure(name = "funcion_registrar_solicitud")
	public String RegistrarSolicitud(@Param("n_nombres") String nombres, @Param("n_apellidos") String apellidos,
			@Param("n_dni") String dni, @Param("n_universidad") String universidad, @Param("n_ciclo") int ciclo,
			@Param("n_idciclonormalizado") int idciclonormalizado, @Param("n_idmodalidad") int idmodalidad,
			@Param("n_idsede") int idsede, @Param("n_carrera_interes") String carrera_interes,
			@Param("n_celular") String celular, @Param("n_correo") String correo,
			@Param("n_direccion") String direccion, @Param("n_perfil_facebook") String perfil_facebook,
			@Param("n_ruta_foto_perfil") String n_ruta_foto_perfil, @Param("n_ruta_foto_dni") String ruta_foto_dni,
			@Param("n_ruta_foto_facebook") String ruta_foto_facebook,
			@Param("n_ruta_foto_voucher_pago") String ruta_foto_voucher_pago,
			@Param("n_ruta_video_registro") String ruta_video_registro,
			@Param("n_nombres_apoderado") String nombres_apoderado,
			@Param("n_apellidos_apoderado") String apellidos_apoderado, @Param("n_dni_apoderado") String dni_apoderado,
			@Param("n_celular_apoderado") String celular_apoderado,
			@Param("n_direccion_apoderado") String direccion_apoderado,
			@Param("n_correo_apoderado") String correo_apoderado,
			@Param("n_ruta_foto_dni_apoderado") String ruta_foto_dni_apoderado,
			@Param("n_medio_info") String n_medio_info, @Param("n_ruta_foto_dni2") String n_ruta_foto_dni2,
			@Param("n_referido") String n_referido, @Param("n_facturacion") int facturacion,
			@Param("n_id_orden") String n_id_orden, @Param("n_estado") int n_estado,
			@Param("n_tipo_pago") int n_tipo_pago, @Param("n_ruta_comprobante") String n_ruta_comprobante,
			@Param("n_monto_pago") double n_monto_pago, @Param("n_fecha_nacimiento") Date n_fecha_nacimiento,
			@Param("n_ruta_comprobante2") String n_ruta_comprobante2,
			@Param("n_ruta_comprobante3") String n_ruta_comprobante3,
			@Param("n_fecha_inscripcion") Date n_fecha_inscripcion, @Param("n_esColegio") int n_esColegio,
			@Param("n_json_por_pagar") String n_json_por_pagar, @Param("n_tipo_solicitud") int n_tipo_solicitud);

	@Procedure(name = "funcion_listar_solicitudes")
	public String ListarSolicitudes(@Param("in_indicador") int indicador);

	@Procedure(name = "funcion_listar_solicitudes_preliminar")
	public String funcion_listar_solicitudes_preliminar(@Param("in_rows") int rows, @Param("in_nombres") String nombres,
			@Param("in_ciclo") String descripcion_ciclo, @Param("in_fecha") String fecha);

	@Procedure(name = "funcion_reporte_solicitudes_preliminar")
	public String funcion_reporte_solicitudes_preliminar(@Param("in_rows") int rows,
			@Param("in_nombres") String nombres, @Param("in_ciclo") String descripcion_ciclo,
			@Param("in_fecha") String fecha);

	@Procedure(name = "funcion_eliminar_solicitud")
	public String EliminarSolicitud(@Param("in_idsolicitud") int idsolicitud,
			@Param("in_eliminado_por") int eliminado_por);

	@Procedure(name = "funcion_aprobar_solicitud")
	public String AprobarSolicitud(@Param("in_idsolicitud") int idsolicitud,
			@Param("in_aprobado_por") int aprobado_por);

	@Procedure(name = "f_obtener_aulas_por_ciclo")
	String listarAula(@Param("in_idciclonormalizado") int idciclonormalizado, @Param("in_idmodalidad") int idmodalidad,
			@Param("in_idsede") int idsede, @Param("in_idarea") int idarea);

	@Procedure(name = "f_obtener_aulas_editar_estudiante")
	String f_obtener_aulas_editar_estudiante(@Param("in_idciclonormalizado") int idciclonormalizado,
			@Param("in_idmodalidad") int idmodalidad, @Param("in_idsede") int idsede,
			@Param("in_idcarrera") String carrera_interes);

	@Procedure(name = "f_listar_ciclos_editar_estudiante")
	String listarCiclosEditarEstudiante(@Param("in_idciclo") int idciclo,
			@Param("in_idciclonormalizado") int idciclonormalizado, @Param("in_idmodalidad") int idmodalidad,
			@Param("in_idsede") int idsede);

	@Procedure(name = "f_listar_ciclos_usuarios")
	String f_listar_ciclos_usuarios();

	@Procedure(name = "funcion_cambiar_estado")
	public String funcion_cambiar_estado(@Param("n_id_orden") String n_id_orden);

	@Procedure(name = "f_actualizar_solicitudes_observado")
	public String f_actualizar_solicitudes_observado(@Param("in_idsolicitud") int idsolicitud,
			@Param("in_observado") int observado, @Param("in_observado_por") int observado_por,
			@Param("in_motivo_observacion") String motivo_observacion);

	@Procedure(name = "f_actualizar_cronograma_observado")
	public String f_actualizar_cronograma_observado(@Param("in_idsolicitud") int idsolicitud,
			@Param("in_observado_por") int observado_por, @Param("in_monto_pago") double montopago,
			@Param("in_ruta_comprobante") String ruta_comprobante);

	@Procedure(name = "f_aprobar_pago_solicitud")
	public String f_aprobar_pago_solicitud(@Param("in_idsolicitud") int idsolicitud,
			@Param("in_validado_por") int validado_por);

	@Procedure(name = "funcion_reporte_solicitudes_eliminadas_mensual")
	public String funcion_reporte_solicitudes_eliminadas_mensual();

	@Procedure(name = "funcion_reporte_solicitudes_vendedores")
	public String funcion_reporte_solicitudes_vendedores();
}
