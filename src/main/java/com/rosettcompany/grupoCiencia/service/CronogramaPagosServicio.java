package com.rosettcompany.grupoCiencia.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

import com.rosettcompany.grupoCiencia.bean.CronogramaTempEntity;
import com.rosettcompany.grupoCiencia.repository.AreaConocimiento;
import com.rosettcompany.grupoCiencia.repository.CronogramaPagos;
import com.rosettcompany.grupoCiencia.repositoryI.AreaConocimientoRepositoryI;
import com.rosettcompany.grupoCiencia.repositoryI.CronogramaPagosRepositoryI;

@Service
public class CronogramaPagosServicio {

	@Autowired
	private CronogramaPagosRepositoryI cronogramaPagosRepositoryI;

	public void enviarCorreo(String apiUrl, Map<String, Object> correoData) {
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<>(correoData, headers);

			// Enviar la solicitud y obtener la respuesta
			ResponseEntity<String> responseEntity = new RestTemplate().postForEntity(apiUrl, requestEntity,
					String.class);

			// Imprimir la respuesta
//			System.out.println("Código de respuesta: " + responseEntity.getStatusCodeValue());
//			System.out.println("Cuerpo de respuesta: " + responseEntity.getBody());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String convertirMapaAJson(Map<String, Object> mapa) {
		// Lógica para convertir un mapa a una cadena JSON
		// Puedes utilizar bibliotecas como Jackson o Gson para hacer esto
		// Aquí hay un ejemplo simple (no recomendado para casos de uso más complejos)
		StringBuilder jsonBuilder = new StringBuilder("{");
		for (Map.Entry<String, Object> entry : mapa.entrySet()) {
			jsonBuilder.append("\"").append(entry.getKey()).append("\":\"").append(entry.getValue()).append("\",");
		}
		if (jsonBuilder.length() > 1) {
			jsonBuilder.deleteCharAt(jsonBuilder.length() - 1); // Eliminar la última coma
		}
		jsonBuilder.append("}");
		return jsonBuilder.toString();
	}

	public String procesar_cronograma_pagos() {
		return cronogramaPagosRepositoryI.procesarCronogramaPagos();
	}

	public String f_actualizar_estudiantes_esnuevo() {
		return cronogramaPagosRepositoryI.f_actualizar_estudiantes_esnuevo();
	}

	public String f_insertar_cronograma_pagos(CronogramaPagos cronogramaPagos) {
		return cronogramaPagosRepositoryI.f_insertar_cronograma_pagos(cronogramaPagos.getIdsolicitud(),
				cronogramaPagos.getDniestudiante(), cronogramaPagos.getIdciclonormalizado(),
				cronogramaPagos.getVencimiento_monto_metodo_estado());
	}

	public String actualizarEstado(Integer id, String valor) {
		return cronogramaPagosRepositoryI.ActualizarPagos(id, valor

		);
	}

	public String listarPagos(String dni) {
		return cronogramaPagosRepositoryI.listarPagos(dni);
	}
	
	public String f_listar_pagos_intr(CronogramaPagos cronogramaPagos) {
		return cronogramaPagosRepositoryI.f_listar_pagos_intr(cronogramaPagos.getDni(), cronogramaPagos.getIdsolicitud());
	}

	
	public String f_actualizar_cronograma_pago(CronogramaPagos cronogramaPagos) {
		return cronogramaPagosRepositoryI.f_actualizar_cronograma_pago(cronogramaPagos.getIdcronogramapagos(),
				cronogramaPagos.getVencimiento_monto_metodo_estado());
	}

	public String listarPagosARealizar(CronogramaPagos cronogramaPagos) {
		return cronogramaPagosRepositoryI.listarPagos(cronogramaPagos.getDni());
	}

	public String listarsolicitudpagos(Integer idsolicitud) {
		return cronogramaPagosRepositoryI.listarsolicitudpagos(idsolicitud);
	}

	public String f_verificar_beneficio_activo(String in_dni) {
		return cronogramaPagosRepositoryI.f_verificar_beneficio_activo(in_dni);
	}

	public String f_obtener_pagos_full(CronogramaPagos cronogramaPagos) {
		return cronogramaPagosRepositoryI.f_obtener_pagos_full(cronogramaPagos.numero_rows, cronogramaPagos.estudiante,
				cronogramaPagos.ciclo, cronogramaPagos.colegio, cronogramaPagos.rango_fechas,
				cronogramaPagos.forma_pago);
	}

	public String f_reporte_pagos_full(CronogramaPagos cronogramaPagos) {
		return cronogramaPagosRepositoryI.f_reporte_pagos_full(cronogramaPagos.estudiante, cronogramaPagos.ciclo,
				cronogramaPagos.colegio, cronogramaPagos.rango_fechas);
	}

	public String f_actualizar_cronograma_editar_estudiante(CronogramaPagos cronogramaPagos) {
		return cronogramaPagosRepositoryI.f_actualizar_cronograma_editar_estudiante(cronogramaPagos.getIdcronogramapagos(), cronogramaPagos.getVencimiento_monto_metodo_estado());
	}

	public String f_listar_cronograma_idsolicitud(int in_idsolicitud) {
		return cronogramaPagosRepositoryI.f_listar_cronograma_idsolicitud(in_idsolicitud);
	}

	public String f_activar_cronograma_beneficio(CronogramaTempEntity cronograma) {
		return cronogramaPagosRepositoryI.f_activar_cronograma_beneficio(cronograma.getIdsolicitud(),
				cronograma.gettipobeneficio(), cronograma.getmontobeneficio(), cronograma.getMotivo_beneficio());
	}

	public String f_desactivar_cronograma_beneficio(CronogramaTempEntity cronograma) {
		return cronogramaPagosRepositoryI.f_desactivar_cronograma_beneficio(cronograma.getIdsolicitud());
	}
	
	public String f_cambiar_estado_cuota_cronograma(String json_input) {
		return cronogramaPagosRepositoryI.f_cambiar_estado_cuota_cronograma(json_input);
	}

}
