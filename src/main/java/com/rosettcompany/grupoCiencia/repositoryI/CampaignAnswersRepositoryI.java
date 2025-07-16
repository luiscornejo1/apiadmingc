package com.rosettcompany.grupoCiencia.repositoryI;

import java.sql.Date;
import java.time.Duration;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.CampaignAnswers;

@Repository
public interface CampaignAnswersRepositoryI extends CrudRepository<CampaignAnswers, Integer> {

	@Procedure(name = "f_insertar_campaign_answers")
	public String f_insertar_campaign(@Param("in_idcampaign") int idcampaign,
			@Param("in_respuestas") String in_respuestas, @Param("in_tiempo") long tiempo,
			@Param("in_red_social") String red_social);

	@Procedure(name = "f_listar_campaign_answers")
	public String f_listar_campaign_answers(@Param("in_row") int row, @Param("in_idcampaign") int idcampaign,
			@Param("in_nombre") String nombre, @Param("in_fecha") String fecha,
			@Param("in_red_social") String red_social);

	@Procedure(name = "f_descargar_campaign_answers")
	public String f_descargar_campaign_answers(
			@Param("in_idcampaign") int idcampaign,
			@Param("in_nombre") String nombre, 
			@Param("in_fecha") String fecha,
			@Param("in_red_social") String red_social);
}
