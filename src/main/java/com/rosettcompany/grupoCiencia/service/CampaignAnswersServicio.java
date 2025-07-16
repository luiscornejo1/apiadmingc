package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.CampaignAnswers;
import com.rosettcompany.grupoCiencia.repositoryI.CampaignAnswersRepositoryI;

@Service
public class CampaignAnswersServicio {
	@Autowired
	private CampaignAnswersRepositoryI campaignAnswersRepositoryI;

	public String f_insertar_campaign_answers(CampaignAnswers campaignAnswers) {
		return campaignAnswersRepositoryI.f_insertar_campaign(campaignAnswers.getIdcampaign(),
				campaignAnswers.getRespuestas(), campaignAnswers.getTiempo(), campaignAnswers.getRed_social());
	}

	public String f_listar_campaign_answers(CampaignAnswers campaignAnswers) {
		return campaignAnswersRepositoryI.f_listar_campaign_answers(campaignAnswers.row,
				campaignAnswers.getIdcampaign(), campaignAnswers.nombre, campaignAnswers.fecha,
				campaignAnswers.getRed_social());
	}

	public String f_descargar_campaign_answers(CampaignAnswers campaignAnswers) {
		return campaignAnswersRepositoryI.f_descargar_campaign_answers(
				campaignAnswers.getIdcampaign(),
				campaignAnswers.nombre, 
				campaignAnswers.fecha, 
				campaignAnswers.getRed_social());
	}
}
