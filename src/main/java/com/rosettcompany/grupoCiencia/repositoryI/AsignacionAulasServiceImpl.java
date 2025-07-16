package com.rosettcompany.grupoCiencia.repositoryI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosettcompany.grupoCiencia.repository.AsignacionAulasEntity;


@Service
public class AsignacionAulasServiceImpl{
	
	@Autowired
	private AsignacionAulasRepositoryI iAsignacionAulasRepository;
	
}
