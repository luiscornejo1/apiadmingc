package com.rosettcompany.grupoCiencia.repository;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name = "cronograma_pagos")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "f_insertar_cronograma_pagos", procedureName = "f_insertar_cronograma_pagos", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsolicitud", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dniestudiante", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idciclonormalizado", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_vencimiento_monto_metodo_estado", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_actualizar_vencimiento_monto_metodo_estado", procedureName = "f_actualizar_vencimiento_monto_metodo_estado", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcronogramapagos", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nuevo_valor", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_pagos", procedureName = "f_listar_pagos", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_listar_utlimo_pago", procedureName = "f_listar_utlimo_pago", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "f_listar_solicitudpagos", procedureName = "f_listar_solicitudpagos", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_solicitud", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_buscar_nrooperacion", procedureName = "f_buscar_nrooperacion", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nrooperacion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_verificar_beneficio_activo", procedureName = "f_verificar_beneficio_activo", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_obtener_pagos_full", procedureName = "f_obtener_pagos_full", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_numero_rows", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_estudiante", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_colegio", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_rango_fechas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_forma_pago", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_reporte_pagos_full", procedureName = "f_reporte_pagos_full", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_estudiante", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciclo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_colegio", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_rango_fechas", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "procesar_cronograma_pagos", procedureName = "procesar_cronograma_pagos"),
		
		@NamedStoredProcedureQuery(name = "f_actualizar_estudiantes_esnuevo", procedureName = "f_actualizar_estudiantes_esnuevo"),
		
		@NamedStoredProcedureQuery(name = "f_actualizar_cronograma_editar_estudiante", procedureName = "f_actualizar_cronograma_editar_estudiante", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcronogramapagos", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_vencimiento_monto_metodo_estado", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		

		@NamedStoredProcedureQuery(name = "f_listar_cronograma_idsolicitud", procedureName = "f_listar_cronograma_idsolicitud", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsolicitud", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_activar_cronograma_beneficio", procedureName = "f_activar_cronograma_beneficio", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsolicitud", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_tipobeneficio", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_montobeneficio", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_motivo_beneficio", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }), 
		
		@NamedStoredProcedureQuery(name = "f_desactivar_cronograma_beneficio", procedureName = "f_desactivar_cronograma_beneficio", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsolicitud", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }), 

		@NamedStoredProcedureQuery(name = "f_actualizar_cronograma_pago", procedureName = "f_actualizar_cronograma_pago", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idcronogramapagos", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_vencimiento_monto_metodo_estado", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "f_listar_pagos_intr", procedureName = "f_listar_pagos_intr", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_idsolicitud", type = int.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_resultado", type = String.class) }),

		
})

public class CronogramaPagos {

	@Id
	@Column(name = "idcronogramapagos")
	public int idcronogramapagos;

	@Column(name = "idsolicitud")
	public int idsolicitud;

	@Column(name = "idcronogramapagosjson")
	private Integer idcronogramapagosjson;
	
	@Column(name = "dniestudiante")
	public String dniestudiante;

	@Column(name = "idciclonormalizado")
	public int idciclonormalizado;

	@Column(name = "vencimiento_monto_metodo_estado")
	public String vencimiento_monto_metodo_estado;

	@Column(name = "estado")
	public int estado;

	@Column(name = "dni")
	private String dni;
	
	public int numero_rows ;
	public String estudiante;
	public String ciclo;
	public String colegio;
	public String rango_fechas;
	public String forma_pago;

	public CronogramaPagos() {
		super();
	}

	public CronogramaPagos(int idcronogramapagos, int idsolicitud, String dniestudiante, int idciclonormalizado,
			String vencimiento_monto_metodo_estado, int estado) {
		super();
		this.idcronogramapagos = idcronogramapagos;
		this.idsolicitud = idsolicitud;
		this.dniestudiante = dniestudiante;
		this.idciclonormalizado = idciclonormalizado;
		this.vencimiento_monto_metodo_estado = vencimiento_monto_metodo_estado;
		this.estado = estado;
	}

	public CronogramaPagos(int idcronogramapagos, int idsolicitud, Integer idcronogramapagosjson, String dniestudiante,
			int idciclonormalizado, String vencimiento_monto_metodo_estado, int estado, String dni, int numero_rows,
			String estudiante, String ciclo, String colegio, String rango_fechas) {
		super();
		this.idcronogramapagos = idcronogramapagos;
		this.idsolicitud = idsolicitud;
		this.idcronogramapagosjson = idcronogramapagosjson;
		this.dniestudiante = dniestudiante;
		this.idciclonormalizado = idciclonormalizado;
		this.vencimiento_monto_metodo_estado = vencimiento_monto_metodo_estado;
		this.estado = estado;
		this.dni = dni;
		this.numero_rows = numero_rows;
		this.estudiante = estudiante;
		this.ciclo = ciclo;
		this.colegio = colegio;
		this.rango_fechas = rango_fechas;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Integer getIdcronogramapagosjson() {
		return idcronogramapagosjson;
	}

	public void setIdcronogramapagosjson(Integer idcronogramapagosjson) {
		this.idcronogramapagosjson = idcronogramapagosjson;
	}

	public int getIdcronogramapagos() {
		return idcronogramapagos;
	}

	public void setIdcronogramapagos(int idcronogramapagos) {
		this.idcronogramapagos = idcronogramapagos;
	}

	public int getIdsolicitud() {
		return idsolicitud;
	}

	public void setIdsolicitud(int idsolicitud) {
		this.idsolicitud = idsolicitud;
	}

	public String getDniestudiante() {
		return dniestudiante;
	}

	public void setDniestudiante(String dniestudiante) {
		this.dniestudiante = dniestudiante;
	}

	public int getIdciclonormalizado() {
		return idciclonormalizado;
	}

	public void setIdciclonormalizado(int idciclonormalizado) {
		this.idciclonormalizado = idciclonormalizado;
	}

	public String getVencimiento_monto_metodo_estado() {
		return vencimiento_monto_metodo_estado;
	}

	public void setVencimiento_monto_metodo_estado(String vencimiento_monto_metodo_estado) {
		this.vencimiento_monto_metodo_estado = vencimiento_monto_metodo_estado;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getNumero_rows() {
		return numero_rows;
	}

	public void setNumero_rows(int numero_rows) {
		this.numero_rows = numero_rows;
	}

	public String getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(String estudiante) {
		this.estudiante = estudiante;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}

	public String getRango_fechas() {
		return rango_fechas;
	}

	public void setRango_fechas(String rango_fechas) {
		this.rango_fechas = rango_fechas;
	}

	
}