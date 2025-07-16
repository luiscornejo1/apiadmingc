package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.DetalleAreaCurso;

@Repository
public interface DetalleAreaCursoRepositoryI extends CrudRepository<DetalleAreaCurso, Integer>{

}
