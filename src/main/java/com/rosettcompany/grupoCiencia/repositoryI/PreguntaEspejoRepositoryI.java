package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.PreguntaEspejo;

@Repository
public interface PreguntaEspejoRepositoryI extends CrudRepository<PreguntaEspejo, Integer> {

	@Procedure(name = "f_listar_preguntas_espejo")
	public String listarPreguntaEspejo(@Param("in_idpregunta") String idpregunta, @Param("in_min") Integer in_min,
			@Param("in_max") Integer in_max);
	
	@Procedure(name = "f_listar_preguntas_espejo_combo")
	public String f_listar_preguntas_espejo_combo();


}
