package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.rosettcompany.grupoCiencia.repository.CronogramaPagos;

@Repository
public interface CronogramaPagosRepositoryI extends CrudRepository<CronogramaPagos, Integer> {

	@Query(nativeQuery = true, value = "SELECT f_calcular_deuda_dia();")
	public String procesarCronogramaPagos();

	@Query(nativeQuery = true, value = "SELECT f_actualizar_estudiantes_esnuevo();")
	public String f_actualizar_estudiantes_esnuevo();

	@Procedure(name = "f_insertar_cronograma_pagos")
	public String f_insertar_cronograma_pagos(
			@Param("in_idsolicitud") int idsolicitud,
			@Param("in_dniestudiante") String dniestudiante, 
			@Param("in_idciclonormalizado") int idciclonormalizado,
			@Param("in_vencimiento_monto_metodo_estado") String vencimiento_monto_metodo_estado);

	@Procedure(name = "f_actualizar_cronograma_pago")
	public String f_actualizar_cronograma_pago(@Param("in_idcronogramapagos") int idcronogramapagos,
			@Param("in_vencimiento_monto_metodo_estado") String vencimiento_monto_metodo_estado);
	
	@Procedure(name = "f_listar_pagos")
	public String listarPagos(@Param("in_dni") String dni);

	@Procedure(name = "f_listar_pagos_intr")
	public String f_listar_pagos_intr(@Param("in_dni") String dni, @Param("in_idsolicitud") int idsolicitud);

	
	@Procedure(name = "f_listar_solicitudpagos")
	public String listarsolicitudpagos(@Param("in_solicitud") Integer idsolicitud);

	@Procedure(name = "f_actualizar_vencimiento_monto_metodo_estado")
	public String ActualizarPagos(@Param("in_idcronogramapagos") int idcronogramapagos,
			@Param("in_nuevo_valor") String in_nuevo_valor);

	@Procedure(name = "f_buscar_nrooperacion")
	public String f_buscar_nrooperacion(@Param("in_nrooperacion") String in_nrooperacion);

	@Procedure(name = "f_verificar_beneficio_activo")
	public String f_verificar_beneficio_activo(@Param("in_dni") String in_dni);

	@Procedure(name = "f_obtener_pagos_full")
	public String f_obtener_pagos_full(@Param("in_numero_rows") int numero_rows,
			@Param("in_estudiante") String estudiante, @Param("in_ciclo") String ciclo,
			@Param("in_colegio") String colegio, @Param("in_rango_fechas") String rango_fechas,
			@Param("in_forma_pago") String forma_pago);

	@Procedure(name = "f_reporte_pagos_full")
	public String f_reporte_pagos_full(@Param("in_estudiante") String estudiante, @Param("in_ciclo") String ciclo,
			@Param("in_colegio") String colegio, @Param("in_rango_fechas") String rango_fechas);

	@Procedure(name = "f_actualizar_cronograma_editar_estudiante")
	public String f_actualizar_cronograma_editar_estudiante(@Param("in_idcronogramapagos") int idcronogramapagos,
			@Param("in_vencimiento_monto_metodo_estado") String vencimiento_monto_metodo_estado);

	@Procedure(name = "f_listar_cronograma_idsolicitud")
	public String f_listar_cronograma_idsolicitud(@Param("in_idsolicitud") int idsolicitud);

	@Procedure(name = "f_activar_cronograma_beneficio")
	public String f_activar_cronograma_beneficio(@Param("in_idsolicitud") Integer idsolicitud,
			@Param("in_tipobeneficio") Integer tipobeneficio, @Param("in_montobeneficio") Double montobeneficio,
			@Param("in_motivo_beneficio") String motivo_beneficio);

	@Procedure(name = "f_desactivar_cronograma_beneficio")
	public String f_desactivar_cronograma_beneficio(@Param("in_idsolicitud") Integer idsolicitud);
	
	@Procedure(name = "f_cambiar_estado_cuota_cronograma")
	public String f_cambiar_estado_cuota_cronograma(@Param("json_input") String json_input);

}
