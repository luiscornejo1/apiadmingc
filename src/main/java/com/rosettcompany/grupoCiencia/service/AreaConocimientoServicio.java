package com.rosettcompany.grupoCiencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.AreaConocimiento;
import com.rosettcompany.grupoCiencia.repositoryI.AreaConocimientoRepositoryI;

@Service
public class AreaConocimientoServicio {

	@Autowired
	private AreaConocimientoRepositoryI areaConocimiento;
	
	public List<AreaConocimiento> getAll(){
		
		return (List<AreaConocimiento>) areaConocimiento.findAll();
	}
	
	
	public String listarAreasConocimientos(int idarea) {
		return areaConocimiento.listarAreasConocimiento(idarea);
	}
}
