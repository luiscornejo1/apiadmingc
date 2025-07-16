package com.rosettcompany.grupoCiencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.Apoderado;
import com.rosettcompany.grupoCiencia.repositoryI.ApoderadosRepositoryI;

@Service
public class ApoderadosServicio {

	@Autowired
	private ApoderadosRepositoryI apoderadosRepositoryI;
	
	public int editarApoderado(Apoderado apoderado) {
		Apoderado a = apoderadosRepositoryI.save(apoderado);
		
		if(a != null) {
			return 1;
		}else {
			return 0;
		}
	}
}
