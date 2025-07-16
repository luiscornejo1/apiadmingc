package com.rosettcompany.grupoCiencia.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TimeZone;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import com.rosettcompany.grupoCiencia.bean.filtroBibliotecaBean;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rosettcompany.grupoCiencia.bean.CronogramaTempEntity;
import com.rosettcompany.grupoCiencia.bean.DetalleCicloSedeModalidad;
import com.rosettcompany.grupoCiencia.bean.EstudianteApoderado;
import com.rosettcompany.grupoCiencia.bean.ExamenBean;
import com.rosettcompany.grupoCiencia.bean.CodisBean;
import com.rosettcompany.grupoCiencia.bean.FiltroBancoPreguntas;
import com.rosettcompany.grupoCiencia.bean.beanAdmisionBiblioteca;
import com.rosettcompany.grupoCiencia.bean.beanCiclo;
import com.rosettcompany.grupoCiencia.bean.beanEstadistica;
import com.rosettcompany.grupoCiencia.bean.beanOrdenRecurso;
import com.rosettcompany.grupoCiencia.bean.beanPreciosFiltrados;
import com.rosettcompany.grupoCiencia.bean.beanReporte;
import com.rosettcompany.grupoCiencia.repository.AreasCarrera;
import com.rosettcompany.grupoCiencia.repository.AsignacionAlumnoAula;
import com.rosettcompany.grupoCiencia.repository.AsignacionAulasEntity;
import com.rosettcompany.grupoCiencia.repository.AulasEntity;
import com.rosettcompany.grupoCiencia.repository.BecaArchivoMasivo;
import com.rosettcompany.grupoCiencia.repository.Comunicado;
import com.rosettcompany.grupoCiencia.repository.CabeceraPregunta;
import com.rosettcompany.grupoCiencia.repository.Campaign;
import com.rosettcompany.grupoCiencia.repository.Codis;
import com.rosettcompany.grupoCiencia.repository.CampaignAnswers;
import com.rosettcompany.grupoCiencia.repository.CodisRespuesta;
import com.rosettcompany.grupoCiencia.repository.Ciclo;
import com.rosettcompany.grupoCiencia.repository.CiclosNormalizadosEntity;
import com.rosettcompany.grupoCiencia.repository.ClaseBiblioteca;
import com.rosettcompany.grupoCiencia.repository.ClaveBiblioteca;
import com.rosettcompany.grupoCiencia.repository.Comunicado;
import com.rosettcompany.grupoCiencia.repository.CronogramaPagos;
import com.rosettcompany.grupoCiencia.repository.Curso;
import com.rosettcompany.grupoCiencia.repository.DetalleAreaCurso;
import com.rosettcompany.grupoCiencia.repository.DetalleEstudiantesBecaDescuento;
import com.rosettcompany.grupoCiencia.repository.DetallePregunta;
import com.rosettcompany.grupoCiencia.repository.EscaneoBiblioteca;
import com.rosettcompany.grupoCiencia.repository.Estudiante;
import com.rosettcompany.grupoCiencia.repository.Examen;
import com.rosettcompany.grupoCiencia.repository.ExamenEstudiante;
import com.rosettcompany.grupoCiencia.repository.Historial;
import com.rosettcompany.grupoCiencia.repository.HistorialAcceso;
import com.rosettcompany.grupoCiencia.repository.MaterialBiblioteca;
import com.rosettcompany.grupoCiencia.repository.Matriculas;
import com.rosettcompany.grupoCiencia.repository.Parametros;
import com.rosettcompany.grupoCiencia.repository.PersonalVentas;
import com.rosettcompany.grupoCiencia.repository.PreciosEntity;
import com.rosettcompany.grupoCiencia.repository.ProspectoBiblioteca;
import com.rosettcompany.grupoCiencia.repository.Recurso;
import com.rosettcompany.grupoCiencia.repository.Salones;
import com.rosettcompany.grupoCiencia.repository.Sedes;
import com.rosettcompany.grupoCiencia.repository.Solicitudes;
import com.rosettcompany.grupoCiencia.repository.SolucionarioBiblioteca;
import com.rosettcompany.grupoCiencia.repository.Tema;
import com.rosettcompany.grupoCiencia.repository.TemaBiblioteca;
import com.rosettcompany.grupoCiencia.repository.Universidad;
import com.rosettcompany.grupoCiencia.repository.Usuarios;
import com.rosettcompany.grupoCiencia.repository.Video;
import com.rosettcompany.grupoCiencia.repository.NotasSimulacroEstudiantes;

import com.rosettcompany.grupoCiencia.service.ExamenEstudianteServicio;
import com.rosettcompany.grupoCiencia.repositoryI.DetalleAreaCursoRepositoryI;
import com.rosettcompany.grupoCiencia.repositoryI.AsistenciaCursoRepositoryI;
import com.rosettcompany.grupoCiencia.service.AccesoMesesServicio;
import com.rosettcompany.grupoCiencia.service.AnioServicio;
import com.rosettcompany.grupoCiencia.service.ApoderadosServicio;
import com.rosettcompany.grupoCiencia.service.AreasCarreraServicio;
import com.rosettcompany.grupoCiencia.service.AsignacionAlumnoAulaServicio;
import com.rosettcompany.grupoCiencia.service.AulaServicio;
import com.rosettcompany.grupoCiencia.service.BecaArchivoMasivoServicio;
import com.rosettcompany.grupoCiencia.service.BecasEstudiantesServicio;
import com.rosettcompany.grupoCiencia.service.CabeceraPreguntaServicio;
import com.rosettcompany.grupoCiencia.service.CampaignAnswersServicio;
import com.rosettcompany.grupoCiencia.service.CampaignServicio;
import com.rosettcompany.grupoCiencia.service.CodisServicio;
import com.rosettcompany.grupoCiencia.service.CodisRespuestaServicio;
import com.rosettcompany.grupoCiencia.service.CarreraServicio;
import com.rosettcompany.grupoCiencia.service.CicloServicio;
import com.rosettcompany.grupoCiencia.service.CiclosNormalizadosServiceImpl;
import com.rosettcompany.grupoCiencia.service.ClaseBibliotecaServicio;
import com.rosettcompany.grupoCiencia.service.ClaveBibliotecaServicio;
import com.rosettcompany.grupoCiencia.service.ComunicadoServicio;
import com.rosettcompany.grupoCiencia.service.CronogramaPagosServicio;
import com.rosettcompany.grupoCiencia.service.CursoServicio;
import com.rosettcompany.grupoCiencia.service.EscaneoBibliotecaServicio;
import com.rosettcompany.grupoCiencia.service.EstadisticaExamenServicio;
import com.rosettcompany.grupoCiencia.service.EstudianteServicio;
import com.rosettcompany.grupoCiencia.service.ExamenServicio;
import com.rosettcompany.grupoCiencia.service.HistorialAccesoServicio;
import com.rosettcompany.grupoCiencia.service.HistorialServicio;
import com.rosettcompany.grupoCiencia.service.MaterialBibliotecaServicio;
import com.rosettcompany.grupoCiencia.service.MatriculasServicio;
import com.rosettcompany.grupoCiencia.service.ModalidadServicio;
import com.rosettcompany.grupoCiencia.service.ParametrosServicio;
import com.rosettcompany.grupoCiencia.service.PersonalVentasServicio;
import com.rosettcompany.grupoCiencia.service.PreciosServiceImpl;
import com.rosettcompany.grupoCiencia.service.ProspectoBibliotecaServicio;
import com.rosettcompany.grupoCiencia.service.RecursoServicio;
import com.rosettcompany.grupoCiencia.service.SalonesServicio;
import com.rosettcompany.grupoCiencia.service.SedesServicio;
import com.rosettcompany.grupoCiencia.service.SemestreServicio;
import com.rosettcompany.grupoCiencia.service.SolicitudesServicio;
import com.rosettcompany.grupoCiencia.service.SolucionarioBibliotecaServicio;
import com.rosettcompany.grupoCiencia.service.TemaBibliotecaServicio;
import com.rosettcompany.grupoCiencia.service.TemaServicio;
import com.rosettcompany.grupoCiencia.service.UniversidadServicio;
import com.rosettcompany.grupoCiencia.service.UsuariosServicio;
import com.rosettcompany.grupoCiencia.service.VideoServicio;

import io.swagger.v3.oas.annotations.Operation;

import com.rosettcompany.grupoCiencia.service.SubtemaServicio;
import com.rosettcompany.grupoCiencia.service.SubsubtemaServicio;
import com.rosettcompany.grupoCiencia.service.SubsubsubtemaServicio;
import com.rosettcompany.grupoCiencia.service.DetallesubtemaServicio;
import com.rosettcompany.grupoCiencia.service.TemaNormalizadoServicio;
import com.rosettcompany.grupoCiencia.service.PreguntaEspejoServicio;
import com.rosettcompany.grupoCiencia.service.NotasSimulacroEstudiantesServicio;
import com.rosettcompany.grupoCiencia.service.AsistenciaCursoServicio;
import com.rosettcompany.grupoCiencia.service.AreaConocimientoServicio;
import com.rosettcompany.grupoCiencia.repository.AccesoMeses;
import com.rosettcompany.grupoCiencia.repository.Anio;
import com.rosettcompany.grupoCiencia.repository.AreaConocimiento;
import org.springframework.web.multipart.MultipartFile;
import com.rosettcompany.grupoCiencia.bean.BeanAsistenciaCursoGuardar;
import com.rosettcompany.grupoCiencia.bean.BeanAsistenciaCursos;
import com.rosettcompany.grupoCiencia.bean.BeanAsistenciaEstudiantes;

@EnableScheduling
@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api")
public class GrupoCienciaController {

	private static final Logger logger = LoggerFactory.getLogger(GrupoCienciaController.class);

	@Autowired
	private AsistenciaCursoServicio asistenciaCursoServicio;
	
	@Autowired
	private UsuariosServicio usuariosServicio;

	@Autowired
	private HistorialServicio historialServicio;

	@Autowired
	private HistorialAccesoServicio historialAccesoServicio;

	@Autowired
	private EstudianteServicio estudianteServicio;

	@Autowired
	private SolicitudesServicio solicitudServicio;

	@Autowired
	private CicloServicio cicloServicio;

	@Autowired
	private AreasCarreraServicio areas_carreraServicio;

	@Autowired
	private BecaArchivoMasivoServicio becaArchivoMasivoServicio;

	@Autowired
	private UniversidadServicio universidadServicio;

	@Autowired
	private DetalleAreaCursoRepositoryI detallAreaCursoRepositoryI;

	@Autowired
	private CarreraServicio carreraServicio;

	@Autowired
	private ApoderadosServicio apoderadoServicio;

	@Autowired
	private CursoServicio cursoServicio;

	@Autowired
	private VideoServicio videoServicio;
	
	@Autowired
	private ExamenEstudianteServicio examenEstudianteServicio;

	@Autowired
	private ParametrosServicio parametrosServicio;

	@Autowired
	private AreaConocimientoServicio areaConocimientoServicio;

	@Autowired
	private AccesoMesesServicio accesoMesesServicio;

	@Autowired
	private ExamenServicio examenServicio;

	@Autowired
	private TemaServicio temaServicio;

	@Autowired
	private CabeceraPreguntaServicio cabeceraPreguntaServicio;

	@Autowired
	private ComunicadoServicio comunicadoServicio;

	@Autowired
	private RecursoServicio recursoServicio;

	@Autowired
	private AnioServicio anioServicio;

	@Autowired
	private ClaseBibliotecaServicio claseBibliotecaServicio;

	@Autowired
	private MaterialBibliotecaServicio materialBibliotecaServicio;

	@Autowired
	private TemaBibliotecaServicio temaBibliotecaServicio;

	@Autowired
	private EscaneoBibliotecaServicio escaneoBibliotecaServicio;

	@Autowired
	private ClaveBibliotecaServicio claveBibliotecaServicio;

	@Autowired
	private ProspectoBibliotecaServicio prospectoBibliotecaServicio;

	@Autowired
	private SolucionarioBibliotecaServicio solucionarioBibliotecaServicio;

	@Autowired
	private SemestreServicio semestreServicio;

	@Autowired
	private EstadisticaExamenServicio estadisticaExamenServicio;

	@Autowired
	private ModalidadServicio modalidadServicio;

	@Autowired
	private SedesServicio sedeServicio;

	@Autowired
	private CiclosNormalizadosServiceImpl cicloNormalizadoServicio;

	@Autowired
	private PreciosServiceImpl preciosServicio;

	@Autowired
	private AsignacionAlumnoAulaServicio asignacionAlumnoAulaServicio;

	@Autowired
	private BecasEstudiantesServicio becasEstudiantesServicio;

	@Autowired
	private MatriculasServicio matriculasServicio;

	@Autowired
	CronogramaPagosServicio cronogramaPagosServicio;

	@Autowired
	private CronogramaPagosServicio cronogramaPagoServicio;

	@Autowired
	private AulaServicio aulaServicio;

	@Autowired
	private PersonalVentasServicio personalVentaServicio;

	@Autowired
	private CampaignServicio campaignServicio;

	@Autowired
	private CampaignAnswersServicio campaignAnswersServicio;

	@Autowired
	private SubtemaServicio subtemaServicio;

	@Autowired
	private SubsubtemaServicio subsubtemaServicio;

	@Autowired
	private SubsubsubtemaServicio subsubsubtemaServicio;

	@Autowired
	private DetallesubtemaServicio detallesubtemaServicio;

	@Autowired
	private TemaNormalizadoServicio temanormalizadoServicio;

	@Autowired
	private PreguntaEspejoServicio preguntaEspejoServicio;

	@Autowired
	private CodisServicio codisServicio;

	@Autowired
	private CodisRespuestaServicio codisRespuestaServicio;

	@Autowired
	private SalonesServicio salonesServicio;
	
	@Autowired
	private NotasSimulacroEstudiantesServicio notasSimulacroEstudiantesServicio;

	@Autowired
	private AsistenciaCursoServicio asistenciaCursoService;
	
	
	@Value("${urls.email}")
	private String url_email;

	// STOREPROCEDURE LISTAR ESTUDIANTES
	@RequestMapping(value = "/estudiante/asignacion-actualizar", method = RequestMethod.POST)
	public ResponseEntity<?> actualizarAsignacionEstudiante(@RequestBody Estudiante estudiante) throws Exception {
		try {
			String data = estudianteServicio.f_actualizar_asignacion_alumno_aula(estudiante);
			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error en api.grupociencias.admin actualizarAsignacionEstudiante para estudiante: {}",
					estudiante.toString(), e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// STOREPROCEDURE LISTAR ESTUDIANTES
	@RequestMapping(value = "/estudiantes/listar/pendientes", method = RequestMethod.POST)
	public ResponseEntity<?> listarEstudiantesPendientes(@RequestBody Estudiante estudiante) throws Exception {
		try {
			String data = estudianteServicio.listarEstudiantesPendientes(estudiante);
			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error en api.grupociencias.admin listarEstudiantesPendientes para estudiante: {}",
					estudiante.toString(), e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/asistencias/listar", method = RequestMethod.POST)
	public ResponseEntity<?> listarAsistenciasEstudiantes(@RequestBody HistorialAcceso historial) throws Exception {
		try {
			String data = historialAccesoServicio.listarAsistencias(historial);
			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error en api.grupociencias.admin listarAsistenciasEstudiantes: {}", e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/asistencias/listar/total", method = RequestMethod.POST)
	public ResponseEntity<?> listarAsistenciasEstudiantesTotal(@RequestBody HistorialAcceso observaciones)
			throws Exception {
		try {
//			System.out.println("jgh: " + observaciones.getObservaciones());
			String data = historialAccesoServicio.listarAsistenciasTotal(observaciones.getObservaciones());
			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error en api.grupociencias.admin listarAsistenciasEstudiantesTotal: {}", e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/asistencias/reporte", method = RequestMethod.POST)
	public ResponseEntity<?> reporteAsistenciasPorFechas(@RequestBody HistorialAcceso historial) throws Exception {
		try {
			String data = historialAccesoServicio.f_buscar_asistencias_fecha(historial);
			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error en api.grupociencias.admin reporteAsistenciasPorFechas para historial acceso: {}",
					historial.toString(), e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// @Scheduled(cron = "0 0 2 * * ?")

	// @Scheduled(fixedRate = 60000)
	@Scheduled(cron = "0 0 2 * * ?")
	public ResponseEntity<String> ActualizarEstadoSolicitudes() {
		try {
			String data = solicitudServicio.actualizarSolicitudes();
			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error en api.grupociencias.admin ActualizarEstadoSolicitudes: {}", e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/cambiar/estado/cuota/cronograma", method = RequestMethod.POST)
	public ResponseEntity<String> cambiarEstadoCuotaCronograma(@RequestBody String json_input) throws Exception {
		try {
			String data = cronogramaPagosServicio.f_cambiar_estado_cuota_cronograma(json_input);
			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error en api.grupociencias.admin cambiarEstadoCuotaCronograma usando json: {}", json_input,
					e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/actualizar/pago/estudiante", method = RequestMethod.POST)
	public ResponseEntity<String> ActualizarPagoEstudiante(@RequestBody String json_input) throws Exception {
		try {
			String data = estudianteServicio.f_pago_cronograma_estudiante(json_input);
			return new ResponseEntity<>(json_input, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error en api.grupociencias.admin ActualizarPagoEstudiante usando json: {}", json_input, e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/actualizar/qr", method = RequestMethod.POST)
	public ResponseEntity<String> ActualizarQR(@RequestBody String json_input) throws Exception {
		try {
			String data = solicitudServicio.f_actualizar_estudiante_qr(json_input);
			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error en api.grupociencias.admin ActualizarQR usando json: {}", json_input, e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Scheduled(cron = "0 0 1 * * ?") // descomentar
	public ResponseEntity<String> actualizar_estudiantes_esnuevo() {
		String data;
		try {
			data = cronogramaPagosServicio.f_actualizar_estudiantes_esnuevo();
			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error api.grupociencias.admin actualizar_estudiantes_esnuevo", e);
			return new ResponseEntity<>("Error api.grupociencias.admin actualizar_estudiantes_esnuevo",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

//	@Scheduled(cron = "0 0 1 * * ?") // a la 1 am  de cada dia

	// @Scheduled(fixedRate = 60000) // 120000 milisegundos = 2 minutos ESTE
	// @Scheduled(cron = "0 20 * * * ?")

	@Scheduled(cron = "0 0 1 * * ?") // descomentar
	public ResponseEntity<String> Contador() {
//		System.out.println(url_email);
		String data;
		try {
			try {
				data = cronogramaPagosServicio.procesar_cronograma_pagos();
			} catch (Exception e) {
				logger.error("Error api.grupociencias.admin Contador-procesar_cronograma_pagos", e);
				return new ResponseEntity<>("Error api.grupociencias.admin Contador-procesar_cronograma_pagos",
						HttpStatus.INTERNAL_SERVER_ERROR);
			}

			// Analizar la cadena JSON
			JSONArray jsonArray;
			try {
				jsonArray = new JSONArray(data);
			} catch (Exception e) {
				logger.error("Error api.grupociencias.admin Contador-parsing JSON data", e);
				return new ResponseEntity<>("Error api.grupociencias.admin Contador-parsing JSON data",
						HttpStatus.BAD_REQUEST);
			}

			String apiUrl = url_email;

			// Recorrer los objetos JSON en el array
			for (int i = 0; i < jsonArray.length(); i++) {
				try {
					JSONObject jsonObject = jsonArray.getJSONObject(i);

					// Obtener atributos individualmente
					String correo = jsonObject.optString("correo");
					int diasMora = jsonObject.optInt("dias_mora");
					String nombreDestinatario = jsonObject.optString("nombres");

//					// Hacer algo con los atributos, por ejemplo, imprimirlos
//					System.out.println("Correo: " + correo);
//					System.out.println("Nombres: " + nombreDestinatario);
//					System.out.println("Días de mora: " + diasMora);
//					System.out.println("-------------");
//
//					// Construir el objeto `correoData` en Java
					Map<String, Object> correoData = new HashMap<>();
					correoData.put("email", correo); // Reemplaza con la dirección de correo real
					correoData.put("subject", "Recordatorio de Pago Pendiente - Grupo Ciencias");

					// Incluir la lógica directamente en el contenido
					String content = "<p><strong>Estimado/a " + nombreDestinatario + ",</strong></p><br>\n\n"
							+ "<p>Nos dirigimos a usted para recordarle sobre un pago pendiente asociado a su cuenta.</p>\n\n"
							+ "<p>Actualmente tiene un retraso de <strong>" + diasMora
							+ " días</strong>. Para garantizar una experiencia educativa continua y sin interrupciones, le instamos a realizar el pago pendiente a la brevedad posible.</p>\n\n"
							+ "<p>Puede abonar la cantidad debida desde su Intranet, mediante las siguientes opciones de pago:</p><br>\n\n"
							+ "<p>Tarjeta de Crédito/Débito</strong></p>\n\n" + "<p>Yape</strong></p>\n\n"
							+ "<p>Pago en Efectivo</strong></p>\n\n";

					correoData.put("content", content);

					cronogramaPagosServicio.enviarCorreo(apiUrl, correoData);

				} catch (Exception e) {
					logger.error("Error procesando email para item " + i, e);
				}
			}

			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error api.grupociencias.admin Contador", e);
			return new ResponseEntity<>("Error api.grupociencias.admin Contador", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/calcular/diasmora", method = RequestMethod.GET)
	public ResponseEntity<String> obtenerContador() {

		String data = cronogramaPagosServicio.procesar_cronograma_pagos();

		JSONArray jsonArray = new JSONArray(data);
		String apiUrl = "https://grupociencias.edu.pe/emailGrupoCiencias-1/api/emailGrupoCiencias/email/enviar";

		// Recorrer los objetos JSON en el array
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);

			String correo = jsonObject.optString("correo");
			int diasMora = jsonObject.optInt("dias_mora");

			String nombreDestinatario = jsonObject.optString("nombres");
			// Hacer algo con los atributos, por ejemplo, imprimirlos
//			System.out.println("Correo: " + correo);
//			System.out.println("Nombres: " + nombreDestinatario);
//			System.out.println("Días de mora: " + diasMora);
//			System.out.println("-------------");
			// Construir el objeto `correoData` en Java
			Map<String, Object> correoData = new HashMap<>();
			correoData.put("email", correo); // Reemplaza con la dirección de correo real
			correoData.put("subject", "Recordatorio de Pago Pendiente - Grupo Ciencias");

			// Incluir la lógica directamente en el contenido
			String content = "<p><strong>Estimado/a " + nombreDestinatario + ",</strong></p><br>\n\n"
					+ "<p>Nos dirigimos a usted para recordarle sobre un pago pendiente asociado a su cuenta.</p>\n\n"
					+ "<p>Actualmente tiene un retraso de <strong>" + diasMora
					+ " días</strong>. Para garantizar una experiencia educativa continua y sin interrupciones, le instamos a realizar el pago pendiente a la brevedad posible.</p>\n\n"
					+ "<p>Puede abonar la cantidad debida desde su Intranet, mediante las siguientes opciones de pago:</p><br>\n\n"
					+ "<p>Tarjeta de Crédito/Débito</strong></p>\n\n" + "<p>Yape</strong></p>\n\n"
					+ "<p>Pago en Efectivo</strong></p>\n\n";

			correoData.put("content", content);

			cronogramaPagosServicio.enviarCorreo(apiUrl, correoData);

		}

		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/foto/actualizar", method = RequestMethod.POST)
	public ResponseEntity<?> actualizarFotoSolicitud(@RequestBody Solicitudes solicitud) throws Exception {

		String data = solicitudServicio.ActualizarFotoSolicitud(solicitud);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/desactivar/beca", method = RequestMethod.POST)
	public ResponseEntity<?> CambiarEstadoBeca(@RequestBody CronogramaTempEntity detpagos) {
		try {

			String data = cronogramaPagosServicio.f_desactivar_cronograma_beneficio(detpagos);

			return new ResponseEntity<>(data, HttpStatus.OK);

		} catch (

		Exception e) {
			// Manejar la excepción de manera apropiada
//			System.out.println(e);
			return new ResponseEntity<>("Error al realizar el pago", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/activar/beca", method = RequestMethod.POST)
	public ResponseEntity<?> activarBeca(@RequestBody CronogramaTempEntity beca) throws Exception {
		// Call buscarBecarDNI method
//		System.out.println(beca.toString());
		String data = cronogramaPagosServicio.f_activar_cronograma_beneficio(beca);

//		String data = solicitudServicio.ActualizarFotoSolicitud(solicitud);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// STOREPROCEDURE INSERTAR USUARIO
	@RequestMapping(value = "/usuario/insertar", method = RequestMethod.POST)
	public ResponseEntity<?> insertarUsuario(@RequestBody Usuarios usuario) throws Exception {

		String data = usuariosServicio.insertarUsuario(usuario);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/perfiles", method = RequestMethod.GET)
	public ResponseEntity<?> listarPerfiles() throws Exception {
		String data = usuariosServicio.f_listar_perfiles();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/usuario/docente", method = RequestMethod.GET)
	public ResponseEntity<?> listarDocentes() throws Exception {
		String data = usuariosServicio.f_listar_usuario_docente();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// STOREPROCEDURE LISTAR USUARIOS
	@RequestMapping(value = "/usuario/listar", method = RequestMethod.GET)
	public ResponseEntity<?> listarUsuarios() throws Exception {

		String data = usuariosServicio.listarUsuarios(1);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// STOREPROCEDURE LISTAR HISTORIAL POR USUARIO
	@RequestMapping(value = "/historial/usuario/listar/{idusuario}", method = RequestMethod.GET)
	public ResponseEntity<?> listarHistorialPorUsuario(@PathVariable int idusuario) throws Exception {

		String data = historialServicio.listarHistorialPorUsuario(idusuario);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// STOREPROCEDURE USUARIO POR NOMBRE O APELLIDOS
	@RequestMapping(value = "/usuario/buscar", method = RequestMethod.POST)
	public ResponseEntity<?> buscarUsuario(@RequestBody Usuarios usuario) throws Exception {

		String data = usuariosServicio.buscarUsuario(usuario);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// STOREPROCEDURE USUARIO POR DNI
	@RequestMapping(value = "/usuario/buscar/dni", method = RequestMethod.POST)
	public ResponseEntity<?> buscarUsuarioPorDni(@RequestBody Usuarios usuario) throws Exception {

		String data = usuariosServicio.f_buscar_usuarios_por_dni(usuario);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// STOREPROCEDURE EDITAR USUARIO
	@RequestMapping(value = "/usuario/editar", method = RequestMethod.POST)
	public ResponseEntity<?> editarUsuario(@RequestBody Usuarios usuario) throws Exception {

		String data = usuariosServicio.editarUsuario(usuario);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// STOREPROCEDURE LISTAR ESTUDIANTES
	@RequestMapping(value = "/estudiantes/listar/", method = RequestMethod.POST)
	public ResponseEntity<?> listarEstudiantes(@RequestBody Estudiante estudiante) throws Exception {

		String data = estudianteServicio.listarEstudiantes(estudiante);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION VALIDAR LOGIN
	@RequestMapping(value = "/solicitud/registrar", method = RequestMethod.POST)
	public ResponseEntity<?> registrarSolicitud(@RequestBody Solicitudes solicitud) throws Exception {
//		System.out.println(solicitud.getNombres());
		if (solicitud.getFecha_nacimiento() == null) {
			solicitud.setFecha_nacimiento(Date.valueOf(LocalDate.now()));
		}
		if (solicitud.getFecha_inscripcion() == null) {
			solicitud.setFecha_inscripcion(Date.valueOf(LocalDate.now()));
		}
		logger.info(solicitud.toString());
		String data = solicitudServicio.RegistrarSolicitud(solicitud);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION LISTAR SOLICITUDES
	@RequestMapping(value = "/solicitud/listar", method = RequestMethod.GET)
	public ResponseEntity<?> listarSolicitudes() throws Exception {

		String data = solicitudServicio.ListarSolicitudes(1);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION LISTAR SOLICITUDES PRELIMINAR
	@RequestMapping(value = "/solicitud-preliminar/listar", method = RequestMethod.POST)
	public ResponseEntity<?> listarSolicitudesPreliminares(@RequestBody Solicitudes solicitud) throws Exception {

		String data = solicitudServicio.funcion_listar_solicitudes_preliminar(solicitud);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION LISTAR SOLICITUDES PRELIMINAR
	@RequestMapping(value = "/solicitud-preliminar/reporte", method = RequestMethod.POST)
	public ResponseEntity<?> funcion_reporte_solicitudes_preliminar(@RequestBody Solicitudes solicitud)
			throws Exception {

		String data = solicitudServicio.funcion_reporte_solicitudes_preliminar(solicitud);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION CAMBIAR ESTADO SOLICITUD
	@RequestMapping(value = "/solicitud/cambiar/estado", method = RequestMethod.POST)
	public ResponseEntity<?> cambiarEstadoSolicitud(@RequestBody Solicitudes solicitud) throws Exception {
		String data = solicitudServicio.funcion_cambiar_estado(solicitud);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION CAMBIAR OBSERVACION SOLICITUD
	@RequestMapping(value = "/solicitud/cambiar/observacion", method = RequestMethod.POST)
	public ResponseEntity<?> cambiarObservacionSolicitud(@RequestBody Solicitudes solicitud) throws Exception {
		String data = solicitudServicio.f_actualizar_solicitudes_observado(solicitud);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION CAMBIAR OBSERVACION SOLICITUD
	@RequestMapping(value = "/solicitud/actualizar/cronograma-observado", method = RequestMethod.POST)
	public ResponseEntity<?> solicitudActualizarCronogramaObservado(@RequestBody Solicitudes solicitud)
			throws Exception {
		String data = solicitudServicio.f_actualizar_cronograma_observado(solicitud);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION VALIDAR LOGIN
	@RequestMapping(value = "/usuario/login", method = RequestMethod.POST)
	public ResponseEntity<?> validarLogin(@RequestBody Usuarios usuario) throws Exception {

		String data = usuariosServicio.InicioSesion(usuario);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// STOREPROCEDURE BUSCAR ESTUDIANTE POR NOMBRE O APELLIDOS
	@RequestMapping(value = "/estudiante/buscar", method = RequestMethod.POST)
	public ResponseEntity<?> buscarEstudiante(@RequestBody Estudiante estudiante) throws Exception {

		String data = estudianteServicio.buscarEstudiantes(estudiante);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/estudiante/buscar/deudores", method = RequestMethod.POST)
	public ResponseEntity<?> buscarEstudiantesDeudores(@RequestBody Estudiante estudiante) throws Exception {

		String data = estudianteServicio.buscarEstudiantesDeudores(estudiante);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION LISTAR CICLOS
	@RequestMapping(value = "/ciclos/listar", method = RequestMethod.GET)
	public ResponseEntity<?> listarCiclos() throws Exception {

		String data = cicloServicio.listarCiclos(1);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION LISTAR CICLOS
	@RequestMapping(value = "/ciclos/listar/{idusuario}", method = RequestMethod.GET)
	public ResponseEntity<?> listarCiclosPorUsuario(@PathVariable int idusuario) throws Exception {
		String data = cicloServicio.f_listar_ciclos_por_usuario(idusuario);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/ciclos/listar/banco", method = RequestMethod.GET)
	public ResponseEntity<?> listarCiclosConBanco() throws Exception {

		String data = cicloServicio.listarCiclosBanco(1);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION FILTRAR ESTUDIANTES POR CICLO
	@RequestMapping(value = "/estudiante/filtrar/ciclo/{idciclo}", method = RequestMethod.GET)
	public ResponseEntity<?> filtrarEstudiantesPorCiclo(@PathVariable int idciclo) throws Exception {

		String data = cicloServicio.filtrarEstudiantesPorCiclo(idciclo);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION LISTAR ARERAS_CARRERA POR UNIVERSIDAD
	@RequestMapping(value = "/areas_carrera/listar/universidad/{iduniversidad}", method = RequestMethod.GET)
	public ResponseEntity<?> listarCarrerasPorUniversidad(@PathVariable int iduniversidad) throws Exception {

		String data = areas_carreraServicio.listarCarrerasPorUniversidad(iduniversidad);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION LISTAR UNIVERSIDADES
	@RequestMapping(value = "/universidad/listar", method = RequestMethod.GET)
	public ResponseEntity<?> listarUniversidades() throws Exception {

		String data = universidadServicio.listarUniversidades(1);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/universidad/listar-all", method = RequestMethod.GET)
	public ResponseEntity<?> listarUniversidadesAll() throws Exception {

		String data = universidadServicio.f_listar_universidades_all();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION LISTAR DETALLE AREAS CURSO
	@RequestMapping(value = "/area/curso/listar/{idarea}", method = RequestMethod.GET)
	public ResponseEntity<?> listarDetalleAreaCurso(@PathVariable int idarea) throws Exception {

		String data = areas_carreraServicio.listarDetalleAreaCurso(idarea);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION GUARDAR PUNTAJES DE LAS PREGUNTAS EN LOS EXAMENES
	@RequestMapping(value = "/area/puntaje/preguntas/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> guardarPuntajePregunta(@RequestBody AreasCarrera area) throws Exception {

		String data = areas_carreraServicio.guardarPuntajesPreguntas(area);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION GUARDAR LA CANTIDAD DE PREGUNTAS POR CURSO
	@RequestMapping(value = "/curso/cantidad/preguntas/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> guardarCantidadPreguntas(@RequestBody ArrayList<DetalleAreaCurso> detalle)
			throws Exception {

		Iterable<DetalleAreaCurso> data = detallAreaCursoRepositoryI.saveAll(detalle);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION ELIMINAR SOLICITUD
	@RequestMapping(value = "/solicitud/eliminar", method = RequestMethod.POST)
	public ResponseEntity<?> eliminarSolicitud(@RequestBody Solicitudes solicitud) throws Exception {

		String data = solicitudServicio.EliminarSolicitud(solicitud);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION APROBAR SOLICITUD
	@RequestMapping(value = "/solicitud/aprobar", method = RequestMethod.POST)
	public ResponseEntity<?> aprobarSolicitud(@RequestBody Solicitudes solicitud) throws Exception {

		String data = solicitudServicio.AprobarSolicitud(solicitud);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION LISTAR CONFIGURACION EXAMEN
	@RequestMapping(value = "/area/configuracion/listar", method = RequestMethod.GET)
	public ResponseEntity<?> listarConfiguracionExamen() throws Exception {

		String data = areas_carreraServicio.listarConfiguracionExamen(1);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION ACTIVAR O SUSPENDER ESTUDIANTE
	@RequestMapping(value = "/estudiante/eliminar/", method = RequestMethod.POST)
	public ResponseEntity<?> eliminarEstudiante(@RequestBody Estudiante estudiante) throws Exception {
//		System.out.println(estudiante.getUsuario_delete());
		String data = estudianteServicio.eliminarEstudiantes(estudiante);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION LISTAR CARRERAS POR UNIVERSIDAD
	@RequestMapping(value = "/carrera/listar/{iduniversidad}", method = RequestMethod.GET)
	public ResponseEntity<?> listarCarreras(@PathVariable int iduniversidad) throws Exception {

		String data = carreraServicio.listarCarreras(iduniversidad);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// FUNCTION EDITAR ESTUDIANTE
	@RequestMapping(value = "/estudiante/editar/", method = RequestMethod.POST)
	public ResponseEntity<?> editarEstudiante(@RequestBody EstudianteApoderado estudianteApoderado) throws Exception {

		String data = estudianteServicio.editarEstudiante(estudianteApoderado.getEstudiante());
		int estadoApoderado = apoderadoServicio.editarApoderado(estudianteApoderado.getApoderado());

		if (estadoApoderado == 1) {
			return new ResponseEntity<>(data, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(data, HttpStatus.UNAUTHORIZED);
		}

	}

	@RequestMapping(value = "/estudiante/cambiar-cronograma", method = RequestMethod.POST)
	public ResponseEntity<?> editarEstudianteCambiarCronograma(@RequestBody CronogramaPagos cronograma)
			throws Exception {
		try {
			String data = cronogramaPagoServicio.f_actualizar_cronograma_editar_estudiante(cronograma);
			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error en api.grupociencias.admin cambiarCronogramaEstudiante para idcronogramapagos: {}",
					cronograma.getIdcronogramapagos(), e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// JPA GET CURSOS
	@RequestMapping(value = "/cursos/listar", method = RequestMethod.GET)
	public ResponseEntity<Iterable<Curso>> getCursos() throws Exception {

		Iterable<Curso> listaCursos = cursoServicio.findAllCursos();
		return ResponseEntity.ok(listaCursos);

	}

	// JPA GUARDAR VIDEOS
	@RequestMapping(value = "/videos/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> postVideos(@RequestBody List<Video> listaVideos) throws Exception {

		for (int i = 0; i < listaVideos.size(); i++) {

			videoServicio.guardarVideo(listaVideos.get(i));
		}

		return new ResponseEntity<>("1", HttpStatus.OK);

	}

	// PROCEDURE GET VIDEOS CURSOS
	@RequestMapping(value = "/videos/listar/{idcurso}", method = RequestMethod.GET)
	public ResponseEntity<?> getVideos(@PathVariable("idcurso") int idcurso) throws Exception {

		String data = cursoServicio.ListarVideosCursos(idcurso);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET PARAMETROS
	@RequestMapping(value = "/parametros/listar/{idparametro}", method = RequestMethod.GET)
	public ResponseEntity<?> getParametroById(@PathVariable("idparametro") int idparametro) throws Exception {

		Optional<Parametros> parametroOptional = parametrosServicio.getParametroById(idparametro);

		if (parametroOptional.isPresent()) {
			Parametros parametro = parametroOptional.get();

			return ResponseEntity.ok(parametro);

		} else {

			return ResponseEntity.noContent().build();
		}

	}

	/// POST PARAMETROS
	@RequestMapping(value = "/parametros/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> postParametrosById(@RequestBody Parametros parametro) throws Exception {

		Parametros nuevoParametro = parametrosServicio.guardarParametro(parametro);

		return ResponseEntity.ok(nuevoParametro);

	}

	// GET ALL AREA DE CONOCIMIENTO
	@RequestMapping(value = "/areas/listar", method = RequestMethod.GET)
	public ResponseEntity<List<AreaConocimiento>> getAreasConocimiento() throws Exception {

		List<AreaConocimiento> listaAreas = areaConocimientoServicio.getAll();

		return new ResponseEntity<>(listaAreas, HttpStatus.OK);

	}

	// PROCEDURE VALIDAR DNI DE ESTUDIANTE
	@RequestMapping(value = "/estudiante/dni/validar/", method = RequestMethod.POST)
	public ResponseEntity<?> validarDniEstudiante(@RequestBody Estudiante estudiante) throws Exception {

		String data = estudianteServicio.validarDniEstudiante(estudiante);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/estudiante/dni/validar/solicitudes", method = RequestMethod.POST)
	public ResponseEntity<?> validarDniEstudianteSolicitudes(@RequestBody Estudiante estudiante) throws Exception {

		String data = estudianteServicio.f_validar_dni_unico_estudiante_solicitudes(estudiante);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PROCEDURE VALIDAR DNI DE USUARIO
	@RequestMapping(value = "/usuario/dni/validar/", method = RequestMethod.POST)
	public ResponseEntity<?> validarDniUsuario(@RequestBody Usuarios usuario) throws Exception {

		String data = usuariosServicio.validarDniUsuario(usuario);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PROCEDURE GUARDAR ACCESO A MESES
	@RequestMapping(value = "/acceso/meses/editar/", method = RequestMethod.POST)
	public ResponseEntity<?> guardarAccesoMeses(@RequestBody List<AccesoMeses> listaMeses) throws Exception {

		for (int i = 0; i < listaMeses.size(); i++) {
			accesoMesesServicio.insertarAccesoMeses(listaMeses.get(i));
		}

		return new ResponseEntity<>("1", HttpStatus.OK);

	}

	// PROCEDURE CAMBIAR CONTRASENIA
	@RequestMapping(value = "/usuario/cambiar/password/", method = RequestMethod.POST)
	public ResponseEntity<?> cambiarPass(@RequestBody Usuarios usuario) throws Exception {

		String data = usuariosServicio.cambiarPass(usuario);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PROCEDURE LISTAR CICLOS POR UNIVERSIDAD
	@RequestMapping(value = "/ciclos/listar/universidad/{iduniversidad}", method = RequestMethod.GET)
	public ResponseEntity<?> listarCiclosPorUniversidad(@PathVariable int iduniversidad) throws Exception {

		String data = cicloServicio.listarCiclosPorUniversidad(iduniversidad);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/ciclos/banco-preguntas/listar/universidad/{iduniversidad}", method = RequestMethod.GET)
	public ResponseEntity<?> f_listar_ciclos_banco_preguntas_universidad(@PathVariable int iduniversidad)
			throws Exception {

		String data = cicloServicio.f_listar_ciclos_banco_preguntas_universidad(iduniversidad);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PROCEDURE LISTAR CICLOS NORMALIZADOS
	@RequestMapping(value = "/ciclos-normalizados/listar", method = RequestMethod.GET)
	public ResponseEntity<?> listarCiclosNormalizados() throws Exception {
		String data = cicloNormalizadoServicio.f_listar_ciclos_normalizados();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// PROCEDURE LISTAR CICLOS NORMALIZADOS
	@RequestMapping(value = "/ciclos-normalizados/listar-activos", method = RequestMethod.GET)
	public ResponseEntity<?> listarCiclosNormalizadosActivos() throws Exception {
		String data = cicloNormalizadoServicio.f_listar_ciclos_normalizados_activos();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/ciclos-normalizados/listar-activos/usuario", method = RequestMethod.POST)
	public ResponseEntity<?> listarCiclosNormalizadosActivosUsuario(@RequestBody CiclosNormalizadosEntity ciclosN) throws Exception {
		String data = cicloNormalizadoServicio.f_listar_ciclos_normalizados_activos_usuario(ciclosN);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// PROCEDURE LISTAR CICLOS NORMALIZADOS POR UNIVERSIDAD
	@RequestMapping(value = "/ciclos-normalizados/listar/universidad/{iduniversidad}", method = RequestMethod.GET)
	public ResponseEntity<?> listarCiclosNormalizadosPorUniversidad(@PathVariable int iduniversidad) throws Exception {
		String data = cicloNormalizadoServicio.listarCiclosNormalizadosPorUniversidad(iduniversidad);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// PROCEDURE BUSCAR CICLOS NORMALIZADOS POR ID
	@RequestMapping(value = "/ciclos-normalizados/buscar/{idciclonormalizado}", method = RequestMethod.GET)
	public ResponseEntity<?> buscarCiclosNormalizadosID(@PathVariable int idciclonormalizado) throws Exception {
		String data = cicloNormalizadoServicio.buscarCiclosNormalizadosPorID(idciclonormalizado);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// PROCEDURE LISTAR MODALIDAD
	@RequestMapping(value = "/sedes/listar/modalidad", method = RequestMethod.POST)
	public ResponseEntity<?> listarSedesPorCiclo(@RequestBody DetalleCicloSedeModalidad det) throws Exception {
		String data = sedeServicio.f_buscar_sede_por_ciclo(det);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/sedes/listar", method = RequestMethod.GET)
	public ResponseEntity<?> listarSedes() throws Exception {
		String data = sedeServicio.f_listar_sedes();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/sedes/listar-all", method = RequestMethod.GET)
	public ResponseEntity<?> listarSedesAll() throws Exception {
		String data = sedeServicio.f_listar_sedes_all();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/sedes/listar/usuarios", method = RequestMethod.GET)
	public ResponseEntity<?> listarSedesUsuarios() throws Exception {
		String data = sedeServicio.f_listar_sedes_usuarios();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/sedes/editar", method = RequestMethod.POST)
	public ResponseEntity<?> updateSedes(@RequestBody Sedes sede) throws Exception {
		String data = sedeServicio.f_update_sedes(sede);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/sedes/insertar", method = RequestMethod.POST)
	public ResponseEntity<?> insertarSede(@RequestBody Sedes sede) throws Exception {
		String data = sedeServicio.f_insertar_sede(sede);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/sedes/update-estado", method = RequestMethod.POST)
	public ResponseEntity<?> updateEstadoSede(@RequestBody Sedes sede) throws Exception {
		String data = sedeServicio.f_update_estado_sedes(sede);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// PROCEDURE LISTAR MODALIDAD
	@RequestMapping(value = "/modalidad/listar", method = RequestMethod.GET)
	public ResponseEntity<?> listarModalidad() throws Exception {
		String data = modalidadServicio.f_listar_modalidad();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// PROCEDURE LISTAR MODALIDAD
	@RequestMapping(value = "/modalidad/listar/ciclo", method = RequestMethod.POST)
	public ResponseEntity<?> listarModalidadPorSedeCilo(@RequestBody DetalleCicloSedeModalidad det) throws Exception {
		String data = modalidadServicio.f_buscar_modalidad_sede_ciclo(det);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// PROCEDURE CREAR EXAMEN
	@RequestMapping(value = "/examen/crear/", method = RequestMethod.POST)
	public ResponseEntity<?> crearExamen(@RequestBody ExamenBean examen) throws Exception {

		String data = examenServicio.crearExamen(examen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PROCEDURE CREAR EXAMEN
	@RequestMapping(value = "/examen/crear/normalizado/", method = RequestMethod.POST)
	public ResponseEntity<?> crearExamenNormalizado(@RequestBody ExamenBean examen) throws Exception {

		String data = examenServicio.crearExamenNormalizado(examen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PROCEDURE VALIDAR CANTIDAD PREGUNTAS PARA CREAR EXAMEN
	@RequestMapping(value = "/preguntas/cantidad/validar/", method = RequestMethod.POST)
	public ResponseEntity<?> validarCantidadPreguntas(@RequestBody ExamenBean examen) throws Exception {

		String data = examenServicio.validarCantidadPreguntas(examen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PROCEDURE VALIDAR CANTIDAD PREGUNTAS PARA CREAR EXAMEN
	@RequestMapping(value = "/preguntas/cantidad/validar/normalizado/", method = RequestMethod.POST)
	public ResponseEntity<?> validarCantidadPreguntasNormalizado(@RequestBody ExamenBean examen) throws Exception {

		String data = examenServicio.validarCantidadPreguntasNormalizado(examen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PROCEDURE CONFIRMAR SI CREAR EL EXAMEN O NO
	@RequestMapping(value = "/examen/confirmar/crear/", method = RequestMethod.POST)
	public ResponseEntity<?> confirmarExamen(@RequestBody Examen examen) throws Exception {

		String data = examenServicio.confirmarExamen(examen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PROCEDURE CONFIRMAR SI CREAR EL EXAMEN O NO
	@RequestMapping(value = "/examen/confirmar/crear/normalizado/", method = RequestMethod.POST)
	public ResponseEntity<?> confirmarExamenNormalizado(@RequestBody Examen examen) throws Exception {

		String data = examenServicio.confirmarExamenNormalizado(examen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PROCEDURE LISTAR EXAMENES
	@RequestMapping(value = "/examen/listar/", method = RequestMethod.GET)
	public ResponseEntity<?> listarExamenes() throws Exception {

		String data = examenServicio.listarExamenes(1);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/examen/listar/normalizado/", method = RequestMethod.GET)
	public ResponseEntity<?> listarExamenesNormalizado() throws Exception {

		String data = examenServicio.listarExamenesNormalizado(1);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PROCEDURE ELIMINAR EXAMEN
	@RequestMapping(value = "/examen/eliminar/{idexamen}", method = RequestMethod.GET)
	public ResponseEntity<?> eliminarExamen(@PathVariable int idexamen) throws Exception {

		String data = examenServicio.eliminarExamen(idexamen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PROCEDURE ELIMINAR EXAMEN
	@RequestMapping(value = "/examen/normalizado/eliminar/{idexamen}", method = RequestMethod.GET)
	public ResponseEntity<?> eliminarExamenNormalizado(@PathVariable int idexamen) throws Exception {

		String data = examenServicio.eliminarExamenNormalizado(idexamen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PROCEDURE EDITAR EXAMEN
	@RequestMapping(value = "/examen/editar/", method = RequestMethod.POST)
	public ResponseEntity<?> editarExamen(@RequestBody ExamenBean examen) throws Exception {

		String data = examenServicio.editarExamen(examen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PROCEDURE EDITAR EXAMEN
	@RequestMapping(value = "/examen/editar/normalizado/", method = RequestMethod.POST)
	public ResponseEntity<?> editarExamenNormalizado(@RequestBody ExamenBean examen) throws Exception {

		String data = examenServicio.editarExamenNormalizado(examen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET TEMAS
	@RequestMapping(value = "/temas/listar", method = RequestMethod.GET)
	public ResponseEntity<Iterable<Tema>> getTemas() throws Exception {

		Iterable<Tema> listaTemas = temaServicio.getAllTemas();
		return ResponseEntity.ok(listaTemas);

	}

	// POST NUEVA PREGUNTA
	@RequestMapping(value = "/pregunta/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> postNuevaPregunta(@RequestBody CabeceraPregunta cabeceraPregunta) throws Exception {

		String data = cabeceraPreguntaServicio.RegistrarPregunta(cabeceraPregunta);

		return new ResponseEntity<>(1, HttpStatus.OK);

	}

	// POST NUEVA PREGUNTA
	@RequestMapping(value = "/pregunta/normalizado/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> postNuevaPreguntaNormalizado(@RequestBody CabeceraPregunta cabeceraPregunta)
			throws Exception {
//		System.out.println(cabeceraPregunta.toString());
//		System.out.println(cabeceraPregunta.getTemanormalizado().toString());
		cabeceraPreguntaServicio.RegistrarPreguntaNormalizado(cabeceraPregunta);

		return new ResponseEntity<>(1, HttpStatus.OK);

	}

	// POST LISTA BANCO PREGUNTAS
	@RequestMapping(value = "/banco/listar", method = RequestMethod.POST)
	public ResponseEntity<?> postListarBancoPreguntas(@RequestBody FiltroBancoPreguntas filtro) throws Exception {

		String data = cabeceraPreguntaServicio.ListarBancoPregunta(filtro);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTA BANCO PREGUNTAS CON TEMAS NORMALIZADOS
	@RequestMapping(value = "/banco/listar/temas-normalizados", method = RequestMethod.POST)
	public ResponseEntity<?> postListarBancoPreguntasTemasNormalizados(@RequestBody FiltroBancoPreguntas filtro)
			throws Exception {

		String data = cabeceraPreguntaServicio.funcion_listar_banco_preguntas_normalizado(filtro);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@Scheduled(cron = "0 0 3 * * ?")
	public ResponseEntity<String> ActualizarCantidadEspejo() {
		try {
			String data = cabeceraPreguntaServicio.f_actualizar_cantidad_preguntas_espejo();
			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error en api.grupociencias.admin f_actualizar_cantidad_preguntas_espejo: {}", e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// PUT ELIMINAR CABECERA PREGUNTA
	@RequestMapping(value = "/cabecera/eliminar", method = RequestMethod.POST)
	public ResponseEntity<?> postEliminarCabecera(@RequestBody CabeceraPregunta cabecera) throws Exception {

		String data = cabeceraPreguntaServicio.EliminarCabecera(cabecera);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT ELIMINAR CABECERA PREGUNTA
	@RequestMapping(value = "/pregunta/eliminar", method = RequestMethod.POST)
	public ResponseEntity<?> postEliminarPregunta(@RequestBody DetallePregunta pregunta) throws Exception {

		String data = cabeceraPreguntaServicio.EliminarPregunta(pregunta);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT ACTUALIZAR CABECERA PREGUNTA
	@RequestMapping(value = "/cabecera/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<?> putActualizarCabecera(@RequestBody CabeceraPregunta cabecera) throws Exception {

		String data = cabeceraPreguntaServicio.ActualizarCabeceraPregunta(cabecera);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT ACTUALIZAR PREGUNTA
	@RequestMapping(value = "/pregunta/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<?> putActualizarPregunta(@RequestBody DetallePregunta pregunta) throws Exception {

		String data = cabeceraPreguntaServicio.ActualizarPregunta(pregunta);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT ACTUALIZAR CABECERA PREGUNTA NORMALIZADO
	@RequestMapping(value = "/cabecera/actualizar/normalizado", method = RequestMethod.PUT)
	public ResponseEntity<?> putActualizarCabeceraNormalizado(@RequestBody CabeceraPregunta cabecera) throws Exception {
		String data = cabeceraPreguntaServicio.ActualizarCabeceraPreguntaNormalizado(cabecera);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT ACTUALIZAR PREGUNTA NORMALIZADO
	@RequestMapping(value = "/pregunta/actualizar/normalizado", method = RequestMethod.PUT)
	public ResponseEntity<?> putActualizarPreguntaNormalizado(@RequestBody DetallePregunta pregunta) throws Exception {
		try {
			logger.info(pregunta.toString());
			String data = cabeceraPreguntaServicio.ActualizarPreguntaNormalizado(pregunta);
			logger.info(data);
			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error en api.grupociencias.admin putActualizarPreguntaNormalizado para pregunta: {}",
					pregunta, e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	// STORE PROCEDURE LISTAR USUARIOS QUE TIENEN PREGUNTAS
	@RequestMapping(value = "/usuarios/listar/preguntas", method = RequestMethod.GET)
	public ResponseEntity<?> listarUsuariosPreguntas() throws Exception {

		String data = usuariosServicio.listarUsuariosPreguntas(1);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// STORE PROCEDURE OBTENER PREGUNTAS POR CURSO
	@RequestMapping(value = "/examen/preguntas/curso", method = RequestMethod.POST)
	public ResponseEntity<?> obtenerPreguntasCurso(@RequestBody ExamenBean examen) throws Exception {
//		System.out.println(examen.toString());
		String data = examenServicio.obtenerPreguntasCurso(examen);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// STORE PROCEDURE OBTENER PREGUNTAS POR CURSO
	@RequestMapping(value = "/examen/preguntas/curso/normalizado", method = RequestMethod.POST)
	public ResponseEntity<?> obtenerPreguntasCursoNormalizado(@RequestBody ExamenBean examen) throws Exception {
//		System.out.println(examen.toString());
		String data = examenServicio.obtenerPreguntasCursoNormalizado(examen);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/preguntas-similares", method = RequestMethod.POST)
	public ResponseEntity<?> obtenerPreguntasSimilares(@RequestBody String texto) throws Exception {

		String data = cabeceraPreguntaServicio.obtenerPreguntasSimilares(texto);
//		System.out.println(data);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET CURSOS UNIVERSIDAD
	@RequestMapping(value = "/cursos/universidad/listar/{iduniversidad}", method = RequestMethod.GET)
	public ResponseEntity<?> getCursosUniversidad(@PathVariable("iduniversidad") int iduniversidad) throws Exception {

		String data = cursoServicio.ListarCursosUniversida(iduniversidad);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// GET AREA CONOCIMIENTO CON SUS CURSOS
	@RequestMapping(value = "/area/conocimiento/listar", method = RequestMethod.GET)
	public ResponseEntity<?> getAreaConocimiento() throws Exception {

		String data = areaConocimientoServicio.listarAreasConocimientos(1);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// ACTUALIZAR OBSERVACION CABECERA PREGUNTA
	@RequestMapping(value = "/cabecera/observacion/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<?> putActualizarObservacionCabecera(@RequestBody CabeceraPregunta cabecera) throws Exception {

		String data = cabeceraPreguntaServicio.ActualizarObservacionCabeceraPregunta(cabecera);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT ACTUALIZAR OBSERVACION PREGUNTA
	@RequestMapping(value = "/pregunta/observacion/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<?> putActualizarObservacionPregunta(@RequestBody DetallePregunta pregunta) throws Exception {

		String data = cabeceraPreguntaServicio.ActualizarObservacionPregunta(pregunta);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST REGISTRAR COMUNICADO
	@RequestMapping(value = "/comunicado/registrar", method = RequestMethod.POST)
	public ResponseEntity<?> postRegistrarComunicado(@RequestBody Comunicado comunicado) throws Exception {

		String data = comunicadoServicio.RegistrarComunicado(comunicado);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT ACTUALIZAR COMUNICADO
	@RequestMapping(value = "/comunicado/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<?> putActualizarComunicado(@RequestBody Comunicado comunicado) throws Exception {

		String data = comunicadoServicio.ActualizarComunicado(comunicado);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET LISTAR COMUNICADO
	@RequestMapping(value = "/asignacion_aulas/listar/{idusuario}", method = RequestMethod.GET)
	public ResponseEntity<?> getAsignacionAulasIdusuario(@PathVariable int idusuario) throws Exception {

		String data = usuariosServicio.f_listar_asignacion_aulas_idusuario(idusuario);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET LISTAR COMUNICADO
	@RequestMapping(value = "/comunicado/listar/{idusuario}", method = RequestMethod.GET)
	public ResponseEntity<?> getListarComunicados(@PathVariable int idusuario) throws Exception {

		String data = comunicadoServicio.ListarComunicados(idusuario);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT ELIMINAR COMUNICADO
	@RequestMapping(value = "/comunicado/eliminar", method = RequestMethod.PUT)
	public ResponseEntity<?> putEliminarComunicado(@RequestBody Comunicado comunicado) throws Exception {

		String data = comunicadoServicio.EliminarComunicado(comunicado);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// ELIMINAR USUARIO
	@RequestMapping(value = "/usuario/eliminar/{idusuario}", method = RequestMethod.GET)
	public ResponseEntity<?> eliminarUsuario(@PathVariable int idusuario) throws Exception {

		String data = usuariosServicio.eliminarUsuario(idusuario);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// INSERTAR HISTORIAL DE USUARIOS
	@RequestMapping(value = "/historial/insertar", method = RequestMethod.POST)
	public ResponseEntity<?> insertarHistorial(@RequestBody Historial historial) throws Exception {

		String data = historialServicio.insertarHistoria(historial);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST REGISTRAR RECURSO
	@RequestMapping(value = "/recurso/registrar", method = RequestMethod.POST)
	public ResponseEntity<?> postRegistrarRecurso(@RequestBody Recurso recurso) throws Exception {

		String data = recursoServicio.RegistrarRecursos(recurso);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR RECURSOS ADMINISTRADOR
	@RequestMapping(value = "/recurso/administrador/listar", method = RequestMethod.POST)
	public ResponseEntity<?> postListarRecursosAdministrador(@RequestBody Recurso recurso) throws Exception {

		String data = recursoServicio.ListarRecursosAdminsitrador(recurso);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET LISTAR AÑOS
	@RequestMapping(value = "/anios/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Anio>> getListarAnios() throws Exception {

		List<Anio> listaAnios = anioServicio.ListarAnios();
		return new ResponseEntity<>(listaAnios, HttpStatus.OK);

	}

	// PUT ELIMINAR RECURSO
	@RequestMapping(value = "/recurso/administrador/eliminar", method = RequestMethod.PUT)
	public ResponseEntity<?> putEliminarRecurso(@RequestBody Recurso recurso) throws Exception {

		String data = recursoServicio.EliminarRecurso(recurso);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/reporte/datos/estudiante", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteDatosEstudiante(@RequestBody beanReporte reporte) throws Exception {

		String data = cabeceraPreguntaServicio.ReporteListarDatosEstudiante(reporte);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/reporte/datos/estudiante/presencial", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteDatosEstudiantePresencial(@RequestBody beanReporte reporte) throws Exception {

		String data = cabeceraPreguntaServicio.ReporteListarDatosEstudiantePresencial(reporte);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/reporte/datos/estudiante/presencial/uni", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteDatosEstudiantePresencialUni(@RequestBody beanReporte reporte) throws Exception {

		String data = cabeceraPreguntaServicio.ReporteListarDatosEstudiantePresencialUni(reporte);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/reporte/datos/estudiante/ps", method = RequestMethod.GET)
	public ResponseEntity<?> getReporteDatosEstudiantePresencial() throws Exception {

		String data = cabeceraPreguntaServicio.f_cargar_examenes();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/reporte/datos/estudiante/ciclo", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteDatosEstudianteCiclo(@RequestBody beanReporte reporte) throws Exception {

		String data = cabeceraPreguntaServicio.ReporteListarDatosEstudianteCiclo(reporte);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/reporte/area/estudiante", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteAreaEstudiante(@RequestBody beanReporte reporte) throws Exception {

		String data = cabeceraPreguntaServicio.ReporteListarAreasMes(reporte);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/reporte/area/estudiante/presencial", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteAreaEstudiantePresencial(@RequestBody beanReporte reporte) throws Exception {

		String data = cabeceraPreguntaServicio.ReporteListarAreasMesPresencial(reporte);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/reporte/area/estudiante/presencial/uni", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteAreaEstudiantePresencialUni(@RequestBody beanReporte reporte) throws Exception {

		String data = cabeceraPreguntaServicio.ReporteListarAreasMesPresencialUni(reporte);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/reporte/simulacros/estudiante", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteSimulacros(@RequestBody beanReporte reporte) throws Exception {

		String data = cabeceraPreguntaServicio.ReporteListarSimulacroMes(reporte);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}
	

	@RequestMapping(value = "/reporte/detalle/simulacro/estudiante", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteDetalleSimulacro(@RequestBody beanReporte reporte) throws Exception {

		String data = cabeceraPreguntaServicio.ReporteListarDetalleSimulacro(reporte);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/reporte/detalle/simulacro/estudiante/presencial", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteDetalleSimulacroPresencial(@RequestBody beanReporte reporte) throws Exception {

		String data = cabeceraPreguntaServicio.ReporteListarDetalleSimulacroPresencial(reporte);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/reporte/detalle/simulacro/estudiante/presencial/uni", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteDetalleSimulacroPresencialUni(@RequestBody beanReporte reporte) throws Exception {

		String data = cabeceraPreguntaServicio.ReporteListarDetalleSimulacroPresencialUni(reporte);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/reporte/notas/dia", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteNotasDia(@RequestBody Examen examen) throws Exception {

		String data = examenServicio.ReporteNotasDia(examen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/reporte/notas/dia/normalizado", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteNotasDiaNormalizado(@RequestBody Examen examen) throws Exception {

		String data = examenServicio.ReporteNotasDiaNormalizado(examen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/temas/listar/mantenimiento", method = RequestMethod.GET)
	public ResponseEntity<?> listarTemas() throws Exception {

		String data = temaServicio.listarTemas(1);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/temas-normalizados/listar/mantenimiento", method = RequestMethod.GET)
	public ResponseEntity<?> listarTemasNormalizados() throws Exception {

		String data = temanormalizadoServicio.f_listar_tema_normalizado(1);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/subtema/temas/listar", method = RequestMethod.GET)
	public ResponseEntity<?> getSubtemasTemas() throws Exception {

		String data = subtemaServicio.f_listar_subtema_temanormalizado_all();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/subsubtema/subtemas/listar", method = RequestMethod.GET)
	public ResponseEntity<?> getSubsubtemasSubtemas() throws Exception {

		String data = subsubtemaServicio.f_listar_subsubtema_subtema_all();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/subsubsubtema/subsubtemas/listar", method = RequestMethod.GET)
	public ResponseEntity<?> getSubsubsubtemasSubsubtemas() throws Exception {

		String data = subsubsubtemaServicio.f_listar_subsubsubtema_subsubtema_all();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/detalle/subtemas/listar", method = RequestMethod.GET)
	public ResponseEntity<?> getDetalleSubtemas() throws Exception {
		String data = detallesubtemaServicio.f_listar_detallesubtema_subsubsubtema_all();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/subtemas/listar/mantenimiento", method = RequestMethod.GET)
	public ResponseEntity<?> listarSubtemas() throws Exception {

		String data = subtemaServicio.f_listar_subtema_temanormalizado(1);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/temas/eliminar/mantenimiento/{idtema}", method = RequestMethod.GET)
	public ResponseEntity<?> eliminarTema(@PathVariable int idtema) throws Exception {

		String data = temaServicio.eliminarTema(idtema);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/temas/insertar/mantenimiento", method = RequestMethod.POST)
	public ResponseEntity<?> insertarTema(@RequestBody Tema tema) throws Exception {

		String data = temaServicio.insertarTema(tema);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/temas/actualizar/mantenimiento", method = RequestMethod.POST)
	public ResponseEntity<?> actualizarTema(@RequestBody Tema tema) throws Exception {

		String data = temaServicio.actualizarTema(tema);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/temas/buscar/mantenimiento", method = RequestMethod.POST)
	public ResponseEntity<?> buscarTema(@RequestBody Tema tema) throws Exception {

		String data = temaServicio.buscarTema(tema);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/recurso/orden/actualizar", method = RequestMethod.POST)
	public ResponseEntity<?> postActualizarOrdenRecurso(@RequestBody beanOrdenRecurso bean) throws Exception {

		String data = recursoServicio.ActualizarOrdenRecurso(bean);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST REGISTRAR COMUNICADO
	@RequestMapping(value = "/comunicado/landing/registrar", method = RequestMethod.POST)
	public ResponseEntity<?> postRegistrarComunicadoLanding(@RequestBody Comunicado comunicado) throws Exception {

		String data = comunicadoServicio.RegistrarComunicadoLanding(comunicado);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT ACTUALIZAR COMUNICADO
	@RequestMapping(value = "/comunicado/landing/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<?> putActualizarComunicadoLanding(@RequestBody Comunicado comunicado) throws Exception {

		String data = comunicadoServicio.ActualizarComunicadoLanding(comunicado);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET LISTAR COMUNICADO
	@RequestMapping(value = "/comunicado/landing/listar", method = RequestMethod.GET)
	public ResponseEntity<?> getListarComunicadosLanding() throws Exception {

		String data = comunicadoServicio.ListarComunicadosLanding();

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET LISTAR COMUNICADO
	@RequestMapping(value = "/comunicado/landing/fechas/listar", method = RequestMethod.GET)
	public ResponseEntity<?> getListarComunicadosLandingFechas() throws Exception {

		String data = comunicadoServicio.ListarComunicadosLandingFechas();

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT ELIMINAR COMUNICADO
	@RequestMapping(value = "/comunicado/landing/eliminar", method = RequestMethod.PUT)
	public ResponseEntity<?> putEliminarComunicadoLanding(@RequestBody Comunicado comunicado) throws Exception {

		String data = comunicadoServicio.EliminarComunicadoLanding(comunicado);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET LISTAR DEPARTAMENTOS PARAMETROS
	@RequestMapping(value = "/parametros/departamentos/listar", method = RequestMethod.GET)
	public ResponseEntity<?> getListarDepartamentos() throws Exception {

		String data = parametrosServicio.listarDepartamentos(1);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT ELIMINAR EXAMEN ADMINSTRADOR
	@RequestMapping(value = "/examen/estudinate/eliminar", method = RequestMethod.PUT)
	public ResponseEntity<?> putEliminarExamenEstudiante(@RequestBody ExamenEstudiante examen) throws Exception {

		String data = estudianteServicio.eliminarExamenEstudiante(examen);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET LISTAR CURSOS POR CICLO
	@RequestMapping(value = "/cursos/lista/ciclo/{idciclo}", method = RequestMethod.GET)
	public ResponseEntity<?> listarCursoCiclo(@PathVariable int idciclo) throws Exception {

		String data = cursoServicio.listarCursosCiclos(idciclo);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR TEMAS BIBLIOTECA

	@RequestMapping(value = "/biblioteca/tema/listar", method = RequestMethod.POST)
	public ResponseEntity<?> postListarTemaBiblioteca(@RequestBody TemaBiblioteca tema) throws Exception {

		String data = temaBibliotecaServicio.listarTemasBiblioteca(tema);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR CLASES BIBLIOTECA

	@RequestMapping(value = "/biblioteca/clases/listar", method = RequestMethod.POST)
	public ResponseEntity<?> postListarClaseBiblioteca(@RequestBody ClaseBiblioteca clase) throws Exception {

		String data = claseBibliotecaServicio.listarClasesBiblioteca(clase);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR MATERIALES BIBLIOTECA

	@RequestMapping(value = "/biblioteca/materiales/listar", method = RequestMethod.POST)
	public ResponseEntity<?> postListarMaterialesBiblioteca(@RequestBody MaterialBiblioteca material) throws Exception {

		String data = materialBibliotecaServicio.listarTemasBiblioteca(material);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR ESCANEOS BIBLIOTECA

	@RequestMapping(value = "/biblioteca/escaneos/listar", method = RequestMethod.POST)
	public ResponseEntity<?> postListarEscaneosBiblioteca(@RequestBody beanAdmisionBiblioteca admision)
			throws Exception {

		String data = escaneoBibliotecaServicio.listarEscaneosBiblioteca(admision);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR CLAVES BIBLIOTECA

	@RequestMapping(value = "/biblioteca/claves/listar", method = RequestMethod.POST)
	public ResponseEntity<?> postListarClavesBiblioteca(@RequestBody beanAdmisionBiblioteca admision) throws Exception {

		String data = claveBibliotecaServicio.listarClavesBiblioteca(admision);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}
	// POST LISTAR PROSPECTOS BIBLIOTECA

	@RequestMapping(value = "/biblioteca/prospectos/listar", method = RequestMethod.POST)
	public ResponseEntity<?> postListarProspectosBiblioteca(@RequestBody beanAdmisionBiblioteca admision)
			throws Exception {

		String data = prospectoBibliotecaServicio.listarProspectosBiblioteca(admision);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR SOLUCIONARIOS BIBLIOTECA

	@RequestMapping(value = "/biblioteca/solucionarios/listar", method = RequestMethod.POST)
	public ResponseEntity<?> postListarSolucionariosBiblioteca(@RequestBody beanAdmisionBiblioteca admision)
			throws Exception {

		String data = solucionarioBibliotecaServicio.listarSolucionariosBiblioteca(admision);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST GUARDAR CLASES - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/clase/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> postGurdarClasesBiblioteca(@RequestBody ClaseBiblioteca clase) throws Exception {

		String data = claseBibliotecaServicio.guardarClaseBiblioteca(clase);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR CLASES BIBLIOTECA ADMIN

	@RequestMapping(value = "/biblioteca/clases/listar/admin", method = RequestMethod.POST)
	public ResponseEntity<?> listarClasesBibliotecaAdmin(@RequestBody filtroBibliotecaBean clase) throws Exception {

		String data = claseBibliotecaServicio.listarClasesBibliotecaAdmin(clase);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// DELETE ELIMINAR CLASES BIBLIOTECA ADMIN

	@RequestMapping(value = "/biblioteca/clases/eliminar/{idclase}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarClasesBiblioteca(@PathVariable int idclase) throws Exception {

		String data = claseBibliotecaServicio.eliminarClasesBiblioteca(idclase);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT EDITAR CLASES - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/clases/editar", method = RequestMethod.PUT)
	public ResponseEntity<?> putEditarClaseBiblioteca(@RequestBody ClaseBiblioteca clase) throws Exception {

		String data = "1";
		// System.out.println(clase.getUrl_clase());
		claseBibliotecaServicio.editarClaseBiblioteca(clase);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR MATERIALES BIBLIOTECA ADMIN

	@RequestMapping(value = "/biblioteca/materiales/listar/admin", method = RequestMethod.POST)
	public ResponseEntity<?> listarMaterialesBiblioteca(@RequestBody filtroBibliotecaBean bean) throws Exception {

		String data = materialBibliotecaServicio.listarMaterialesBiblioteca(bean);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST GUARDAR MATERIALES - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/materiales/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> guardarMaterialesBiblioteca(@RequestBody MaterialBiblioteca material) throws Exception {

		String data = materialBibliotecaServicio.insertarMaterialesBiblioteca(material);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT EDITAR MATERIAL - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/materiales/editar", method = RequestMethod.PUT)
	public ResponseEntity<?> editarMaterialesBiblioteca(@RequestBody MaterialBiblioteca material) throws Exception {

		String data = "1";
		materialBibliotecaServicio.editarMaterialBiblioteca(material);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// DELETE ELIMINAR MATERIAL - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/materiales/eliminar/{idmaterial}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarMaterialesBiblioteca(@PathVariable int idmaterial) throws Exception {

		String data = materialBibliotecaServicio.eliminarMaterialBiblioteca(idmaterial);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET LISTAR SEMESTRES POR AÑO

	@RequestMapping(value = "/biblioteca/semestre/listar/anio/{idanio}", method = RequestMethod.GET)
	public ResponseEntity<?> listarSemestresAnio(@PathVariable int idanio) throws Exception {

		String data = semestreServicio.listarSemestresAnio(idanio);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR SOLUCIONARIOS - BIBLIOTECA ADMIN

	@RequestMapping(value = "/biblioteca/solucionarios/listar/admin", method = RequestMethod.POST)
	public ResponseEntity<?> listarSolucionariosBibliotecaAdmin(@RequestBody filtroBibliotecaBean bean)
			throws Exception {

		String data = solucionarioBibliotecaServicio.listarSolucionariosBibliotecaAdmin(bean);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// DELETE ELIMINAR SOLUCIONARIO - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/solucionario/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarSolucionarioBiblioteca(@PathVariable int id) throws Exception {

		String data = solucionarioBibliotecaServicio.eliminarSolucionarioBiblioteca(id);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST INSERTAR SOLUCIONARIOS- BIBLIOTECA ADMIN

	@RequestMapping(value = "/biblioteca/solucionarios/insertar", method = RequestMethod.POST)
	public ResponseEntity<?> insertarSolucionariosBibliotecaAdmin(@RequestBody SolucionarioBiblioteca sol)
			throws Exception {

		String data = solucionarioBibliotecaServicio.insertarSolucionariosBiblioteca(sol);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT EDITAR SOLUCIONARIO - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/solucionarios/editar", method = RequestMethod.PUT)
	public ResponseEntity<?> editarSolucionariosBibliotecaAdmin(@RequestBody SolucionarioBiblioteca sol)
			throws Exception {

		String data = "1";
		solucionarioBibliotecaServicio.editarSolucionarioBiblioteca(sol);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST INSERTAR ESCANEOS - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/escaneos/insertar", method = RequestMethod.POST)
	public ResponseEntity<?> insertarEscaneoBiblioteca(@RequestBody EscaneoBiblioteca escan) throws Exception {

		String data = escaneoBibliotecaServicio.insertarEscaneosBiblioteca(escan);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR ESCANEOS - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/escaneos/listar/admin", method = RequestMethod.POST)
	public ResponseEntity<?> listarEscaneoBibliotecaAdmin(@RequestBody filtroBibliotecaBean escan) throws Exception {

		String data = escaneoBibliotecaServicio.listarEscaneosBibliotecaAdmin(escan);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// DELETE ELIMINAR ESCANEOS - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/escaneos/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarEscaneoBibliotecaAdmin(@PathVariable int id) throws Exception {

		String data = escaneoBibliotecaServicio.eliminarEscaneoBiblioteca(id);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT EDITAR ESCANEOS - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/escaneos/editar", method = RequestMethod.PUT)
	public ResponseEntity<?> editarEscaneoBibliotecaAdmin(@RequestBody EscaneoBiblioteca escan) throws Exception {

		String data = "1";
		escaneoBibliotecaServicio.editarEscaneoBiblioteca(escan);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST GUARDAR PROSPECTOS - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/prospectos/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> guardarProspectosBibliotecaAdmin(@RequestBody ProspectoBiblioteca pro) throws Exception {

		String data = prospectoBibliotecaServicio.insertarProspectosBiblioteca(pro);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR PROSPECTOS - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/prospecto/listar/admin", method = RequestMethod.POST)
	public ResponseEntity<?> listarProspectosBibliotecaAdmin(@RequestBody filtroBibliotecaBean bean) throws Exception {

		String data = prospectoBibliotecaServicio.listarProspectosBibliotecaAdmin(bean);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// DELETE ELIMINAR PROSPECTOS - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/prospecto/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarProspectosBibliotecaAdmin(@PathVariable int id) throws Exception {

		String data = prospectoBibliotecaServicio.eliminarProspectoBiblioteca(id);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT EDITAR PROSPECTOS - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/prospecto/editar", method = RequestMethod.PUT)
	public ResponseEntity<?> editarProspectosBibliotecaAdmin(@RequestBody ProspectoBiblioteca pro) throws Exception {

		String data = "1";
		prospectoBibliotecaServicio.editarProspectoBiblioteca(pro);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST GUARDAR CLAVES - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/clave/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> insertarClavesBiblioteca(@RequestBody ClaveBiblioteca clave) throws Exception {

		String data = claveBibliotecaServicio.insertarClavesBiblioteca(clave);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT EDITAR CLAVE - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/clave/editar", method = RequestMethod.PUT)
	public ResponseEntity<?> editarClaveBibliotecaAdmin(@RequestBody ClaveBiblioteca clave) throws Exception {

		String data = "1";
		claveBibliotecaServicio.editarClaveBiblioteca(clave);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// DELETE ELIMINAR CLAVE - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/clave/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarClaveBibliotecaAdmin(@PathVariable int id) throws Exception {

		String data = claveBibliotecaServicio.eliminarClaveBiblioteca(id);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR CLAVE - BIBLIOTECA

	@RequestMapping(value = "/biblioteca/clave/listar/admin", method = RequestMethod.POST)
	public ResponseEntity<?> listarClaveBibliotecaAdmin(@RequestBody filtroBibliotecaBean clave) throws Exception {

		String data = claveBibliotecaServicio.listarClavesBibliotecaAdmin(clave);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR ESTADISTICA BIBLIOTECA

	@RequestMapping(value = "/biblioteca/estadisticas/listar", method = RequestMethod.POST)
	public ResponseEntity<?> postListarEstadisticasBiblioteca(@RequestBody beanAdmisionBiblioteca admision)
			throws Exception {

		String data = estadisticaExamenServicio.listarEstadisticasBiblioteca(admision);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR SEMESTRE BIBLIOTECA

	@RequestMapping(value = "/biblioteca/semestres/listar", method = RequestMethod.POST)
	public ResponseEntity<?> postListarSemestresBiblioteca(@RequestBody beanAdmisionBiblioteca admision)
			throws Exception {

		String data = semestreServicio.listarSemestres(admision);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR ESTADISTICA ADMINISTRADOR

	@RequestMapping(value = "/administrador/estadisticas/listar", method = RequestMethod.POST)
	public ResponseEntity<?> postListarEstadisticasAdministrador(@RequestBody beanAdmisionBiblioteca admision)
			throws Exception {

		String data = estadisticaExamenServicio.listarEstadisticasAdministrador(admision);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR CURSOS UNIVERSIDAD ESTADISTICA ADMINISTRADOR

	@RequestMapping(value = "/administrador/estadistica/cursos/universidad/", method = RequestMethod.POST)
	public ResponseEntity<?> postListarCursosUniversidadEstadistica(@RequestBody beanAdmisionBiblioteca admision)
			throws Exception {

		String data = estadisticaExamenServicio.listarCursosUniversidadEstadistica(admision);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST REGISTRAR ESTADISTICA

	@RequestMapping(value = "/administrador/estadistica/insertar/", method = RequestMethod.POST)
	public ResponseEntity<?> postRegistrarEstadisticaAdministrador(@RequestBody beanEstadistica estadistica)
			throws Exception {

		String data = estadisticaExamenServicio.insertarEstadisticaAdministrador(estadistica);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST REGISTRAR DETALLE

	@RequestMapping(value = "/administrador/estadistica/detalle/insertar/", method = RequestMethod.POST)
	public ResponseEntity<?> postRegistrarDetalleEstadistica(@RequestBody beanEstadistica estadistica)
			throws Exception {

		String data = estadisticaExamenServicio.insertarDetalleEstadistica(estadistica);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT ACTUALIZAR TEMARIO CURSO

	@RequestMapping(value = "/administrador/curso/temario/actualizar/", method = RequestMethod.PUT)
	public ResponseEntity<?> putActualizarTemarioCurso(@RequestBody Curso curso) throws Exception {

		String data = cursoServicio.ActualizarTemarioCurso(curso);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT ELIMINAR ESTADISTICA

	@RequestMapping(value = "/administrador/estadistica/eliminar/", method = RequestMethod.PUT)
	public ResponseEntity<?> putEliminarEstadistica(@RequestBody beanEstadistica estadistica) throws Exception {

		String data = estadisticaExamenServicio.eliminarEstadistica(estadistica);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR DETALLE EXAMEN BY ID

	@RequestMapping(value = "/examen/detalle/listar/", method = RequestMethod.POST)
	public ResponseEntity<?> postListarDetalleExamen(@RequestBody Examen examen) throws Exception {

		String data = examenServicio.ListarDetalleExamen(examen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR DETALLE EXAMEN BY ID

	@RequestMapping(value = "/examen/detalle/listar/normalizado/", method = RequestMethod.POST)
	public ResponseEntity<?> postListarDetalleExamenNormalizado(@RequestBody Examen examen) throws Exception {

		String data = examenServicio.ListarDetalleExamenNormalizado(examen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR TEMAS BIBLIOTECA CLASES

	@RequestMapping(value = "/biblioteca/clases/tema/listar", method = RequestMethod.POST)
	public ResponseEntity<?> postListarTemaBibliotecaClases(@RequestBody TemaBiblioteca tema) throws Exception {

		String data = temaBibliotecaServicio.listarTemasBibliotecaClases(tema);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR TEMAS BIBLIOTECA MATERIALES

	@RequestMapping(value = "/biblioteca/materiales/tema/listar", method = RequestMethod.POST)
	public ResponseEntity<?> postListarTemaBibliotecaMaterial(@RequestBody TemaBiblioteca tema) throws Exception {

		String data = temaBibliotecaServicio.listarTemasBibliotecaMateriales(tema);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET CURSOS UNIVERSIDAD CLASES
	@RequestMapping(value = "/cursos/universidad/clases/listar/{iduniversidad}", method = RequestMethod.GET)
	public ResponseEntity<?> getCursosUniversidadClases(@PathVariable("iduniversidad") int iduniversidad)
			throws Exception {

		String data = cursoServicio.ListarCursosUniversidadClases(iduniversidad);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// GET CURSOS UNIVERSIDAD MATERIALES
	@RequestMapping(value = "/cursos/universidad/materiales/listar/{iduniversidad}", method = RequestMethod.GET)
	public ResponseEntity<?> getCursosUniversidadMateriales(@PathVariable("iduniversidad") int iduniversidad)
			throws Exception {

		String data = cursoServicio.ListarCursosUniversidadMateriales(iduniversidad);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// POST INSERTAR TEMAS BIBLIOTECA
	@RequestMapping(value = "/biblioteca/tema/insertar/", method = RequestMethod.POST)
	public ResponseEntity<?> registrarTemaBiblioteca(@RequestBody TemaBiblioteca tema) throws Exception {

		String data = temaBibliotecaServicio.insertarTemasBiblioteca(tema);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET TEMAS BIBLIOTECA
	@RequestMapping(value = "/biblioteca/temas/listar/admin", method = RequestMethod.GET)
	public ResponseEntity<?> getTemasBibliotecaAdmin() throws Exception {

		String data = temaBibliotecaServicio.listarTemasBibliotecaAdmin(1);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PUT EDITAR TEMA BIBLIOTECA
	@RequestMapping(value = "/biblioteca/temas/editar/admin", method = RequestMethod.PUT)
	public ResponseEntity<?> editarTemasBibliotecaAdmin(@RequestBody TemaBiblioteca tema) throws Exception {

		String data = temaBibliotecaServicio.actualizarTema(tema);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST BUSCAR TEMAS BIBLIOTECA
	@RequestMapping(value = "/biblioteca/temas/buscar/admin", method = RequestMethod.POST)
	public ResponseEntity<?> buscarTemasBibliotecaAdmin(@RequestBody TemaBiblioteca tema) throws Exception {

		String data = temaBibliotecaServicio.buscarTema(tema);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// DELETE ELIMINAR TEMA BIBLIOTECA
	@RequestMapping(value = "/biblioteca/temas/eliminar/admin/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarTemasBibliotecaAdmin(@PathVariable int id) throws Exception {

		String data = temaBibliotecaServicio.eliminarTema(id);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR CICLOS MANTENIMIENTO
	@RequestMapping(value = "/ciclo/mantenimiento/listar/", method = RequestMethod.POST)
	public ResponseEntity<?> listarCiclosMantenimiento(@RequestBody Ciclo ciclo) throws Exception {

		String data = cicloServicio.listarCiclosMantenimiento(ciclo);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// DELETE ELIMINAR CICLO
//	@RequestMapping(value = "/ciclo/mantenimiento/eliminar/{id}", method = RequestMethod.DELETE)
//	public ResponseEntity<?> eliminarCiclo(@PathVariable int id) throws Exception {
//
//		String data = cicloServicio.eliminarCiclo(id);
//
//		return new ResponseEntity<>(data, HttpStatus.OK);
//
//	}

//	// POST INSERTAR CICLOS MANTENIMIENTO
//	@RequestMapping(value = "/ciclo/mantenimiento/insertar/", method = RequestMethod.POST)
//	public ResponseEntity<?> insertarCiclo(@RequestBody Ciclo ciclo) throws Exception {
//
//		String data = cicloServicio.insertarCiclo(ciclo);
//
//		return new ResponseEntity<>(data, HttpStatus.OK);
//
//	}

//	// PUT EDITAR CICLOS MANTENIMIENTO
	@RequestMapping(value = "/ciclo/mantenimiento/editar/", method = RequestMethod.PUT)
	public ResponseEntity<?> editarCiclo(@RequestBody beanCiclo ciclo) throws Exception {
		logger.info(ciclo.toString());
		String data = cicloServicio.editarCiclo(ciclo);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST INSERTAR UNIVERSIDAD
	@RequestMapping(value = "/universidad/insertar", method = RequestMethod.POST)
	public ResponseEntity<?> insertarUniversidad(@RequestBody Universidad universidad) throws Exception {

		String data = universidadServicio.f_insertar_universidad(universidad);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST ACTUALIZAR UNIVERSIDAD
	@RequestMapping(value = "/universidad/actualizar", method = RequestMethod.POST)
	public ResponseEntity<?> actualizarUniversidad(@RequestBody Universidad universidad) throws Exception {

		String data = universidadServicio.f_update_nombre_universidad(universidad);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST CAMBIAR ESTADO DE UNIVERSIDAD
	@RequestMapping(value = "/universidad/mantenimiento/visibilidad/", method = RequestMethod.POST)
	public ResponseEntity<?> cambiarVisibilidadUniversidad(@RequestBody Universidad universidad) throws Exception {

		String data = universidadServicio.f_update_estado_universidad(universidad);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST CAMBIAR VISIBILIDAD EN LANDING DE CICLO
	@RequestMapping(value = "/ciclo/mantenimiento/visibilidad/", method = RequestMethod.POST)
	public ResponseEntity<?> cambiarVisibilidadCiclo(@RequestBody Ciclo ciclo) throws Exception {

		String data = cicloServicio.cambiarVisibilidadCiclo(ciclo);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET LISTAR TEMAS POR CURSO
	@RequestMapping(value = "/tema/listar/curso/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listarTemasCurso(@PathVariable int id) throws Exception {

		String data = temaServicio.listarTemasCursos(id);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET LISTAR TEMAS POR CURSO
	@RequestMapping(value = "/tema-normalizado/listar/curso/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listarTemasNormalizadosCurso(@PathVariable int id) throws Exception {

		String data = temaServicio.f_listar_tema_normalizado_cursos(id);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET LISTAR SUBTEMAS POR TEMA
	@RequestMapping(value = "/subtema/listar/tema-normalizado/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listarSubtema(@PathVariable int id) throws Exception {

		String data = subtemaServicio.f_listar_subtema_temanormalizado(id);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET LISTAR SUBSUBTEMAS POR TEMA
	@RequestMapping(value = "/sub-subtema/listar/subtema/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listarSubsubtemas(@PathVariable int id) throws Exception {

		String data = subsubtemaServicio.f_listar_subsubtema_subtema(id);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET LISTAR SUBSUBSUBTEMAS POR TEMA
	@RequestMapping(value = "/sub-sub-subtema/listar/sub-subtema/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listarSubsubsubtemas(@PathVariable int id) throws Exception {

		String data = subsubsubtemaServicio.f_listar_subsubsubtema_subsubtema(id);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET LISTAR DETALLESUBTEMA POR TEMA
	@RequestMapping(value = "/detalle-subtema/listar/sub-sub-subtema/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listarDetallesubtemas(@PathVariable int id) throws Exception {

		String data = detallesubtemaServicio.f_listar_detallesubtema_subsubsubtema(id);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// GET LISTAR PREGUNTAS ESPEJO POR ID
	@RequestMapping(value = "/preguntas/espejo/listar", method = RequestMethod.POST)
	public ResponseEntity<?> listarPreguntaEspejo(@RequestBody FiltroBancoPreguntas filtro) throws Exception {

		String data = preguntaEspejoServicio.listarPreguntaEspejo(filtro);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTA BANCO PREGUNTAS CON TEMAS NORMALIZADOS
	@RequestMapping(value = "/banco/listar/espejo", method = RequestMethod.GET)
	public ResponseEntity<?> f_listar_preguntas_espejo_combo() throws Exception {

		String data = preguntaEspejoServicio.f_listar_preguntas_espejo_combo();

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST CREAR EXAMEN TEMAS
	@RequestMapping(value = "/examen/crear/temas/", method = RequestMethod.POST)
	public ResponseEntity<?> crearExamenTemas(@RequestBody ExamenBean ex) throws Exception {

		String data = examenServicio.crearExamenTemas(ex);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST CREAR EXAMEN TEMAS NORMALIZADO
	@RequestMapping(value = "/examen/crear/temas/normalizado/", method = RequestMethod.POST)
	public ResponseEntity<?> crearExamenTemasNormalizado(@RequestBody ExamenBean ex) throws Exception {

		String data = examenServicio.crearExamenTemasNormalizados(ex);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// STORE PROCEDURE OBTENER PREGUNTAS POR CURSO POR TEMAS
	@RequestMapping(value = "/examen/preguntas/curso/temas", method = RequestMethod.POST)
	public ResponseEntity<?> obtenerPreguntasCursoTemas(@RequestBody ExamenBean examen) throws Exception {

		String data = examenServicio.obtenerPreguntasCursoTemas(examen);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// STORE PROCEDURE OBTENER PREGUNTAS POR CURSO POR TEMAS
	@RequestMapping(value = "/examen/preguntas/curso/temas/normalizado", method = RequestMethod.POST)
	public ResponseEntity<?> obtenerPreguntasCursoTemasNormalizado(@RequestBody ExamenBean examen) throws Exception {

		String data = examenServicio.obtenerPreguntasCursoTemasNormalizado(examen);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PROCEDURE CREAR EXAMEN UNI
	@RequestMapping(value = "/examen/crear/uni", method = RequestMethod.POST)
	public ResponseEntity<?> crearExamenUni(@RequestBody ExamenBean examen) throws Exception {

		String data = examenServicio.crearExamenUni(examen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// PROCEDURE CREAR EXAMEN UNI
	@RequestMapping(value = "/examen/crear/uni/normalizado", method = RequestMethod.POST)
	public ResponseEntity<?> crearExamenUniNormalizado(@RequestBody ExamenBean examen) throws Exception {

		String data = examenServicio.crearExamenUniNormalizado(examen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// STORE PROCEDURE OBTENER PREGUNTAS POR CURSO UNI
	@RequestMapping(value = "/examen/preguntas/curso/uni", method = RequestMethod.POST)
	public ResponseEntity<?> obtenerPreguntasCursoUni(@RequestBody ExamenBean examen) throws Exception {

		String data = examenServicio.obtenerPreguntasCursoUni(examen);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// STORE PROCEDURE OBTENER PREGUNTAS POR CURSO UNI
	@RequestMapping(value = "/examen/preguntas/curso/uni/normalizado", method = RequestMethod.POST)
	public ResponseEntity<?> obtenerPreguntasCursoUniNormalizado(@RequestBody ExamenBean examen) throws Exception {

		String data = examenServicio.obtenerPreguntasCursoUniNormalizado(examen);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// STORE PROCEDURE PARA OBTENER EL CODIGO DE LAS FUNCIONES
	@RequestMapping(value = "/obtener/query/funcion", method = RequestMethod.POST)
	public ResponseEntity<?> obtenerQueryFuncion(@RequestBody Universidad u) throws Exception {

		String data = universidadServicio.obtenerQueryFuncion(u);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// STORE PROCEDURE PARA GUARDAR EL ORDEN DE LOS TEMAS EN LA BIBLIOTECA FREE
	@RequestMapping(value = "/biblioteca/temas/guardar/orden", method = RequestMethod.POST)
	public ResponseEntity<?> postActualizarOrdenTemas(@RequestBody TemaBiblioteca u) throws Exception {

		String data = temaBibliotecaServicio.actualizarOrdenTemas(u);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// POST LISTAR TEMAS BIBLIOTECA ORDENAR

	@RequestMapping(value = "/biblioteca/ordenar/tema/listar", method = RequestMethod.POST)
	public ResponseEntity<?> postListarTemaBibliotecaOrdenar(@RequestBody TemaBiblioteca tema) throws Exception {

		String data = temaBibliotecaServicio.listarTemasBibliotecaOrdenar(tema);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// STORE PROCEDURE PARA GUARDAR EL ORDEN DE LOS TEMAS
	@RequestMapping(value = "/matenimiento/temas/guardar/orden", method = RequestMethod.POST)
	public ResponseEntity<?> postActualizarOrdenTemasMantenimiento(@RequestBody Tema u) throws Exception {

		String data = temaServicio.actualizarOrdenTemas(u);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// REPORTE ESTUDIANTE POR MESES

	@RequestMapping(value = "/reporte/datos/estudiante/meses", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteDatosEstudianteMeses(@RequestBody beanReporte reporte) throws Exception {

		String data = cabeceraPreguntaServicio.ReporteListarDatosEstudianteMeses(reporte);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/reporte/detalle/simulacro/estudiante/meses", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteDetalleSimulacroMeses(@RequestBody beanReporte reporte) throws Exception {

		String data = cabeceraPreguntaServicio.ReporteListarDetalleSimulacroMeses(reporte);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/reporte/datos/estudiante/uni", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteDatosEstudianteUni(@RequestBody beanReporte reporte) throws Exception {

		String data = cabeceraPreguntaServicio.ReporteDatosEstudianteUni(reporte);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	@RequestMapping(value = "/reporte/datos/estudiante/ciclo/uni", method = RequestMethod.POST)
	public ResponseEntity<?> postReporteDatosEstudianteCicloUni(@RequestBody beanReporte reporte) throws Exception {

		String data = cabeceraPreguntaServicio.ReporteListarDatosEstudianteUniCiclo(reporte);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// FUNCION FILTRAR PRECIO POR CICLO
	@RequestMapping(value = "/filtrar/precio/ciclo", method = RequestMethod.POST)
	public ResponseEntity<?> editarUsuario(@RequestBody com.rosettcompany.grupoCiencia.repository.PreciosEntity precio)
			throws Exception {

		String data = preciosServicio.f_filtrar_precio_ciclo(precio);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/realizar/pago", method = RequestMethod.POST)
	@Operation(summary = "NO SE USA")
	public ResponseEntity<?> realizarPago(@RequestBody CronogramaPagos detpagos) {
		try {

//			System.out.println(detpagos.getIdCronogramaPagos());
//			System.out.println(detpagos.getVencimientoMontoMetodoEstado());
			String data = cronogramaPagosServicio.f_actualizar_cronograma_pago(detpagos);
			return new ResponseEntity<>(data, HttpStatus.OK);

		} catch (Exception e) {
			// Manejar la excepción de manera apropiada
			return new ResponseEntity<>("Error al realizar el pago", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

	@RequestMapping(value = "/listar/pagos", method = RequestMethod.POST)
	public ResponseEntity<?> ListarPagos(@RequestBody String dni) throws Exception {
		// System.out.println(dni);
		String data = cronogramaPagosServicio.listarPagos(dni);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/listar/pago", method = RequestMethod.POST)
	@Operation(summary = "PANTALLA INICIO Y PAGOS. Listar pagos segun ciclo y dni", description = " Usa parámetros `dni` e `idsolicitud` para listar")
	public ResponseEntity<?> f_listar_pagos_intr(@RequestBody CronogramaPagos cronograma) throws Exception {
//		System.out.println(cronograma.getDni());
//		System.out.println(cronograma.getIdsolicitud());
		String data = cronogramaPagosServicio.f_listar_pagos_intr(cronograma);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/estudiante/examenes/listar/{idestudiante}", method = RequestMethod.GET)
	@Operation(summary = "Listar examenes realizados del estudiante")
	public ResponseEntity<?> listarExamenesEstudiante(@PathVariable int idestudiante) throws Exception {

		String data = examenEstudianteServicio.listarExamenesEstudiante(idestudiante);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	@RequestMapping(value = "/verificar/fecha/examen/{idexamen}", method = RequestMethod.GET)
	@Operation(summary = "Verificar si el examen está activo por fecha y hora")
	public ResponseEntity<?> verificarFechaExamen(@PathVariable int idexamen) throws Exception {

		String data = examenEstudianteServicio.verificarFechaExamen(idexamen);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/resumen/asistencia-anual", method = RequestMethod.POST)
	@Operation(summary = "Obtener resumen de asistencias del estudiante anual", description = "Usa parámetro `idestudiante (13858)`y `anio (2024)` para listar su información")
	public ResponseEntity<?> f_detalle_asistencia_anual(@RequestBody HistorialAcceso historial) throws Exception {
//		System.out.println(historial.toString());
		String data = historialAccesoServicio.f_detalle_asistencia_anual(historial);
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}
	
	

	@RequestMapping(value = "/listar/solicitud/pagos", method = RequestMethod.POST)
	public ResponseEntity<?> ListarSolicitudPagos(@RequestBody Integer idsolicitud) throws Exception {
		// System.out.println(dni);
		String data = cronogramaPagosServicio.listarsolicitudpagos(idsolicitud);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// STOREPROCEDURE INSERTAR MATRICULAS
	@RequestMapping(value = "/insertar/matriculas", method = RequestMethod.POST)
	public ResponseEntity<?> insertarMatriculas(@RequestBody Matriculas matriculas) throws Exception {
		String data = matriculasServicio.insertarMatriculas(matriculas);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// STOREPROCEDURE INSERTAR CRONOGRAMA DE PAGO
	@RequestMapping(value = "/insertar/cronograma-pago", method = RequestMethod.POST)
	public ResponseEntity<?> insertarCronogramaPago(@RequestBody CronogramaPagos cronogramaPagos) throws Exception {
		String data = cronogramaPagoServicio.f_insertar_cronograma_pagos(cronogramaPagos);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/registrarBecaDescuento", method = RequestMethod.POST)
	public ResponseEntity<?> registrarBecaEstudianteEstado(
			@RequestBody DetalleEstudiantesBecaDescuento detalleEstudiantesBecaDescuento) throws Exception {
		if (detalleEstudiantesBecaDescuento.getFecha_fin() == null) {
			logger.info("es null");
		} else {
			logger.info("datos recibidos");
		}
		// System.out.println(detalleEstudiantesBecaDescuento);
		String data = becasEstudiantesServicio.registrarBecaDescuento(detalleEstudiantesBecaDescuento);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/actualizar/estado/becaestudiantes", method = RequestMethod.POST)
	public ResponseEntity<?> actualizarBecaEstudianteEstado(
			@RequestBody DetalleEstudiantesBecaDescuento detalleEstudiantesBecaDescuento) throws Exception {
		// System.out.println(dni);
		String data = becasEstudiantesServicio.actualizarEstado(detalleEstudiantesBecaDescuento);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// STOREPROCEDURE LISTAR BECAS
	@RequestMapping(value = "/becas/listar", method = RequestMethod.POST)
	public ResponseEntity<?> listarBecasEstudiantes(
			@RequestBody DetalleEstudiantesBecaDescuento detalleEstudiantesBecaDescuento) throws Exception {
//		System.out.println(detalleEstudiantesBecaDescuento.getUsuario());
		String data = becasEstudiantesServicio
				.f_listar_detalle_estudiantes_beca_descuento(detalleEstudiantesBecaDescuento);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// STOREPROCEDURE LISTAR BECAS
	@RequestMapping(value = "/becas/descargar", method = RequestMethod.POST)
	public ResponseEntity<?> descargarBecasEstudiantes(
			@RequestBody DetalleEstudiantesBecaDescuento detalleEstudiantesBecaDescuento) throws Exception {

		String data = becasEstudiantesServicio
				.f_descargar_detalle_estudiantes_beca_descuento(detalleEstudiantesBecaDescuento);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/insertar/archivo/becas/descuento/masivo", method = RequestMethod.POST)
	public ResponseEntity<?> f_insertar_archivo_becas_masivo(@RequestBody BecaArchivoMasivo becaArchivoMasivo)
			throws Exception {
		String data = becaArchivoMasivoServicio.f_insertar_archivo_becas_masivo(becaArchivoMasivo);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/subir/archivo/notas/simulacros/estudiantes", method = RequestMethod.POST)
	public ResponseEntity<?> f_subir_notas_simulacros_estudiantes(@RequestBody NotasSimulacroEstudiantes notasSimulacroEstudiantes)
			throws Exception {
		String data = notasSimulacroEstudiantesServicio.f_subir_notas_simulacros_estudiantes(notasSimulacroEstudiantes);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/archivo/becas/descuento/masivo", method = RequestMethod.POST)
	public ResponseEntity<?> f_listar_archivo_becas_masivo(@RequestBody BecaArchivoMasivo becaArchivoMasivo)
			throws Exception {
		logger.info("entra");
		logger.info(becaArchivoMasivo.toString());

		
		String data = becaArchivoMasivoServicio.f_listar_archivo_becas_masivo(becaArchivoMasivo);
		logger.info(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/listar/archivo/notas/simulacros/estudiantes", method = RequestMethod.POST)
	public ResponseEntity<?> f_listar_notas_simulacro_estudiantes(@RequestBody NotasSimulacroEstudiantes notasSimulacroEstudiantes)
			throws Exception {
		logger.info("entra");
		logger.info(notasSimulacroEstudiantes.toString());

		
		String data = notasSimulacroEstudiantesServicio.f_listar_notas_simulacro_estudiantes(notasSimulacroEstudiantes);
		logger.info(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/buscar/becas/dni", method = RequestMethod.POST)
	public ResponseEntity<?> buscarBecarDNI(@RequestBody String dni) throws Exception {
		String data = becasEstudiantesServicio.buscarBecaDNI(dni);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// STOREPROCEDURE INSERTAR ASIGNACION AULA ALUMNO
	@RequestMapping(value = "/asignar/aula", method = RequestMethod.POST)
	public ResponseEntity<?> buscarUsuario(@RequestBody AsignacionAlumnoAula asignacionAlumnoAula) throws Exception {
//		System.out.println(asignacionAlumnoAula);
		String data = asignacionAlumnoAulaServicio.asignaraula(asignacionAlumnoAula);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/editar/asignar/aula", method = RequestMethod.POST)
	public ResponseEntity<?> editarAsignarAula(@RequestBody AsignacionAlumnoAula asignacionAlumnoAula)
			throws Exception {
//		System.out.println(asignacionAlumnoAula);
		String data = asignacionAlumnoAulaServicio.editarAsignarAula(asignacionAlumnoAula);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/todas/aulas", method = RequestMethod.GET)
	public ResponseEntity<?> listarTodasAulas() throws Exception {
		// System.out.println(solicitudes);
		String data = aulaServicio.f_listar_aulas();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/listar/ciclos/aulas", method = RequestMethod.POST)
	public ResponseEntity<?> listarCiclosAulas(@RequestBody AulasEntity aulas) throws Exception {
		logger.info("Recibido en /listar/ciclos/aulas: {}", aulas);
		String data = aulaServicio.f_listar_aulas_por_ciclo(aulas);
		logger.info("Respuesta de f_listar_aulas_por_ciclo: {}", data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}


	@RequestMapping(value = "/listar/aulas", method = RequestMethod.POST)
	public ResponseEntity<?> listarAulas(@RequestBody Solicitudes solicitudes) throws Exception {
		// System.out.println(solicitudes);
		String data = cicloServicio.listarAula(solicitudes);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/obtener/aulas/editar-estudiante", method = RequestMethod.POST)
	public ResponseEntity<?> f_obtener_aulas_editar_estudiante(@RequestBody Solicitudes solicitudes) throws Exception {
		// System.out.println(solicitudes);
		String data = cicloServicio.f_obtener_aulas_editar_estudiante(solicitudes);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/ciclos/editar-estudiante", method = RequestMethod.POST)
	public ResponseEntity<?> listarCiclosEditarEstudiante(@RequestBody beanCiclo solicitudes) throws Exception {
		// System.out.println(solicitudes);
		String data = cicloServicio.listarCiclosEditarEstudiante(solicitudes);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/ciclos/listar/usuarios", method = RequestMethod.GET)
	public ResponseEntity<?> listarCiclosUsuarios() throws Exception {
		// System.out.println(solicitudes);
		String data = cicloServicio.f_listar_ciclos_usuarios();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/mostrar/facturador", method = RequestMethod.POST)
	public ResponseEntity<?> mostrarFacturador(@RequestBody Sedes sedes) throws Exception {
//		System.out.println(sedes.getIdsede());
		String data = sedeServicio.f_mostrar_facturador_sede(sedes.getIdsede());
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/personal-ventas", method = RequestMethod.GET)
	public ResponseEntity<?> listarPersonalVentas() throws Exception {
		String data = personalVentaServicio.f_listar_personal_ventas();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/buscar/personal-ventas/codigo", method = RequestMethod.POST)
	public ResponseEntity<?> buscarPorCodPersonalVentas(@RequestBody PersonalVentas personal) throws Exception {
		String data = personalVentaServicio.f_buscar_personal_ventas_cod(personal);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/insertar/ciclos-normalizados", method = RequestMethod.POST)
	public ResponseEntity<?> insertarCiclosNormalizados(@RequestBody CiclosNormalizadosEntity ciclosN)
			throws Exception {
		String data = cicloNormalizadoServicio.f_insertar_ciclo_normalizado(ciclosN);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/actualizar/ciclo-normalizado", method = RequestMethod.POST)
	public ResponseEntity<?> actualizarCiclosNormalizados(@RequestBody CiclosNormalizadosEntity ciclosN)
			throws Exception {
		String data = cicloNormalizadoServicio.f_actualizar_ciclo_normalizado(ciclosN);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/visibilidad/ciclos-normalizados", method = RequestMethod.POST)
	public ResponseEntity<?> cambiarVisibilidadCiclosNormalizados(@RequestBody CiclosNormalizadosEntity ciclosN)
			throws Exception {
		String data = cicloNormalizadoServicio.cambiarVisibilidadCiclo(ciclosN);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/eliminar/ciclo-normalizado", method = RequestMethod.POST)
	public ResponseEntity<?> eliminarCicloNormalizado(@RequestBody CiclosNormalizadosEntity ciclosN) throws Exception {
		String data = cicloNormalizadoServicio.eliminarCicloNormalizado(ciclosN);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/insertar/aula", method = RequestMethod.POST)
	public ResponseEntity<?> insertarAula(@RequestBody AulasEntity aula) throws Exception {
		String data = aulaServicio.f_insertar_aula(aula);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/actualizar/aula", method = RequestMethod.POST)
	public ResponseEntity<?> actualizarAula(@RequestBody AulasEntity aula) throws Exception {
		String data = aulaServicio.f_actualizar_aula(aula);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/eliminar/aula", method = RequestMethod.POST)
	public ResponseEntity<?> eliminarAula(@RequestBody AulasEntity aula) throws Exception {
		String data = aulaServicio.f_eliminar_aula(aula);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/actualizar/precio/ciclo-normalizado", method = RequestMethod.POST)
	public ResponseEntity<?> actualizarPrecioCicloNormalizado(@RequestBody PreciosEntity precios) throws Exception {
		String data = preciosServicio.f_actualizar_precio_ciclo(precios);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// POST INSERTAR CICLOS MANTENIMIENTO
	@RequestMapping(value = "/ciclo/mantenimiento/insertar/", method = RequestMethod.POST)
	public ResponseEntity<?> insertarCiclo(@RequestBody beanCiclo ciclo) throws Exception {
		String data = cicloServicio.insertarCiclo(ciclo);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// PUT EDITAR CICLOS MANTENIMIENTO
//	@RequestMapping(value = "/ciclo/mantenimiento/editar/", method = RequestMethod.PUT)
//	public ResponseEntity<?> editarCiclo(@RequestBody beanCiclo ciclo) throws Exception {
//		String data = cicloServicio.editarCiclo(ciclo);
//		return new ResponseEntity<>(data, HttpStatus.OK);
//	}

	// DELETE CICLOS MANTENIMIENTO
	@RequestMapping(value = "/ciclo/mantenimiento/eliminar", method = RequestMethod.POST)
	public ResponseEntity<?> eliminarCiclo(@RequestBody beanCiclo ciclo) throws Exception {
		String data = cicloServicio.eliminarCiclo(ciclo);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// DELETE CICLOS MANTENIMIENTO
	@RequestMapping(value = "/ciclo-normalizado/cronograma", method = RequestMethod.POST)
	public ResponseEntity<?> cronogramaCicloNormalizado(@RequestBody CiclosNormalizadosEntity ciclo) throws Exception {
		String data = cicloNormalizadoServicio.f_prueba_cambiar_cronograma(ciclo);

		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// APROBAR PAGO SOLICITUD
	@RequestMapping(value = "/solicitud/aprobar-pago", method = RequestMethod.POST)
	public ResponseEntity<?> validarPagoSolicitud(@RequestBody Solicitudes solicitud) throws Exception {
		String data = solicitudServicio.f_aprobar_pago_solicitud(solicitud);
		return new ResponseEntity<>(1, HttpStatus.OK);
	}

	// APROBAR PAGO SOLICITUD
	@RequestMapping(value = "/buscar/nrooperacion-repetida", method = RequestMethod.POST)
	public ResponseEntity<?> buscarNroOperacionRepetida(@RequestBody String in_nrooperacion) throws Exception {
		String data = estudianteServicio.f_buscar_datos_nrooperacion_repetida(in_nrooperacion);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

	// APROBAR PAGO SOLICITUD
	@RequestMapping(value = "/verificar/beneficio-existente", method = RequestMethod.POST)
	public ResponseEntity<?> verificarBeneficioExistente(@RequestBody String in_dni) throws Exception {
		String data = cronogramaPagoServicio.f_verificar_beneficio_activo(in_dni);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/pagos-full", method = RequestMethod.POST)
	public ResponseEntity<?> listarPagosFull(@RequestBody CronogramaPagos cronogramaPagos) throws Exception {
		String data = cronogramaPagoServicio.f_obtener_pagos_full(cronogramaPagos);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/reporte/pagos-full", method = RequestMethod.POST)
	public ResponseEntity<?> reportePagosFull(@RequestBody CronogramaPagos cronogramaPagos) throws Exception {
		String data = cronogramaPagoServicio.f_reporte_pagos_full(cronogramaPagos);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/buscar/estudiante-dni", method = RequestMethod.POST)
	public ResponseEntity<?> buscarEstudiantePorDNI(@RequestBody String in_dni) throws Exception {
		String data = estudianteServicio.f_buscar_estudiante_por_dni(in_dni);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/buscar/estudiante-dni/ciclo", method = RequestMethod.POST)
	public ResponseEntity<?> buscarCicloDeEstudiantePorDNI(@RequestBody String in_dni) throws Exception {
		String data = estudianteServicio.f_buscar_ciclos_estudiante_por_dni(in_dni);
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/buscar/historial/esnuevo", method = RequestMethod.POST)
	public ResponseEntity<?> buscarHistorialEsNuevo(@RequestBody String in_dni) throws Exception {
		String data = estudianteServicio.f_buscar_historial_esnuevo(in_dni);
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// CODIS

	@RequestMapping(value = "/insertar/codis1", method = RequestMethod.POST)
	public ResponseEntity<?> insertarCodis(@RequestBody CodisBean codis) throws Exception {
//		System.out.println("Esto es lo que manda");
		logger.info(codis.toString().toString());
//		System.out.println(codis.toString());
		String data = codisServicio.f_insertar_codis(codis);
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/codis", method = RequestMethod.POST)
	public ResponseEntity<?> listarCodis(@RequestBody Codis codis) throws Exception {
		String data = codisServicio.f_listar_codis(codis);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/descargar/codis/parametros", method = RequestMethod.POST)
	public ResponseEntity<?> DescarCodisParametros(@RequestBody Codis codis) throws Exception {
		String data = codisServicio.f_descargar_excel_codis_profesores_promedio(codis);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/codis/respuesta", method = RequestMethod.POST)
	public ResponseEntity<?> listarCodisRespuesta(@RequestBody CodisRespuesta codis) throws Exception {
		logger.info(codis.toString());
		String data = codisRespuestaServicio.f_listar_codis_respuestas_por_estudiante(codis);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/respuesta/general/codis", method = RequestMethod.POST)
	public ResponseEntity<?> guardarRespuestaGeneralCodis(@RequestBody Codis codis) throws Exception {
		String data = codisRespuestaServicio.f_listar_codis_respuestas_general(codis.getIdcodis());
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/actualizar/codis", method = RequestMethod.POST)
	public ResponseEntity<?> actualizarCodis(@RequestBody Codis codis) throws Exception {
//		System.out.println("actualizar: " + codis.toString());
		String data = codisServicio.f_actualizar_codis(codis);
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/eliminar/codis", method = RequestMethod.POST)
	public ResponseEntity<?> eliminarCodis(@RequestBody Codis codis) throws Exception {
//		System.out.println(codis.toString());
		String data = codisServicio.f_eliminar_codis(codis);
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/codis-respuesta/descargar", method = RequestMethod.POST)
	public ResponseEntity<?> descargarCodisRespuesta(@RequestBody CodisRespuesta codis) throws Exception {
//		System.out.println(codis.toString());
		String data = codisRespuestaServicio.f_descargar_codis_respuestas(codis.getIdcodis());
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/codis/descargar/profesores", method = RequestMethod.POST)
	public ResponseEntity<?> descargarCodisProfesores(@RequestBody CodisRespuesta codis) throws Exception {
//		System.out.println(codis.toString());
		String data = codisRespuestaServicio.f_descargar_codis_profesores_por_codis(codis.getIdcodis());
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	// CAMPAIGNS
	@RequestMapping(value = "/insertar/campaign", method = RequestMethod.POST)
	public ResponseEntity<?> insertarCampaign(@RequestBody Campaign campaign) throws Exception {
		String data = campaignServicio.f_insertar_campaign(campaign);
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/campaigns", method = RequestMethod.POST)
	public ResponseEntity<?> listarCampaigns(@RequestBody Campaign campaign) throws Exception {
//		System.out.println(campaign.toString());
		String data = campaignServicio.f_listar_campaigns(campaign);
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/buscar/campaign", method = RequestMethod.POST)
	public ResponseEntity<?> buscarCampaign(@RequestBody Campaign campaign) throws Exception {
//		System.out.println(campaign.toString());
		String data = campaignServicio.f_buscar_campaign_cod(campaign);
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/actualizar/campaign", method = RequestMethod.POST)
	public ResponseEntity<?> actualizarCampaign(@RequestBody Campaign campaign) throws Exception {
//		System.out.println("actualizar: " + campaign.toString());
		String data = campaignServicio.f_actualizar_campaign(campaign);
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/eliminar/campaign", method = RequestMethod.POST)
	public ResponseEntity<?> eliminarCampaign(@RequestBody Campaign campaign) throws Exception {
//		System.out.println(campaign.toString());
		String data = campaignServicio.f_eliminar_campaign(campaign);
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/campaign-answer/insertar", method = RequestMethod.POST)
	public ResponseEntity<?> insertarCampaignAnswer(@RequestBody CampaignAnswers campaignAnswer) throws Exception {
//		System.out.println(campaignAnswer.toString());
		String data = campaignAnswersServicio.f_insertar_campaign_answers(campaignAnswer);
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/campaign-answer/listar", method = RequestMethod.POST)
	public ResponseEntity<?> listarCampaignAnswer(@RequestBody CampaignAnswers campaignAnswer) throws Exception {
//		System.out.println(campaignAnswer.toString());
		String data = campaignAnswersServicio.f_listar_campaign_answers(campaignAnswer);
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/campaign-answer/descargar", method = RequestMethod.POST)
	public ResponseEntity<?> descargarCampaignAnswer(@RequestBody CampaignAnswers campaignAnswer) throws Exception {
//		System.out.println(campaignAnswer.toString());
		String data = campaignAnswersServicio.f_descargar_campaign_answers(campaignAnswer);
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@Scheduled(cron = "0 0 23 * * ?")
//	@RequestMapping(value = "/asistencia/actualizar", method = RequestMethod.GET)
	public void ActualizarFaltasAsistencias() {
		try {
			historialAccesoServicio.insertar_historial_faltas();
		} catch (Exception e) {
			logger.error("Error en api.grupociencias.admin ActualizarFaltasAsistencias: {}", e);
		}
	}

	@RequestMapping(value = "/asistencia/justificar", method = RequestMethod.POST)
	public ResponseEntity<?> justificarAsistencia(@RequestBody HistorialAcceso historial) throws Exception {
//		System.out.println(historial.toString());
		String data = historialAccesoServicio.f_justificar_asistencia(historial);
//		System.out.println(data);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}


	@RequestMapping(value = "/asistencia-resumen/listar-presencial", method = RequestMethod.POST)
	public ResponseEntity<?> listarAsistenciaResumenPresencial(@RequestBody HistorialAcceso historial) throws Exception {
		String data = historialAccesoServicio.f_listar_resumen_asistencias(historial);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/asistencia-resumen/listar-virtual", method = RequestMethod.POST)
	public ResponseEntity<?> listarAsistenciaResumenVirtual(@RequestBody HistorialAcceso historial) throws Exception {
		String data = historialAccesoServicio.f_listar_resumen_asistencias_virtual(historial);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/asistencia-resumen/listar-estudiante", method = RequestMethod.POST)
	public ResponseEntity<?> listarAsistenciaResumenIdestudiante(@RequestBody HistorialAcceso historial)
			throws Exception {
		String data = historialAccesoServicio.f_listar_resumen_asistencias_idestudiante(historial);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/salones/listar-all", method = RequestMethod.GET)
	public ResponseEntity<?> listarSalonesAll() throws Exception {
		String data = salonesServicio.f_listar_salones_all();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@RequestMapping(value = "/salones/listar", method = RequestMethod.GET)
	public ResponseEntity<?> listarSalones() throws Exception {
		String data = salonesServicio.f_listar_salones();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@PostMapping("/salones/insertar")
	public ResponseEntity<?> insertarSalones(@RequestBody Salones salon) throws Exception {
		String data = salonesServicio.f_insertar_salones(salon);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@PostMapping("/salones/update")
	public ResponseEntity<?> updateSalones(@RequestBody Salones salon) throws Exception {
		String data = salonesServicio.f_update_salones(salon);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@PostMapping("/salones/update-estado")
	public ResponseEntity<?> updateEstadoSalones(@RequestBody Salones salon) throws Exception {
		String data = salonesServicio.f_update_estado_salon(salon);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@Scheduled(cron = "59 59 23 * * ?")
//	@RequestMapping(value = "/desactivar/becas-fin", method = RequestMethod.GET)
	public void desactivarBecasFechaFin() {
		try {
			String data = becasEstudiantesServicio.f_desactivar_becas_fecha_fin();
			logger.info(data);
		} catch (Exception e) {
			logger.error("Error en api.grupociencias.admin desactivarBecasFechaFin: {}", e);
		}
	}
	
	@GetMapping("/solicitudes/reporte-eliminadas")
	public ResponseEntity<?> solicitudesEliminadas() throws Exception {
		String data = solicitudServicio.funcion_reporte_solicitudes_eliminadas_mensual();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@GetMapping("/solicitudes/reporte-vendedores")
	public ResponseEntity<?> vendedoresReporte() throws Exception {
		String data = solicitudServicio.funcion_reporte_solicitudes_vendedores();
		return new ResponseEntity<>(data, HttpStatus.OK);
	} 
	
	@GetMapping("/estudiantes/reporte-eliminados")
	public ResponseEntity<?> estudiantesEliminados() throws Exception {
		String data = estudianteServicio.funcion_reporte_estudiantes_eliminados_mensual();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@GetMapping("/apoderados/reporte")
	public ResponseEntity<?> apoderadosReporte() throws Exception {
		String data = estudianteServicio.funcion_reporte_estudiantes_apoderados_mensual();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	//STOREPROCEDURE INSERTAR HORARIO CURSO
		@RequestMapping(value="/horario/curso/insertar",method = RequestMethod.POST)
		public ResponseEntity<?> guardarHorarioCurso(@RequestBody BeanAsistenciaCursoGuardar a) throws Exception{
					
			String data = asistenciaCursoServicio.guardarHorarioCurso(a);
			return new ResponseEntity<>(data,HttpStatus.OK);
		}
		
		
		//STOREPROCEDURE ELIMINAR HORARIO CURSO
		@RequestMapping(value="/horario/curso/eliminar/{id}",method = RequestMethod.GET)
		public ResponseEntity<?> eliminarHorarioCurso(@PathVariable int id) throws Exception{
					
			String data = asistenciaCursoServicio.eliminarHorarioCurso(id);
			return new ResponseEntity<>(data,HttpStatus.OK);
		}	
		
		//STOREPROCEDURE LISTAR HORARIO CURSO
		@RequestMapping(value="/horario/curso/listar/{id}",method = RequestMethod.GET)
		public ResponseEntity<?> listarHorarioCurso(@PathVariable int id) throws Exception{
					
			String data = asistenciaCursoServicio.listarHorarioCurso(id);
			return new ResponseEntity<>(data,HttpStatus.OK);
		}
		
		//STOREPROCEDURE LISTAR CURSOS CICLO ASISTENCIA
		@RequestMapping(value="/asistencia/cursos/ciclo",method = RequestMethod.POST)
		public ResponseEntity<?> ListarAsistenciaCursosCiclo(@RequestBody BeanAsistenciaCursos asistenciaCursos) throws Exception{
					
			String data = asistenciaCursoService.ListarAsistenciaCursos_ciclo(asistenciaCursos);
			return new ResponseEntity<>(data,HttpStatus.OK);
		}
		
		//STOREPROCEDURE LISTAR ESTUDIANTES CICLO ASISTENCIA
		@RequestMapping(value="/asistencia/estudiantes/ciclo",method = RequestMethod.POST)
		public ResponseEntity<?> ListarEstudiantesCiclo(@RequestBody BeanAsistenciaCursos asistenciaCursos) throws Exception{
		
//			System.out.println(asistenciaCursos.getFecha());
			String data = estudianteServicio.listarEstudiantes(asistenciaCursos);
			return new ResponseEntity<>(data,HttpStatus.OK);
		}
		
		//STOREPROCEDURE REGISTRAR ASISTENCIA ESTUDIANTES
		@RequestMapping(value="/registrar/asistencia/estudiantes",method = RequestMethod.POST)
		public ResponseEntity<?> RegistrarAsistenciaEstudiantes(@RequestBody BeanAsistenciaEstudiantes asistenciaEstudiantes) throws Exception{
					
			String data = estudianteServicio.registrarAsistenciaEstudiantes(asistenciaEstudiantes);
			return new ResponseEntity<>(data,HttpStatus.OK);
		}

}
