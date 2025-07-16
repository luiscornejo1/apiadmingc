package com.rosettcompany.grupoCiencia.repositoryI;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Ciclo;
import com.rosettcompany.grupoCiencia.repository.DetalleEstudiantesBecaDescuento;

@Repository
public interface DetalleEstudiantesBecaDescuentoRepositoryI
		extends CrudRepository<DetalleEstudiantesBecaDescuento, Integer> {
	@Procedure(name = "f_listar_detalle_estudiantes_beca_descuento")
	public String f_listar_detalle_estudiantes_beca_descuento(@Param("in_rows") Integer rows,
			@Param("in_idusuario") Integer idusuario, @Param("in_nombre") String nombre,
			@Param("in_ciclo") String ciclo, @Param("in_fecha_registro") String fecha_registro,
			@Param("in_tipo_beneficio") String tipo_beneficio);

	@Procedure(name = "f_descargar_detalle_estudiantes_beca_descuento")
	public String f_descargar_detalle_estudiantes_beca_descuento(@Param("in_nombre") String nombre,
			@Param("in_idusuario") Integer idusuario, @Param("in_ciclo") String ciclo,
			@Param("in_fecha_registro") String fecha_registro, @Param("in_tipo_beneficio") String tipo_beneficio);

	@Procedure(name = "f_actualizar_becaestudiante_estado")
	public String actualizarEstado(@Param("in_iddetallebeca") Integer iddetallebeca,
			@Param("usuario_parametro") Integer usuario);

	@Procedure(name = "f_registrar_beca_descuento")
	public String registrarBecaDescuento(@Param("tipo_parametro") Double tipo, @Param("monto_parametro") Double monto,
			@Param("dni_parametro") String dni, @Param("nombre_parametro") String nombre,
			@Param("in_correo") String correo, @Param("usuario_parametro") Integer usuario,
			@Param("in_idsolicitud") int idsolicitud, @Param("in_motivo") String motivo,
			@Param("in_dni_asociado") String dni_asociado, @Param("in_idmodalidad") int idmodalidad,
			@Param("in_fecha_fin") String fecha_fin);

	@Procedure(name = "f_buscar_beca_descuento_por_dni")
	public String buscarBecaDNI(@Param("in_dni") String dni);

	
	@Procedure(name = "f_desactivar_becas_fecha_fin")
	public String f_desactivar_becas_fecha_fin();

}