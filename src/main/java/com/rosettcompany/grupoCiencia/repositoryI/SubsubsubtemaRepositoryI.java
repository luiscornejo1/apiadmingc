package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Subsubsubtema;

@Repository
public interface SubsubsubtemaRepositoryI extends CrudRepository<Subsubsubtema, Integer> {

	@Procedure(name = "f_listar_subsubsubtema_subsubtema")
	public String listarSubsubsubtemas(@Param("in_id_tema") int id_subtema);

	@Procedure(name = "f_listar_subsubsubtema_subsubtema_all")
	public String f_listar_subsubsubtema_subsubtema_all();

}
