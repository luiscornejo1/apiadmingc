package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.bean.*;
import com.rosettcompany.grupoCiencia.bean.EstudianteApoderado;
import com.rosettcompany.grupoCiencia.repository.Estudiante;
import com.rosettcompany.grupoCiencia.repository.ExamenEstudiante;
import com.rosettcompany.grupoCiencia.repositoryI.EstudianteRepositoryI;

@Service
public class EstudianteServicio {

	@Autowired
	private EstudianteRepositoryI estudianteRepositoryI;

	public String f_pago_cronograma_estudiante(String json_input) throws Exception {
		return estudianteRepositoryI.f_pago_cronograma_estudiante(json_input);

	}

	public String listarEstudiantes(Estudiante estudiante) {
		return estudianteRepositoryI.listarEstudiantes(estudiante.idusuario, estudiante.numero_rows,
				estudiante.getNombres(), estudiante.getApellidos(), estudiante.getRuta_foto_dni());
	}

	public String buscarEstudiantes(Estudiante estudiante) {
		return estudianteRepositoryI.buscarEstudiante(
				estudiante.idusuario,
				estudiante.getNombres()
				);
	}

	public String buscarEstudiantesDeudores(Estudiante estudiante) {
		return estudianteRepositoryI.buscarEstudiantesDeudores(estudiante.getNombres());
	}
	
	public String listarEstudiantes(BeanAsistenciaCursos asistenciaCursos) {
		return estudianteRepositoryI.listarEstudiantes(
				asistenciaCursos.getIdciclo(),
				asistenciaCursos.getIdcurso(),
				asistenciaCursos.getFecha());
	}
	
	public String registrarAsistenciaEstudiantes(BeanAsistenciaEstudiantes asistenciaEstudiantes) {
		return estudianteRepositoryI.registrarAsistenciaEstudiantes(
				asistenciaEstudiantes.getIdasistencia(),
				asistenciaEstudiantes.getLista_estudiantes());
	}

	public String eliminarEstudiantes(Estudiante estudiante) {
		return estudianteRepositoryI.eliminarEstudiantes(estudiante.getIdestudiante(), estudiante.getEstado(),
				estudiante.getUsuario_delete());
	}

	public String editarEstudiante(Estudiante estudiante) {
		return estudianteRepositoryI.editarEstudiante(estudiante.getIdestudiante(), estudiante.idciclonormalizado,
				estudiante.idmodalidad, estudiante.idsede, estudiante.idaula, estudiante.getNombres(),
				estudiante.getApellidos(), estudiante.getDni(), estudiante.getCarrera(), estudiante.getCelular(),
				estudiante.getCorreo(), estudiante.getPerfil_facebook(), estudiante.getRuta_foto_dni(),
				estudiante.getRuta_foto_facebook(), estudiante.getRuta_foto_voucher_pago(),
				estudiante.getRuta_video_registro(), estudiante.getRuta_foto_perfil(), estudiante.getRuta_foto_dni2());

	}

	public String validarDniEstudiante(Estudiante estudiante) {
		return estudianteRepositoryI.validarDniEstudiante(estudiante.getIdestudiante(), estudiante.getDni());
	}

	public String f_validar_dni_unico_estudiante_solicitudes(Estudiante estudiante) {
		return estudianteRepositoryI.f_validar_dni_unico_estudiante_solicitudes(estudiante.getIdestudiante(),
				estudiante.getDni());
	}

	public String eliminarExamenEstudiante(ExamenEstudiante examen) {
		return estudianteRepositoryI.eliminarExamenEstudiante(examen.getIdestudiante(), examen.getIdexamen());
	}

	public String f_mostrar_carnet_dni(Estudiante estudiante) {
		return estudianteRepositoryI.f_mostrar_carnet_dni(estudiante.getDni());
	}

	public String listarEstudiantesPendientes(Estudiante estudiante) {
		return estudianteRepositoryI.listarEstudiantesPendientes(estudiante.getIdestudiante(), estudiante.getNombres(),
				estudiante.getApellidos());
	}

	public String f_buscar_datos_nrooperacion_repetida(String in_nrooperacion) throws Exception {
		return estudianteRepositoryI.f_buscar_datos_nrooperacion_repetida(in_nrooperacion);
	}

	public String f_actualizar_asignacion_alumno_aula(Estudiante estudiante) throws Exception {
		return estudianteRepositoryI.f_actualizar_asignacion_alumno_aula(estudiante.getIdciclo_antiguo(),
				estudiante.getIdciclo_nuevo(), estudiante.getIdestudiante(), estudiante.getId_usuario_delete());
	}

	public String f_buscar_estudiante_por_dni(String in_dni) throws Exception {
		return estudianteRepositoryI.f_buscar_estudiante_por_dni(in_dni);
	}

	public String f_buscar_ciclos_estudiante_por_dni(String in_dni) throws Exception {
		return estudianteRepositoryI.f_buscar_ciclos_estudiante_por_dni(in_dni);
	}

	public String f_buscar_historial_esnuevo(String in_dni) throws Exception {
		return estudianteRepositoryI.f_buscar_historial_esnuevo(in_dni);
	}

	public String funcion_reporte_estudiantes_eliminados_mensual() throws Exception {
		return estudianteRepositoryI.funcion_reporte_estudiantes_eliminados_mensual();
	}
	
	public String funcion_reporte_estudiantes_apoderados_mensual() throws Exception {
		return estudianteRepositoryI.funcion_reporte_estudiantes_apoderados_mensual();
	}
}
