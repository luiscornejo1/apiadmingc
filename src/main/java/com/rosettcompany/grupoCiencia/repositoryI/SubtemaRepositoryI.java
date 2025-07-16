package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Subtema;

@Repository
public interface SubtemaRepositoryI extends CrudRepository<Subtema, Integer> {

	@Procedure(name = "f_listar_subtema_temanormalizado")
	public String listarSubtemas(@Param("in_id_tema") int idtemanormalizado);

	@Procedure(name = "f_listar_subtema_temanormalizado_all")
	public String f_listar_subtema_temanormalizado_all();

}
