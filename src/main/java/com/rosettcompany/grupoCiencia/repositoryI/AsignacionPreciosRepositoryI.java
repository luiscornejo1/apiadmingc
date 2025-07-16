package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.AsignacionPreciosEntity;

@Repository
public interface AsignacionPreciosRepositoryI extends CrudRepository<AsignacionPreciosEntity, Integer>{ 
}
