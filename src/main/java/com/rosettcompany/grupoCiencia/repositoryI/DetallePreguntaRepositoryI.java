package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.rosettcompany.grupoCiencia.repository.DetallePregunta;

@Repository
public interface DetallePreguntaRepositoryI extends CrudRepository<DetallePregunta,Integer>{

}
