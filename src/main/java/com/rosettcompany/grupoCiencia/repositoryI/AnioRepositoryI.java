package com.rosettcompany.grupoCiencia.repositoryI;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Anio;

@Repository
public interface AnioRepositoryI extends CrudRepository<Anio,Integer>{
	@Query(value="select * from anios where estado !=0",nativeQuery=true)
	List<Anio> listarAnios();
}
