package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Campaign;
import com.rosettcompany.grupoCiencia.repositoryI.CampaignRepositoryI;

@Service
public class CampaignServicio {
	@Autowired
	private CampaignRepositoryI campaignRepositoryI;

	public String f_insertar_campaign(Campaign campaign) {
		return campaignRepositoryI.f_insertar_campaign(campaign.getNombre(), campaign.getImagen(),
				campaign.getFecha_inicio(), campaign.getFecha_fin(), campaign.getUsuario_registro(),
				campaign.getCodigo(), campaign.preguntas);
	}

	public String f_listar_campaigns(Campaign campaign) {
		return campaignRepositoryI.f_listar_campaigns(campaign.row, campaign.getNombre(),
				campaign.getFecha_modificacion());
	}

	public String f_buscar_campaign_cod(Campaign campaign) {
		return campaignRepositoryI.f_buscar_campaign_cod(campaign.getCodigo());
	}

	public String f_actualizar_campaign(Campaign campaign) {
		return campaignRepositoryI.f_actualizar_campaign(campaign.getIdcampaign(),campaign.getNombre(), campaign.getImagen(),
				campaign.getFecha_inicio(), campaign.getFecha_fin(), campaign.getUsuario_modificacion(),
				 campaign.preguntas);
	}

	public String f_eliminar_campaign(Campaign campaign) {
		return campaignRepositoryI.f_eliminar_campaign(campaign.getIdcampaign());
	}
}
