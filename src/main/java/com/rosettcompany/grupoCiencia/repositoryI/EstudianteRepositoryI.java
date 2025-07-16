package com.rosettcompany.grupoCiencia.repositoryI;

import java.sql.Date;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Estudiante;

@Repository
public interface EstudianteRepositoryI extends CrudRepository<Estudiante, Integer> {
	@Procedure(name = "f_pago_cronograma_estudiante")
	public String f_pago_cronograma_estudiante(@Param("json_input") String json_input);

	@Procedure(name = "listar_estudiantes")
	public String listarEstudiantes(@Param("in_idusuario") int idusuario, @Param("in_numero_rows") int numero_rows,
			@Param("in_nombres") String nombres, @Param("in_apellidos") String apellidos,
			@Param("in_ruta_foto_dni") String ruta_foto_dni);

	@Procedure(name = "buscar_estudiantes")
	public String buscarEstudiante(@Param("in_idusuario") int idusuario, @Param("in_condicion") String nombres);

	@Procedure(name = "buscar_estudiantes_deudores")
	public String buscarEstudiantesDeudores(@Param("in_condicion") String nombres);

	@Procedure(name = "eliminar_estudiante")
	public String eliminarEstudiantes(@Param("in_id_estudiante") int idestudiante, @Param("in_estado") int estado,
			@Param("usuario_delete") int id_usuario_delete);

	@Procedure(name = "editar_estudiante")
	public String editarEstudiante(@Param("in_id_estudiante") int idestudiante,
			@Param("in_idciclonormalizado") int idciclonormalizado, @Param("in_idmodalidad") int idmodalidad,
			@Param("in_idsede") int idsede, @Param("in_idaula") int idaula, @Param("in_nombres") String nombres,
			@Param("in_apellidos") String apellidos, @Param("in_dni") String dni, @Param("in_carrera") int carrera,
			@Param("in_celular") String celular, @Param("in_correo") String correo, @Param("in_perfil") String perfil,
			@Param("in_foto_dni") String foto_dni, @Param("in_foto_facebook") String foto_facebook,
			@Param("in_foto_voucher") String foto_voucher, @Param("in_video") String video,
			@Param("in_foto_perfil") String foto_perfil, @Param("ruta_foto_dni2") String ruta_foto_dni2);

	@Procedure(name = "validar_dni_unico_estudiante")
	public String validarDniEstudiante(@Param("in_id_estudiante") int idestudiante, @Param("in_dni") String dni);

	@Procedure(name = "f_validar_dni_unico_estudiante_solicitudes")
	public String f_validar_dni_unico_estudiante_solicitudes(@Param("in_id_estudiante") int idestudiante,
			@Param("in_dni") String dni);

	@Procedure(name = "funcion_eliminar_examen_estudiante")
	public String eliminarExamenEstudiante(@Param("n_idestudiante") int idestudiante,
			@Param("n_idexamen") int n_idexamen);

	@Procedure(name = "f_mostrar_carnet_dni")
	public String f_mostrar_carnet_dni(@Param("in_dni") String dni);

	@Procedure(name = "listar_estudiantes_pendientes")
	public String listarEstudiantesPendientes(@Param("in_id_usuario") int idusuario,
			@Param("in_nombres") String nombres, @Param("in_apellidos") String apellidos);

	@Procedure(name = "f_buscar_datos_nrooperacion_repetida")
	public String f_buscar_datos_nrooperacion_repetida(@Param("in_nrooperacion") String in_nrooperacion);

	@Procedure(name = "f_actualizar_asignacion_alumno_aula")
	public String f_actualizar_asignacion_alumno_aula(@Param("in_idciclo_antiguo") int idciclo_antiguo,
			@Param("in_idciclo_nuevo") int idciclo_nuevo, @Param("in_idestudiante") int idestudiante,
			@Param("in_idusuario") int id_usuario_delete);

	@Procedure(name = "f_buscar_estudiante_por_dni")
	public String f_buscar_estudiante_por_dni(@Param("in_dni") String in_dni);

	@Procedure(name = "f_buscar_ciclos_estudiante_por_dni")
	public String f_buscar_ciclos_estudiante_por_dni(@Param("in_dni") String in_dni);

	@Procedure(name = "f_buscar_historial_esnuevo")
	public String f_buscar_historial_esnuevo(@Param("in_dni") String in_dni);

	@Procedure(name = "funcion_reporte_estudiantes_eliminados_mensual")
	public String funcion_reporte_estudiantes_eliminados_mensual();
	
	@Procedure(name = "funcion_reporte_estudiantes_apoderados_mensual")
	public String funcion_reporte_estudiantes_apoderados_mensual();

	@Procedure(name="funcion_listar_estudiantes_ciclo")
	public String listarEstudiantes(
			@Param("in_idciclo") int in_idciclo,
			@Param("in_idcurso") int in_idcurso,
			@Param("in_fecha") Date in_fecha
			);
	
	@Procedure(name="registrar_asistencia_estudiantes")
	public String registrarAsistenciaEstudiantes(
			@Param("in_idasistencia") int in_idasistencia,
			@Param("in_lista_estudiantes") String in_lista_estudiantes
			);
}
