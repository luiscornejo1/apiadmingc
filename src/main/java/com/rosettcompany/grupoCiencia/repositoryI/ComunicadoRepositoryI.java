package com.rosettcompany.grupoCiencia.repositoryI;
import java.sql.Date;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.rosettcompany.grupoCiencia.repository.Comunicado;

@Repository
public interface ComunicadoRepositoryI  extends CrudRepository<Comunicado,Integer>{

	
	@Procedure(name="funcion_registrar_comunicado")
	public String RegistrarComunicado(
			@Param("n_idciclo") int n_idciclo,
			@Param("n_fecha_inicio") Date n_fecha_inicio,
			@Param("n_fecha_fin") Date n_fecha_fin,
			@Param("n_resumen") String n_resumen,
			@Param("n_descripcion") String n_descripcion,
			@Param("n_estado") int n_estado,
			@Param("n_universidad") int universidad
			);
	
	@Procedure(name="funcion_actualizar_comunicado")
	public String ActualizarComunicado(
			@Param("n_idcomunicado") int n_idcomunicado,
			@Param("n_idciclo") int n_idciclo,
			@Param("n_fecha_inicio") Date n_fecha_inicio,
			@Param("n_fecha_fin") Date n_fecha_fin,
			@Param("n_descripcion") String n_descripcion,
			@Param("n_universidad") int universidad
			);
	
	@Procedure(name="funcion_listar_comunicados")
	public String ListarComunicados(
			@Param("in_indicador") int in_indicador
			);
	
	@Procedure(name="funcion_eliminar_comunicado")
	public String EliminarComunicado(
			@Param("n_idcomunicado") int n_idcomunicado
			);
	
	@Procedure(name="funcion_registrar_comunicado_landing")
	public String RegistrarComunicadoLanding(
			@Param("n_fecha_inicio") Date n_fecha_inicio,
			@Param("n_fecha_fin") Date n_fecha_fin,
			@Param("n_descripcion") String n_descripcion,
			@Param("n_estado") int n_estado
			);
	
	@Procedure(name="funcion_actualizar_comunicado_landing")
	public String ActualizarComunicadoLanding(
			@Param("n_idcomunicado") int n_idcomunicado,
			@Param("n_fecha_inicio") Date n_fecha_inicio,
			@Param("n_fecha_fin") Date n_fecha_fin,
			@Param("n_descripcion") String n_descripcion
			);
	
	@Procedure(name="funcion_listar_comunicados_landing")
	public String ListarComunicadosLanding(
			@Param("in_indicador") int in_indicador
			);
	
	@Procedure(name="funcion_eliminar_comunicado_landing")
	public String EliminarComunicadoLanding(
			@Param("n_idcomunicado") int n_idcomunicado
			);
	
	@Procedure(name="funcion_return_pdf")
	public String returnPdf(
			@Param("n_indicador") int n_indicador
			);
	
}
