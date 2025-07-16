package com.rosettcompany.grupoCiencia.repositoryI;

import java.sql.Date;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Campaign;

@Repository
public interface CampaignRepositoryI extends CrudRepository<Campaign, Integer> {

	@Procedure(name = "f_insertar_campaign")
	public String f_insertar_campaign(@Param("in_nombre") String nombre, @Param("in_imagen") String imagen,
			@Param("in_fecha_inicio") Date fecha_inicio, @Param("in_fecha_fin") Date fecha_fin,
			@Param("in_usuario_registro") int usuario_registro, @Param("in_codigo") String codigo,
			@Param("in_preguntas") String preguntas);

	@Procedure(name = "f_listar_campaigns")
	public String f_listar_campaigns(@Param("in_row") int row, @Param("in_nombre") String nombre,
			@Param("in_fecha_modificacion") String fecha_modificacion);

	@Procedure(name = "f_buscar_campaign_cod")
	public String f_buscar_campaign_cod(@Param("in_codigo") String codigo);

	@Procedure(name = "f_actualizar_campaign")
	public String f_actualizar_campaign(@Param("in_idcampaign") int idcampaign, @Param("in_nombre") String nombre,
			@Param("in_imagen") String imagen, @Param("in_fecha_inicio") Date fecha_inicio,
			@Param("in_fecha_fin") Date fecha_fin, @Param("in_usuario_modificacion") int usuario_modificacion,
			@Param("in_preguntas") String preguntas);

	@Procedure(name = "f_eliminar_campaign")
	public String f_eliminar_campaign(@Param("in_idcampaign") int idcampaign);
}
