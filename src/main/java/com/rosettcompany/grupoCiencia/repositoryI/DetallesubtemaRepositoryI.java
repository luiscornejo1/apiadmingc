package com.rosettcompany.grupoCiencia.repositoryI;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rosettcompany.grupoCiencia.repository.Detallesubtema;

@Repository
public interface DetallesubtemaRepositoryI extends CrudRepository<Detallesubtema, Integer> {

	@Procedure(name = "f_listar_detallesubtema_subsubsubtema")
	public String listarDetallesubtemas(@Param("in_id_tema") int id_sub_subtema);

	@Procedure(name = "f_listar_detallesubtema_subsubsubtema_all")
	public String f_listar_detallesubtema_subsubsubtema_all();

}
