package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Subsubtema;

@Repository
public interface SubsubtemaRepositoryI extends CrudRepository<Subsubtema, Integer> {

	@Procedure(name = "f_listar_subsubtema_subtema")
	public String listarSubsubtemas(@Param("in_id_tema") int id_subtema);

	@Procedure(name = "f_listar_subsubtema_subtema_all")
	public String f_listar_subsubtema_subtema_all();

}
